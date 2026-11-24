#define _GNU_SOURCE
#include <ctype.h>
#include <dlfcn.h>
#include <errno.h>
#include <pthread.h>
#include <stdarg.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/sysinfo.h>
#include <sys/sysmacros.h>
#include <unistd.h>
#include <android/log.h>

#define CORZ_LOG_TAG "CorzQvmBionicShim"

/*
 * Android Bionic <-> GNU/glibc ABI compatibility shim for CorzClient's ARM64 libvm.so.
 * Loaded into the same clns linker namespace immediately before libvm.so.
 */

/*
 * Intercept dlopen() calls from libvm.so so any runtime dlopen("libc.so.6" / "libm.so.6" / etc.)
 * maps transparently to Bionic's libraries inside the same clns linker namespace.
 */
void *dlopen(const char *filename, int flags) {
    typedef void *(*dlopen_fn)(const char *, int);
    static dlopen_fn real_dlopen = NULL;
    if (!real_dlopen) {
        real_dlopen = (dlopen_fn)dlsym(RTLD_NEXT, "dlopen");
    }
    if (!real_dlopen) {
        return NULL;
    }
    if (filename != NULL) {
        if (strcmp(filename, "libc.so.6") == 0 || strcmp(filename, "libpthread.so.0") == 0 || strcmp(filename, "librt.so.1") == 0) {
            filename = "libc.so";
        } else if (strcmp(filename, "libm.so.6") == 0) {
            filename = "libm.so";
        } else if (strcmp(filename, "libdl.so.2") == 0) {
            filename = "libdl.so";
        } else if (strcmp(filename, "libstdc++.so.6") == 0) {
            filename = "libc++_shared.so";
        }
    }
    return real_dlopen(filename, flags);
}

/* Bionic declares __errno(void) and __assert2(...) in libc.so */
extern int *__errno(void);
extern void __assert2(const char *file, int line, const char *func, const char *failedexpr)
    __attribute__((noreturn));

int *__errno_location(void) {
    return __errno();
}

void __assert_fail(const char *assertion, const char *file, unsigned int line, const char *function) {
    __android_log_print(ANDROID_LOG_ERROR, CORZ_LOG_TAG,
                        "QVM assert failed (%s:%u %s): %s",
                        file ? file : "?", line, function ? function : "?", assertion ? assertion : "?");
    __assert2(file ? file : "unknown", (int)line, function ? function : "unknown", assertion ? assertion : "assert");
}

/* GNU <ctype.h> bitmasks matching aarch64 glibc headers (little-endian __isctype_f) */
enum {
    GLIBC_ISupper  = 1 << 8,
    GLIBC_ISlower  = 1 << 9,
    GLIBC_ISalpha  = 1 << 10,
    GLIBC_ISdigit  = 1 << 11,
    GLIBC_ISxdigit = 1 << 12,
    GLIBC_ISspace  = 1 << 13,
    GLIBC_ISprint  = 1 << 14,
    GLIBC_ISgraph  = 1 << 15,
    GLIBC_ISblank  = 1 << 0,
    GLIBC_IScntrl  = 1 << 1,
    GLIBC_ISpunct  = 1 << 2,
    GLIBC_ISalnum  = 1 << 3
};

static unsigned short g_ctype_b_table[384];
static int32_t g_ctype_tolower_table[384];
static int32_t g_ctype_toupper_table[384];
static pthread_once_t g_ctype_once = PTHREAD_ONCE_INIT;

static void init_ctype_tables(void) {
    for (int i = -128; i < 256; ++i) {
        int idx = i + 128;
        if (i == -1) {
            g_ctype_b_table[idx] = 0;
            g_ctype_tolower_table[idx] = -1;
            g_ctype_toupper_table[idx] = -1;
            continue;
        }
        unsigned char c = (unsigned char)i;
        unsigned short flags = 0;
        if (isupper(c))  flags |= GLIBC_ISupper;
        if (islower(c))  flags |= GLIBC_ISlower;
        if (isalpha(c))  flags |= GLIBC_ISalpha;
        if (isdigit(c))  flags |= GLIBC_ISdigit;
        if (isxdigit(c)) flags |= GLIBC_ISxdigit;
        if (isspace(c))  flags |= GLIBC_ISspace;
        if (isprint(c))  flags |= GLIBC_ISprint;
        if (isgraph(c))  flags |= GLIBC_ISgraph;
        if (c == ' ' || c == '\t') flags |= GLIBC_ISblank;
        if (iscntrl(c))  flags |= GLIBC_IScntrl;
        if (ispunct(c))  flags |= GLIBC_ISpunct;
        if (isalnum(c))  flags |= GLIBC_ISalnum;

        g_ctype_b_table[idx] = flags;
        g_ctype_tolower_table[idx] = (int32_t)tolower(c);
        g_ctype_toupper_table[idx] = (int32_t)toupper(c);
    }
}

const unsigned short **__ctype_b_loc(void) {
    pthread_once(&g_ctype_once, init_ctype_tables);
    static __thread const unsigned short *ptr = NULL;
    ptr = &g_ctype_b_table[128];
    return &ptr;
}

const int32_t **__ctype_tolower_loc(void) {
    pthread_once(&g_ctype_once, init_ctype_tables);
    static __thread const int32_t *ptr = NULL;
    ptr = &g_ctype_tolower_table[128];
    return &ptr;
}

const int32_t **__ctype_toupper_loc(void) {
    pthread_once(&g_ctype_once, init_ctype_tables);
    static __thread const int32_t *ptr = NULL;
    ptr = &g_ctype_toupper_table[128];
    return &ptr;
}

/* ISO C99 scanf wrappers emitted by glibc toolchains */
int __isoc99_vsscanf(const char *str, const char *format, va_list ap) {
    return vsscanf(str, format, ap);
}

int __isoc99_vfscanf(FILE *stream, const char *format, va_list ap) {
    return vfscanf(stream, format, ap);
}

int __isoc99_sscanf(const char *str, const char *format, ...) {
    va_list ap;
    va_start(ap, format);
    int r = vsscanf(str, format, ap);
    va_end(ap);
    return r;
}

int __isoc99_fscanf(FILE *stream, const char *format, ...) {
    va_list ap;
    va_start(ap, format);
    int r = vfscanf(stream, format, ap);
    va_end(ap);
    return r;
}

int __isoc99_vscanf(const char *format, va_list ap) {
    return vfscanf(stdin, format, ap);
}

int __isoc99_scanf(const char *format, ...) {
    va_list ap;
    va_start(ap, format);
    int r = vfscanf(stdin, format, ap);
    va_end(ap);
    return r;
}

/* GNU _FORTIFY_SOURCE checked functions that may have slightly different names/signatures on Bionic */
void *__memcpy_chk(void *dest, const void *src, size_t len, size_t destlen) {
    if (len > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "memcpy buffer overflow");
    }
    return memcpy(dest, src, len);
}

void *__memmove_chk(void *dest, const void *src, size_t len, size_t destlen) {
    if (len > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "memmove buffer overflow");
    }
    return memmove(dest, src, len);
}

void *__memset_chk(void *dest, int c, size_t len, size_t destlen) {
    if (len > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "memset buffer overflow");
    }
    return memset(dest, c, len);
}

char *__strcpy_chk(char *dest, const char *src, size_t destlen) {
    size_t len = strlen(src) + 1;
    if (len > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "strcpy buffer overflow");
    }
    return memcpy(dest, src, len);
}

char *__strncpy_chk(char *dest, const char *src, size_t n, size_t destlen) {
    if (n > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "strncpy buffer overflow");
    }
    return strncpy(dest, src, n);
}

char *__strcat_chk(char *dest, const char *src, size_t destlen) {
    size_t dlen = strlen(dest);
    size_t slen = strlen(src) + 1;
    if (dlen + slen > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "strcat buffer overflow");
    }
    memcpy(dest + dlen, src, slen);
    return dest;
}

int __vsnprintf_chk(char *s, size_t maxlen, int flag, size_t slen, const char *format, va_list ap) {
    (void)flag;
    if (maxlen > slen) {
        __assert2(__FILE__, __LINE__, __func__, "vsnprintf buffer overflow");
    }
    return vsnprintf(s, maxlen, format, ap);
}

int __snprintf_chk(char *s, size_t maxlen, int flag, size_t slen, const char *format, ...) {
    va_list ap;
    va_start(ap, format);
    int r = __vsnprintf_chk(s, maxlen, flag, slen, format, ap);
    va_end(ap);
    return r;
}

int __vsprintf_chk(char *s, int flag, size_t slen, const char *format, va_list ap) {
    (void)flag;
    return vsnprintf(s, slen, format, ap);
}

int __sprintf_chk(char *s, int flag, size_t slen, const char *format, ...) {
    (void)flag;
    va_list ap;
    va_start(ap, format);
    int r = vsnprintf(s, slen, format, ap);
    va_end(ap);
    return r;
}

char *__strncat_chk(char *dest, const char *src, size_t n, size_t destlen) {
    size_t dlen = strlen(dest);
    size_t slen = strnlen(src, n);
    if (dlen + slen + 1 > destlen) {
        __assert2(__FILE__, __LINE__, __func__, "strncat buffer overflow");
    }
    memcpy(dest + dlen, src, slen);
    dest[dlen + slen] = '\0';
    return dest;
}

int __vfprintf_chk(FILE *fp, int flag, const char *format, va_list ap) {
    (void)flag;
    return vfprintf(fp, format, ap);
}

int __fprintf_chk(FILE *fp, int flag, const char *format, ...) {
    (void)flag;
    va_list ap;
    va_start(ap, format);
    int r = vfprintf(fp, format, ap);
    va_end(ap);
    return r;
}

int __printf_chk(int flag, const char *format, ...) {
    (void)flag;
    va_list ap;
    va_start(ap, format);
    int r = vfprintf(stdout, format, ap);
    va_end(ap);
    return r;
}

/* Miscellaneous GNU extensions */
void *mempcpy(void *dest, const void *src, size_t n) {
    return (unsigned char *)memcpy(dest, src, n) + n;
}

void *rawmemchr(const void *s, int c) {
    const unsigned char *p = (const unsigned char *)s;
    unsigned char ch = (unsigned char)c;
    while (*p != ch) {
        ++p;
    }
    return (void *)p;
}

char *secure_getenv(const char *name) {
    return getenv(name);
}

int __xpg_strerror_r(int errnum, char *buf, size_t buflen) {
    if (buflen == 0) return 22;
    union {
        char *pc;
        int i;
    } u;
    u.pc = (char *)strerror_r(errnum, buf, buflen);
    if ((uintptr_t)u.pc < 4096) {
        return u.i;
    } else {
        if (u.pc && u.pc != buf) {
            snprintf(buf, buflen, "%s", u.pc);
        }
        return 0;
    }
}

const char *gnu_get_libc_version(void) {
    return "2.35";
}

void explicit_bzero(void *s, size_t n) {
    volatile unsigned char *p = (volatile unsigned char *)s;
    while (n--) {
        *p++ = 0;
    }
}

int __register_atfork(void (*prepare)(void), void (*parent)(void), void (*child)(void), void *dso_handle) {
    (void)dso_handle;
    return pthread_atfork(prepare, parent, child);
}

int backtrace(void **buffer, int size) {
    (void)buffer;
    (void)size;
    return 0;
}

char **backtrace_symbols(void *const *buffer, int size) {
    (void)buffer;
    (void)size;
    return NULL;
}

void backtrace_symbols_fd(void *const *buffer, int size, int fd) {
    (void)buffer;
    (void)size;
    (void)fd;
}

int get_nprocs(void) {
    long n = sysconf(_SC_NPROCESSORS_ONLN);
    return n > 0 ? (int)n : 1;
}

int get_nprocs_conf(void) {
    long n = sysconf(_SC_NPROCESSORS_CONF);
    return n > 0 ? (int)n : 1;
}

char *canonicalize_file_name(const char *path) {
    return realpath(path, NULL);
}

int euidaccess(const char *pathname, int mode) {
    return access(pathname, mode);
}

int eaccess(const char *pathname, int mode) {
    return access(pathname, mode);
}

__attribute__((constructor))
static void corz_bionic_shim_init(void) {
    init_ctype_tables();
    __android_log_print(ANDROID_LOG_INFO, CORZ_LOG_TAG,
                        "Initialized CorzClient QVM Bionic compatibility shim on Android ARM64");
}
