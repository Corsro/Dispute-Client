package gg.corz;

import com.corz.client.CorzClient;
import com.corz.client.mixins.AccessorItemCooldownEntry;
import com.corz.client.mixins.AccessorItemCooldownManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1041;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_313;
import net.minecraft.class_319;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3966;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_642;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_8685;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class IIililillIililil extends ilIllIiIll {
   private float lliIiiIlil;
   private static final String IiilIIllil = "RMB";
   private final iIlIIIiIllIIIi[] llliiIllil;
   private static final float IlliIiIlil = 1.8F;
   private final float[] IiIiiIllil;
   private float IiliiIllil;
   private final float[] IiiIIlllil;
   public static int iIliiiIlil;
   private final float[] IlllIiIlil = new float[64];
   private IIlIiIlllIlIiIll IiiilIllil;
   private final iiIiiilIIliiil iiIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float lllIIIllil = 30.0F;
   private static final long lIIlIIllil = 500000000L;
   private static final float liiIIIllil = 2.5F;
   public static int ililiiIlil;
   private float lIIllIllil;
   private static final String[] lIiiiIllil;
   private final float[] IlliiIllil;
   private float llIllIllil;
   private static long IIliiiIlil = -1L;
   private static final float IiilliIlil = 8.0F;
   private float IiIliIllil;
   private boolean IlliliIlil;
   private static final String iIilIIllil = "Cooldowns";
   private List<ilIllIiIll> llliiiIlil;
   private String IliiliIlil;
   private long IiIllIllil;
   private final iiIiiilIIliiil llililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float ilIliIllil;
   private final liIliIliiIliIl iiiIliIlil;
   private float iIIllIllil;
   private float IlIIliIlil = 0.0F;
   private final Map<String, float[]> iIiiilIlil = new HashMap();
   private static long liiliiIlil = -1L;
   private static final float IilIIIllil = 15.0F;
   private static final float ilIIIIllil = 6.0F;
   private String lIIIIiIlil;
   private static final float iIliIiIlil = 0.6F;
   private final IlIiIIIillIiIIIi iIlliIllil;
   private final llliiiiilliiii IililIllil;
   private String lIiiliIlil;
   private final float[] iIilIiIlil = new float[256];
   public static int iIIiiiIlil;
   private float lllIiiIlil;
   private boolean IIIIIiIlil;
   private float IiIIiiIlil;
   private final llliiiiilliiii iililIllil;
   private static final float iIIlIiIlil = 5.0F;
   private final List<iiiilIIIIi> IiiiilIlil = new ArrayList();
   private int IiliiiIlil;
   private long iiIllIllil;
   private int lIIIiIllil;
   private static final String lIilIIllil = "Potions";
   private static final IIIlliillIIlliil IIilIIllil;
   private final float[] lIilIiIlil = new float[256];
   private float IlIiiIllil;
   private static final float IiIIIlllil = 9.0F;
   private final iiIIlillIIlIlill IIliIIllil;
   public static final int lllliiIlil = -1;
   private float liIIiiIlil;
   private final ArrayList<iilIiIIiIIiIiIIi> iIillIllil;
   private final iiIIlillIIlIlill IllilIllil;
   private final iiIIlillIIlIlill llIiIIllil;
   private float IlIliIllil;
   private final iiIiIliIIliIli IliiIIllil;
   private static final String[] IIIiIIllil;
   private static final float lIIiliIlil = 0.86F;
   private static final String liIiliIlil = "Drag to move  ·  corner or scroll to resize";
   private final iiIiiilIIliiil IlliilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iilliIlIIiliIl iiliilIlil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 64, 16, 256, 16);
   private static final String illlIIllil = "BPS";
   private final String[] iIiiiIllil;
   private float IliIIiIlil;
   private final float[] iiIiIiIlil = new float[32];
   private float liIIIiIlil;
   private static final float IlIIIIllil = 4.0F;
   private final float[] IlilIiIlil = new float[256];
   private float iiiiiIllil;
   private boolean liiiiIllil;
   private IIliiIlllIliiIll iIliiIllil;
   private final liIliIliiIliIl IiiiIiIlil = lIilliIill();
   private final iiIiIliIIliIli IliIiIllil;
   public static int lIIiiiIlil;
   private final iiIiiilIIliiil liililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IliIIlllliIIll IliIIlllil;
   public static final int IllliiIlil = -671088640;
   private static final float llIIIlllil = 0.82F;
   private static IIlIiIlllIlIiIll iilliiIlil;
   private final liIliIliiIliIl iIIlliIlil;
   private float liIliiIlil;
   private final iiIIlillIIlIlill iiiIiiIlil;
   private float IiiIlIllil;
   private static float IIiliiIlil;
   private final Map<String, float[]> IliiilIlil = new HashMap();
   private final lliliIIiililiIIi illiilIlil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final float[] lliilIllil;
   private final iiIiiilIIliiil IIiiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float iiIIIiIlil;
   private long iliiliIlil;
   private static final int lilliiIlil = -1;
   private float lIIIliIlil = 0.0F;
   private float iIIiiIllil;
   private static final float iliIIIllil = 18.0F;
   private final float[] iilIlIllil;
   private float lIlIiIllil;
   private static final float lliiiiIlil = 8.0F;
   private float iIIIiiIlil;
   private final liIliIliiIliIl IiIIliIlil;
   private final iiIIlillIIlIlill liIilIllil;
   private float ilIIiiIlil;
   private final liIliIliiIliIl IiiIliIlil;
   private int IIllliIlil;
   private final Map<class_1291, illiIIlIiliIIl> iilllIllil;
   private static final float iIiIIIllil = 0.95F;
   private final class_1799[] ilIiiIllil;
   private final liIliIliiIliIl lliiIiIlil = lIilliIill();
   private static final String[] IillIIllil;
   private final iiIiiilIIliiil IIliilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean iIiiIiIlil;
   private final iiIiiilIIliiil lIililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float lliIIiIlil;
   private float IIiIlIllil;
   private static final long IlIlIIllil = 100000000L;
   private boolean illllIllil;
   private final iiIiIliIIliIli IilIiIllil;
   private static final float ilIliiIlil = 24.0F;
   private class_1309 ilillIllil;
   private final liIliIliiIliIl iIlIliIlil;
   private static float llIilIllil;
   private final iiIIlillIIlIlill illIIlllil;
   private final iiIiIliIIliIli IIIIlIllil;
   private static final float IlIlIiIlil = 12.0F;
   private float[] iliiilIlil;
   private boolean iilIIiIlil;
   private final iiIiiilIIliiil IiIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final ililliIiIiilliIi lIiiilIlil = (new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::lilIIliilIIl)).Ililllililil();
   private final llliiiiilliiii IiIIlIllil;
   private static final float iIIiliIlil = 21.0F;
   private static float IlIilIllil;
   private float IiIIIiIlil;
   private static final int lillliIlil = 5;
   private final int[] IliiiIllil;
   private final iiIIlillIIlIlill ilIiIIllil;
   private int illliIllil;
   private final iiIiiilIIliiil iIililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IlIiIIIillIiIIIi lIlliIllil;
   private float IIlliiIlil;
   private lllIIIIiillIIIIi IilllIllil;
   private final llliiiiilliiii IIIliiIlil;
   private final iiIiiilIIliiil iiililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float iiIliiIlil;
   private static final int iillliIlil = 6;
   private final iiIiiilIIliiil lIliilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private long iiIIiIllil;
   private final String[] iiiliIllil;
   private final int[] illlIiIlil = new int[64];
   private long IIiliIllil;
   private float ilIIIiIlil;
   private int IIIiIiIlil;
   private boolean lilIIiIlil;
   private final Set<UUID> ilIilIllil;
   private float illIiiIlil;
   private final llliiiiilliiii IIlIlIllil;
   private final long[] lIliiIllil;
   private final iiIiIliIIliIli lIiiIIllil;
   private final float[] lIllIiIlil = new float[64];
   private final iiIiiilIIliiil iIliilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long ilIlIIllil = 260000000L;
   private final iiIiIliIIliIli iilIiIllil;
   private final iiIiIliIIliIli lliIiIllil;
   private final ArrayList<String> ilIlIiIlil = new ArrayList();
   private final Map<String, float[]> lliiilIlil = new HashMap();
   private final class_1799[] liillIllil;
   private final iiIIlillIIlIlill lllIIlllil;
   private static final float iIilliIlil = 6.0F;
   private int iiiiliIlil;
   public static int IliliiIlil;
   private float lilIiiIlil;
   public static int IiIiiiIlil;
   private static final float iiilliIlil = 6.0F;
   private final liIliIliiIliIl iliiIiIlil = lIilliIill();
   private boolean iIliliIlil;
   private static final String llllIIllil = "corz.gg";
   private String iiiilIllil;
   private int liIliIllil;
   private boolean lilliIllil;
   private class_332 IliiIiIlil;
   private long ilIllIllil;
   private float illIIiIlil;
   private final float[] iIllIiIlil = new float[64];
   private final iiIiIliIIliIli IIiIIlllil;
   private static final String liilIIllil = "inf";
   private static final String IlllIIllil = "Resources";
   private final float[] liiIlIllil;
   private long lIlllIllil;
   private static final String[] IlIiIIllil;
   private float IIIllIllil;
   public static int liIiiiIlil;
   private String IIiIIiIlil;
   private float iiiIlIllil;
   private int liiiilIlil;
   private final long[] llIliiIlil;
   private float IIiiiIllil;
   private static long IlliiiIlil = -1L;
   private final iiIiIliIIliIli iIiIiIllil;
   private float lllIIiIlil;
   private int iliiiIllil;
   private final iiIIlillIIlIlill iIliIIllil;
   private static final float IIIlIiIlil = 0.07F;
   private float iliIlIllil;
   private float iIiIlIllil;
   private double llliliIlil;
   private int iiilIiIlil;
   private long liIIiIllil;
   private static int iiillIllil;
   private static final float IiliIiIlil = 0.065F;
   private float llIiiIllil;
   private int illIliIlil;
   private IIlIiIlllIlIiIll liiilIllil;
   private int IlIIIlllil;
   private static final float liIIIIllil = 14.0F;
   private final llliiiiilliiii IlIIlIllil;
   private final iiIIlillIIlIlill lllilIllil;
   private static final float lilIIIllil = 13.5F;
   private final iiIIlillIIlIlill lIlilIllil;
   private final llliiiiilliiii iiIIlIllil;
   private int ililIiIlil;
   private double IIiIliIlil;
   private final iiIiIliIIliIli IilIIlllil;
   private final iiIiIliIIliIli lllIiIllil;
   private static final float iIIIIIllil = 0.78F;
   private final liIliIliiIliIl liiiIiIlil = lIilliIill();
   private static final float llilliIlil = 2.0F;
   private boolean IilIliIlil;
   private final Map<String, iiIliiiIIlliii> IIiiIiIlil = new HashMap();
   private String lliiliIlil;
   private final iiIiIliIIliIli lIliIiIlil = new iiIiIliIIliIli();
   private static final float illIIIllil = 5.0F;
   private final iiIiIliIIliIli iilIIlllil;
   private double lilIliIlil;
   private final Map<String, iIlilliIllilli> IlillIllil;
   private float IIlIIiIlil;
   private final float[] llIiIiIlil = new float[64];
   private final iiIiIliIIliIli liiiIIllil;
   private String iililiIlil;
   private final iiIiIliIIliIli[] IIIiiIllil;
   private final iiIiIliIIliIli lIiIiIllil;
   private final llliiiiilliiii llIIlIllil;
   private final float[] IiiIIiIlil = new float[4];
   private static final float IiiiiiIlil = 5.0F;
   private float liliiIllil;
   private static final int IillilIlil = 3;
   private static final int IilliiIlil = -4205835;
   private final IliIIlllliIIll IiiIiIllil;
   private static final String[] iIIiIIllil;
   private final llliiiiilliiii liIIlIllil;
   private final iiIiiilIIliiil iIIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final liIliIliiIliIl lIlIliIlil;
   private static final int illlliIlil = 3;
   private long lIiIliIlil;
   private final liIliIliiIliIl iiIIliIlil;
   private static float[] iIiliiIlil = new float[16];
   private float IliliIllil;
   private boolean iIlIiIllil;
   private final LinkedList<Long> llIlliIlil;
   private final liIliIliiIliIl llIIliIlil;
   private long IiIIiIllil;
   public static int iiIiiiIlil;
   private long illiiiIlil;
   private static final float liiiiiIlil = 12.0F;
   private final float[] IlIiIiIlil = new float[64];
   private final IliIIlllliIIll liiIiIllil;
   public static final int lIiiiiIlil = -6645087;
   private String iIiiliIlil;
   private float IliIlIllil;
   private float IIIIIlllil;
   private final float[] liIiiIllil;
   private static final int IillliIlil = 4;
   private final float[] iliIIlllil;
   private final iiIIlillIIlIlill IiIiIIllil;
   private final liIliIliiIliIl IIIlliIlil;
   private float iiliiIllil;
   private int IIIIiiIlil;
   private iiIliiiIIlliii lIiiIiIlil;
   private static final float IiIIIIllil = 7.0F;
   private final llliiiiilliiii IllIlIllil;
   private static final float IlilliIlil = 0.8F;
   private static final float IliiiiIlil = 6.0F;
   private String lililiIlil;
   private final float[] lliIIlllil;
   private static final float IIiIIIllil = 0.8F;
   private float lIIIiiIlil;
   private String IIIIiIllil;
   private final Map<String, float[]> llIlIiIlil = new HashMap();
   private final llliiiiilliiii lIlIlIllil;
   private static final int illlilIlil = 6;
   private static final int iiIlIIllil = 40;
   private static final class_1304[] IIllIIllil;
   private static final SimpleDateFormat iiiiiiIlil;
   private final liIliIliiIliIl ilIIliIlil;
   private int lllIliIlil;
   private final iiIiiilIIliiil llIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIlliillIIlliil[] iIiilIllil;
   private final iiIiIliIIliIli illIiIllil;
   private int liilIiIlil;
   private float llIIiiIlil;
   private static final long llIlIIllil = 500000000L;
   private static final long IiIiliIlil = 5200000000L;
   private static final float lIilliIlil = 17.0F;
   private final iiIiiilIIliiil ilililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float IliIiiIlil;
   private long IIIlIlllil;
   private double illiliIlil;
   private float illiiIllil;
   private static final float lIIIIIllil = 0.9F;
   private final float[] iiIlIiIlil = new float[64];
   private final iiIIlillIIlIlill iiIiIIllil;
   private int lIlliiIlil;
   public static final int liliiiIlil = -233499369;
   private final iiIiiilIIliiil IlililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIIlIIiIIlIlIIi illIlIllil;
   private final float[] IIilIiIlil = new float[256];
   private final llliiiiilliiii ilIIlIllil;
   private boolean IIliliIlil;
   private final liIliIliiIliIl lIIlliIlil;
   private final int[] IillIiIlil = new int[64];
   private float liIiIiIlil;
   private float iIlIiiIlil;
   private final iiIIlillIIlIlill IIlilIllil;
   private float iIlIIiIlil;
   private final iiIIlillIIlIlill iIlilIllil;
   private double lliIliIlil;
   private final IliIIlllliIIll IIIliIllil;
   private int llIIiIllil;
   private final llliiiiilliiii lililIllil;
   private final iiIiIliIIliIli lliiIIllil;
   private static final float lIlIIIllil = 26.0F;
   public static int IiiliiIlil;
   private final iiIiIliIIliIli iIiiIIllil;
   private float IIlIiIllil;
   private static final float iiIIIIllil = 12.0F;
   private final float[] iIIiIiIlil = new float[64];
   private long iilliIllil;
   private final iiIiIliIIliIli[] lIIIIlllil;
   private static final float ilIIIlllil = 3.0F;
   private final ArrayList<ilIllIiIll> IllliIllil;
   private static final long iIIlIIllil = 50000000L;
   private long IIlllIllil;
   private final iiIiiilIIliiil IIililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiIliIIliIli illiIIllil;
   private final IliIIlllliIIll IiiiiIllil;
   private final String[] liIlIiIlil = new String[64];
   private int iiiiilIlil;
   private final float[] llllIiIlil = new float[64];
   private boolean IiIlliIlil;
   private final IliIIlllliIIll iiiIiIllil;
   private int iIIIiIllil;
   private ilIllIiIll lilllIllil;
   private float IllIIiIlil;
   private static final float lIIlIiIlil = 10.0F;
   private final liIliIliiIliIl liiIliIlil;
   private int IlIIiIllil;
   private long IliIliIlil;
   private float IilIiiIlil;
   private final iiIiIliIIliIli iliiIIllil;
   private static final int iIllliIlil = 0;
   private static final int IllIIlllil = 161;
   private final Map<class_2960, iilIiIIiIIiIiIIi> lIillIllil;
   private float IllIiiIlil;
   private static long llIiiiIlil = 0L;
   private final int[] IIliiIllil;
   private float lIiIiiIlil;
   private float iliIiiIlil;
   private final iiIiiilIIliiil IlIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float lIiIlIllil;
   private class_1799[] lIIiiIllil;
   private final iiIIlillIIlIlill liIiIIllil;
   private final float[] IlIliiIlil;
   private static final int iiiIIiIlil = 5;
   private final iiIiIliIIliIli iiiiIIllil;
   private float llIliIllil;
   private final boolean[] iIIIIlllil;
   private static final int IlllliIlil = 1;
   private static final float ililliIlil = 16.0F;
   private final iiIiIliIIliIli iiliIIllil;
   private float iiIIiiIlil;
   private boolean ilIlliIlil;
   private final iiIiIliIIliIli iliIiIllil;
   private static final String[] iIlIIlllil;
   private final float[] iIlliiIlil;
   private class_1309 liIlliIlil;
   private float lIlIiiIlil;
   private final ArrayList<illiIIlIiliIIl> IIillIllil;
   private static final long llIiliIlil = 180000000L;
   private final iiIiiilIIliiil IiililIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final ArrayDeque<long[]> iIiIliIlil;
   private long IiiiliIlil;
   private final float[] iiIIIlllil;
   private final liIliIliiIliIl iliIliIlil;
   private final ArrayList<iIlilliIllilli> llillIllil;
   private static final float lIiIIIllil = 0.8F;
   private final iiIIlillIIlIlill lIliIIllil;
   private long iiIlliIlil;
   private final iiIIlIIiIIlIlIIi IilIlIllil;
   private float lIIliIllil;
   public static final int illliiIlil = -8224116;
   private static final int IIIIIIllil = 721420287;
   private int IiilIiIlil = Integer.MIN_VALUE;
   private final iiIIlIIiIIlIlIIi IIlliIllil;
   private static final String iIllIIllil = "Keybinds";
   private final iiIIlillIIlIlill iiIilIllil;
   private long iIIIliIlil = 0L;
   private int lIllliIlil;
   private static final float iilIIIllil = 0.9F;
   private static final float IliIIIllil = 5.0F;
   private float lIlIIiIlil;
   private final llliiiiilliiii iIlIlIllil;
   private final llliiiiilliiii[] lIiilIllil;
   private final liIliIliiIliIl iiiiIiIlil = lIilliIill();
   private final llliiiiilliiii lIiIIlllil;
   private final iiIiIliIIliIli lilIIlllil;
   private final iiIiIliIIliIli IlliIIllil;
   private final float[] IIllIiIlil = new float[64];
   private final String[] IiIlIiIlil = new String[64];
   private final lliliIIiililiIIi llliilIlil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private double IlIIIiIlil;
   private static final int iiliIiIlil = 2;
   private static final int llllilIlil = 260;
   private static final float IiiIIIllil = 4.0F;
   private static final float iillIIllil = 2.4E8F;
   private final iiIIlIIiIIlIlIIi lilIlIllil;
   private final IIIlliillIIlliil[] IliilIllil;
   private final int[] lillIiIlil = new int[64];
   private int iIlllIllil;
   private float IlIllIllil;
   private float iIiIiiIlil;
   private float IiillIllil;
   private static final String[] lIlIIlllil;
   private static final String[] liliIiIlil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private int lllliIllil;
   private final iiIIlillIIlIlill liiIiiIlil;
   private float iilIiiIlil;
   private final float[] iliIIiIlil = new float[2];
   private long IilliIllil;
   private final float[] iliilIllil;
   private static long IlIiiiIlil = -1L;
   private final float[] iiiIIlllil;
   private static final float llIIIIllil = 6.0F;
   private final iiIiIliIIliIli lilIiIllil;
   private final int[] IiiliIllil;
   private float lliIlIllil;
   private final iiIiIliIIliIli IiiiIIllil;
   private final iiIiiilIIliiil liliilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int liIlIIllil = 200;
   public static int ilIiiiIlil;
   private static final Color liIIIlllil;
   private static final int llllliIlil = 2;
   private final float[] lIIiIiIlil = new float[64];
   private static final float lliIIIllil = 10.0F;
   private final iiIIlillIIlIlill illilIllil;
   private long liiiliIlil;
   private static final float liilliIlil = 22.0F;
   private String IIiiliIlil;
   private static final float iliiiiIlil = 9.0F;
   public static final int iiliiiIlil = 620756991;
   private final iiIiIliIIliIli lIIIlIllil;
   private static int lIIilIllil;
   private final llliiiiilliiii IIiilIllil;
   private final iiIiIliIIliIli IiliIIllil;
   private static float lIiliiIlil;
   private static final float IllIIIllil = 6.0F;
   private float iIIliIllil;
   private boolean IilIIiIlil;
   private String iIIIIiIlil;
   private int IllIliIlil;
   public static int lliliiIlil;
   private static final float IIilliIlil = 17.0F;
   private int ilIIiIllil;
   private static final long ilIiliIlil = 200000000L;
   private final iiIiIliIIliIli IIiiIIllil;
   private final liIliIliiIliIl IIlIliIlil;
   private static final String iiilIIllil = "None online";
   private final iiIiiilIIliiil liIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiIliIIliIli IIiIiIllil;
   private static final int liiIIiIlil = 64;
   private double llIIIiIlil;
   private final llliiiiilliiii[] lllIlIllil;
   private float iIiIIiIlil;
   private static final String IlilIIllil = "Staff";
   private float IlIIiiIlil;
   private double iilIliIlil;
   private final LinkedList<Long> IlIlliIlil;
   private double IililiIlil;
   private final float[] lliiiIllil;
   private float IIiIiiIlil;
   private static final float iIiiiiIlil = 20.0F;
   private final iiIIlIIiIIlIlIIi iiIliIllil;
   private final iiIiIliIIliIli iIIliiIlil;
   private final iiIIlIIiIIlIlIIi lIIliiIlil;
   public static int IIIiiiIlil;
   private long lIiliIllil;
   private static float iIIilIllil;
   private final float[] liiIIlllil;
   private float lliliIllil;
   private static final String ililIIllil = "LMB";
   private float iIiliIllil;
   private static final float iIlIIIllil = 4.0F;
   private static final float llliIiIlil = 0.05F;
   private float IIlIiiIlil;
   public static int lIliiiIlil;
   private static int IIIilIllil;
   private long IiIilIllil;
   private final iiIiiilIIliiil lIIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl IiliilIlil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 100, 60, 220, 10);
   private final iiIiIliIIliIli liliIIllil;
   private int lllllIllil;
   private final IliIIlllliIIll iIiIIlllil;
   private boolean liIIliIlil;
   private final float[] iiIiiIllil;
   private final iiIiIliIIliIli[] iIIIlIllil;
   private float lIiIIiIlil;
   private final liIliIliiIliIl IIIIliIlil = lIilliIill();
   private final long[] liiliIllil;
   private static final String lIllIIllil = "Modules";
   private int IIliIiIlil;
   private final int[] ililiIllil;
   private boolean iiIiliIlil;
   private static final long IIIlIIllil = 250000000L;
   private int IllllIllil;
   private static final String[] lIIiIIllil;
   private float IiIiIiIlil;
   private int llilIiIlil;
   private final iiIiiilIIliiil ilIiilIlil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String llilIIllil = "Build";
   private long liIllIllil;
   private static final float IlIiliIlil = 11.0F;
   private static final float IiIliiIlil = 20.0F;
   private final boolean[] ilIiIiIlil = new boolean[64];
   private static final float illiIiIlil = 0.045F;
   private IIliiIlllIliiIll IiiIiiIlil;
   private static final float IIlIIIllil = 5.0F;
   private static final String iillilIlil = "Corz Client";
   private final iiIiIliIIliIli IllIiIllil;
   private final iiIiIliIIliIli llliIIllil;
   private final boolean[] iillIiIlil = new boolean[64];
   public static int iiiliiIlil;
   private static final long lillIIllil = 1000000000L;
   private static IIililillIililil lillilIlil;
   private static final float iiiIIIllil = 120.0F;
   private static final String IIlIIlllil = "Performance";
   private static final float IIIiliIlil = 8.0F;
   private static final int IIiiiiIlil = -1;
   private static final long IiIlIIllil = 900000000L;

   private List<ilIllIiIll> Illlllllllll() {
      long var1 = ((long)this.llliilIlil.Ililllililil() + 1L) * -7046029254386353131L;

      for(ilIllIiIll var4 : llilIllililIll.IilliliilIIi()) {
         if (var4 != null && var4.IliIlllilIi() && var4.iIlIlllllill()) {
            var1 = (var1 ^ (long)System.identityHashCode(var4) * -7046029254386353131L + (long)var4.IIIilIIiiIIi()) * -4658895280553007687L;
         }
      }

      if (var1 != this.illiiiIlil || this.IiliiiIlil == 0) {
         this.illiiiIlil = var1;
         this.llliiiIlil = this.illlllIillll();
         ++this.IiliiiIlil;
      }

      return this.llliiiIlil;
   }

   private void llIiililIiil(class_332 now, int sh, int sw, long ctx) {
      boolean var6 = this.iiililIlil.Iilllilliill() && Iiiilllliiilll.field_1687 != null;
      if (this.IIliIIllil.IilliliilIIi(var6, llIiiiIlil) && Iiiilllliiilll.field_1687 != null) {
         int var7 = this.IIllIllIllIl();
         float var8 = (float)var7 / 2.0F;
         this.iIIiilIlIiil(sh, sw, var7);
         float var9 = this.IlIllIllil + this.lIiIIiIlil;
         float var10 = this.llIllIllil + this.iIiIIiIlil;
         float var11 = var9 + var8;
         float var12 = var10 + var8;
         this.IilIililIi(var9, var10, (float)var7, (float)var7);
         this.iIIiIlIlIiIl(this.IlIllIllil, this.llIllIllil, (float)var7);
         float var13 = Iiiilllliiilll.method_61966().method_60637(true);
         float var14 = Iiiilllliiilll.field_1724.field_5982 + (Iiiilllliiilll.field_1724.method_36454() - Iiiilllliiilll.field_1724.field_5982) * var13;
         double var15 = Math.toRadians(((double)var14 % (double)360.0F + (double)180.0F + (double)360.0F) % (double)360.0F);
         float var17 = IliiIilliiIi.IilliliilIIi(this.IIliIIllil.IliIlllilIi());
         boolean var18 = llliIlIlilliIlIl.lIIIiiIIIi(now, var11, var12, this.IIliIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.iliIIlIiIl, var9, var10, (float)var7, (float)var7, 1.0F);
            float var19 = Math.max(4.0F, var8 - 16.0F);
            float var20 = Math.max(6.0F, var8 - 14.0F);
            float var21 = Math.max(8.0F, var8 - 8.0F);
            llliIlIlilliIlIl.IIIillIIil(now, var11 - var19, var12, var19 * 2.0F, 268435455);
            llliIlIlilliIlIl.iIIilIlIil(now, var11, var12 - var19, var19 * 2.0F, 268435455);
            llliIlIlilliIlIl.IIillIiliIil(var11 - var20, var12 - var20, var20 * 2.0F, var20 * 2.0F, var20, IIIiiIillIIiiIil.Illlllllilll(), 536870911);
            if (this.liliilIlil.Iilllilliill()) {
               double var22 = (double)Math.max(1, this.iiliilIlil.Iilllilliill());
               class_746 var24 = Iiiilllliiilll.field_1724;
               double var25 = class_3532.method_16436((double)var13, var24.field_6038, ((class_1657)var24).method_23317());
               double var27 = class_3532.method_16436((double)var13, var24.field_5989, ((class_1657)var24).method_23321());
               List var29 = Iiiilllliiilll.field_1687.method_18456();
               int var30 = var29.size();
               if (this.IiIilIllil == 0L || ctx - this.IiIilIllil >= 500000000L) {
                  this.IiIilIllil = ctx;
                  this.ilIilIllil.clear();

                  for(int var31 = 0; var31 < var30; ++var31) {
                     class_1657 var32 = (class_1657)var29.get(var31);
                     if (var32 != var24 && iIIiIiIlIlIiIiIl.liiiIIllIl(var32)) {
                        this.ilIilIllil.add(var32.method_5667());
                     }
                  }
               }

               for(int var49 = 0; var49 < var30; ++var49) {
                  class_1657 var50 = (class_1657)var29.get(var49);
                  if (var50 != var24) {
                     double var33 = class_3532.method_16436((double)var13, var50.field_6038, var50.method_23317()) - var25;
                     double var35 = class_3532.method_16436((double)var13, var50.field_5989, var50.method_23321()) - var27;
                     double var37 = Math.sqrt(var33 * var33 + var35 * var35);
                     if (!(var37 > var22)) {
                        double var39 = Math.atan2(var33, -var35) - var15;
                        double var41 = var37 / var22 * (double)var20;
                        llliIlIlilliIlIl.llIililIil(now, var11 + (float)(Math.sin(var39) * var41), var12 - (float)(Math.cos(var39) * var41), 3.0F, this.ilIilIllil.contains(var50.method_5667()) ? -8393375 : -1750963);
                     }
                  }
               }
            }

            llliIlIlilliIlIl.llIililIil(now, var11, var12, 3.0F, -920587);
            float var46 = 10.0F;

            for(int var23 = 0; var23 < 4; ++var23) {
               double var47 = (double)var23 * (Math.PI / 2D) - var15;
               float var26 = var11 + (float)(Math.sin(var47) * (double)var21);
               float var48 = var12 - (float)(Math.cos(var47) * (double)var21);
               llliIlIlilliIlIl.lililiilil(IIIiIIllil[var23], llliIlIlilliIlIl.IIIllIIliIIl(var26 - this.liiIlIllil[var23] / 2.0F), llliIlIlilliIlIl.illilIilil(var48 - var46 / 2.0F, var46, 0.78F), 0.78F, var23 == 0 ? llliIlIlilliIlIl.liIlIlIiIl : llliIlIlilliIlIl.iiIlIlIiIl);
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(now, var18);
            IliiIilliiIi.lIiiIiIlilli(var17);
         }

      }
   }

   private void IlliIlllliIl(int y, int x, int w, int h) {
      iiIliiiIIlliii var5 = this.lIiiIiIlil;
      if (var5 != null && w > 0) {
         w = (int)Math.ceil((double)((float)w * var5.illiIIIlIl));
         h = (int)Math.ceil((double)((float)h * var5.illiIIIlIl));
      }

      ilIiiiIlil = y;
      IiIiiiIlil = x;
      liIiiiIlil = w;
      iiIiiiIlil = h;
      IIliiiIlil = llIiiiIlil;
   }

   private int liIiiiiIii(String id) {
      if (this.IiilIiIlil != iiillIllil) {
         return -1;
      } else {
         for(int var2 = 0; var2 < this.llilIiIlil; ++var2) {
            if (this.IiIlIiIlil[var2].equals(id)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private String IIIllllIIlll(class_1293 e) {
      try {
         return ((class_1291)e.method_5579().comp_349()).method_5560().getString();
      } catch (Exception var3) {
         return IliIlllilIi<invokedynamic>();
      }
   }

   private static boolean ilIlilIiIlil(illiIIlIiliIIl a, illiIIlIiliIIl b) {
      if (a.IIIIIIiIllIIIIIiIl != b.IIIIIIiIllIIIIIiIl) {
         return !a.IIIIIIiIllIIIIIiIl;
      } else {
         return a.lIiiliiIliIiiliiIl > b.lIiiliiIliIiiliiIl;
      }
   }

   private void lIiIIiiIiIIi(class_332 ctx, int sh) {
      if (this.iIlilIllil.IilliliilIIi(this.llililIlil.Iilllilliill(), llIiiiIlil)) {
         int var3 = (int)Math.floor(IlIllllllIllll.lIIlliIIll(Iiiilllliiilll.field_1724.method_23317()));
         int var4 = (int)Math.floor(Iiiilllliiilll.field_1724.method_23318());
         int var5 = (int)Math.floor(IlIllllllIllll.IlIllllIll(Iiiilllliiilll.field_1724.method_23321()));
         if (this.lIiilIllil[0].IliIlllilIi((long)var3)) {
            this.lIiilIllil[0].liiiIIllIl(String.valueOf(var3), 0.9F, true, true);
         }

         if (this.lIiilIllil[1].IliIlllilIi((long)var4)) {
            this.lIiilIllil[1].liiiIIllIl(String.valueOf(var4), 0.9F, true, true);
         }

         if (this.lIiilIllil[2].IliIlllilIi((long)var5)) {
            this.lIiilIllil[2].liiiIIllIl(String.valueOf(var5), 0.9F, true, true);
         }

         long var6 = Math.max(0L, Math.round(this.IIiIliIlil * (double)10.0F));
         if (this.IililIllil.IliIlllilIi(var6)) {
            this.IililIllil.liiiIIllIl(var6 / 10L + IliIlllilIi<invokedynamic>() + var6 % 10L, 0.9F, true, false);
         }

         float var8 = this.IililIllil.iliillIlIl + 4.0F + this.illiiIllil;

         for(int var9 = 0; var9 < 3; ++var9) {
            var8 += this.IlliiIllil[var9] + 4.0F + this.lIiilIllil[var9].iliillIlIl + 8.0F;
         }

         float var23 = 23.0F;
         float var10 = 6.0F;
         float var11 = this.lIiIiIllil.IilliliilIIi((float)Math.ceil((double)(var10 + 12.0F + 5.0F + var8 + 7.0F)), this.iIiliIllil, 0.08F);
         float var12 = 6.0F + this.lIiIIiIlil;
         float var13 = (float)sh - 6.0F - var23 + this.iIiIIiIlil;
         this.IilIililIi(var12, var13, var11, var23);
         float var14 = IliiIilliiIi.IilliliilIIi(this.iIlilIllil.IliIlllilIi());
         boolean var15 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var12 + var11 / 2.0F, var13 + var23 / 2.0F, this.iIlilIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IiiIIlIiIl, var12, var13, var11, var23, 1.0F);
            llliIlIlilliIlIl.iIIIlIlIIl(var12 + var10, var13 + llliIlIlilliIlIl.IIIllIIliIIl((var23 - 12.0F) / 2.0F), lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llliIlIlilliIlIl.iIllIlIiIl, 1.0F);
            float var16 = var12 + var10 + 12.0F + 5.0F;
            float var17 = llliIlIlilliIlIl.illilIilil(var13, var23, 0.78F);
            float var18 = llliIlIlilliIlIl.illilIilil(var13, var23, 0.9F);

            for(int var19 = 0; var19 < 3; ++var19) {
               llliIlIlilliIlIl.lililiilil(IillIIllil[var19], var16, var17, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
               var16 += this.IlliiIllil[var19] + 4.0F;
               llliIlIlilliIlIl.lliililiil(this.lIiilIllil[var19], var16, var18, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
               var16 += this.lIiilIllil[var19].iliillIlIl + 8.0F;
            }

            llliIlIlilliIlIl.iIiilIliil(this.IililIllil, var16 + this.IililIllil.iliillIlIl, var18, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.lililiilil(IliIlllilIi<invokedynamic>(), var16 + this.IililIllil.iliillIlIl + 4.0F, var17, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var15);
            IliiIilliiIi.lIiiIiIlilli(var14);
         }

      }
   }

   protected void illIlIilIl(iilIIlilIIiIIlil event) {
      long var4 = 6087852887538186535L;
      String var2 = this.lIiiliIlil;
      if (var2 != null && this.IIIIIiIlil && Iiiilllliiilll.field_1755 instanceof class_408) {
         this.IililiIlil += event.IliIlllilIi();
         var4 ^= ((long)((int)this.IililiIlil) << 32 ^ var4) & -1L << 32;
         event.iIlIlllllill();
         if ((int)(var4 >>> 32) != 0) {
            this.IililiIlil -= (double)((int)(var4 >>> 32));
            this.iiiilIIIIi(var2, (int)(var4 >>> 32));
            this.llIliiIlil[(int)(var4 >>> 32) > 0 ? 4 : 2] = System.nanoTime();
         }
      }
   }

   public boolean iIlIlllllill() {
      return false;
   }

   private static float IlIillllIill(IIlIiIlllIlIiIll k, IIIlliillIIlliil f, float s) {
      return (8.0F + (f.IiIlIlilil != null ? 14.0F : 0.0F) + 8.0F) * s + lIIilliIIill(k, f, s);
   }

   private void iilIIiIIiIIi(float base, float top, float x0, float x1) {
      float var5 = 5.0F;
      float var6 = 0.1F;
      int var7 = IIiIiIIllIiIiIIl.iIlIlllllill();
      float var8 = IIiIiIIllIiIiIIl.iliIiiliiiii();
      float var9 = this.IIiIIlllil.liiiIIllIl(IIiIiIIllIiIiIIl.lIiiIiIlilli(), this.iIiliIllil, 0.12F, 0.01F);
      int var10 = 0;
      this.lliIIlllil[var10] = 0.0F;
      this.iliIIlllil[var10] = var9;
      ++var10;
      float var11 = var9;

      for(int var12 = 0; var12 < var7 && var10 < 161; ++var12) {
         float var13 = -((float)var12 + 0.5F + var8) * 0.1F;
         float var14 = IIiIiIIllIiIiIIl.IilliliilIIi(Math.max(0, var12 - 1));
         float var15 = IIiIiIIllIiIiIIl.IilliliilIIi(var12);
         float var16 = IIiIiIIllIiIiIIl.IilliliilIIi(Math.min(var7 - 1, var12 + 1));
         float var17 = (var14 + 2.0F * var15 + var16) / 4.0F;
         this.lliIIlllil[var10] = var13;
         this.iliIIlllil[var10] = var17;
         ++var10;
         var11 = Math.max(var11, var17);
         if (var13 < -5.0F) {
            break;
         }
      }

      if (var10 >= 2) {
         float var30 = this.iilIIlllil.liiiIIllIl(Math.max(30.0F, var11 * 1.18F), this.iIiliIllil, 0.45F, 0.5F);
         float var31 = (top - base) / 5.0F;
         float var32 = (x1 - x0) / Math.max(1.0F, var30);
         int var33 = 0;

         for(int var34 = var10 - 1; var34 >= 0 && var33 < this.IiiIIlllil.length; --var34) {
            float var36 = this.lliIIlllil[var34];
            float var18 = this.iliIIlllil[var34];
            if (var34 == var10 - 1 && var36 < -5.0F && var10 >= 2) {
               float var19 = this.lliIIlllil[var34 - 1];
               float var20 = this.iliIIlllil[var34 - 1];
               float var21 = (-5.0F - var36) / (var19 - var36);
               var18 += (var20 - var18) * var21;
               var36 = -5.0F;
            }

            this.IiiIIlllil[var33] = top + var36 * var31;
            this.liiIIlllil[var33] = x1 - Math.min(var30, var18) * var32;
            ++var33;
            if (var34 == 0) {
               break;
            }

            float var39 = this.lliIIlllil[var34 - 1];
            float var41 = this.iliIIlllil[Math.min(var10 - 1, var34 + 1)];
            float var43 = var18;
            float var22 = this.iliIIlllil[var34 - 1];
            float var23 = this.iliIIlllil[Math.max(0, var34 - 2)];

            for(int var24 = 1; var24 < 3 && var33 < this.IiiIIlllil.length; ++var24) {
               float var25 = (float)var24 / 3.0F;
               float var26 = var25 * var25;
               float var27 = var26 * var25;
               float var28 = 0.5F * (2.0F * var43 + (-var41 + var22) * var25 + (2.0F * var41 - 5.0F * var43 + 4.0F * var22 - var23) * var26 + (-var41 + 3.0F * var43 - 3.0F * var22 + var23) * var27);
               this.IiiIIlllil[var33] = top + (var36 + (var39 - var36) * var25) * var31;
               this.liiIIlllil[var33] = x1 - Math.max(0.0F, Math.min(var30, var28)) * var32;
               ++var33;
            }
         }

         int var35 = llliIlIlilliIlIl.Illlllllilll();
         float var37 = (top - base) * 0.14F;
         llliIlIlilliIlIl.iilllIIill(this.IiiIIlllil, this.liiIIlllil, var33, x0, x1, var35, 0.42F, base, var37);
         llliIlIlilliIlIl.lIilliIill(this.IiiIIlllil, this.liiIIlllil, var33, 1.4F, var35, base, var37);
         float var38 = this.IiiIIlllil[var33 - 1];
         float var40 = this.liiIIlllil[var33 - 1];
         float var42 = 3.4F;
         float var44 = 4.0F;
         llliIlIlilliIlIl.Ililllililil(var38 - var42 / 2.0F, var40 - var42 / 2.0F, var42, var42, var42 / 2.0F, llliIlIlilliIlIl.iliIiiliiiii(var35, 0.55F), var44, true);
         llliIlIlilliIlIl.llIililIil((class_332)null, var38, var40, var42, -1);
      }
   }

   public void liilliiill(class_332 ctx) {
      this.IIIIIiIlil = this.IIiiilIlil.Iilllilliill() && this.IliIlllilIi() && Iiiilllliiilll.field_1755 instanceof class_408;
      this.IliiIiIlil = ctx;
      if (!this.IIIIIiIlil && this.iiIiliIlil) {
         this.lIlliiIlli();
      }

      this.iiIiliIlil = this.IIIIIiIlil;
      boolean var2 = !IIiliilllIiliill.liiiIIllIl();
      if (var2 && !this.IIIIIiIlil) {
         this.liIIliIlil = true;
      } else {
         if (this.liIIliIlil && !this.IIIIIiIlil) {
            this.liIIliIlil = false;
            this.ilIIliIlil.IilliliilIIi((double)0.0F);
            this.ilIIliIlil.lIiiIiIlilli((double)1.0F);
         }

         boolean var3 = this.IliIlllilIi();
         if (Math.abs(this.IiIIliIlil.IiIlliIliiIl() - (var3 ? (double)1.0F : (double)0.0F)) > 0.01) {
            this.IiIIliIlil.lIiiIiIlilli(var3 ? (double)1.0F : (double)0.0F);
         }

         float var4 = (float)(this.IiIIliIlil.iIlIlllllill() * this.ilIIliIlil.iIlIlllllill());
         if (!var3 && var4 < 0.004F) {
            lIliIliIliIl();
         } else {
            if (this.IIIIIiIlil) {
               this.IiiiilIlil.clear();
               this.illIIlIilIIl(ctx);
            }

            double var5 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var7 = Iiiilllliiilll.method_22683().method_4476(iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var8 = (float)((double)var7 / var5);
            boolean var9 = Math.abs(var8 - 1.0F) > 1.0E-4F;
            int var10 = var9 ? Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var8) : Iiiilllliiilll.method_22683().method_4486();
            int var11 = var9 ? Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var8) : Iiiilllliiilll.method_22683().method_4502();
            int var12 = var10;
            int var13 = var11;
            if (var9) {
               CorzClient.fontManager.iIlIlllllill((class_4587)null);
               IIIiiIillIIiiIil.IliIlllilIi(new class_4587());
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var10;
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)var11;
               ctx.method_51448().pushMatrix();
               ctx.method_51448().scale(var8, var8);
               int var14 = (int)Math.round(var5 * (double)100.0F);
               if (var7 != this.IIllliIlil || var14 != this.lIllliIlil) {
                  this.IIllliIlil = var7;
                  this.lIllliIlil = var14;
               }
            } else {
               CorzClient.fontManager.iIlIlllllill((class_4587)null);
            }

            this.liiiilIlil = var10;
            this.iiiiilIlil = var11;
            ++llIiiiIlil;
            this.IIiIIllIiIIl();
            boolean var24 = Iiiilllliiilll.field_1724 != null;
            this.ilillIiill(this.lliiIiIlil, this.IIililIlil.Iilllilliill() || (this.lIililIlil.Iilllilliill() || this.llIiilIlil.Iilllilliill()) && var24);
            this.ilillIiill(this.IiiiIiIlil, (this.llililIlil.Iilllilliill() || this.iiililIlil.Iilllilliill()) && var24);
            this.ilillIiill(this.iliiIiIlil, this.iIililIlil.Iilllilliill());
            this.ilillIiill(this.IIIIliIlil, this.IlililIlil.Iilllilliill() && IiIlIiIiliIlIiIi.Illlllllilll().iIlIlllllill());
            this.ilillIiill(this.liiiIiIlil, this.ilililIlil.Iilllilliill() && var24);
            this.ilillIiill(this.iiiiIiIlil, this.liililIlil.Iilllilliill());
            boolean var15 = this.IIIiilIlil.Iilllilliill() && var24 && this.liIlliIlil != null && !this.liIlliIlil.method_31481() && (!this.lIIiilIlil.Iilllilliill() || this.liIlliIlil instanceof class_1657) && System.currentTimeMillis() - this.iiIlliIlil < 1500L;
            if (Math.abs(this.llIIliIlil.IiIlliIliiIl() - (var15 ? (double)1.0F : (double)0.0F)) > 0.01) {
               this.llIIliIlil.IIIllIIliIIl(var15 ? 360 : 200);
               this.llIIliIlil.lIiiIiIlilli(var15 ? (double)1.0F : (double)0.0F);
            }

            this.ilillIiill(this.iiIIliIlil, this.iIIiilIlil.Iilllilliill() && var24);
            this.ilillIiill(this.IIlIliIlil, this.IlIiilIlil.Iilllilliill() && var24);
            this.ilillIiill(this.lIlIliIlil, this.llIiilIlil.Iilllilliill() && var24);
            this.ilillIiill(this.iIlIliIlil, this.ilIiilIlil.Iilllilliill() && var24);
            boolean var16 = var4 < 0.999F;
            class_4587 var17 = CorzClient.fontManager.liiiIIllIl();
            class_4587 var18 = IIIiiIillIIiiIil.liiiIIllIl();
            float var19 = 1.0F;
            if (var16) {
               float var20 = -3.0F * (1.0F - var4);
               var19 = IliiIilliiIi.IilliliilIIi(var4);
               var17.method_22903();
               var17.method_46416(0.0F, var20, 0.0F);
               if (var18 != var17) {
                  var18.method_22903();
                  var18.method_46416(0.0F, var20, 0.0F);
               }

               ctx.method_51448().pushMatrix();
               ctx.method_51448().translate(0.0F, var20);
            }

            try {
               this.IIIillIIil(IliIlllilIi<invokedynamic>());
               this.iillIlIIilIl(ctx, var12, var13);
               this.iIIilIlIil();
               this.iilillIIiill(ctx, var12, var13);
               this.iIIliIlIli(false, true);
            } finally {
               if (this.lIiiIiIlil != null) {
                  llliIlIlilliIlIl.IlIIillIIi(ctx, this.iIiiIiIlil);
                  this.lIiiIiIlil = null;
                  this.iIiiIiIlil = false;
               }

               if (var16) {
                  ctx.method_51448().popMatrix();
                  if (var18 != var17) {
                     var18.method_22909();
                  }

                  var17.method_22909();
                  IliiIilliiIi.lIiiIiIlilli(var19);
               }

            }

            if (this.IIIIIiIlil) {
               double[] var25 = this.iiIliIIlli(var8);
               this.lliliilili(var25[0], var25[1]);
               this.IllIIllllIIl(ctx, this.llliliIlil, this.illiliIlil);
            }

            if (var9) {
               ctx.method_51448().popMatrix();
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               CorzClient.fontManager.iIlIlllllill((class_4587)null);
               IIIiiIillIIiiIil.IliIlllilIi(new class_4587());
            }

         }
      }
   }

   private void IiIilliIil(String w, iiIliiiIIlliii y, float x, float h, float id, float sc) {
      float[] var7 = (float[])this.IliiilIlil.get(w);
      if (var7 != null) {
         this.lIIIiiIlil = Illillllil(var7[0]);
         this.iIIIiiIlil = Illillllil(var7[1]);
         if (y != null) {
            y.iIliIIIlIl = false;
         }

      } else {
         this.lIliliIlil(w, y, x, h, id, sc);
      }
   }

   private static void ililIlIiilIl(class_4587 s, float cx, float ms, float cy) {
      s.method_22903();
      s.method_46416(cx, ms, 0.0F);
      s.method_22905(cy, cy, 1.0F);
      s.method_46416(-cx, -ms, 0.0F);
   }

   private void iIIilIlIil() {
      iiIliiiIIlliii var1 = this.lIiiIiIlil;
      if (var1 != null) {
         llliIlIlilliIlIl.IlIIillIIi(this.IliiIiIlil, this.iIiiIiIlil);
         this.lIiiIiIlil = null;
         this.iIiiIiIlil = false;
      }

      if (this.IIiIIiIlil != null && this.iliiilIlil != null) {
         this.lliiilIlil.put(this.IIiIIiIlil, this.iliiilIlil);
         float var2 = this.iliiilIlil[0] + this.lIiIIiIlil;
         float var3 = this.iliiilIlil[1] + this.iIiIIiIlil;
         float var4 = this.iliiilIlil[2];
         float var5 = this.iliiilIlil[3];
         if (var1 != null) {
            float var6 = var1.liiiIIllIl(var2 + var4);
            float var7 = var1.iIlIlllllill(var3 + var5);
            var2 = var1.liiiIIllIl(var2);
            var3 = var1.iIlIlllllill(var3);
            var4 = var6 - var2;
            var5 = var7 - var3;
         }

         if (this.liiiiIllil && this.IIiIIiIlil.equals(this.lIIIIiIlil)) {
            this.lIiIiiIiIi(this.IIiIIiIlil, this.iliiilIlil[0], this.iliiilIlil[1], var4, var5);
         } else {
            this.lIiIiiIiIi(this.IIiIIiIlil, var2 - this.IliIIiIlil, var3 - this.lliIIiIlil, var4, var5);
         }

         if (!this.IliiilIlil.containsKey(this.IIiIIiIlil) && this.iIiiilIlil.containsKey(this.IIiIIiIlil) && !this.IIiIIiIlil.equals(this.lIIIIiIlil)) {
            this.IIlIilIlIi(this.IIiIIiIlil, var2 - this.IliIIiIlil, var3 - this.lliIIiIlil, var4, var5);
         }
      }

      this.IIiIIiIlil = null;
      this.lIiIIiIlil = 0.0F;
      this.iIiIIiIlil = 0.0F;
      this.IliIIiIlil = 0.0F;
      this.lliIIiIlil = 0.0F;
      this.iliiilIlil = null;
   }

   private void iiliiIIiii(float seg, float... c) {
      float var3 = Math.abs(this.liIliiIlil - seg);
      if (var3 <= 5.0F) {
         this.Iiliililii(seg, var3, c);
      }

   }

   private float IlIIllllIIll(String id) {
      return this.IlIIillIIi(id)[1] + this.iliIiIiiIi(id);
   }

   private void iiiilIIIIi(String notches, int id) {
      iiIliiiIIlliii var3 = (iiIliiiIIlliii)this.IIiiIiIlil.get(notches);
      float var4 = var3 == null ? IIiillIiil(notches) : var3.liIiIIIlIl;
      this.Iiiilliiil(notches, (float)Math.round(var4 / 0.05F + (float)id) * 0.05F);
   }

   private boolean Illiilllliil(class_332 ctx, float y, float x, long now) {
      long var10 = 3323139933218761946L;
      IIlIiIlllIlIiIll var6 = lilllliillll();
      var10 ^= ((long)var6.IIillIiliIil() << 32 ^ var10) & -1L << 32;
      if (this.iiIilIllil.IilliliilIIi(this.lIililIlil.Iilllilliill() && (int)(var10 >>> 32) != 0, llIiiiIlil) && (int)(var10 >>> 32) != 0) {
         this.illiilIiliil(var6, now);
         float var8 = y + this.lIiIIiIlil;
         float var9 = x + this.iIiIIiIlil;
         lIliiliIliil(ctx, var6, llliIlIlilliIlIl.lllIIlIiIl, var8, var9, this.IliilIllil, this.iliilIllil, 3, this.lIlIiIllil, this.iiIilIllil);
         this.IilIililIi(var8, var9, this.lIlIiIllil, 20.0F);
         return true;
      } else {
         return false;
      }
   }

   private void iIiliIlili(String my, double id, double mx) {
      float[] var6 = (float[])this.lliiilIlil.get(my);
      if (var6 != null) {
         iiIliiiIIlliii var7 = (iiIliiiIIlliii)this.IIiiIiIlil.get(my);
         if (var7 == null) {
            var7 = new iiIliiiIIlliii();
            this.IIiiIiIlil.put(my, var7);
         }

         float var8 = var6[0] + this.lIIIlliIIIll(my);
         float var9 = var6[1] + this.IlIIllllIIll(my);
         this.IiIilliIil(my, var7, var8, var9, var6[2], var6[3]);
         this.iilIiiIlil = var8 + this.lIIIiiIlil * var6[2];
         this.IIiIiiIlil = var9 + this.iIIIiiIlil * var6[3];
         this.lIiIiiIlil = ((this.lIIIiiIlil >= 0.75F ? 0.0F : 1.0F) - this.lIIIiiIlil) * var6[2];
         this.iIiIiiIlil = ((this.iIIIiiIlil >= 0.75F ? 0.0F : 1.0F) - this.iIIIiiIlil) * var6[3];
         this.IIiiliIlil = my;
         this.IliIiiIlil = var7.liIiIIIlIl - this.IIililIili(id, mx);
      }
   }

   private void liililiiilil(int x, float w, float value, float i, Color y) {
      float var6 = 9.5F;
      llliIlIlilliIlIl.IIiillIiil(this.llliiIllil[x], w, llliIlIlilliIlIl.illilIilil(value, var6, 0.66F), 0.66F, llliIlIlilliIlIl.iiIlIlIiIl);
      llliIlIlilliIlIl.iIiilIliil(this.lllIlIllil[x], w + i, llliIlIlilliIlIl.illilIilil(value, var6, 0.8F), 0.8F, y);
   }

   private void Iiiilliiil(String v, float id) {
      if (v != null) {
         id = Math.max(0.6F, Math.min(1.8F, (float)Math.round(id * 100.0F) / 100.0F));
         iiIliiiIIlliii var3 = (iiIliiiIIlliii)this.IIiiIiIlil.get(v);
         if (var3 == null) {
            if (id == IIiillIiil(v)) {
               return;
            }

            var3 = new iiIliiiIIlliii();
            this.IIiiIiIlil.put(v, var3);
         }

         if (var3.liIiIIIlIl != id) {
            var3.liIiIIIlIl = id;
            iiiIIIlIIIlIIl.liiiIIllIl();
         }
      }
   }

   public static void iliIllIiiIll() {
      IIililillIililil var0 = lliiIliliiIl();
      if (var0 != null) {
         var0.IIliliIlil = false;
      }

   }

   private boolean ilIiiIiIii(float w, float y, float h, float x) {
      if (this.IlIiillIii(w, y, h, x)) {
         return false;
      } else {
         float var5 = Float.MAX_VALUE;
         float var6 = 6.0F;

         for(int var7 = 0; var7 < this.llilIiIlil; ++var7) {
            if (this.lIIiiiIIii(var7) && liiIiiiiIi(w, y, h, x, this.IlllIiIlil[var7], this.llllIiIlil[var7], this.lIllIiIlil[var7], this.iIllIiIlil[var7])) {
               float var8 = this.IlllIiIlil[var7];
               float var9 = this.llllIiIlil[var7];
               float var10 = this.lIllIiIlil[var7];
               float var11 = this.iIllIiIlil[var7];

               for(int var12 = 1; var12 < 5; ++var12) {
                  float var13 = var12 == 1 ? var8 - var6 - h : (var12 == 2 ? var8 + var10 + var6 : w);
                  float var14 = var12 == 3 ? var9 - var6 - x : (var12 == 4 ? var9 + var11 + var6 : y);
                  float var15 = Math.abs(var13 - w) + Math.abs(var14 - y);
                  if (!(var15 > 20.0F) && !(var15 >= var5) && !(var13 < 0.0F) && !(var14 < 0.0F) && !(var13 > (float)this.liiiilIlil - h) && !(var14 > (float)this.iiiiilIlil - x) && this.IlIiillIii(var13, var14, h, x)) {
                     var5 = var15;
                     this.IiIiIiIlil = var13;
                     this.liIiIiIlil = var14;
                  }
               }
            }
         }

         return var5 != Float.MAX_VALUE;
      }
   }

   private static IIlIiIlllIlIiIll lilllliillll() {
      IIlIiIlllIlIiIll var0 = IIlIiIlllIlIiIll.lIiiIiIlilli();
      return var0.IIillIiliIil() ? var0 : IIlIiIlllIlIiIll.liiiIIllIl();
   }

   private void ilillIiill(liIliIliiIliIl v, boolean a) {
      double var3 = a ? (double)1.0F : (double)0.0F;
      if (Math.abs(v.IiIlliIliiIl() - var3) > Double.longBitsToDouble(-2709692939430271999L ^ -1882145921971392390L)) {
         v.lIiiIiIlilli(var3);
      }

   }

   private void IIIlIilIIlIi(class_332 sw, int sh, int ctx) {
      this.IilIliIlil = false;
      List var4 = this.Illlllllllll();
      int var5 = Math.max(4, (int)(((float)ctx - 6.0F - 30.0F - 5.0F - 64.0F) / 13.5F));
      if (this.lllliIllil != this.IiliiiIlil || var5 != this.illliIllil) {
         this.lllliIllil = this.IiliiiIlil;
         this.illliIllil = var5;
         int var6 = var4.size();
         int var7 = var6 > var5 ? var5 - 1 : var6;
         this.lIlliIllil.IliIlllilIi();

         for(int var8 = 0; var8 < var7; ++var8) {
            this.lIlliIllil.liiiIIllIl((ilIllIiIll)var4.get(var8));
         }

         this.lIlliIllil.iIlIlllllill();
         if (var6 > 0 && this.lililIllil.IliIlllilIi((long)var6)) {
            this.lililIllil.liiiIIllIl(String.valueOf(var6), 0.8F, true, false);
            this.iiIliIllil.IliIlllilIi();
         }

         int var29 = var6 - var7;
         if (this.IIiilIllil.IliIlllilIi((long)var29)) {
            this.IIiilIllil.liiiIIllIl(var29 > 0 ? IliIlllilIi<invokedynamic>() + var29 + IliIlllilIi<invokedynamic>() : "", 0.78F, false, false);
         }
      }

      this.lIlliIllil.IilliliilIIi(1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.06F)));
      float var27 = this.lliIiIllil.liiiIIllIl(this.IIiilIllil.iIlIlllllill() ? 0.0F : 13.5F, this.iIiliIllil, 0.06F, 0.01F);
      if (!this.lllilIllil.IilliliilIIi(this.liililIlil.Iilllilliill() && this.lIlliIllil.ilIiiIliil, llIiiiIlil)) {
         this.IliIiIllil.iIlIlllllill();
      } else {
         float var28 = this.IliIiIllil.IilliliilIIi((float)Math.ceil((double)Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.IiliiIllil, this.lililIllil.iliillIlIl), Math.max(this.lIlliIllil.llIiiIliil, this.IIiilIllil.IliillIlIl) + 14.0F)), this.iIiliIllil, 0.08F);
         float var30 = 30.0F + this.lIlliIllil.IlIiiIliil + var27 + 5.0F;
         float var9 = (float)sh - 6.0F - var28;
         float var10 = 6.0F;
         this.IllIliIlil = Math.round(var9);
         this.lllIliIlil = Math.round(var10);
         this.illIliIlil = Math.round(var28);
         this.IilIliIlil = true;
         float[] var11 = (float[])this.IliiilIlil.get(IliIlllilIi<invokedynamic>());
         float[] var12 = (float[])this.lliiilIlil.get(IliIlllilIi<invokedynamic>());
         float var13 = (var11 != null && var11[0] <= 0.25F && var12 != null ? var12[0] : var9) + this.lIiIIiIlil;
         float var14 = var10 + this.iIiIIiIlil;
         this.IilIililIi(var13, var14, var28, var30);
         this.liliIliiliIl(var9, var10, var28);
         float var15 = IliiIilliiIi.IilliliilIIi(this.lllilIllil.IliIlllilIi());
         boolean var16 = llliIlIlilliIlIl.lIIIiiIIIi(sw, var13 + var28 / 2.0F, var14 + var30 / 2.0F, this.lllilIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.lIiIIlIiIl, var13, var14, var28, var30, 1.0F);
            float var17 = llliIlIlilliIlIl.illIlIilIl(sw, var13, var14, var28, lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llliIlIlilliIlIl.iIllIlIiIl, IliIlllilIi<invokedynamic>(), this.lililIllil, this.iiIliIllil, IiIlllliIlll(this.lIlliIllil.IlIiiIliil / 8.0F));
            this.lIlliIllil.lIiiIiIlilli(var17, var13 + 7.0F, var13 + var28 - 7.0F);
            if (var27 > 0.5F && !this.IIiilIllil.iIlIlllllill()) {
               float var18 = IliiIilliiIi.IilliliilIIi(var27 / 13.5F);

               try {
                  llliIlIlilliIlIl.lililiilil(this.IIiilIllil.lIiillIlIl, var13 + 7.0F, llliIlIlilliIlIl.illilIilil(var17 + this.lIlliIllil.IlIiiIliil, var27, 0.78F), 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var18);
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(sw, var16);
            IliiIilliiIi.lIiiIiIlilli(var15);
         }

      }
   }

   private void IIIillIIil(String id) {
      this.IIiIIiIlil = id;
      this.iliiilIlil = null;
      float[] var2 = this.IlIIillIIi(id);
      this.IliIIiIlil = this.IliIilliIi(id);
      this.lliIIiIlil = this.iliIiIiiIi(id);
      this.lIiIIiIlil = var2[0] + this.IliIIiIlil;
      this.iIiIIiIlil = var2[1] + this.lliIIiIlil;
      if (this.IilIIiIlil && id.equals(this.lIIIIiIlil) && liiilliiiill(id) >= 0) {
         this.iiiiiIllil = this.lIIliIllil;
         this.IIIIIlllil = this.iIIliIllil;
         this.lIiIIiIlil = this.lllIIiIlil - this.lIIliIllil;
         this.iIiIIiIlil = this.illIIiIlil - this.iIIliIllil;
      }

      if (!this.IIiiIiIlil.isEmpty()) {
         iiIliiiIIlliii var3 = (iiIliiiIIlliii)this.IIiiIiIlil.get(id);
         float[] var4 = var3 == null ? null : (float[])this.lliiilIlil.get(id);
         if (var4 != null && this.llIililIil(id, var3, var4[0] + this.lIiIIiIlil, var4[1] + this.iIiIIiIlil, var4[2], var4[3])) {
            this.lIiiIiIlil = var3;
            this.iIiiIiIlil = llliIlIlilliIlIl.lIIIiiIIIi(this.IliiIiIlil, var3.IiliIIIlIl, var3.liliIIIlIl, var3.illiIIIlIl);
         }
      }
   }

   private static void lIliIliIliIl() {
      liiliiIlil = -1L;
      IIliiiIlil = -1L;
      IlliiiIlil = -1L;
      IlIiiiIlil = -1L;
   }

   private static String llllIlilllIl(class_2960 id) {
      String var1 = id.method_12832();
      StringBuilder var2 = new StringBuilder(var1.length() + 4);
      boolean var3 = true;

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (var5 != '_' && var5 != '-' && var5 != ' ') {
            if (var3) {
               var2.append(Character.toUpperCase(var5));
               var3 = false;
            } else {
               var2.append(var5);
            }
         } else {
            var2.append(' ');
            var3 = true;
         }
      }

      String var6 = var2.toString().trim();
      return var6.isEmpty() ? id.toString() : var6;
   }

   public static float iIiIilIliIil() {
      return lilIiliilIil(lIIilIllil) ? iIIilIllil : 0.0F;
   }

   private boolean IIIIillIIIil() {
      return Arrays.equals(this.iIiiiIllil, lIiiiIllil);
   }

   private void lIililiIilil(lllIIIIiillIIIIi now, long sl) {
      for(int var4 = 0; var4 < this.llillIllil.size(); ++var4) {
         ((iIlilliIllilli)this.llillIllil.get(var4)).iIlIlllllill();
      }

      class_634 var14 = Iiiilllliiilll.method_1562();
      List var5 = now.ilIllIiIll();
      this.IlIIIlllil = now.IIllllIlll();
      int var6 = 0;

      for(int var7 = 0; var7 < var5.size(); ++var7) {
         liliIIIliiliIIIl var8 = (liliIIIliiliIIIl)var5.get(var7);
         String var9 = var8.llIIllllIl;
         iIlilliIllilli var10 = (iIlilliIllilli)this.IlillIllil.get(var9);
         if (var10 == null) {
            var10 = new iIlilliIllilli(var9);
            var10.IiilliIIIl = llliIlIlilliIlIl.lIliliIlil(var9, 0.9F);
            var10.IliIlllilIi((float)this.llillIllil.size() * 15.0F);
            this.IlillIllil.put(var9, var10);
            this.llillIllil.add(var10);
         }

         var10.liiiIIllIl();
         var10.lIiiIiIlilli(var8.iiIIllllIl, sl);
         class_640 var11 = var8.ilIIllllIl != null && var14 != null ? var14.method_2871(var8.ilIIllllIl) : null;

         try {
            var10.liilliIIIl = var11 == null ? null : var11.method_52810();
         } catch (Throwable var13) {
            var10.liilliIIIl = null;
         }

         ++var6;
      }

      for(int var15 = 1; var15 < this.llillIllil.size(); ++var15) {
         iIlilliIllilli var17 = (iIlilliIllilli)this.llillIllil.get(var15);

         int var19;
         for(var19 = var15 - 1; var19 >= 0 && iillilIIilil(var17, (iIlilliIllilli)this.llillIllil.get(var19)); --var19) {
            this.llillIllil.set(var19 + 1, (iIlilliIllilli)this.llillIllil.get(var19));
         }

         this.llillIllil.set(var19 + 1, var17);
      }

      int var16 = 0;

      for(int var18 = 0; var18 < this.llillIllil.size(); ++var18) {
         iIlilliIllilli var20 = (iIlilliIllilli)this.llillIllil.get(var18);
         if (!var20.IIIIIIiIllIIIIIiIl) {
            var20.IliiiilIllliiiilIl = (float)(var16++) * 15.0F;
         }
      }

      this.iIlllIllil = var6;
      this.illllIllil = now.IlIllllIll();
      if (this.liIIlIllil.IliIlllilIi((long)var6)) {
         this.liIIlIllil.liiiIIllIl(String.valueOf(var6), 0.8F, true, false);
         this.lilIlIllil.IliIlllilIi();
      }

   }

   private static String iiIlllIIllll(double v) {
      return String.format(IliIlllilIi<invokedynamic>(), v);
   }

   private void IIIiillIIiil(class_332 ctx, int sw) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      boolean var4 = this.iIliilIlil.Iilllilliill() && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1761.method_2908() && !(var3.method_5854() instanceof class_1309);
      int var5 = var3.method_5669();
      int var6 = Math.max(1, var3.method_5748());
      float var7 = this.IiiiIIllil.liiiIIllIl(var4 && var5 < var6 ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      float var8 = 15.0F;
      float var9 = 5.0F;
      float var10 = llliIlIlilliIlIl.IIIllIIliIIl(13.0F + var8 * 2.0F + var9 + (var8 + var9) * var7);
      double var11 = (double)Iiiilllliiilll.method_22683().method_4495();
      float var13 = (float)((double)Iiiilllliiilll.method_22683().method_4476(iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573()) / var11);
      class_634 var14 = Iiiilllliiilll.method_1562();
      boolean var15 = var14 != null && var14.method_70936().method_70952();
      float var16 = this.iliIiIllil.IliIlllilIi(var15 ? llliIlIlilliIlIl.IIIllIIliIIl(17.0F / var13) : 6.0F, this.iIiliIllil, 0.08F);
      float var17 = var4 && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? var16 + var10 * this.lililiilil() : 0.0F;
      if (this.lilllIllil == null) {
         this.lilllIllil = llilIllililIll.iliIiiliiiii(liiiIIiiiiiIIi.class);
      }

      boolean var18 = var17 > 0.0F && this.lilllIllil != null && this.lilllIllil.IliIlllilIi() && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>());
      iIIilIllil = this.IIIIlIllil.IliIlllilIi(var17, this.iIiliIllil, 0.08F);
      IlIilIllil = this.lIIIlIllil.IliIlllilIi(var18 ? var17 + 6.0F + 16.0F * this.illilIilil(IliIlllilIi<invokedynamic>()) : var17, this.iIiliIllil, 0.08F);
      llIilIllil = var13;
      lIIilIllil = iiillIllil;
      if (this.iIliIIllil.IilliliilIIi(var4, llIiiiIlil)) {
         IIIilIllil = iiillIllil;
         float var19 = var3.method_6032();
         float var20 = Math.max(1.0F, var3.method_6063());
         int var21 = class_3532.method_15386(var19);
         int var22 = class_3532.method_15386(var3.method_6067());
         if (this.lllIlIllil[0].IliIlllilIi((long)var21 * 4096L + (long)var22)) {
            this.lllIlIllil[0].liiiIIllIl(var22 > 0 ? var21 + IliIlllilIi<invokedynamic>() + var22 : String.valueOf(var21), 0.8F, true, true);
         }

         int var23 = var3.method_7344().method_7586();
         if (this.lllIlIllil[1].IliIlllilIi((long)var23)) {
            this.lllIlIllil[1].liiiIIllIl(String.valueOf(var23), 0.8F, true, true);
         }

         int var24 = var3.method_6096();
         if (this.lllIlIllil[2].IliIlllilIi((long)var24)) {
            this.lllIlIllil[2].liiiIIllIl(String.valueOf(var24), 0.8F, true, true);
         }

         int var25 = var3.field_7520;
         if (this.lllIlIllil[3].IliIlllilIi((long)var25)) {
            this.lllIlIllil[3].liiiIIllIl(String.valueOf(var25), 0.8F, true, true);
         }

         int var26 = class_3532.method_15386((float)Math.max(0, var5) * 10.0F / (float)var6);
         if (this.lllIlIllil[4].IliIlllilIi((long)var26)) {
            this.lllIlIllil[4].liiiIIllIl(String.valueOf(var26), 0.8F, true, true);
         }

         float var27 = this.iIIIlIllil[0].liiiIIllIl(IiIlllliIlll(var19 / var20), this.iIiliIllil, 0.12F, 0.001F);
         float var28 = this.iIIIlIllil[1].liiiIIllIl(IiIlllliIlll((float)var23 / 20.0F), this.iIiliIllil, 0.12F, 0.001F);
         float var29 = this.iIIIlIllil[2].liiiIIllIl(IiIlllliIlll((float)var24 / 20.0F), this.iIiliIllil, 0.12F, 0.001F);
         float var30 = this.iIIIlIllil[3].liiiIIllIl(IiIlllliIlll(var3.field_7510), this.iIiliIllil, 0.12F, 0.001F);
         float var31 = this.iIIIlIllil[4].liiiIIllIl(IiIlllliIlll((float)var5 / (float)var6), this.iIiliIllil, 0.12F, 0.001F);
         float var32 = this.liiiIIllil.liiiIIllIl(var19 < 6.0F ? 1.0F : 0.0F, this.iIiliIllil, 0.12F, 0.002F);
         float var33 = this.iiiiIIllil.liiiIIllIl((float)var23 <= 6.0F ? 1.0F : 0.0F, this.iIiliIllil, 0.12F, 0.002F);
         int var34 = llliIlIlilliIlIl.Illlllllilll();
         float var35 = 184.0F;
         float var36 = 79.0F;
         float var37 = ((float)Iiiilllliiilll.method_22683().method_4502() - 22.0F) / var13 - iilllIIill();
         float var38 = llliIlIlilliIlIl.IIIllIIliIIl(((float)sw - var35) / 2.0F) + this.lIiIIiIlil;
         float var39 = llliIlIlilliIlIl.IIIllIIliIIl(var37 - var16 - var10) + this.iIiIIiIlil;
         this.IilIililIi(var38, var39, var35, var10);
         float var40 = IliiIilliiIi.IilliliilIIi(this.iIliIIllil.IliIlllilIi());
         boolean var41 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var38 + var35 / 2.0F, var39 + var10 / 2.0F, this.iIliIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.lliIIlIiIl, var38, var39, var35, var10, 1.0F);
            float var42 = var38 + 8.0F;
            float var43 = var42 + var36 + 10.0F;
            float var44 = var39 + var10 - 7.0F - var8;
            float var45 = var44 - var9 - var8;
            float var46 = 12.5F;
            float var47 = 2.5F;
            if (var7 > 0.01F) {
               float var48 = var35 - 16.0F;
               float var49 = var39 + 6.0F;
               float var50 = IliiIilliiIi.IilliliilIIi(var7 * var7);

               try {
                  this.liililiiilil(4, var42, var49, var48, llliIlIlilliIlIl.liIlIlIiIl);
                  llliIlIlilliIlIl.iIlllIllll(var42, var49 + var46, var48, var47, var31, var34);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var50);
               }
            }

            this.liililiiilil(0, var42, var45, var36, var32 > 0.5F ? llliIlIlilliIlIl.lIllIlIiIl : llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.iIlllIllll(var42, var45 + var46, var36, var47, var27, IilIIIIililIIIIi.Illlllllilll(var34, -1750963, (double)var32));
            this.liililiiilil(1, var43, var45, var36, var33 > 0.5F ? llliIlIlilliIlIl.lIllIlIiIl : llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.iIlllIllll(var43, var45 + var46, var36, var47, var28, IilIIIIililIIIIi.Illlllllilll(var34, -1750963, (double)var33));
            this.liililiiilil(2, var42, var44, var36, llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.iIlllIllll(var42, var44 + var46, var36, var47, var29, var34);
            this.liililiiilil(3, var43, var44, var36, llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.iIlllIllll(var43, var44 + var46, var36, var47, var30, var34);
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var41);
            IliiIilliiIi.lIiiIiIlilli(var40);
         }

      }
   }

   private static void llilllililll(class_332 a, float x, float ctx, float h, float y) {
      float var5 = IIIiiIillIIiiIil.Illlllllilll();
      IIIiiIillIIiiIil.IilliliilIIi(a, iIilllIlilll(x), (float)Math.round(ctx) + var5, 0.5F, (float)Math.round(h) - var5 * 2.0F, IIillllIilll(~((232719487 * 71 << 13 | 232719487 * 71 >>> 19) >>> 11 | (232719487 * 71 << 13 | 232719487 * 71 >>> 19) << 21) ^ -1234633497, y));
   }

   private float IlIlilllIlil(class_332 ctx, float y, float x) {
      float var4 = 18.0F;
      float var5 = 4.0F;
      float var6 = 6.0F;
      float var7 = var4 * 3.0F + var5 * 2.0F;
      float var8 = this.IlliIIllil.liiiIIllIl(this.IlIiilIlil.Iilllilliill() ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      float var9 = llliIlIlilliIlIl.IIIllIIliIIl(var4 + 8.0F * var8);
      float var10 = var7 + 2.0F * var6;
      float var11 = 2.0F * var6 + var4 * 2.0F + var5 * 3.0F + var9 + 12.0F;
      if (!this.llIiIIllil.IilliliilIIi(this.iIIiilIlil.Iilllilliill(), llIiiiIlil)) {
         return var11;
      } else {
         float var12 = y + this.lIiIIiIlil;
         float var13 = x + this.iIiIIiIlil;
         this.IilIililIi(var12, var13, var10, var11);
         y = llliIlIlilliIlIl.IIIllIIliIIl(var12);
         x = llliIlIlilliIlIl.IIIllIIliIIl(var13);
         int var14 = Math.min(40, this.IlIlliIlil.size());
         int var15 = Math.min(40, this.llIlliIlil.size());
         if (this.IlIIlIllil.IliIlllilIi((long)var14)) {
            this.IlIIlIllil.liiiIIllIl(IlIiIIllil[var14], 0.64F, true, false);
         }

         if (this.llIIlIllil.IliIlllilIi((long)var15)) {
            this.llIIlIllil.liiiIIllIl(IlIiIIllil[var15], 0.64F, true, false);
         }

         float var16 = IliiIilliiIi.IilliliilIIi(this.llIiIIllil.IliIlllilIi());
         boolean var17 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, y + var10 / 2.0F, x + var11 / 2.0F, this.llIiIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.lilIIlIiIl, y, x, var10, var11, 1.0F);
            float var18 = y + var6;
            float var19 = x + var6;
            float var20 = var19 + var4 + var5;
            float var21 = var20 + var4 + var5;
            float var22 = var21 + var9 + var5;
            float var23 = llliIlIlilliIlIl.IIIllIIliIIl((var7 - var5) / 2.0F);
            iiiIilIIIlil(lIIiIIllil[0], this.iilIlIllil[0], var18 + var4 + var5, var19, var4, var4, (float)this.iliIliIlil.iIlIlllllill());
            iiiIilIIIlil(lIIiIIllil[1], this.iilIlIllil[1], var18, var20, var4, var4, (float)this.IiiIliIlil.iIlIlllllill());
            iiiIilIIIlil(lIIiIIllil[2], this.iilIlIllil[2], var18 + var4 + var5, var20, var4, var4, (float)this.liiIliIlil.iIlIlllllill());
            iiiIilIIIlil(lIIiIIllil[3], this.iilIlIllil[3], var18 + (var4 + var5) * 2.0F, var20, var4, var4, (float)this.iiiIliIlil.iIlIlllllill());
            lIIliliIIlil(IliIlllilIi<invokedynamic>(), this.IIiIlIllil, this.IlIIlIllil, var18, var21, var23, var9, (float)this.IIIlliIlil.iIlIlllllill(), var8);
            lIIliliIIlil(IliIlllilIi<invokedynamic>(), this.lIiIlIllil, this.llIIlIllil, var18 + var23 + var5, var21, var7 - var23 - var5, var9, (float)this.lIIlliIlil.iIlIlllllill(), var8);
            float var24 = (float)this.iIIlliIlil.iIlIlllllill();
            float var25 = 12.0F;
            float var26 = 16.0F;
            float var27 = 2.0F;
            llliIlIlilliIlIl.IiIIlliIIl(var18, var22, var7, var25, var24);
            llliIlIlilliIlIl.IIillIiliIil(llliIlIlilliIlIl.IIIllIIliIIl(var18 + (var7 - var26) / 2.0F), llliIlIlilliIlIl.IIIllIIliIIl(var22 + (var25 - var27) / 2.0F), var26, var27, var27 / 2.0F, 0.0F, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var24));
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var17);
            IliiIilliiIi.lIiiIiIlilli(var16);
         }

         return var11;
      }
   }

   private static float lIIlIliIIlIl(IIlIiIlllIlIiIll y, String s, float size, float x, int color, float f) {
      float var6 = IiiIIlliiIIl(y, f);
      float var7 = size;
      int var8 = s.length();
      if (iIiliiIlil.length < var8) {
         iIiliiIlil = new float[var8];
      }

      float[] var9 = iIiliiIlil;

      for(int var10 = 0; var10 < var8; ++var10) {
         char var11 = s.charAt(var10);
         if (var11 >= '0' && var11 <= '9') {
            float var12 = y.IIIilIIiiIIi(var11, f);
            var9[var10] = var7 + (var6 - var12) / 2.0F;
            var7 += var6;
         } else {
            var9[var10] = var7;
            var7 += y.IIIilIIiiIIi(var11, f);
         }
      }

      y.Illillliilli(s, var9, var8, x, color, f);
      return var7 - size;
   }

   private static void IlIlIlllIlIl(class_332 argb, float w, float x, float y, float ctx, float h, int r) {
      IIIiiIillIIiiIil.lIiiIiIlilli(argb, Math.round(w), Math.round(x), Math.max(0, Math.round(y)), Math.max(0, Math.round(ctx)), Math.max(0, Math.round(h)), r);
   }

   private static float IIiillIiil(String id) {
      byte var2 = -1;
      switch (id.hashCode()) {
         case -1983070683:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 3;
            }
            break;
         case -1354750946:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 4;
            }
            break;
         case -868041058:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
            break;
         case -390600384:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 7;
            }
            break;
         case 3437289:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 2;
            }
            break;
         case 109757152:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 5;
            }
            break;
         case 473741317:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 6;
            }
            break;
         case 1227433863:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
      }

      float var10000;
      switch (var2) {
         case 0:
            var10000 = 0.9F;
            break;
         case 1:
            var10000 = 0.85F;
            break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
            var10000 = 0.8F;
            break;
         default:
            var10000 = 1.0F;
      }

      return var10000;
   }

   public static boolean IIIiIllIIiIl() {
      return iiIiIlIIliIl() && IiIiIlliIiIl(liiliiIlil);
   }

   private void lIiIiiIiIi(String h, float w, float id, float x, float y) {
      if (this.IiilIiIlil != iiillIllil) {
         this.llilIiIlil = 0;
         this.IiilIiIlil = iiillIllil;
      }

      if (!(x <= 0.0F) && !(y <= 0.0F) && (!IliIlllilIi<invokedynamic>().equals(h) || this.IiIIilliIIil(h))) {
         for(int var6 = 0; var6 < this.llilIiIlil; ++var6) {
            if (this.IiIlIiIlil[var6].equals(h)) {
               float var7 = Math.max(this.iiIlIiIlil[var6] + this.lIllIiIlil[var6], w + x);
               float var8 = Math.max(this.IIllIiIlil[var6] + this.iIllIiIlil[var6], id + y);
               this.iiIlIiIlil[var6] = Math.min(this.iiIlIiIlil[var6], w);
               this.IIllIiIlil[var6] = Math.min(this.IIllIiIlil[var6], id);
               this.lIllIiIlil[var6] = var7 - this.iiIlIiIlil[var6];
               this.iIllIiIlil[var6] = var8 - this.IIllIiIlil[var6];
               return;
            }
         }

         if (this.llilIiIlil < 64) {
            this.IiIlIiIlil[this.llilIiIlil] = h;
            this.iiIlIiIlil[this.llilIiIlil] = w;
            this.IIllIiIlil[this.llilIiIlil] = id;
            this.lIllIiIlil[this.llilIiIlil] = x;
            this.iIllIiIlil[this.llilIiIlil] = y;
            ++this.llilIiIlil;
         }
      }
   }

   private float IliIilliIi(String id) {
      if (!this.llIlIiIlil.isEmpty() && (!this.IilIIiIlil || !id.equals(this.lIIIIiIlil))) {
         float[] var2 = (float[])this.llIlIiIlil.get(id);
         return var2 == null ? 0.0F : var2[2];
      } else {
         return 0.0F;
      }
   }

   private float IlIIIillIIIi() {
      return 30.0F + this.llIiiIllil + 5.0F;
   }

   private void lIlliiIlli() {
      if (this.lIIIIiIlil != null) {
         this.iIIIIlIlIIIl();
      }

      this.lilIIiIlil = true;
      this.IIliIiIlil = 0;
      this.IIiiliIlil = null;
      this.lililiIlil = null;
      this.lIiiliIlil = null;
      this.iiiiliIlil = 0;
      this.iliiliIlil = 0L;
      this.IililiIlil = (double)0.0F;
   }

   private float illilIilil(String id) {
      if (this.IIiiIiIlil.isEmpty()) {
         return 1.0F;
      } else {
         iiIliiiIIlliii var2 = (iiIliiiIIlliii)this.IIiiIiIlil.get(id);
         return var2 == null ? 1.0F : var2.iiIiIIIlIl;
      }
   }

   private void ilililIiilil(class_332 ctx, int sh, int sw, long now) {
      class_1309 var6 = this.liIlliIlil;
      boolean var7 = this.llIIliIlil.IiIlliIliiIl() > (double)0.5F && var6 != null;
      if (var6 != null && var6 != this.ilillIllil) {
         this.ilillIllil = var6;

         String var8;
         try {
            var8 = var6.method_5477().getString();
         } catch (Throwable var76) {
            var8 = IliIlllilIi<invokedynamic>();
         }

         if (var6 instanceof class_1657) {
            var8 = liIlliIiiiIlliIi.lllllillll(var8);
         }

         this.iiIIlIllil.liiiIIllIl(var8, 0.9F, false, false);
         this.iIiiIIllil.iIlIlllllill();
         this.IliiIIllil.iIlIlllllill();
         this.lliiIIllil.iIlIlllllill();
         this.IIiiIIllil.iIlIlllllill();
         this.lIiiIIllil.iIlIlllllill();
         this.IiillIllil = -1.0F;
         this.lIlllIllil = 0L;
         this.IIlllIllil = 0L;
      }

      if (this.iiIiIIllil.IilliliilIIi(var7, llIiiiIlil) && var6 != null) {
         float var79 = var6.method_6032();
         float var9 = var6.method_6063();
         float var10 = var6.method_6067();
         float var11 = var9 > 0.0F ? IiIlllliIlll(var79 / var9) : 0.0F;
         if (this.IiillIllil >= 0.0F && var11 < this.IiillIllil - 0.001F) {
            this.lIlllIllil = now;
         }

         this.IiillIllil = var11;
         float var12 = this.iIiiIIllil.liiiIIllIl(var11, this.iIiliIllil, 0.12F, 0.001F);
         float var13 = Math.max(var12, this.IliiIIllil.liiiIIllIl(var11, this.iIiliIllil, 0.35F, 0.001F));
         float var14 = this.lliiIIllil.liiiIIllIl(var9 > 0.0F ? IiIlllliIlll(var10 / var9) : 0.0F, this.iIiliIllil, 0.12F, 0.001F);
         int var15 = class_3532.method_15386(Math.max(0.0F, var79 + var10));
         if (this.IIlIlIllil.IliIlllilIi((long)var15)) {
            this.IIlIlIllil.liiiIIllIl(String.valueOf(var15), 0.78F, true, true);
         }

         if (this.IIlllIllil == 0L || now - this.IIlllIllil >= 100000000L) {
            this.IIlllIllil = now;
            int var16 = Math.round(Iiiilllliiilll.field_1724.method_5739(var6) * 10.0F);
            if (this.lIlIlIllil.IliIlllilIi((long)var16)) {
               this.lIlIlIllil.liiiIIllIl(var16 / 10 + IliIlllilIi<invokedynamic>() + var16 % 10 + IliIlllilIi<invokedynamic>(), 0.76F, true, false);
            }
         }

         int var80 = 0;

         for(class_1304 var20 : IIllIIllil) {
            class_1799 var21 = var6.method_6118(var20);
            if (var21 != null && !var21.method_7960()) {
               this.liillIllil[var80++] = var21;
            }
         }

         int var81 = var80;
         class_1799 var82 = var6.method_6047();
         class_1799 var83 = var6.method_6079();
         if (var82 != null && !var82.method_7960()) {
            this.liillIllil[var80++] = var82;
         }

         if (var83 != null && !var83.method_7960()) {
            this.liillIllil[var80++] = var83;
         }

         float var84 = this.IIIllIllil;
         float var85 = 6.0F;
         float var22 = 5.0F;
         float var23 = 4.0F + var84 + 2.0F + 2.0F + 4.0F;
         float var24 = this.lIiiIIllil.liiiIIllIl(var80 > 0 ? var23 : 0.0F, this.iIiliIllil, 0.08F, 0.01F);
         float var25 = (float)var80 * var84 + (float)Math.max(0, var80 - 1) * 3.0F + (var81 > 0 && var80 > var81 ? 3.0F : 0.0F);
         class_8685 var26 = null;
         if (var6 instanceof class_742) {
            class_742 var27 = (class_742)var6;

            try {
               var26 = var27.method_52814();
            } catch (Throwable var75) {
            }
         }

         if (var26 == null && var6 instanceof class_1657) {
            class_1657 var86 = (class_1657)var6;
            if (Iiiilllliiilll.method_1562() != null) {
               try {
                  class_640 var28 = Iiiilllliiilll.method_1562().method_2871(var86.method_5667());
                  if (var28 != null) {
                     var26 = var28.method_52810();
                  }
               } catch (Throwable var74) {
               }
            }
         }

         float var87 = 24.0F;
         float var88 = 6.0F;
         float var29 = 8.0F;
         float var30 = 0.9F;
         float var31 = 0.76F;
         float var32 = 0.78F;
         float var33 = var29 + 1.0F;
         float var34 = Math.max(54.0F, Math.max(this.iiIIlIllil.IliillIlIl, var33 + this.lIlIlIllil.iliillIlIl));
         float var35 = this.IIiiIIllil.IilliliilIIi((float)Math.ceil((double)Math.max(var85 + var87 + var88 + var34 + var88 + 22.0F + var85, var25 + 2.0F * var85)), this.iIiliIllil, 0.08F);
         float var36 = var22 * 2.0F + var87;
         float var37 = var36 + var24;
         float var38 = llliIlIlilliIlIl.IIIllIIliIIl(((float)sh - var35) / 2.0F) + this.lIiIIiIlil;
         float var39 = llliIlIlilliIlIl.IIIllIIliIIl((float)sw / 2.0F + 48.0F) + this.iIiIIiIlil;
         this.IilIililIi(var38, var39, var35, var37);
         float var40 = IliiIilliiIi.IilliliilIIi(this.iiIiIIllil.IliIlllilIi());
         boolean var41 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var38 + var35 / 2.0F, var39 + var37 / 2.0F, this.iiIiIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IliIIlIiIl, var38, var39, var35, var37, 1.0F);
            float var42 = var38 + var85;
            float var43 = var39 + var22;
            float var44 = var38 + var35 - var85;
            if (!llliIlIlilliIlIl.iiIilIIlil(var26, var42, var43, var87, 4.0F)) {
               llliIlIlilliIlIl.iiIIlIIlIl(var42, var43, var87, 4.0F, lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), 12.0F);
            }

            float var45 = var42 + var87 + var88;
            float var46 = var43 + 12.5F;
            float var47 = 9.0F;
            llliIlIlilliIlIl.lililiilil(this.iiIIlIllil.lIiillIlIl, var45, llliIlIlilliIlIl.illilIilil(var43 + 1.5F, 11.0F, var30), var30, llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.IIiilIiiiIii(lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), var45 + 0.5F, llliIlIlilliIlIl.IIIllIIliIIl(var46 + (var47 - var29) / 2.0F), var29, llliIlIlilliIlIl.iiIlIlIiIl);
            llliIlIlilliIlIl.lliililiil(this.lIlIlIllil, var45 + var33, llliIlIlilliIlIl.illilIilil(var46, var47, var31), var31, llliIlIlilliIlIl.iiIlIlIiIl);
            float var48 = 9.0F;
            float var49 = llliIlIlilliIlIl.IIIllIIliIIl(2.0F);
            float var50 = var44 - 11.0F;
            float var51 = var43 + var87 / 2.0F;
            float var52 = 0.0F;
            if (this.lIlllIllil != 0L) {
               float var53 = (float)(now - this.lIlllIllil) / 2.6E8F;
               if (var53 >= 1.0F) {
                  this.lIlllIllil = 0L;
               } else {
                  var52 = (1.0F - var53) * (1.0F - var53);
               }
            }

            llliIlIlilliIlIl.IIllllIlll(var50, var51, var48, var49, 1.0F, 318767103);
            if (var13 > var12 + 0.002F) {
               llliIlIlilliIlIl.IIllllIlll(var50, var51, var48, var49, var13, llliIlIlilliIlIl.iliIiiliiiii(-920587, 0.35F + 0.45F * var52));
            }

            llliIlIlilliIlIl.IIllllIlll(var50, var51, var48, var49, var12, llliIlIlilliIlIl.Iilllilliill(var12));
            if (var14 > 0.001F) {
               llliIlIlilliIlIl.IIllllIlll(var50, var51, 11.0F, llliIlIlilliIlIl.IIIllIIliIIl(1.0F), var14, -1535700);
            }

            if (var52 > 0.01F) {
               double var89 = (double)var12 * (Math.PI * 2D) - (Math.PI / 2D);
               float var55 = var48 - var49 / 2.0F;
               llliIlIlilliIlIl.llIililIil(ctx, var50 + (float)Math.cos(var89) * var55, var51 + (float)Math.sin(var89) * var55, 3.0F, llliIlIlilliIlIl.iliIiiliiiii(-920587, var52));
            }

            float var90 = 10.0F;
            llliIlIlilliIlIl.Iiiilliiil(this.IIlIlIllil, var50, llliIlIlilliIlIl.illilIilil(var51 - var90 / 2.0F, var90, var32), var32, llliIlIlilliIlIl.liIlIlIiIl);
            if (var24 > 0.5F) {
               float var54 = var24 / var23;
               llliIlIlilliIlIl.IIIillIIil(ctx, var38 + var85, var39 + var36, var35 - 2.0F * var85, llliIlIlilliIlIl.iliIiiliiiii(268435455, var54));
               float var91 = IliiIilliiIi.IilliliilIIi(var54);

               try {
                  float var56 = var38 + var85;
                  float var57 = var39 + var36 + 4.0F;
                  float var58 = var57 + var84 + 2.0F;

                  for(int var59 = 0; var59 < var80; ++var59) {
                     if (var59 == var81 && var81 > 0) {
                        var56 += 3.0F;
                     }

                     class_1799 var60 = this.liillIllil[var59];
                     llliIlIlilliIlIl.lIIlliIIll(ctx, var60, var56, var57, var84);
                     if (var60.method_7963() && var60.method_7936() > 0) {
                        float var61 = 1.0F - (float)var60.method_7919() / (float)var60.method_7936();
                        if (var61 < 0.999F) {
                           llliIlIlilliIlIl.iIlllIllll(var56, var58, var84, 2.0F, var61, llliIlIlilliIlIl.Iilllilliill(var61));
                        }
                     }

                     var56 += var84 + 3.0F;
                  }
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var91);
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var41);
            IliiIilliiIi.lIiiIiIlilli(var40);
         }

      }
   }

   private int IIIlilIIli(String id) {
      long var3 = -6720824996673590981L;
      var3 ^= ((long)this.ilIlIiIlil.indexOf(id) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? -1 : (int)(var3 >>> 32);
   }

   private void Iiliililii(float cost, float seg, float... c) {
      if (!(seg >= this.iiIliiIlil)) {
         this.iiIliiIlil = seg;
         this.IIlliiIlil = cost;
         this.lIlliiIlil = Math.min(3, c.length / 4);
         System.arraycopy(c, 0, this.iIlliiIlil, 0, this.lIlliiIlil * 4);
      }
   }

   private static boolean iillilIIilil(iIlilliIllilli a, iIlilliIllilli b) {
      return String.CASE_INSENSITIVE_ORDER.compare(a.ililliIIIl, b.ililliIIIl) < 0;
   }

   private static float[] lllIiillIi(float[] b, float[] a) {
      if (b == null) {
         return a;
      } else {
         float var2 = Math.min(b[0], a[0]);
         float var3 = Math.min(b[1], a[1]);
         float var4 = Math.max(b[0] + b[2], a[0] + a[2]);
         float var5 = Math.max(b[1] + b[3], a[1] + a[3]);
         return new float[]{var2, var3, var4 - var2, var5 - var3};
      }
   }

   private static void liIilliiIill(class_332 f, IIlIiIlllIlIiIll x, IIIlliillIIlliil y, float h, float k, float s, float a, float ctx) {
      long var15 = 8707848226180885454L;
      float var8 = 8.0F * ctx;
      float var9 = 9.0F * ctx;
      float var10 = 5.0F * ctx;
      float var11 = 12.0F * ctx;
      float var12 = h + var8;
      if (y.IiIlIlilil != null) {
         iiilllIIIill(f, y.IiIlIlilil, var12, k + (s - var9) / 2.0F, var9, IIillllIilll(-1, a));
         var12 += var9 + var10;
      }

      var15 ^= ((long)IIillllIilll(y.iiIlIlilil, a) << 32 ^ var15) & -1L << 32;
      if (y.lIllIlilil) {
         IIlIiIlllIlIiIll var14 = IIlIiIlllIlIiIll.iliIiiliiiii();
         if (var14.IIillIiliIil()) {
            var14.Iliilliiilii(y.liIlIlilil, var12, k + (s - var14.IlIillIiilIi(13.0F * ctx)) / 2.0F, IIillllIilll(-(-1525031924 * -41) - -91 ^ -1902383950, a), IIillllIilll(-1, a), 13.0F * ctx);
            return;
         }
      }

      float var17 = k + (s - x.IlIillIiilIi(var11)) / 2.0F;
      if (y.IIllIlilil) {
         lIIlIliIIlIl(x, y.liIlIlilil, var12, var17, (int)(var15 >>> 32), var11);
      } else {
         x.IIlilIliiIli(y.liIlIlilil, var12, var17, (int)(var15 >>> 32), var11);
      }

   }

   private void liilIliiilIl(float h, float x, float y, float w) {
      IliliiIlil = (int)llliIlIlilliIlIl.IIIllIIliIIl(h);
      lliliiIlil = (int)llliIlIlilliIlIl.IIIllIIliIIl(x);
      ililiiIlil = (int)y;
      IiiliiIlil = (int)w;
      liiliiIlil = llIiiiIlil;
   }

   static {
      iiiiiiIlil = new SimpleDateFormat(IliIlllilIi<invokedynamic>(), Locale.US);
      IIllIIllil = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
      IillIIllil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      IIilIIllil = new IIIlliillIIlliil((class_2960)null, IliIlllilIi<invokedynamic>(), -1, false, true);
      IIIiIIllil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      lIIiIIllil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      iIIiIIllil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      IlIiIIllil = lllillillill();
      IIIilIllil = -9;
      lIIilIllil = -9;
      llIilIllil = 1.0F;
      lIiiiIllil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      liIIIlllil = new Color(IilIIIIililIIIIi.Illlllllilll(-1750963, -7630437, (double)0.3F), true);
      lIlIIlllil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      iIlIIlllil = liIIIiiiIIIi();
   }

   private static boolean iiIiIlIIliIl() {
      IIililillIililil var0 = lillilIlil;
      return var0 != null && var0.IliIlllilIi();
   }

   private void iiiliIIIii(double mx, double my) {
      float var5 = (float)(mx - this.IlIIIiIlil);
      float var6 = (float)(my - this.llIIIiIlil);
      String var7 = this.lIIIIiIlil;
      boolean var8 = liiilliiiill(var7) >= 0;
      float[] var9 = this.IiiIIiIlil;
      if (!this.IilIIiIlil) {
         if (Math.abs(var5) < 1.5F && Math.abs(var6) < 1.5F) {
            return;
         }

         this.IilIIiIlil = true;
         this.llIlIiIlil.remove(var7);
         this.iiiiiIllil = this.liIIIiIlil;
         this.IIIIIlllil = this.iiIIIiIlil;
         float[] var10 = (float[])this.IliiilIlil.remove(var7);
         float[] var11 = (float[])this.lliiilIlil.get(var7);
         float var12 = this.illilIilil(var7);
         if (var10 != null && var11 != null && var12 != 1.0F) {
            this.lIliliIlil(var7, (iiIliiiIIlliii)this.IIiiIiIlil.get(var7), var11[0] + this.ilIIIiIlil, var11[1] + this.IiIIIiIlil, var11[2], var11[3]);
            this.liIIIiIlil += (this.lIIIiiIlil - Illillllil(var10[0])) * var11[2] * (1.0F - var12);
            this.iiIIIiIlil += (this.iIIIiiIlil - Illillllil(var10[1])) * var11[3] * (1.0F - var12);
         }
      } else if (var8) {
         this.liIIIiIlil = this.iiiiiIllil;
         this.iiIIIiIlil = this.IIIIIlllil;
         if (this.Iiililiili(var7, var9)) {
            this.IIlIIiIlil = var9[2];
            this.lIlIIiIlil = var9[3];
         }
      } else if (this.Iiililiili(var7, var9)) {
         this.liIIIiIlil = var9[0] - this.ilIIIiIlil;
         this.iiIIIiIlil = var9[1] - this.IiIIIiIlil;
         this.IIlIIiIlil = var9[2];
         this.lIlIIiIlil = var9[3];
      }

      float var16 = this.IIlIIiIlil;
      float var17 = this.lIlIIiIlil;
      float var18 = this.iIlIIiIlil + var5;
      float var13 = this.IllIIiIlil + var6;
      this.liiiiIllil = var8 && this.IIliilIlii(var7, var18, var13, var16, var17);
      float var14;
      float var15;
      if (this.liiiiIllil) {
         this.IIliIiIlil = 0;
         var14 = var18;
         var15 = var13;
      } else {
         var14 = this.iliiiIiiii(var18, var13, var16, var17, !var8);
         var15 = this.liiiiiiiii(var14, var13, var16, var17, !var8);
         if (this.ilIiiIiIii(var14, var15, var16, var17)) {
            var14 = this.IiIiIiIlil;
            var15 = this.liIiIiIlil;
         }
      }

      this.lllIIiIlil = Math.max(0.0F, Math.min((float)this.liiiilIlil - var16, var14));
      this.illIIiIlil = Math.max(0.0F, Math.min((float)this.iiiiilIlil - var17, var15));
      this.ilIIIiIlil = this.lllIIiIlil - this.liIIIiIlil;
      this.IiIIIiIlil = this.illIIiIlil - this.iiIIIiIlil;
      this.iIiiilIlil.put(var7, new float[]{this.ilIIIiIlil, this.IiIIIiIlil});
   }

   public static boolean IIiIillIiIil() {
      return lilIiliilIil(IIIilIllil);
   }

   private boolean iliillIiiill(String id) {
      if (this.IiIIilliIIil(id)) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.iIiiiIllil.length; ++var2) {
            if (this.iIiiiIllil[var2].equals(id)) {
               int var3 = this.IliiiIllil[var2];
               return var3 >= 0 && var3 < this.iIIIIlllil.length && this.iIIIIlllil[var3];
            }
         }

         return false;
      }
   }

   public static int iiiIlIIIll(class_310 client) {
      long var2 = -5641245459740147484L;
      var2 ^= ((long)(lIIlliIIll(client) / ((-781154189 * 1 >>> 13 | -781154189 * 1 << 19) ^ 1134463588)) << 32 ^ var2) & -1L << 32;
      return Math.max(2, Math.min(3, (int)(var2 >>> 32)));
   }

   public static float iIlIllIllIll(String id) {
      IIililillIililil var1 = lliiIliliiIl();
      return var1 == null ? 1.0F : var1.illilIilil(id);
   }

   private void iIIiIlIlIiIl(float x, float y, float d) {
      float var4 = this.illilIilil(IliIlllilIi<invokedynamic>());
      if (var4 != 1.0F) {
         this.lIliliIlil(IliIlllilIi<invokedynamic>(), (iiIliiiIIlliii)null, x, y, d, d);
         x += this.lIIIiiIlil * d * (1.0F - var4);
         y += this.iIIIiiIlil * d * (1.0F - var4);
         d *= var4;
      }

      iiiliiIlil = (int)x;
      IIIiiiIlil = (int)y;
      lIIiiiIlil = (int)d;
      iIIiiiIlil = (int)d;
      IlIiiiIlil = llIiiiIlil;
   }

   private boolean iiIiilIIliil(IIlIiIlllIlIiIll now, long f) {
      boolean var4 = this.IIililIlil.Iilllilliill();
      boolean var5 = this.llIiilIlil.Iilllilliill();
      boolean var6 = this.iIililIlil.Iilllilliill();
      long var7 = var6 ? System.currentTimeMillis() / 1000L : -1L;
      int var9 = (var4 ? 1 : 0) | (var5 ? 2 : 0) | (IIlIiIlllIlIiIll.iliIiiliiiii().IIillIiliIil() ? 4 : 0);
      boolean var10 = var7 == this.IiIIiIllil && var9 == this.iIIIiIllil && now == this.IiiilIllil;
      if (var10 && this.liIIiIllil != 0L && f - this.liIIiIllil < 250000000L) {
         return this.iIlIiIllil;
      } else {
         this.liIIiIllil = f;
         String var11 = "";

         try {
            var11 = Iiiilllliiilll.method_1548().method_1676();
         } catch (Throwable var16) {
         }

         if (var11 == null) {
            var11 = "";
         }

         var11 = liIlliIiiiIlliIi.lllllillll(var11);
         String var12 = var5 ? this.iIlillIllill() : "";
         if (var10 && var11.equals(this.iiiilIllil) && var12.equals(this.IIIIiIllil)) {
            return this.iIlIiIllil;
         } else {
            this.IiIIiIllil = var7;
            this.iIIIiIllil = var9;
            this.IiiilIllil = now;
            this.iiiilIllil = var11;
            this.IIIIiIllil = var12;
            if (!var4 && !var6 && var11.isEmpty() && var12.isEmpty()) {
               return false;
            } else {
               int var13 = 0;
               if (var4) {
                  this.iIiilIllil[var13++] = IIilIIllil;
               }

               if (!var11.isEmpty()) {
                  this.iIiilIllil[var13++] = new IIIlliillIIlliil(lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()), var11);
               }

               if (!var12.isEmpty()) {
                  this.iIiilIllil[var13++] = new IIIlliillIIlliil(lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()), var12);
               }

               if (var6) {
                  this.iIiilIllil[var13++] = new IIIlliillIIlliil(lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()), iiiiiiIlil.format(new Date()), -1, true, false);
               }

               this.lIIIiIllil = var13;
               float var14 = 0.0F;

               for(int var15 = 0; var15 < var13; ++var15) {
                  this.lliilIllil[var15] = ilIillIiIill(now, this.iIiilIllil[var15]);
                  var14 += this.lliilIllil[var15];
               }

               this.IIlIiIllil = var14;
               return true;
            }
         }
      }
   }

   private float lililiilil() {
      return this.lIiiIiIlil != null ? this.lIiiIiIlil.illiIIIlIl : 1.0F;
   }

   private boolean lIIiiiIIii(int i) {
      return !this.IiIlIiIlil[i].equals(this.lIIIIiIlil) && !this.iliillIiiill(this.IiIlIiIlil[i]);
   }

   private static void lIIliliIIlil(String press, float y, llliiiiilliiii sub, float label, float h, float x, float cps, float w, float labelW) {
      llliIlIlilliIlIl.IiIIlliIIl(label, h, x, cps, w);
      llliIlIlilliIlIl.lililiilil(press, llliIlIlilliIlIl.IIIllIIliIIl(label + (x - y) / 2.0F), llliIlIlilliIlIl.illilIilil(h + labelW, 18.0F - 4.0F * labelW, 0.7F), 0.7F, llliIlIlilliIlIl.liIlIlIiIl);
      if (!(labelW <= 0.01F)) {
         float var9 = 9.0F;
         float var10 = IliiIilliiIi.IilliliilIIi(labelW);

         try {
            llliIlIlilliIlIl.Iiiilliiil(sub, label + x / 2.0F, llliIlIlilliIlIl.illilIilil(h + cps - 3.0F - var9, var9, 0.64F), 0.64F, llliIlIlilliIlIl.iiIlIlIiIl);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var10);
         }

      }
   }

   private float IliIIilliIIi(class_332 ctx, int sh, int sw) {
      boolean var4 = this.IIililIlil.Iilllilliill();
      float var5 = 21.0F;
      float var6 = this.iIiIiIllil.IliIlllilIi(var4 && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? var5 * this.lililiilil() + 6.0F : 0.0F, this.iIiliIllil, 0.08F);
      if (!this.illilIllil.IilliliilIIi(var4, llIiiiIlil)) {
         return var6;
      } else {
         float var7 = (float)Math.ceil((double)(this.IIiiiIllil + 14.0F));
         float var8 = (float)sh - 6.0F - var7 + this.lIiIIiIlil;
         float var9 = (float)sw - 6.0F - var5 + this.iIiIIiIlil;
         this.IilIililIi(var8, var9, var7, var5);
         this.lIlIiliIlIil(var8, var9, var7, sh, sw);
         float var10 = IliiIilliiIi.IilliliilIIi(this.illilIllil.IliIlllilIi());
         boolean var11 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var8 + var7 / 2.0F, var9 + var5 / 2.0F, this.illilIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.iiiIIlIiIl, var8, var9, var7, var5, 1.0F);
            llliIlIlilliIlIl.lililiilil(IliIlllilIi<invokedynamic>(), var8 + (var7 - this.IIiiiIllil) / 2.0F, llliIlIlilliIlIl.illilIilil(var9, var5, 0.8F), 0.8F, llliIlIlilliIlIl.iiIlIlIiIl);
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var11);
            IliiIilliiIi.lIiiIiIlilli(var10);
         }

         return var6;
      }
   }

   private static void iiilllIIIill(class_332 x, class_2960 argb, float sz, float icon, float ctx, int y) {
      iiIlilIlIIllilIl.IliIlllilIi(sz, icon, ctx, ctx, argb, new Color(y, true), IIIiiIillIIiiIil.liiiIIllIl());
   }

   public static boolean lllllillll(String id) {
      IIililillIililil var1 = lillilIlil;
      if (var1 == null) {
         return false;
      } else if (!var1.IIIIIiIlil && !var1.iIiiilIlil.containsKey(id) && !var1.IliiilIlil.containsKey(id)) {
         iiIliiiIIlliii var2 = var1.IIiiIiIlil.isEmpty() ? null : (iiIliiiIIlliii)var1.IIiiIiIlil.get(id);
         return var2 != null && (var2.liIiIIIlIl != 1.0F || var2.iiIiIIIlIl != 1.0F);
      } else {
         return true;
      }
   }

   private int Ilillllill(liiiiIIiiiiiiIIi p, double a) {
      double var4 = (double)1.0F - a;
      int var10000;
      switch (p.ordinal()) {
         case 0:
         case 1:
         case 2:
            var10000 = (int)((double)-6.0F * var4);
            break;
         case 3:
         case 4:
            var10000 = 0;
            break;
         case 5:
         case 6:
         case 7:
            var10000 = (int)((double)6.0F * var4);
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private void IIlIilIlIi(String h, float w, float y, float id, float x) {
      if (this.liiiilIlil > 0 && this.iiiiilIlil > 0) {
         w = iIlIiIllIi(w, 0.0F, Math.max(0.0F, (float)this.liiiilIlil - id));
         y = iIlIiIllIi(y, 0.0F, Math.max(0.0F, (float)this.iiiiilIlil - x));
         this.IliiilIlil.put(h, liIIiiiIIi(w, y, id, x, (float)this.liiiilIlil, (float)this.iiiiilIlil));
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   private void Ilililllilil(class_332 ctx, int now, long sw) {
      if (this.IilllIllil == null) {
         this.IilllIllil = (lllIIIIiillIIIIi)llilIllililIll.iliIiiliiiii(lllIIIIiillIIIIi.class);
      }

      lllIIIIiillIIIIi var5 = this.IilllIllil;
      boolean var6 = var5 != null && var5.IliIlllilIi() && (!var5.lIIlliIIll() || lllIIIIiillIIIIi.iIlllIllll()) && Iiiilllliiilll.method_1562() != null;
      if (!var6) {
         this.IiIllIllil = 0L;
      } else if (this.IiIllIllil == 0L || var5.IIllllIlll() != this.IlIIIlllil || sw - this.IiIllIllil >= 500000000L) {
         this.IiIllIllil = sw;
         this.lIililiIilil(var5, sw);
      }

      float var7 = 1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.06F));
      float var8 = 0.0F;
      float var9 = 0.0F;

      for(int var10 = 0; var10 < this.llillIllil.size(); ++var10) {
         iIlilliIllilli var11 = (iIlilliIllilli)this.llillIllil.get(var10);
         if (var11.IilliliilIIi(var7)) {
            this.IlillIllil.remove(var11.ililliIIIl);
            this.llillIllil.remove(var10--);
         } else {
            var11.lIiiiilIliIiiiilIl = var8;
            var8 += 15.0F * var11.iliiiilIlIiiiiilIl;
            if (!var11.IIIIIIiIllIIIIIiIl) {
               var9 = Math.max(var9, this.iIIllIllil + 5.0F + var11.IiilliIIIl + 8.0F + 4.0F);
            }
         }
      }

      boolean var48 = this.iIlllIllil == 0;
      float var49 = this.iiliIIllil.liiiIIllIl(var48 ? 15.0F : 0.0F, this.iIiliIllil, 0.06F, 0.01F);
      if (!this.liIiIIllil.IilliliilIIi(var6, llIiiiIlil)) {
         this.liliIIllil.iIlIlllllill();
      } else {
         if (var48) {
            var9 = Math.max(var9, this.iliIlIllil);
         }

         float var12 = this.liliIIllil.IilliliilIIi((float)Math.ceil((double)Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.lliIlIllil, this.illllIllil ? this.liIIlIllil.iliillIlIl : 0.0F), var9 + 14.0F)), this.iIiliIllil, 0.08F);
         float var13 = 30.0F + var8 + var49 + 5.0F;
         float var14 = Math.max(6.0F, this.IilIliIlil ? (float)this.IllIliIlil - 6.0F - var12 : (float)now - 6.0F - var12);
         float var15 = this.IilIliIlil ? (float)this.lllIliIlil : 6.0F;
         float var16 = var14 + this.lIiIIiIlil;
         float var17 = var15 + this.iIiIIiIlil;
         this.IilIililIi(var16, var17, var12, var13);
         this.liliIliiliIl(var14, var15, var12);
         float var18 = IliiIilliiIi.IilliliilIIi(this.liIiIIllil.IliIlllilIi());
         boolean var19 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var16 + var12 / 2.0F, var17 + var13 / 2.0F, this.liIiIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.iIiIIlIiIl, var16, var17, var12, var13, 1.0F);
            float var20 = llliIlIlilliIlIl.IllIllllIl(ctx, var16, var17, var12, lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), this.illllIllil ? this.liIIlIllil : null, this.lilIlIllil, IiIlllliIlll((var8 + var49) / 8.0F));
            float var21 = var16 + 7.0F;
            float var22 = IiIlllliIlll(var49 / 15.0F) * (1.0F - IiIlllliIlll(var8 / 4.5F));
            if (var49 > 0.5F && var22 > 0.004F) {
               float var23 = IliiIilliiIi.IilliliilIIi(var22 * var22);

               try {
                  llliIlIlilliIlIl.iIiIlIliIl(IliIlllilIi<invokedynamic>(), var21, var20 + var8, var49, llliIlIlilliIlIl.iiIlIlIiIl);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var23);
               }
            }

            for(int var50 = 0; var50 < this.llillIllil.size(); ++var50) {
               iIlilliIllilli var24 = (iIlilliIllilli)this.llillIllil.get(var50);
               float var25 = var24.iliiiilIlIiiiiilIl;
               if (!(var25 <= 0.002F)) {
                  float var26 = 15.0F * var25;
                  float var27 = var20 + var24.lIiiiilIliIiiiilIl;
                  float var28 = IliiIilliiIi.IilliliilIIi(var25 * var25);

                  try {
                     float var29 = var27 + llliIlIlilliIlIl.IIIllIIliIIl((var26 - this.iIIllIllil) / 2.0F);
                     if (!llliIlIlilliIlIl.IiIilliIil(var24.liilliIIIl, var21, var29, this.iIIllIllil)) {
                        llliIlIlilliIlIl.IIiilIiiiIii(lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), var21, var29, this.iIIllIllil, llliIlIlilliIlIl.iiIlIlIiIl);
                     }

                     llliIlIlilliIlIl.iIiIlIliIl(var24.ililliIIIl, var21 + this.iIIllIllil + 5.0F, var27, var26, llliIlIlilliIlIl.liIlIlIiIl);
                     if (var24.iiilliIIIl >= 0) {
                        int var30 = -16777216 | var24.iliIiiliiiii(sw);
                        float var31 = 4.0F;
                        float var32 = llliIlIlilliIlIl.IIIllIIliIIl(var16 + var12 - 7.0F - var31);
                        float var33 = var27 + llliIlIlilliIlIl.IIIllIIliIIl((var26 - var31) / 2.0F);
                        llliIlIlilliIlIl.Ililllililil(var32, var33, var31, var31, var31 / 2.0F, llliIlIlilliIlIl.iliIiiliiiii(var30, 0.22F), 2.5F, true);
                        llliIlIlilliIlIl.IIillIiliIil(var32, var33, var31, var31, var31 / 2.0F, 0.0F, var30);
                     }
                  } finally {
                     IliiIilliiIi.lIiiIiIlilli(var28);
                  }
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var19);
            IliiIilliiIi.lIiiIiIlilli(var18);
         }

      }
   }

   private void iIIiilIlIiil(int d, int sh, int sw) {
      float var4 = 6.0F;
      String var7 = this.illiilIlil.Iilllilliill();
      byte var8 = -1;
      switch (var7.hashCode()) {
         case -960744398:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 0;
            }
            break;
         case 2364455:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 4;
            }
            break;
         case 78959100:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 5;
            }
            break;
         case 287355729:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 1;
            }
            break;
         case 926500839:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 3;
            }
            break;
         case 999535836:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 2;
            }
      }

      float var5;
      float var6;
      switch (var8) {
         case 0:
            var5 = var4;
            var6 = var4;
            break;
         case 1:
            var5 = (float)d - var4 - (float)sw;
            var6 = var4;
            break;
         case 2:
            var5 = var4;
            var6 = (float)sh - var4 - (float)sw - (this.llililIlil.Iilllilliill() ? 29.0F : 0.0F);
            break;
         case 3:
            var5 = (float)d - var4 - (float)sw;
            var6 = (float)sh - var4 - (float)sw - this.lliliIllil;
            break;
         case 4:
            var5 = var4;
            var6 = (float)(sh - sw) / 2.0F;
            break;
         case 5:
            var5 = (float)d - var4 - (float)sw;
            var6 = (float)(sh - sw) / 2.0F;
            break;
         default:
            if (IiIiIlliIiIl(liiliiIlil)) {
               var5 = (float)(IliliiIlil + ililiiIlil) + var4;
               var6 = (float)lliliiIlil;
            } else {
               var5 = (float)d - var4 - (float)sw;
               var6 = (float)(sh - sw) / 2.0F;
            }
      }

      this.IlIllIllil = llliIlIlilliIlIl.IIIllIIliIIl(Math.max(var4, Math.min(var5, (float)(d - sw) - var4)));
      this.llIllIllil = llliIlIlilliIlIl.IIIllIIliIIl(Math.max(var4, Math.min(var6, (float)(sh - sw) - var4)));
   }

   private void liiIIiiiiIIi(class_332 ctx, int lift, int sh, float sw) {
      float var5 = 1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.06F));
      float var6 = 1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.12F));
      float var7 = 0.0F;
      boolean var8 = false;

      for(int var9 = 0; var9 < 4; ++var9) {
         class_1799 var10 = Iiiilllliiilll.field_1724.method_6118(IIllIIllil[var9]);
         boolean var11 = var10 != null && !var10.method_7960();
         if (var11) {
            var8 = true;
            this.ilIiiIllil[var9] = var10;
            int var12 = var10.method_7936();
            this.liIiiIllil[var9] = var12 > 0 ? (float)(var12 - var10.method_7919()) / (float)var12 : 1.0F;
         }

         float var33 = var11 ? 1.0F : 0.0F;
         float[] var10000 = this.IiIiiIllil;
         var10000[var9] += (var33 - this.IiIiiIllil[var9]) * var5;
         if (Math.abs(var33 - this.IiIiiIllil[var9]) < 0.002F) {
            this.IiIiiIllil[var9] = var33;
         }

         var10000 = this.iiIiiIllil;
         var10000[var9] += (this.liIiiIllil[var9] - this.iiIiiIllil[var9]) * var6;
         if (Math.abs(this.liIiiIllil[var9] - this.iiIiiIllil[var9]) < 0.001F) {
            this.iiIiiIllil[var9] = this.liIiiIllil[var9];
         }

         var7 += (this.iiiIlIllil + 4.0F) * this.IiIiiIllil[var9];
      }

      if (this.IllilIllil.IilliliilIIi(this.ilIiilIlil.Iilllilliill() && var8, llIiiiIlil)) {
         float var30 = 23.0F;
         float var31 = 6.0F;
         float var32 = llliIlIlilliIlIl.IlIlllIlilIl(var31 + 12.0F + 5.0F + Math.max(0.0F, var7 - 4.0F) + 7.0F);
         float var34 = (float)lift - 6.0F - var32 + this.lIiIIiIlil;
         float var13 = (float)sh - 6.0F - var30 - sw + this.iIiIIiIlil;
         this.IilIililIi(var34, var13, var32, var30);
         this.lIlIiliIlIil(var34, var13, var32, lift, sh);
         float var14 = IliiIilliiIi.IilliliilIIi(this.IllilIllil.IliIlllilIi());
         boolean var15 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var34 + var32 / 2.0F, var13 + var30 / 2.0F, this.IllilIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.liiIIlIiIl, var34, var13, var32, var30, 1.0F);
            llliIlIlilliIlIl.IIIIllIIIl(var34 + var31, var13 + llliIlIlilliIlIl.IIIllIIliIIl((var30 - 12.0F) / 2.0F), lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), 1.0F);
            float var16 = var34 + var31 + 12.0F + 5.0F;
            float var17 = var13 + llliIlIlilliIlIl.IIIllIIliIIl((var30 - this.iiiIlIllil - 2.0F - 2.0F) / 2.0F);
            float var18 = var17 + this.iiiIlIllil + 2.0F;

            for(int var19 = 0; var19 < 4; ++var19) {
               float var20 = this.IiIiiIllil[var19];
               if (!(var20 <= 0.002F) && this.ilIiiIllil[var19] != null) {
                  float var21 = IliiIilliiIi.IilliliilIIi(var20);

                  try {
                     llliIlIlilliIlIl.lIIlliIIll(ctx, this.ilIiiIllil[var19], var16, var17, this.iiiIlIllil);
                     llliIlIlilliIlIl.iIlllIllll(var16, var18, this.iiiIlIllil, 2.0F, this.iiIiiIllil[var19], this.iliIIiIiiIIi(var19));
                  } finally {
                     IliiIilliiIi.lIiiIiIlilli(var21);
                  }

                  var16 += (this.iiiIlIllil + 4.0F) * var20;
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var15);
            IliiIilliiIi.lIiiIiIlilli(var14);
         }

      }
   }

   private boolean IiIliliIli(int i, int free, boolean k) {
      float var4 = this.lIllIiIlil[i];
      float var5 = this.iIllIiIlil[i];
      float var6 = this.iiIlIiIlil[i];
      float var7 = this.IIllIiIlil[i];
      float var8 = 6.0F;
      float[] var9 = (float[])this.llIlIiIlil.get(this.IiIlIiIlil[i]);
      int var10 = var9 == null ? 0 : (int)var9[4];
      float var11 = Float.MAX_VALUE;
      int var12 = 1;
      int var13 = k ? this.iiilIiIlil : free;
      this.IIilIiIlil[0] = var6;
      this.lIilIiIlil[0] = var7;
      this.liilIiIlil = 0;

      for(int var14 = 0; var14 < 3 && var12 > 0; ++var14) {
         int var15 = 0;

         for(int var16 = 0; var16 < var12; ++var16) {
            float var17 = this.IIilIiIlil[var16];
            float var18 = this.lIilIiIlil[var16];
            boolean var19 = true;

            for(int var20 = 0; var20 < var13; ++var20) {
               if (var20 != free) {
                  int var21 = this.illlIiIlil[var20];
                  float var22 = var20 < free ? this.IlllIiIlil[var21] : this.iiIlIiIlil[var21];
                  float var23 = var20 < free ? this.llllIiIlil[var21] : this.IIllIiIlil[var21];
                  float var24 = this.lIllIiIlil[var21];
                  float var25 = this.iIllIiIlil[var21];
                  if (liiIiiiiIi(var17, var18, var4, var5, var22, var23, var24, var25)) {
                     var19 = false;
                     if (var14 == 2) {
                        break;
                     }

                     for(int var26 = 1; var26 < 5 && var15 < this.iIilIiIlil.length; ++var26) {
                        float var27 = var26 == 1 ? var22 - var8 - var4 : (var26 == 2 ? var22 + var24 + var8 : var17);
                        float var28 = var26 == 3 ? var23 - var8 - var5 : (var26 == 4 ? var23 + var25 + var8 : var18);
                        if (!(var27 < 0.0F) && !(var28 < 0.0F) && !(var27 > (float)this.liiiilIlil - var4) && !(var28 > (float)this.iiiiilIlil - var5) && !(Math.abs(var27 - var6) + Math.abs(var28 - var7) >= var11 + 10.0F)) {
                           this.iIilIiIlil[var15] = var27;
                           this.IlilIiIlil[var15] = var28;
                           ++var15;
                        }
                     }
                  }
               }
            }

            if (var19 && var14 != 0) {
               float var29 = var17 - var6;
               float var30 = var18 - var7;
               int var31 = Math.abs(var29) >= Math.abs(var30) ? (var29 < 0.0F ? 1 : 2) : (var30 < 0.0F ? 3 : 4);
               float var32 = Math.abs(var29) + Math.abs(var30) - (var31 == var10 ? 10.0F : 0.0F);
               if (var32 < var11) {
                  var11 = var32;
                  this.IiIiIiIlil = var17;
                  this.liIiIiIlil = var18;
                  this.liilIiIlil = var31;
               }
            }
         }

         System.arraycopy(this.iIilIiIlil, 0, this.IIilIiIlil, 0, var15);
         System.arraycopy(this.IlilIiIlil, 0, this.lIilIiIlil, 0, var15);
         var12 = var15;
      }

      return var11 != Float.MAX_VALUE;
   }

   private String lIilIliIilIl(int code) {
      if (code < 0) {
         return "";
      } else if (IlIiliIlllIiliIl.IliIlllilIi(code)) {
         return IliIlllilIi<invokedynamic>() + (IlIiliIlllIiliIl.liiiIIllIl(code) + 1);
      } else {
         String var2 = IlIiliIlllIiliIl.IlIlllIlilIl(code);
         if (var2 != null && !var2.equals(IliIlllilIi<invokedynamic>())) {
            return var2.toUpperCase(Locale.ROOT);
         } else {
            try {
               String var3 = GLFW.glfwGetKeyName(code, 0);
               if (var3 != null && !var3.isBlank()) {
                  return var3.toUpperCase(Locale.ROOT);
               }
            } catch (Throwable var4) {
            }

            return IlIiliIlllIiliIl.IIIllIIliIIl(code);
         }
      }
   }

   public static boolean iIlllIllll() {
      IIililillIililil var0 = lillilIlil;
      if (var0 != null && var0.IliIlllilIi() && var0.IlliilIlil.Iilllilliill()) {
         return Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1724.method_7325() && !Iiiilllliiilll.field_1690.field_1842 && !IIiIIllIiIIl.IliIlllilIi();
      } else {
         return false;
      }
   }

   public static float IIllllIlll() {
      IIililillIililil var0 = lillilIlil;
      if ((var0 == null || !var0.IliIlllilIi()) && Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1690.field_1842) {
         boolean var1 = false;
         boolean var2 = false;

         for(class_1293 var4 : Iiiilllliiilll.field_1724.method_6026()) {
            if (var4.method_5592()) {
               if (((class_1291)var4.method_5579().comp_349()).method_5573()) {
                  var1 = true;
               } else {
                  var2 = true;
               }
            }
         }

         return var2 ? 51.0F : (var1 ? 25.0F : 0.0F);
      } else {
         return 0.0F;
      }
   }

   public static boolean liIlliiIll() {
      return true;
   }

   private float IIililIili(double my, double mx) {
      float var5 = this.lIiIiiIlil * this.lIiIiiIlil + this.iIiIiiIlil * this.iIiIiiIlil;
      return var5 < 1.0F ? 1.0F : (float)((my - (double)this.iilIiiIlil) * (double)this.lIiIiiIlil + (mx - (double)this.IIiIiiIlil) * (double)this.iIiIiiIlil) / var5;
   }

   private void Iililllilill(IIliiIlllIliiIll f) {
      this.iIliiIllil = f;

      for(int var2 = 0; var2 < 5; ++var2) {
         this.llliiIllil[var2] = new iIlIIIiIllIIIi(iIIiIIllil[var2], 0.66F, 0.6F);
      }

      this.illiiIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.78F);

      for(int var3 = 0; var3 < 3; ++var3) {
         this.IlliiIllil[var3] = llliIlIlilliIlIl.lIliliIlil(IillIIllil[var3], 0.78F);
      }

      this.IiliiIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.95F);
      this.liliiIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.95F);
      this.iiliiIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.95F);
      this.iIiIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.95F);
      this.IliIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.95F);
      this.lliIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.95F);
      this.IIiiiIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.8F);

      for(int var4 = 0; var4 < 4; ++var4) {
         this.iilIlIllil[var4] = llliIlIlilliIlIl.lIliliIlil(lIIiIIllil[var4], 0.82F);
      }

      this.IIiIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.7F);
      this.lIiIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.7F);
      this.iliIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.9F);
      this.IiiIlIllil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.78F);

      for(int var5 = 0; var5 < 4; ++var5) {
         this.liiIlIllil[var5] = llliIlIlilliIlIl.lIliliIlil(IIIiIIllil[var5], 0.78F);
      }

      for(int var6 = 0; var6 < 6; ++var6) {
         this.iiiIIlllil[var6] = llliIlIlilliIlIl.lIliliIlil(lIlIIlllil[var6], 0.62F);
      }

      for(int var7 = 0; var7 < 4; ++var7) {
         this.iiIIIlllil[var7] = llliIlIlilliIlIl.lIliliIlil(this.iiiliIllil[var7], 0.82F);
      }

   }

   private static float IlilIlllilIl(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private void iIIIIlIlIIIl() {
      String var1 = this.lIIIIiIlil;
      boolean var2 = this.liiiiIllil;
      this.lIIIIiIlil = null;
      this.liiiiIllil = false;
      this.IIliIiIlil = 0;
      if (var1 != null && this.IilIIiIlil) {
         this.IilIIiIlil = false;
         if (var2) {
            this.iIiiilIlil.remove(var1);
            this.IliiilIlil.remove(var1);
            this.ilIlIiIlil.remove(var1);
            float var3 = this.lllIIiIlil - this.iiiiiIllil;
            float var4 = this.illIIiIlil - this.IIIIIlllil;
            if (!(Math.abs(var3) >= 0.05F) && !(Math.abs(var4) >= 0.05F)) {
               this.llIlIiIlil.remove(var1);
            } else {
               this.llIlIiIlil.put(var1, new float[]{0.0F, 0.0F, var3, var4, 0.0F});
            }

            iiiIIIlIIIlIIl.liiiIIllIl();
         } else {
            if (Math.abs(this.ilIIIiIlil) < 0.5F && Math.abs(this.IiIIIiIlil) < 0.5F) {
               this.iIiiilIlil.remove(var1);
               this.IliiilIlil.remove(var1);
               this.ilIlIiIlil.remove(var1);
            } else {
               this.IIlIilIlIi(var1, this.lllIIiIlil, this.illIIiIlil, this.IIlIIiIlil, this.lIlIIiIlil);
               this.ilIlIiIlil.remove(var1);
               this.ilIlIiIlil.add(var1);
            }

            this.llIlIiIlil.remove(var1);
            iiiIIIlIIIlIIl.liiiIIllIl();
         }
      } else {
         this.IilIIiIlil = false;
      }
   }

   private void lIlIiliIlIil(float w, float sh, float sw, int y, int x) {
      iiIliiiIIlliii var6 = this.lIiiIiIlil;
      if (var6 != null) {
         float var7 = var6.liiiIIllIl(w + sw);
         w = var6.liiiIIllIl(w);
         sh = var6.iIlIlllllill(sh);
         sw = var7 - w;
      }

      if (!(w + sw < (float)y - 220.0F) && !(sh < (float)x - 96.0F)) {
         this.IliliIllil = Math.max(this.IliliIllil, (float)x - sh + 4.0F - 8.0F);
      }
   }

   private String iIlillIllill() {
      try {
         class_642 var1 = Iiiilllliiilll.method_1558();
         if (var1 != null && var1.field_3761 != null && !var1.field_3761.isEmpty()) {
            return var1.field_3761;
         }

         if (Iiiilllliiilll.method_1542()) {
            return IliIlllilIi<invokedynamic>();
         }
      } catch (Throwable var2) {
      }

      return "";
   }

   public static float iiiiIlIIIIll(String id) {
      IIililillIililil var1 = lliiIliliiIl();
      return var1 != null ? var1.IlIIllllIIll(id) : 0.0F;
   }

   private float lIIIIiiIIIIi(int i, long now) {
      long var4 = this.liiliIllil[i];
      if (var4 == (3015952699059927324L ^ 3015952699059927324L)) {
         return 1.0F;
      } else {
         float var6 = (float)(now - var4) / 2.4E8F;
         if (var6 >= 1.0F) {
            this.liiliIllil[i] = 0L;
            return 1.0F;
         } else {
            return 1.0F + 0.18F * llliIlIlilliIlIl.lIiiIiIlilli(var6);
         }
      }
   }

   private float Iliiilliii() {
      if (this.iiIliiIlil == Float.MAX_VALUE) {
         return this.liIliiIlil;
      } else {
         for(int var1 = 0; var1 < this.lIlliiIlil && this.IIliIiIlil < this.iiIiIiIlil.length / 4; ++this.IIliIiIlil) {
            System.arraycopy(this.iIlliiIlil, var1 * 4, this.iiIiIiIlil, this.IIliIiIlil * 4, 4);
            ++var1;
         }

         return this.IIlliiIlil;
      }
   }

   private boolean iiIilIIlil(String out, float[] id) {
      float[] var3 = (float[])this.lliiilIlil.get(out);
      if (var3 == null) {
         return false;
      } else {
         float var4 = var3[0];
         float var5 = var3[1];
         float var6 = var3[2];
         float var7 = var3[3];
         iiIliiiIIlliii var8 = this.IIiiIiIlil.isEmpty() ? null : (iiIliiiIIlliii)this.IIiiIiIlil.get(out);
         float var9 = var8 == null ? 1.0F : var8.iiIiIIIlIl;
         if (var9 != 1.0F) {
            this.lIliliIlil(out, (iiIliiiIIlliii)null, var4, var5, var6, var7);
            var4 += this.lIIIiiIlil * var6 * (1.0F - var9);
            var5 += this.iIIIiiIlil * var7 * (1.0F - var9);
            var6 *= var9;
            var7 *= var9;
         }

         id[0] = var4;
         id[1] = var5;
         id[2] = var6;
         id[3] = var7;
         return true;
      }
   }

   public boolean lliIliliIl() {
      return true;
   }

   public static boolean iIiiIlIliiIl() {
      return iiIiIlIIliIl() && IiIiIlliIiIl(IlliiiIlil);
   }

   private void llliiillii(int to, int from) {
      if (from > to) {
         --from;
      }

      if (from != to && from >= 0 && from < this.iIiiiIllil.length) {
         String var3 = this.iIiiiIllil[to];
         if (from < to) {
            System.arraycopy(this.iIiiiIllil, from, this.iIiiiIllil, from + 1, to - from);
         } else {
            System.arraycopy(this.iIiiiIllil, to + 1, this.iIiiiIllil, to, from - to);
         }

         this.iIiiiIllil[from] = var3;
      }
   }

   private void iilillIIiill(class_332 ctx, int sh, int sw) {
      if (Iiiilllliiilll.field_1724 != null) {
         long var4 = System.nanoTime();
         this.iIiliIllil = this.iilliIllil == 0L ? 0.016F : Math.min(0.05F, (float)(var4 - this.iilliIllil) / 1.0E9F);
         this.iilliIllil = var4;
         IIliiIlllIliiIll var6 = llliIlIlilliIlIl.IliIlllilIi();
         if (var6 != this.iIliiIllil) {
            this.Iililllilill(var6);
         }

         int var7 = Math.max(1, Math.round(1.0F / IIIiiIillIIiiIil.Illlllllilll()));
         this.iiiIlIllil = 16.0F * (float)Math.max(1, Math.round(10.0F * (float)var7 / 16.0F)) / (float)var7;
         this.IIIllIllil = 16.0F * (float)Math.max(1, Math.round(8.0F * (float)var7 / 16.0F)) / (float)var7;
         this.lIIllIllil = Math.min(12.0F, 18.0F * (float)Math.max(1, Math.round(9.0F * (float)var7 / 18.0F)) / (float)var7);
         this.iIIllIllil = 8.0F * (float)Math.max(1, Math.round(10.0F * (float)var7 / 8.0F)) / (float)var7;
         this.iIIiiIllil = 16.0F * (float)Math.max(1, Math.round(12.0F * (float)var7 / 16.0F)) / (float)var7;
         this.IlIiiIllil = Math.max(27.0F, llliIlIlilliIlIl.IlIlllIlilIl(this.iIIiiIllil * 2.1F));
         this.llIiiIllil = Math.max(22.0F, llliIlIlilliIlIl.IlIlllIlilIl(this.iIIiiIllil * 1.6F));
         this.IliliIllil = 0.0F;
         float var8 = 6.0F;
         float var9 = 6.0F;
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         float var10 = this.IiIiilliIiil(ctx, var8, var9, var4);
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         boolean var11 = this.Illiilllliil(ctx, var8, var9 + var10, var4);
         this.iIIilIlIil();
         boolean var12 = this.iIlIiIllil && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>());
         boolean var13 = var11 && this.lIililIlil.Iilllilliill() && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>());
         float var14 = var12 ? 20.0F * this.illilIilil(IliIlllilIi<invokedynamic>()) : 0.0F;
         float var15 = var13 ? 20.0F * this.illilIilil(IliIlllilIi<invokedynamic>()) : 0.0F;
         var9 += this.IllIiIllil.IliIlllilIi(!var12 && !var13 ? 0.0F : var14 + var15 + (var12 && var13 ? 4.0F : 0.0F) + 6.0F, this.iIiliIllil, 0.08F);
         var9 = this.iiIIilIIlIil(IliIlllilIi<invokedynamic>(), llilIllililIll.iliIiiliiiii(IiIiIIliliIiIIli.class), var8, var9);
         boolean var16 = this.iiililIlil.Iilllilliill() && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>());
         boolean var17 = var16 && IliIlllilIi<invokedynamic>().equals(this.illiilIlil.Iilllilliill());
         float var18 = (float)this.IIllIllIllIl() * this.illilIilil(IliIlllilIi<invokedynamic>());
         this.lIIliIllil = var8;
         this.iIIliIllil = var9;
         this.IlIliIllil = var9;
         this.llIliIllil = 0.0F;
         this.liIliIllil = 0;
         this.ilIliIllil = (float)sw - 6.0F - (!this.llililIlil.Iilllilliill() || !var17 && this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? 0.0F : 23.0F * this.illilIilil(IliIlllilIi<invokedynamic>()) + 6.0F) - (var17 ? var18 + 6.0F : 0.0F);
         this.iliiiIllil = 1;
         this.lliiiIllil[0] = this.lIIliIllil;
         Arrays.fill(this.iIIIIlllil, false);

         for(int var19 = 0; var19 < this.iIiiiIllil.length; ++var19) {
            this.iIIIilIlIIil(ctx, var19, var4, var16, var18);
         }

         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.IIIlIilIIlIi(ctx, sh, sw);
         this.IIiiIllIiiIl();
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.ilililIiilil(ctx, sh, sw, var4);
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.Ilililllilil(ctx, sh, var4);
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.lIiIIiiIiIIi(ctx, sw);
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.IIIiillIIiil(ctx, sh);
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         float var22 = this.IliIIilliIIi(ctx, sh, sw);
         this.iIIilIlIil();
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.liiIIiiiiIIi(ctx, sh, sw, var22);
         this.iIIilIlIil();
         this.lliliIllil = var22 + (this.IllilIllil.IliIlllilIi() > 0.01F ? 23.0F * this.illilIilil(IliIlllilIi<invokedynamic>()) + 6.0F : 0.0F);
         this.IIIillIIil(IliIlllilIi<invokedynamic>());
         this.llIiililIiil(ctx, sh, sw, var4);
         this.iIIilIlIil();
         llliIlIlilliIlIl.ilillIiill(this.IliliIllil);
      }
   }

   public static void IilIlllilIll(String id, float v) {
      IIililillIililil var2 = lliiIliliiIl();
      if (var2 != null) {
         var2.Iiiilliiil(id, v);
      }

   }

   private static boolean iIllilIlllil(iilIiIIiIIiIiIIi b, iilIiIIiIIiIiIIi a) {
      if (b.IIIIIIiIllIIIIIiIl != a.IIIIIIiIllIIIIIiIl) {
         return !b.IIIIIIiIllIIIIIiIl;
      } else {
         return b.iIiIlliiil > a.iIiIlliiil;
      }
   }

   private void lilIIliilIIl() {
      boolean var1 = !this.iIiiilIlil.isEmpty() || !this.IliiilIlil.isEmpty() || !this.IIIIillIIIil();
      this.iIiiilIlil.clear();
      this.IliiilIlil.clear();
      this.ilIlIiIlil.clear();

      for(Map.Entry var3 : this.IIiiIiIlil.entrySet()) {
         iiIliiiIIlliii var4 = (iiIliiiIIlliii)var3.getValue();
         float var5 = IIiillIiil((String)var3.getKey());
         var1 |= var4.liIiIIIlIl != var5;
         var4.liIiIIIlIl = var5;
         var4.iIliIIIlIl = false;
      }

      this.lIIIIiIlil = null;
      this.IilIIiIlil = false;
      this.liiiiIllil = false;
      this.IIliIiIlil = 0;
      this.IIiiliIlil = null;
      System.arraycopy(lIiiiIllil, 0, this.iIiiiIllil, 0, lIiiiIllil.length);
      this.llIlIiIlil.clear();
      if (var1) {
         iiiIIIlIIIlIIl.liiiIIllIl();
      }

      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   }

   public static void IliIlllliIll(boolean down) {
      IIililillIililil var1 = lliiIliliiIl();
      if (var1 != null) {
         var1.IlliliIlil = down;
      }

   }

   public static float IiiiIlliiiIl(String id) {
      IIililillIililil var1 = lliiIliliiIl();
      return var1 != null ? var1.lIIIlliIIIll(id) : 0.0F;
   }

   private void IilIililIi(float w, float h, float x, float y) {
      if (this.IIiIIiIlil != null) {
         this.iilIiIIiIi(this.IIiIIiIlil, w, h, x, y, this.lIiiIiIlil);
      }

   }

   public static float IIlIlllIlIll(String id) {
      IIililillIililil var1 = lliiIliliiIl();
      iiIliiiIIlliii var2 = var1 == null ? null : (iiIliiiIIlliii)var1.IIiiIiIlil.get(id);
      return var2 == null ? 1.0F : var2.liIiIIIlIl;
   }

   private boolean llIlllilIlll(class_1293 e) {
      long var3 = -8818450657917395440L;
      var3 ^= ((long)e.method_5584() << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 || (int)(var3 >>> 32) > ((-2137579655 + -87) * 1601513229 ^ 1710611450);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) ^ var5) ^ 3208) - var5) ^ var5) - var5) ^ var5) ^ '\ud7ab'))) - '迾'))) - 12716) ^ var5) ^ var5) + 30965));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') >>> 14) - var5) - 23609))) ^ 20503) >>> 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') >>> 14) - var5) - 23609))) ^ 20503) << 7) << 1 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') >>> 14) - var5) - 23609))) ^ 20503) >>> 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랯') - var5) ^ var5) ^ '럤') - 20704) ^ '芒') + 9959) ^ 27849) + var5) ^ '뗱') >>> 14) - var5) - 23609))) ^ 20503) << 7) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiiIilliiIil(class_332 sw, int ctx) {
      if (this.lIliIIllil.IilliliilIIi(this.IIIIliIlil.IiIlliIliiIl() > (double)0.5F, llIiiiIlil)) {
         IIliiIlllIliiIll var3 = llliIlIlilliIlIl.IliIlllilIi();
         if (var3 != this.iIliiIllil) {
            this.Iililllilill(var3);
         }

         boolean var4 = this.IlIIliIlil > 0.5F;
         int var5 = Math.round(this.lIIIliIlil * 100.0F);
         if (this.iIlIlIllil.IliIlllilIi((long)var5)) {
            this.iIlIlIllil.liiiIIllIl(var5 + IliIlllilIi<invokedynamic>(), 0.9F, true, true);
         }

         long var6 = System.nanoTime();
         if (this.ilIllIllil == 0L || var6 - this.ilIllIllil >= 500000000L) {
            this.ilIllIllil = var6;
            String var8 = IillIllillIl(var4);
            if (this.IllIlIllil.IliIlllilIi((long)var8.hashCode())) {
               this.IllIlIllil.liiiIIllIl(var8, 0.78F, false, true);
            }
         }

         boolean var24 = !this.IllIlIllil.iIlIlllllill();
         float var9 = 25.0F;
         float var10 = this.iliiIIllil.IilliliilIIi(Math.max(132.0F, (float)Math.ceil((double)(var9 + this.IiiIlIllil + 4.0F + this.iIlIlIllil.iliillIlIl + (var24 ? 10.0F + this.IllIlIllil.IliillIlIl : 0.0F) + 7.0F))), this.iIiliIllil, 0.08F);
         float var11 = 26.0F;
         int var12 = IiIiIIliliIiIIli.iIlllIllll();
         float var13 = llliIlIlilliIlIl.IIIllIIliIIl(((float)ctx - var10) / 2.0F) + this.lIiIIiIlil;
         float var14 = (var12 > 0 ? (float)var12 + 5.0F : 6.0F) + this.iIiIIiIlil;
         this.IilIililIi(var13, var14, var10, var11);
         float var15 = IliiIilliiIi.IilliliilIIi(this.lIliIIllil.IliIlllilIi());
         boolean var16 = llliIlIlilliIlIl.lIIIiiIIIi(sw, var13 + var10 / 2.0F, var14 + var11 / 2.0F, this.lIliIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IIIlIlIiIl, var13, var14, var10, var11, 1.0F);
            llliIlIlilliIlIl.Iiiiliiiiiii(var13 + 6.0F, var14 + 6.0F, lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), 1.0F);
            float var17 = var13 + var9;
            float var18 = var13 + var10 - 7.0F;
            float var19 = var14 + 4.0F;
            float var20 = 12.0F;
            llliIlIlilliIlIl.lililiilil(IliIlllilIi<invokedynamic>(), var17, llliIlIlilliIlIl.illilIilil(var19, var20, 0.78F), 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
            llliIlIlilliIlIl.iIiilIliil(this.iIlIlIllil, var17 + this.IiiIlIllil + 4.0F + this.iIlIlIllil.iliillIlIl, llliIlIlilliIlIl.illilIilil(var19, var20, 0.9F), 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
            if (var24) {
               llliIlIlilliIlIl.iIiilIliil(this.IllIlIllil, var18, llliIlIlilliIlIl.illilIilil(var19, var20, 0.78F), 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
            }

            llliIlIlilliIlIl.iIlllIllll(var17, var14 + 18.5F, var18 - var17, 2.5F, this.lIIIliIlil, IilIIIIililIIIIi.Illlllllilll(llliIlIlilliIlIl.Illlllllilll(), -8393375, (double)IiIlllliIlll(this.IlIIliIlil)));
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(sw, var16);
            IliiIilliiIi.lIiiIiIlilli(var15);
         }

      }
   }

   private void iiIIIlIIlIIl(class_332 ctx) {
      boolean var2 = this.lililiIlil != null;
      if (var2) {
         this.iililiIlil = this.lililiIlil;
      }

      String var3 = this.iililiIlil;
      if (this.liiIiiIlil.IilliliilIIi(var2, llIiiiIlil) && var3 != null) {
         iiIliiiIIlliii var4 = (iiIliiiIIlliii)this.IIiiIiIlil.get(var3);
         float var5 = var4 == null ? 1.0F : var4.liIiIIIlIl;
         boolean var6 = var5 != 1.0F;
         this.iIIliiIlil.liiiIIllIl(var6 ? 1.0F : 0.0F, this.IlIIiiIlil, 0.05F, 0.002F);
         if (this.Illlilllli(var3)) {
            int var7 = Math.round(var5 * 100.0F);
            boolean var8 = var3.equals(this.iIiiliIlil);
            if (this.IIIliiIlil.IliIlllilIi((long)var7) || !var8) {
               this.IIIliiIlil.liiiIIllIl(var7 + IliIlllilIi<invokedynamic>(), 0.8F, true, var8);
               if (var8) {
                  this.lIIliiIlil.IliIlllilIi();
               }

               this.iIiiliIlil = var3;
            }

            long var9 = System.nanoTime();
            float var11 = 1.0F - (float)Math.exp((double)(-this.IlIIiiIlil / 0.05F));

            for(int var12 = 1; var12 <= 5; ++var12) {
               float var13 = this.iiiiliIlil == var12 ? 1.0F : 0.0F;
               float[] var10000 = this.IlIliiIlil;
               var10000[var12] += (var13 - this.IlIliiIlil[var12]) * var11;
               if (Math.abs(var13 - this.IlIliiIlil[var12]) < 0.004F) {
                  this.IlIliiIlil[var12] = var13;
               }
            }

            float var60 = this.liiIiiIlil.liiiIIllIl();
            float var61 = this.iiIIiiIlil;
            float var14 = this.IIlIiiIlil;
            float var15 = this.lIlIiiIlil;
            float var16 = var14 + 8.5F;
            float var17 = IliiIilliiIi.IilliliilIIi(this.liiIiiIlil.IliIlllilIi());

            try {
               boolean var18 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var61 + var15 / 2.0F, var16, var60);

               try {
                  llliIlIlilliIlIl.IIIilIIiiIIi(llliIlIlilliIlIl.iIIlIlIiIl, var61, var14, var15, 17.0F, 8.5F, 1.0F);
                  this.IiIIIlliIIIl(ctx, 2, var61, var14, 17.0F, var9, var5 > 0.601F);
                  float var19 = var61 + 17.0F;
                  float var20 = var19 + this.IilIiiIlil / 2.0F;
                  float var21 = var6 ? this.IlIliiIlil[3] : 0.0F;
                  if (var21 > 0.01F) {
                     llliIlIlilliIlIl.IIillIiliIil(var19, var14 + 2.0F, this.IilIiiIlil, 13.0F, 6.5F, 0.0F, llliIlIlilliIlIl.iliIiiliiiii(385875967, var21));
                  }

                  boolean var22 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var20, var16, (1.0F + 0.5F * (this.lIIliiIlil.liiiIIllIl() - 1.0F)) * (1.0F - 0.12F * this.llIIIlilIIIl(3, var9)));

                  try {
                     llliIlIlilliIlIl.Iiiilliiil(this.IIIliiIlil, var20, llliIlIlilliIlIl.illilIilil(var14, 17.0F, 0.8F), 0.8F, var6 ? llliIlIlilliIlIl.IIlllIlliIll() : llliIlIlilliIlIl.liIlIlIiIl);
                  } finally {
                     llliIlIlilliIlIl.IlIIillIIi(ctx, var22);
                  }

                  float var23 = var19 + this.IilIiiIlil + 17.0F;
                  float var24 = this.iIIliiIlil.lIiiIiIlilli();
                  this.IiIIIlliIIIl(ctx, 4, var19 + this.IilIiiIlil, var14, 17.0F, var9, var5 < 1.7989999F);
                  if (var24 > 0.01F) {
                     float var25 = IliiIilliiIi.IilliliilIIi(var24 * var24);

                     try {
                        llliIlIlilliIlIl.iIIilIlIil(ctx, var23, var14 + 5.0F, 7.0F, 536870911);
                        this.IiIIIlliIIIl(ctx, 5, var23 - 1.0F, var14, 16.0F, var9, true);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var25);
                     }
                  }
               } finally {
                  llliIlIlilliIlIl.IlIIillIIi(ctx, var18);
               }

               float var62 = this.IlIliiIlil[1];
               float var63 = 8.0F;
               float var64 = this.lllIiiIlil - var63 / 2.0F;
               float var65 = this.illIiiIlil - var63 / 2.0F;
               int var66 = llliIlIlilliIlIl.Illlllllilll();
               boolean var67 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, this.lllIiiIlil, this.illIiiIlil, var60 * (1.0F + 0.25F * var62));

               try {
                  llliIlIlilliIlIl.Ililllililil(var64, var65 + 1.0F, var63, var63, var63 / 2.0F, 1291845632, 4.0F, true);
                  llliIlIlilliIlIl.IIillIiliIil(var64, var65, var63, var63, var63 / 2.0F, 0.0F, -16184562);
                  llliIlIlilliIlIl.IIillIiliIil(var64, var65, var63, var63, var63 / 2.0F, IIIiiIillIIiiIil.Illlllllilll(), IilIIIIililIIIIi.Illlllllilll(-1929379841, var66, (double)var62));
                  llliIlIlilliIlIl.llIililIil(ctx, this.lllIiiIlil, this.illIiiIlil, 3.0F, IilIIIIililIIIIi.Illlllllilll(-920587, var66, (double)var62));
               } finally {
                  llliIlIlilliIlIl.IlIIillIIi(ctx, var67);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var17);
            }

         }
      } else {
         if (!var2) {
            this.iililiIlil = null;
         }

      }
   }

   private float iliiiIiiii(float y, float home, float w, float h, boolean x) {
      this.IIliIiIlil = 0;
      this.iIIliIlIli(true, false);
      this.liIliiIlil = y;
      this.iiIliiIlil = Float.MAX_VALUE;
      float var6 = (float)this.liiiilIlil;
      float var7 = (float)this.iiiiilIlil;
      float var8 = var6 / 2.0F;
      float var9 = 6.0F;
      this.iiliiIIiii(var8 - w / 2.0F, var8, 0.0F, var8, var7);
      this.iiliiIIiii(6.0F, 6.0F, home, 6.0F, home + h);
      this.iiliiIIiii(var6 - 6.0F - w, var6 - 6.0F, home, var6 - 6.0F, home + h);
      if (x) {
         this.iiliiIIiii(this.liIIIiIlil);
      }

      for(int var10 = 0; var10 < this.llilIiIlil; ++var10) {
         if (!this.IiIlIiIlil[var10].equals(this.lIIIIiIlil) && !this.iliillIiiill(this.IiIlIiIlil[var10])) {
            float var11 = this.IlllIiIlil[var10];
            float var12 = this.llllIiIlil[var10];
            float var13 = this.lIllIiIlil[var10];
            float var14 = this.iIllIiIlil[var10];
            float var15 = Math.min(var12, home);
            float var16 = Math.max(var12 + var14, home + h);
            if (home < var12 + var14 + var9 && var12 < home + h + var9) {
               float var17 = Math.max(var12, home);
               float var18 = Math.min(var12 + var14, home + h);
               this.lIiiiiIiii(var11 + var13 + var9, true, var11 + var13 + var9 / 2.0F, var17, var11 + var13 + var9 / 2.0F, var18);
               this.lIiiiiIiii(var11 - var9 - w, false, var11 - var9 / 2.0F, var17, var11 - var9 / 2.0F, var18);
            }

            if (!(y < var11 + var13) || !(var11 < y + w) || !(home < var12 + var14) || !(var12 < home + h)) {
               this.iiliiIIiii(var11, var11, var15, var11, var16);
               this.iiliiIIiii(var11 + var13 - w, var11 + var13, var15, var11 + var13, var16);
               this.iiliiIIiii(var11 + (var13 - w) / 2.0F, var11 + var13 / 2.0F, var15, var11 + var13 / 2.0F, var16);
               this.iiliiIIiii(var6 - var11 - var13, var8, 0.0F, var8, var7, var6 - var11 - var13, home, var6 - var11 - var13, home + h, var11 + var13, var12, var11 + var13, var12 + var14);
               this.iiliiIIiii(var6 - var11 - w, var8, 0.0F, var8, var7, var6 - var11, home, var6 - var11, home + h, var11, var12, var11, var12 + var14);
            }
         }
      }

      return this.Iliiilliii();
   }

   private float lIIIlliIIIll(String id) {
      return this.IlIIillIIi(id)[0] + this.IliIilliIi(id);
   }

   private int IIllIllIllIl() {
      float var1 = (float)Math.max(1, this.IiliilIlil.Iilllilliill()) / 100.0F;
      return Math.max(~(-(-1373626079 << 27 | -1373626079 >>> 5)) ^ 225509664, Math.round(80.0F * var1));
   }

   private void lliliilili(double mx, double my) {
      long var5 = Iiiilllliiilll.method_22683().method_4490();
      boolean var7 = GLFW.glfwGetMouseButton(var5, 0) == 1;
      boolean var8 = GLFW.glfwGetMouseButton(var5, 1) == 1;
      long var9 = System.nanoTime();
      this.IlIIiiIlil = this.IiiiliIlil == 0L ? 0.016F : Math.min(0.05F, (float)(var9 - this.IiiiliIlil) / 1.0E9F);
      this.IiiiliIlil = var9;
      IIliiIlllIliiIll var11 = llliIlIlilliIlIl.IliIlllilIi();
      if (var11 != this.IiiIiiIlil) {
         this.IiiIiiIlil = var11;
         this.IilIiiIlil = (float)Math.ceil((double)llliIlIlilliIlIl.Illillllil(IliIlllilIi<invokedynamic>(), 0.8F)) + 4.0F;
         this.lilIiiIlil = llliIlIlilliIlIl.lIliliIlil(IliIlllilIi<invokedynamic>(), 0.86F);
      }

      if (this.iIliliIlil) {
         var7 = this.IlliliIlil;
         var8 = false;
         if (this.IliiliIlil != null && this.Illlilllli(this.IliiliIlil)) {
            boolean var12 = this.IliiliIlil.equals(this.lliiliIlil);
            float var13 = var12 ? this.iiIIiiIlil : this.iIlIiiIlil;
            float var14 = (var12 ? this.IIlIiiIlil : this.IllIiiIlil) + 8.5F;
            switch (this.IIIIiiIlil) {
               case 1:
                  this.lliIiiIlil = this.lllIiiIlil;
                  this.iliIiiIlil = this.illIiiIlil;
                  break;
               case 2:
                  this.lliIiiIlil = var13 + 8.5F;
                  this.iliIiiIlil = var14;
                  break;
               case 3:
                  this.lliIiiIlil = var13 + 17.0F + this.IilIiiIlil / 2.0F;
                  this.iliIiiIlil = var14;
                  break;
               case 4:
                  this.lliIiiIlil = var13 + 17.0F + this.IilIiiIlil + 8.5F;
                  this.iliIiiIlil = var14;
                  break;
               case 5:
                  this.lliIiiIlil = var13 + 34.0F + this.IilIiiIlil + 8.0F;
                  this.iliIiiIlil = var14;
                  break;
               default:
                  this.lliIiiIlil = this.llIIiiIlil + this.IiIIiiIlil / 2.0F;
                  this.iliIiiIlil = this.ilIIiiIlil + this.liIIiiIlil / 2.0F;
            }

            this.IliiliIlil = null;
         }

         mx = (double)this.lliIiiIlil;
         my = (double)this.iliIiiIlil;
      }

      this.llliliIlil = mx;
      this.illiliIlil = my;
      String var20 = null;

      for(int var21 = this.IiiiilIlil.size() - 1; var21 >= 0; --var21) {
         iiiilIIIIi var23 = (iiiilIIIIi)this.IiiiilIlil.get(var21);
         if (mx >= (double)var23.iilliliIIilili && mx <= (double)(var23.iilliliIIilili + var23.Ilililillilili) && my >= (double)var23.lIililiiIilili && my <= (double)(var23.lIililiiIilili + var23.ilililiIiilili)) {
            var20 = var23.Iillililillili;
            break;
         }
      }

      boolean var22 = this.lIIIIiIlil != null || this.IIiiliIlil != null;
      boolean var24 = this.lililiIlil != null && this.Illlilllli(this.lililiIlil);
      if (this.lililiIlil != null && !var24) {
         this.lililiIlil = null;
         this.IIiiliIlil = null;
      }

      int var15 = var24 && !var22 && this.liiIiiIlil.IliIlllilIi() > 0.35F ? this.lilliiilli(mx, my) : 0;
      if (!var22) {
         boolean var16 = var24 && var20 == null && mx >= (double)(this.iiIIiiIlil - 6.0F) && mx <= (double)(this.iiIIiiIlil + this.lIlIiiIlil + 6.0F) && my >= (double)Math.min(this.IIlIiiIlil, this.ilIIiiIlil + this.liIIiiIlil) && my <= (double)Math.max(this.IIlIiiIlil + 17.0F, this.ilIIiiIlil);
         if (var15 == 0 && !var16) {
            if (var20 != null) {
               if (!var20.equals(this.lililiIlil)) {
                  this.lililiIlil = var20;
                  this.liiIiiIlil.iIlIlllllill();
                  var24 = this.Illlilllli(var20);
               }

               this.iliiliIlil = 0L;
            } else if (this.lililiIlil != null) {
               if (this.iliiliIlil == 0L) {
                  this.iliiliIlil = var9;
               } else if (var9 - this.iliiliIlil > 180000000L) {
                  this.lililiIlil = null;
               }
            }
         } else {
            this.iliiliIlil = 0L;
         }
      }

      if (this.lililiIlil != null && var24) {
         if (this.lililiIlil.equals(this.lliiliIlil) && this.lIIIIiIlil == null) {
            if (var15 < 2) {
               float var25 = 1.0F - (float)Math.exp((double)(-this.IlIIiiIlil / 0.05F));
               this.iiIIiiIlil += (this.iIlIiiIlil - this.iiIIiiIlil) * var25;
               this.IIlIiiIlil += (this.IllIiiIlil - this.IIlIiiIlil) * var25;
               if (Math.abs(this.iIlIiiIlil - this.iiIIiiIlil) < 0.1F) {
                  this.iiIIiiIlil = this.iIlIiiIlil;
               }

               if (Math.abs(this.IllIiiIlil - this.IIlIiiIlil) < 0.1F) {
                  this.IIlIiiIlil = this.IllIiiIlil;
               }
            }
         } else {
            this.lliiliIlil = this.lililiIlil;
            this.iiIIiiIlil = this.iIlIiiIlil;
            this.IIlIiiIlil = this.IllIiiIlil;
         }
      }

      String var26 = var15 != 0 ? this.lililiIlil : var20;
      this.iIIIIiIlil = this.IIiiliIlil != null ? this.IIiiliIlil : var26;
      this.lIiiliIlil = var22 ? null : var26;
      this.iiiiliIlil = this.IIiiliIlil != null ? 1 : var15;
      if (var7 && !this.lilIIiIlil) {
         if (var15 == 1) {
            this.iIiliIlili(this.lililiIlil, mx, my);
         } else if (var15 != 2 && var15 != 4) {
            if (var15 != 3 && var15 != 5) {
               if (var15 == 0 && var20 != null && this.Iiililiili(var20, this.IiiIIiIlil)) {
                  this.lIIIIiIlil = var20;
                  this.IilIIiIlil = false;
                  float[] var17 = this.IlIIillIIi(var20);
                  this.ilIIIiIlil = var17[0] + this.IliIilliIi(var20);
                  this.IiIIIiIlil = var17[1] + this.iliIiIiiIi(var20);
                  this.iIlIIiIlil = this.lllIIiIlil = this.IiiIIiIlil[0];
                  this.IllIIiIlil = this.illIIiIlil = this.IiiIIiIlil[1];
                  this.IIlIIiIlil = this.IiiIIiIlil[2];
                  this.lIlIIiIlil = this.IiiIIiIlil[3];
                  this.liIIIiIlil = this.iIlIIiIlil - this.ilIIIiIlil;
                  this.iiIIIiIlil = this.IllIIiIlil - this.IiIIIiIlil;
                  this.IlIIIiIlil = mx;
                  this.llIIIiIlil = my;
               }
            } else {
               this.Iiiilliiil(this.lililiIlil, IIiillIiil(this.lililiIlil));
               this.llIliiIlil[var15] = var9;
            }
         } else {
            this.iiiilIIIIi(this.lililiIlil, var15 == 4 ? 1 : -1);
            this.llIliiIlil[var15] = var9;
         }
      } else if (var7 && this.IIiiliIlil != null) {
         this.Iiiilliiil(this.IIiiliIlil, lIIIiiIIIi(this.IIililIili(mx, my) + this.IliIiiIlil));
      } else if (var7 && this.lIIIIiIlil != null) {
         this.iiiliIIIii(mx, my);
      } else if (!var7 && this.lilIIiIlil) {
         if (this.lIIIIiIlil != null) {
            this.iIIIIlIlIIIl();
         }

         this.IIiiliIlil = null;
      }

      if (var8 && !this.iilIIiIlil && var26 != null) {
         boolean var27 = this.iIiiilIlil.remove(var26) != null;
         var27 |= this.IliiilIlil.remove(var26) != null;
         var27 |= this.ilIlIiIlil.remove(var26);
         iiIliiiIIlliii var18 = (iiIliiiIIlliii)this.IIiiIiIlil.get(var26);
         float var19 = IIiillIiil(var26);
         if (var18 != null) {
            var27 |= var18.liIiIIIlIl != var19;
            var18.liIiIIIlIl = var19;
            var18.iIliIIIlIl = false;
         }

         if (var27) {
            iiiIIIlIIIlIIl.liiiIIllIl();
         }

         if (var26.equals(this.lIIIIiIlil)) {
            this.lIIIIiIlil = null;
            this.IilIIiIlil = false;
            this.liiiiIllil = false;
            this.IIliIiIlil = 0;
         }

         if (var26.equals(this.IIiiliIlil)) {
            this.IIiiliIlil = null;
         }
      }

      this.lilIIiIlil = var7;
      this.iilIIiIlil = var8;
   }

   public static boolean llIiIlilIiIl() {
      return iiIiIlIIliIl() && IiIiIlliIiIl(IlIiiiIlil);
   }

   private void llllililllil() {
      for(int var1 = 0; var1 < this.iIillIllil.size(); ++var1) {
         ((iilIiIIiIIiIiIIi)this.iIillIllil.get(var1)).iIlIlllllill();
      }

      try {
         AccessorItemCooldownManager var13 = (AccessorItemCooldownManager)Iiiilllliiilll.field_1724.method_7357();
         int var2 = var13.corzGetTick();
         Map var3 = var13.corzGetEntries();
         if (var3 != null) {
            for(Map.Entry var5 : var3.entrySet()) {
               Object var7 = var5.getValue();
               if (var7 instanceof AccessorItemCooldownEntry) {
                  AccessorItemCooldownEntry var6 = (AccessorItemCooldownEntry)var7;
                  int var20 = var6.corzEndTick() - var2;
                  if (var20 > 0) {
                     class_2960 var8 = (class_2960)var5.getKey();
                     iilIiIIiIIiIiIIi var9 = (iilIiIIiIIiIiIIi)this.lIillIllil.get(var8);
                     if (var9 == null) {
                        var9 = new iilIiIIiIIiIiIIi(var8);
                        class_1792 var10 = (class_1792)class_7923.field_41178.method_63535(var8);
                        boolean var11 = var10 != null && var10 != class_1802.field_8162;
                        var9.iilIlliiil = new class_1799(var11 ? var10 : class_1802.field_8407);
                        var9.IIiIlliiil = var11 ? var9.iilIlliiil.method_7964().getString() : llllIlilllIl(var8);
                        var9.lIiIlliiil = llliIlIlilliIlIl.lIliliIlil(var9.IIiIlliiil, 0.9F);
                        var9.IliIlllilIi((float)this.iIillIllil.size() * 15.0F);
                        this.lIillIllil.put(var8, var9);
                        this.iIillIllil.add(var9);
                     }

                     var9.liiiIIllIl();
                     var9.iIiIlliiil = (float)var20 / 20.0F;
                     if (var9.IliIlliiil.IliIlllilIi((long)Math.round(var9.iIiIlliiil * 10.0F))) {
                        var9.IliIlliiil.liiiIIllIl(iIllIlIlllIl(var9.iIiIlliiil), 0.9F, true, false);
                     }
                  }
               }
            }
         }
      } catch (Throwable var12) {
      }

      for(int var14 = 1; var14 < this.iIillIllil.size(); ++var14) {
         iilIiIIiIIiIiIIi var16 = (iilIiIIiIIiIiIIi)this.iIillIllil.get(var14);

         int var18;
         for(var18 = var14 - 1; var18 >= 0 && iIllilIlllil(var16, (iilIiIIiIIiIiIIi)this.iIillIllil.get(var18)); --var18) {
            this.iIillIllil.set(var18 + 1, (iilIiIIiIIiIiIIi)this.iIillIllil.get(var18));
         }

         this.iIillIllil.set(var18 + 1, var16);
      }

      int var15 = 0;

      for(int var17 = 0; var17 < this.iIillIllil.size(); ++var17) {
         iilIiIIiIIiIiIIi var19 = (iilIiIIiIIiIiIIi)this.iIillIllil.get(var17);
         if (!var19.IIIIIIiIllIIIIIiIl) {
            var19.IliiiilIllliiiilIl = (float)(var15++) * 15.0F;
         }
      }

      this.lllllIllil = var15;
      if (var15 > 0 && this.IiIIlIllil.IliIlllilIi((long)var15)) {
         this.IiIIlIllil.liiiIIllIl(String.valueOf(var15), 0.8F, true, false);
         this.IilIlIllil.IliIlllilIi();
      }

   }

   private void IIiiIllIiiIl() {
      long var3 = 2715411197891723976L;
      iiIliiiIIlliii var1 = this.lIiiIiIlil;
      if (var1 != null && this.IilIliIlil && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>())) {
         var3 ^= ((long)(this.IllIliIlil + this.illIliIlil) << 32 ^ var3) & -1L << 32;
         this.IllIliIlil = Math.round(var1.liiiIIllIl((float)this.IllIliIlil));
         this.illIliIlil = (int)(var3 >>> 32) - this.IllIliIlil;
      }
   }

   public static float ilIlIlIiIlIl(class_332 x, float ctx, float h, float w, float title, String y) {
      IlIlIlllIlIl(x, ctx, h, w, title, 7.0F, -671088640);
      if (y == null) {
         return h + 14.5F;
      } else {
         IIlIiIlllIlIiIll var6 = IIlIiIlllIlIiIll.liiiIIllIl();
         if (var6.IIillIiliIil()) {
            float var7 = 13.0F;
            float var8 = ctx + 6.0F;
            float var9 = h + 5.3F;
            var6.IIlilIliiIli(IliIlllilIi<invokedynamic>(), var8, var9, -1, 13.0F);
            var8 += var6.Iiilliiliiil(IliIlllilIi<invokedynamic>(), 13.0F) + 3.0F;
            var6.IIlilIliiIli(y, var8, var9, -1, 13.0F);
         } else {
            IIliiIlllIliiIll var10 = illlIiiIillIii.iIlIlllllill();
            var10.liiiIIllIl(IliIlllilIi<invokedynamic>() + y, ctx + 6.0F, (float)var10.IlIillIiilIi(Math.round(h), 15), new Color(-1, true));
         }

         return h + 14.5F;
      }
   }

   private static String iIllIlIlllIl(float seconds) {
      long var2 = 126146733050057323L;
      var2 ^= ((long)Math.round(seconds * 10.0F) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) / ((-1438231636 * 83 + -27) * 750576809 ^ -1801645157) + IliIlllilIi<invokedynamic>() + Math.abs((int)(var2 >>> 32) % ((616158594 << 1 | 616158594 >>> 31) * -1775253149 - -79 ^ -155367727)) + IliIlllilIi<invokedynamic>();
   }

   private static float lIIilliIIill(IIlIiIlllIlIiIll s, IIIlliillIIlliil k, float f) {
      if (k.lIllIlilil) {
         IIlIiIlllIlIiIll var3 = IIlIiIlllIlIiIll.iliIiiliiiii();
         if (var3.IIillIiliIil()) {
            return var3.Iiilliiliiil(k.liIlIlilil, 13.0F * f);
         }
      }

      return k.IIllIlilil ? iiiIIlIIIlIl(s, k.liIlIlilil, 12.0F * f) : s.Iiilliiliiil(k.liIlIlilil, 12.0F * f);
   }

   private void illiilIiliil(IIlIiIlllIlIiIll now, long f) {
      boolean var4 = this.IiIiilIlil.Iilllilliill();
      int var5 = var4 ? 1 : 0;
      int var6 = Iiiilllliiilll.method_47599();
      int var7 = this.ilIIiIllil;
      long var8 = Math.round(this.lliIliIlil * (double)10.0F);
      boolean var10 = var5 != this.IlIIiIllil || now != this.liiilIllil;
      if (var10 || this.IIiliIllil == 0L || f - this.IIiliIllil >= 500000000L) {
         this.IIiliIllil = f;
         var7 = this.liIlIliiIlIl();
      }

      if (var10 || var6 != this.llIIiIllil || var7 != this.ilIIiIllil || var8 != this.iiIIiIllil) {
         if (var10 || var6 != this.llIIiIllil) {
            this.liliiliiliil(now, 0, var4 ? lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()) : null, var6 + IliIlllilIi<invokedynamic>());
         }

         if (var10 || var7 != this.ilIIiIllil) {
            this.liliiliiliil(now, 1, var4 ? lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()) : null, var7 + IliIlllilIi<invokedynamic>());
         }

         if (var10 || var8 != this.iiIIiIllil) {
            this.liliiliiliil(now, 2, var4 ? lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()) : null, String.format(Locale.ROOT, IliIlllilIi<invokedynamic>(), this.lliIliIlil));
         }

         this.IlIIiIllil = var5;
         this.liiilIllil = now;
         this.llIIiIllil = var6;
         this.ilIIiIllil = var7;
         this.iiIIiIllil = var8;
         this.lIlIiIllil = this.iliilIllil[0] + this.iliilIllil[1] + this.iliilIllil[2];
      }
   }

   private boolean llIliilIli(int a, int b) {
      long var5 = -54438812902286280L;
      var5 ^= ((long)this.IillIiIlil[a] << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)this.IillIiIlil[b] ^ var5) & -1L >>> 32;
      if ((int)(var5 >>> 32) != (int)var5) {
         return (int)(var5 >>> 32) > (int)var5;
      } else if ((int)(var5 >>> 32) != ((-1599017760 * 1926714301 << 15 | -1599017760 * 1926714301 >>> 17) - 61 ^ 1085298568)) {
         return false;
      } else if (this.IIllIiIlil[a] != this.IIllIiIlil[b]) {
         return this.IIllIiIlil[a] < this.IIllIiIlil[b];
      } else {
         return this.iiIlIiIlil[a] < this.iiIlIiIlil[b];
      }
   }

   public IIililillIililil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.llIIliIlil = new liIliIliiIliIl(llIIIliilIIIli.lilllliiiiilllliii, 320, (double)0.0F);
      this.ilIIliIlil = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 220, (double)1.0F);
      this.IiIIliIlil = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 240, (double)0.0F);
      this.liIIliIlil = false;
      this.iiIIliIlil = lIilliIill();
      this.IIlIliIlil = lIilliIill();
      this.lIlIliIlil = lIilliIill();
      this.iIlIliIlil = lIilliIill();
      this.iIiIliIlil = new ArrayDeque();
      this.lliIliIlil = (double)20.0F;
      this.iliIliIlil = lIilliIill();
      this.IiiIliIlil = lIilliIill();
      this.liiIliIlil = lIilliIill();
      this.iiiIliIlil = lIilliIill();
      this.IIIlliIlil = lIilliIill();
      this.lIIlliIlil = lIilliIill();
      this.iIIlliIlil = lIilliIill();
      this.IlIlliIlil = new LinkedList();
      this.llIlliIlil = new LinkedList();
      this.ilIlliIlil = false;
      this.IiIlliIlil = false;
      this.liIlliIlil = null;
      this.iiIlliIlil = 0L;
      this.IIllliIlil = Integer.MIN_VALUE;
      this.lIllliIlil = Integer.MIN_VALUE;
      this.IlIIiiIlil = 0.016F;
      this.liiIiiIlil = new iiIIlillIIlIlill();
      this.iiiIiiIlil = new iiIIlillIIlIlill();
      this.IIIliiIlil = new llliiiiilliiii();
      this.lIIliiIlil = new iiIIlIIiIIlIlIIi();
      this.iIIliiIlil = new iiIiIliIIliIli();
      this.IlIliiIlil = new float[7];
      this.llIliiIlil = new long[7];
      this.iIlliiIlil = new float[12];
      this.llliiiIlil = List.of();
      this.illiiiIlil = 0L;
      this.IiliiiIlil = 0;
      this.llIiIIllil = new iiIIlillIIlIlill();
      this.ilIiIIllil = new iiIIlillIIlIlill();
      this.IiIiIIllil = new iiIIlillIIlIlill();
      this.liIiIIllil = new iiIIlillIIlIlill();
      this.iiIiIIllil = new iiIIlillIIlIlill();
      this.IIliIIllil = new iiIIlillIIlIlill();
      this.lIliIIllil = new iiIIlillIIlIlill();
      this.iIliIIllil = new iiIIlillIIlIlill();
      this.IlliIIllil = new iiIiIliIIliIli();
      this.llliIIllil = new iiIiIliIIliIli();
      this.illiIIllil = new iiIiIliIIliIli();
      this.IiliIIllil = new iiIiIliIIliIli();
      this.liliIIllil = new iiIiIliIIliIli();
      this.iiliIIllil = new iiIiIliIIliIli();
      this.IIiiIIllil = new iiIiIliIIliIli();
      this.lIiiIIllil = new iiIiIliIIliIli();
      this.iIiiIIllil = new iiIiIliIIliIli();
      this.IliiIIllil = new iiIiIliIIliIli();
      this.lliiIIllil = new iiIiIliIIliIli();
      this.iliiIIllil = new iiIiIliIIliIli();
      this.IiiiIIllil = new iiIiIliIIliIli();
      this.liiiIIllil = new iiIiIliIIliIli();
      this.iiiiIIllil = new iiIiIliIIliIli();
      this.IIIIlIllil = new iiIiIliIIliIli();
      this.lIIIlIllil = new iiIiIliIIliIli();
      this.iIIIlIllil = new iiIiIliIIliIli[]{new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli()};
      this.IlIIlIllil = new llliiiiilliiii();
      this.llIIlIllil = new llliiiiilliiii();
      this.ilIIlIllil = new llliiiiilliiii();
      this.IiIIlIllil = new llliiiiilliiii();
      this.liIIlIllil = new llliiiiilliiii();
      this.iiIIlIllil = new llliiiiilliiii();
      this.IIlIlIllil = new llliiiiilliiii();
      this.lIlIlIllil = new llliiiiilliiii();
      this.iIlIlIllil = new llliiiiilliiii();
      this.IllIlIllil = new llliiiiilliiii();
      this.lllIlIllil = new llliiiiilliiii[]{new llliiiiilliiii(), new llliiiiilliiii(), new llliiiiilliiii(), new llliiiiilliiii(), new llliiiiilliiii()};
      this.illIlIllil = new iiIIlIIiIIlIlIIi();
      this.IilIlIllil = new iiIIlIIiIIlIlIIi();
      this.lilIlIllil = new iiIIlIIiIIlIlIIi();
      this.iilIlIllil = new float[4];
      this.liiIlIllil = new float[4];
      this.iiiIlIllil = 8.0F;
      this.IIIllIllil = 8.0F;
      this.lIIllIllil = 9.0F;
      this.iIIllIllil = 8.0F;
      this.ilIllIllil = 0L;
      this.IiIllIllil = 0L;
      this.liIllIllil = 0L;
      this.iiIllIllil = 0L;
      this.IIlllIllil = 0L;
      this.lIlllIllil = 0L;
      this.iIlllIllil = 0;
      this.IllllIllil = 0;
      this.lllllIllil = 0;
      this.iilllIllil = new HashMap();
      this.IIillIllil = new ArrayList();
      this.lIillIllil = new HashMap();
      this.iIillIllil = new ArrayList();
      this.IlillIllil = new HashMap();
      this.llillIllil = new ArrayList();
      this.IiillIllil = -1.0F;
      this.liillIllil = new class_1799[6];
      this.ilIilIllil = new HashSet();
      this.IiIilIllil = 0L;
      this.liIilIllil = new iiIIlillIIlIlill();
      this.iiIilIllil = new iiIIlillIIlIlill();
      this.IIlilIllil = new iiIIlillIIlIlill();
      this.lIlilIllil = new iiIIlillIIlIlill();
      this.iIlilIllil = new iiIIlillIIlIlill();
      this.IllilIllil = new iiIIlillIIlIlill();
      this.lllilIllil = new iiIIlillIIlIlill();
      this.illilIllil = new iiIIlillIIlIlill();
      this.IililIllil = new llliiiiilliiii();
      this.lililIllil = new llliiiiilliiii();
      this.iililIllil = new llliiiiilliiii();
      this.IIiilIllil = new llliiiiilliiii();
      this.lIiilIllil = new llliiiiilliiii[]{new llliiiiilliiii(), new llliiiiilliiii(), new llliiiiilliiii()};
      this.iIiilIllil = new IIIlliillIIlliil[4];
      this.IliilIllil = new IIIlliillIIlliil[3];
      this.lliilIllil = new float[4];
      this.iliilIllil = new float[3];
      this.iiiilIllil = "";
      this.IIIIiIllil = "";
      this.iIIIiIllil = -1;
      this.IlIIiIllil = -1;
      this.llIIiIllil = -1;
      this.IiIIiIllil = Long.MIN_VALUE;
      this.liIIiIllil = 0L;
      this.iiIIiIllil = Long.MIN_VALUE;
      this.IllIiIllil = new iiIiIliIIliIli();
      this.lllIiIllil = new iiIiIliIIliIli();
      this.illIiIllil = new iiIiIliIIliIli();
      this.IilIiIllil = new iiIiIliIIliIli();
      this.lilIiIllil = new iiIiIliIIliIli();
      this.iilIiIllil = new iiIiIliIIliIli();
      this.IIiIiIllil = new iiIiIliIIliIli();
      this.lIiIiIllil = new iiIiIliIIliIli();
      this.iIiIiIllil = new iiIiIliIIliIli();
      this.IliIiIllil = new iiIiIliIIliIli();
      this.lliIiIllil = new iiIiIliIIliIli();
      this.iliIiIllil = new iiIiIliIIliIli();
      this.IiiIiIllil = new IliIIlllliIIll();
      this.liiIiIllil = new IliIIlllliIIll();
      this.iiiIiIllil = new IliIIlllliIIll();
      this.IIIliIllil = new IliIIlllliIIll();
      this.iiIliIllil = new iiIIlIIiIIlIlIIi();
      this.IIlliIllil = new iiIIlIIiIIlIlIIi();
      this.lIlliIllil = new IlIiIIIillIiIIIi(this, 13.5F, 0.88F, false);
      this.iIlliIllil = new IlIiIIIillIiIIIi(this, 15.0F, 0.9F, true);
      this.IllliIllil = new ArrayList();
      this.lllliIllil = 0;
      this.illliIllil = -1;
      this.IilliIllil = 0L;
      this.iilliIllil = 0L;
      this.IIiliIllil = 0L;
      this.lIiliIllil = 0L;
      this.iIiliIllil = 0.016F;
      this.ililiIllil = new int[4];
      this.IiiliIllil = new int[4];
      this.liiliIllil = new long[4];
      this.iiiliIllil = new String[]{"", "", "", ""};
      this.IIIiiIllil = new iiIiIliIIliIli[]{new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli()};
      this.iIIiiIllil = 12.0F;
      this.IlIiiIllil = 27.0F;
      this.llIiiIllil = 22.0F;
      this.ilIiiIllil = new class_1799[4];
      this.IiIiiIllil = new float[4];
      this.liIiiIllil = new float[4];
      this.iiIiiIllil = new float[4];
      this.IIliiIllil = new int[4];
      this.lIliiIllil = new long[]{-1L, -1L, -1L, -1L};
      this.IlliiIllil = new float[3];
      this.llliiIllil = new iIlIIIiIllIIIi[5];
      this.iIiiiIllil = (String[])lIiiiIllil.clone();
      this.IliiiIllil = new int[lIiiiIllil.length];
      this.lliiiIllil = new float[8];
      this.IiiiiIllil = new IliIIlllliIIll();
      this.lIIIIlllil = new iiIiIliIIliIli[]{new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli(), new iiIiIliIIliIli()};
      this.iIIIIlllil = new boolean[8];
      this.IlIIIlllil = -1;
      this.iiIIIlllil = new float[4];
      this.lllIIlllil = new iiIIlillIIlIlill();
      this.illIIlllil = new iiIIlillIIlIlill();
      this.IilIIlllil = new iiIiIliIIliIli();
      this.lilIIlllil = new iiIiIliIIliIli();
      this.iilIIlllil = new iiIiIliIIliIli();
      this.IIiIIlllil = new iiIiIliIIliIli();
      this.lIiIIlllil = new llliiiiilliiii();
      this.iIiIIlllil = new IliIIlllliIIll();
      this.IliIIlllil = new IliIIlllliIIll();
      this.lliIIlllil = new float[161];
      this.iliIIlllil = new float[161];
      this.IiiIIlllil = new float[644];
      this.liiIIlllil = new float[644];
      this.iiiIIlllil = new float[6];
      this.IiIiilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.liIiilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iiIiilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IIliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lIliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iIliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.illiilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IiliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.liliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iiliilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IIiiilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lIiiilIlil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIililIlil, this.lIililIlil, this.iIililIlil, this.IlililIlil, this.llililIlil, this.ilililIlil, this.IiililIlil, this.liililIlil, this.iiililIlil, this.illiilIlil, this.IiliilIlil, this.liliilIlil, this.iiliilIlil, this.IIIiilIlil, this.lIIiilIlil, this.iIIiilIlil, this.IlIiilIlil, this.llIiilIlil, this.ilIiilIlil, this.IiIiilIlil, this.liIiilIlil, this.iiIiilIlil, this.IIliilIlil, this.lIliilIlil, this.iIliilIlil, this.IlliilIlil, this.llliilIlil, this.IIiiilIlil, this.lIiiilIlil});
      this.lliililiil();
      lillilIlil = this;
      this.IIillIiliIil(true);
   }

   public static void illIilIilIil() {
      ++iiillIllil;
   }

   private void IiIIIlliIIIl(class_332 y, int ctx, float w, float enabled, float now, long zone, boolean x) {
      float var9 = x ? this.IlIliiIlil[ctx] : 0.0F;
      float var10 = this.llIIIlilIIIl(ctx, zone);
      float var11 = Math.max(0.0F, var10);
      float var12 = w + now / 2.0F;
      float var13 = enabled + 8.5F;
      float var14 = Math.max(var9, var11);
      if (var14 > 0.01F) {
         llliIlIlilliIlIl.IIillIiliIil(w + 2.0F, enabled + 2.0F, now - 4.0F, 13.0F, 6.5F, 0.0F, llliIlIlilliIlIl.iliIiiliiiii(385875967, var14));
      }

      boolean var15 = llliIlIlilliIlIl.lIIIiiIIIi(y, var12, var13, 1.0F - 0.18F * var10);

      try {
         if (ctx != 5) {
            int var16 = x ? IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var9), llliIlIlilliIlIl.Illlllllilll(), (double)var11) : llliIlIlilliIlIl.iliIiiliiiii(-11117467, 0.6F);
            float var17 = Math.max(IIIiiIillIIiiIil.Illlllllilll(), llliIlIlilliIlIl.IIIllIIliIIl(0.75F));
            float var18 = 3.0F;
            llliIlIlilliIlIl.IIillIiliIil(llliIlIlilliIlIl.IIIllIIliIIl(var12 - var18), llliIlIlilliIlIl.IIIllIIliIIl(var13 - var17 / 2.0F), 6.0F, var17, var17 / 2.0F, 0.0F, var16);
            if (ctx == 4) {
               llliIlIlilliIlIl.IIillIiliIil(llliIlIlilliIlIl.IIIllIIliIIl(var12 - var17 / 2.0F), llliIlIlilliIlIl.IIIllIIliIIl(var13 - var18), var17, 6.0F, var17 / 2.0F, 0.0F, var16);
            }

            return;
         }

         llliIlIlilliIlIl.IIiilIiiiIii(lIlIIiliIlIIil.IIIilIIiiIIi(), llliIlIlilliIlIl.IIIllIIliIIl(var12 - 4.0F), llliIlIlilliIlIl.IIIllIIliIIl(var13 - 4.0F), 8.0F, var14 > 0.5F ? llliIlIlilliIlIl.liIlIlIiIl : llliIlIlilliIlIl.iiIlIlIiIl);
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(y, var15);
      }

   }

   public static void iilIllIIiIll(String zone, String id) {
      IIililillIililil var2 = lliiIliliiIl();
      if (var2 != null) {
         if (IliIlllilIi<invokedynamic>().equals(zone)) {
            var2.iIliliIlil = false;
            var2.IlliliIlil = false;
            var2.IliiliIlil = null;
         } else {
            var2.iIliliIlil = true;
            var2.IliiliIlil = zone;
            byte var4 = -1;
            switch (id.hashCode()) {
               case -1224577496:
                  if (id.equals(IliIlllilIi<invokedynamic>())) {
                     var4 = 0;
                  }
                  break;
               case 3444122:
                  if (id.equals(IliIlllilIi<invokedynamic>())) {
                     var4 = 3;
                  }
                  break;
               case 102727412:
                  if (id.equals(IliIlllilIi<invokedynamic>())) {
                     var4 = 2;
                  }
                  break;
               case 103901296:
                  if (id.equals(IliIlllilIi<invokedynamic>())) {
                     var4 = 1;
                  }
                  break;
               case 108404047:
                  if (id.equals(IliIlllilIi<invokedynamic>())) {
                     var4 = 4;
                  }
            }

            byte var10001;
            switch (var4) {
               case 0 -> var10001 = 1;
               case 1 -> var10001 = 2;
               case 2 -> var10001 = 3;
               case 3 -> var10001 = 4;
               case 4 -> var10001 = 5;
               default -> var10001 = 0;
            }

            var2.IIIIiiIlil = var10001;
         }
      }
   }

   private static float Illillllil(float edge) {
      return edge <= 0.25F ? 0.0F : (edge >= 0.75F ? 1.0F : 0.5F);
   }

   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         this.iIiiilIlil.clear();
         this.IliiilIlil.clear();
         this.ilIlIiIlil.clear();
         this.llIlIiIlil.clear();
         this.IIiiIiIlil.clear();
         System.arraycopy(lIiiiIllil, 0, this.iIiiiIllil, 0, lIiiiIllil.length);
         if (var2.has(IliIlllilIi<invokedynamic>())) {
            this.IIliliIlil = true;
         }

         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonArray()) {
            String[] var3 = new String[lIiiiIllil.length];
            int var4 = 0;

            for(JsonElement var6 : var2.getAsJsonArray(IliIlllilIi<invokedynamic>())) {
               try {
                  String var7 = var6.getAsString();
                  boolean var8 = false;

                  for(int var9 = 0; var9 < var4; ++var9) {
                     var8 |= var3[var9].equals(var7);
                  }

                  if (!var8 && liiilliiiill(var7) >= 0 && var4 < var3.length) {
                     var3[var4++] = var7;
                  }
               } catch (Exception var15) {
               }
            }

            for(String var33 : lIiiiIllil) {
               boolean var34 = false;

               for(int var10 = 0; var10 < var4; ++var10) {
                  var34 |= var3[var10].equals(var33);
               }

               if (!var34) {
                  var3[var4++] = var33;
               }
            }

            System.arraycopy(var3, 0, this.iIiiiIllil, 0, var3.length);
         }

         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonArray()) {
            for(JsonElement var18 : var2.getAsJsonArray(IliIlllilIi<invokedynamic>())) {
               try {
                  String var23 = var18.getAsString();
                  if (!this.ilIlIiIlil.contains(var23)) {
                     this.ilIlIiIlil.add(var23);
                  }
               } catch (Exception var13) {
               }
            }
         }

         boolean var17 = !var2.has(IliIlllilIi<invokedynamic>());
         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonObject()) {
            for(Map.Entry var24 : var2.getAsJsonObject(IliIlllilIi<invokedynamic>()).entrySet()) {
               try {
                  float var28 = (float)Math.round(((JsonElement)var24.getValue()).getAsFloat() * 100.0F) / 100.0F;
                  if (!(var28 < 0.6F) && !(var28 > 1.8F) && (!var17 || var28 != iIiilIliil((String)var24.getKey()))) {
                     iiIliiiIIlliii var32 = new iiIliiiIIlliii();
                     var32.liIiIIIlIl = var28;
                     var32.iiIiIIIlIl = var28;
                     this.IIiiIiIlil.put((String)var24.getKey(), var32);
                  }
               } catch (Exception var14) {
               }
            }
         }

         this.lliililiil();
         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonObject()) {
            for(Map.Entry var25 : var2.getAsJsonObject(IliIlllilIi<invokedynamic>()).entrySet()) {
               try {
                  JsonArray var29 = ((JsonElement)var25.getValue()).getAsJsonArray();
                  this.iIiiilIlil.put((String)var25.getKey(), new float[]{var29.get(0).getAsFloat(), var29.get(1).getAsFloat()});
               } catch (Exception var12) {
               }
            }
         }

         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonObject()) {
            for(Map.Entry var26 : var2.getAsJsonObject(IliIlllilIi<invokedynamic>()).entrySet()) {
               try {
                  JsonArray var30 = ((JsonElement)var26.getValue()).getAsJsonArray();
                  this.IliiilIlil.put((String)var26.getKey(), new float[]{var30.get(0).getAsFloat(), var30.get(1).getAsFloat(), var30.get(2).getAsFloat(), var30.get(3).getAsFloat()});
               } catch (Exception var11) {
               }
            }
         }

      }
   }

   private static float lIIIiiIIIi(float v) {
      return Math.abs(v - 1.0F) < 0.065F ? 1.0F : (float)Math.round(v / 0.05F) * 0.05F;
   }

   private float ilIIIiIiIIIi(class_332 y, float x, float ctx, long now) {
      boolean var6 = this.iiIiilIlil.Iilllilliill();
      float var7 = this.IlIIIillIIIi();
      float var8 = (var7 * this.lililiilil() + 6.0F) * this.lilIiIllil.liiiIIllIl(var6 && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      if (!this.lIlilIllil.IilliliilIIi(var6, llIiiiIlil)) {
         return var8;
      } else {
         if (this.lIIiiIllil == null) {
            this.lIIiiIllil = new class_1799[]{new class_1799(class_1802.field_8463), new class_1799(class_1802.field_8288), new class_1799(class_1802.field_8301), new class_1799(class_1802.field_8287)};
         }

         boolean var9 = this.lIiliIllil == 0L || now - this.lIiliIllil > 1000000000L;
         if (var9 || now - this.lIiliIllil >= 250000000L) {
            this.lIiliIllil = now;
            this.iiiiilIIIIIi(now, var9);
         }

         float var10 = 6.0F;
         float var11 = 0.0F;

         for(int var12 = 0; var12 < 4; ++var12) {
            var11 = Math.max(var11, this.iiIIIlllil[var12]);
         }

         float var38 = Math.max(this.IlIiiIllil, (float)Math.ceil((double)(this.iIIiiIllil + 3.0F + var11 + 9.0F)));
         float var13 = this.iilIiIllil.IilliliilIIi((float)Math.ceil((double)Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.iiliiIllil, 0.0F), 2.0F * var10 + 4.0F * var38)), this.iIiliIllil, 0.08F);
         float var14 = (var13 - 2.0F * var10) / 4.0F;
         float var15 = x + this.lIiIIiIlil;
         float var16 = ctx + this.iIiIIiIlil;
         this.IilIililIi(var15, var16, var13, var7);
         float var17 = IliiIilliiIi.IilliliilIIi(this.lIlilIllil.IliIlllilIi());
         boolean var18 = llliIlIlilliIlIl.lIIIiiIIIi(y, var15 + var13 / 2.0F, var16 + var7 / 2.0F, this.lIlilIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IilIIlIiIl, var15, var16, var13, var7, 1.0F);
            float var19 = llliIlIlilliIlIl.illIlIilIl(y, var15, var16, var13, lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llliIlIlilliIlIl.iIllIlIiIl, IliIlllilIi<invokedynamic>(), (llliiiiilliiii)null, (iiIIlIIiIIlIlIIi)null, 1.0F);
            float var20 = var19 + this.llIiiIllil / 2.0F;
            float var21 = this.iIIiiIllil + 2.0F;
            float var22 = llliIlIlilliIlIl.IIIllIIliIIl(var20 - this.iIIiiIllil / 2.0F);
            float var23 = llliIlIlilliIlIl.IIIllIIliIIl(var20 - var21 / 2.0F);

            for(int var24 = 1; var24 < 4; ++var24) {
               llliIlIlilliIlIl.iIIilIlIil(y, var15 + var10 + (float)var24 * var14, var23, var21, 536870911);
            }

            for(int var39 = 0; var39 < 4; ++var39) {
               float var25 = var15 + var10 + ((float)var39 + 0.5F) * var14;
               float var26 = this.IIIiiIllil[var39].liiiIIllIl(this.ililiIllil[var39] > 0 ? 1.0F : 0.0F, this.iIiliIllil, 0.06F, 0.002F);
               float var27 = this.iiIIIlllil[var39];
               float var28 = llliIlIlilliIlIl.IIIllIIliIIl(var25 - (this.iIIiiIllil + 3.0F + var27) / 2.0F);
               boolean var29 = llliIlIlilliIlIl.lIIIiiIIIi(y, var28 + this.iIIiiIllil / 2.0F, var22 + this.iIIiiIllil / 2.0F, this.lIIIIiiIIIIi(var39, now));

               try {
                  llliIlIlilliIlIl.lIIlliIIll(y, this.lIIiiIllil[var39], var28, var22, this.iIIiiIllil);
               } finally {
                  llliIlIlilliIlIl.IlIIillIIi(y, var29);
               }

               Color var30 = var26 >= 0.998F ? llliIlIlilliIlIl.liIlIlIiIl : (var26 <= 0.002F ? liIIIlllil : new Color(IilIIIIililIIIIi.Illlllllilll(liIIIlllil.getRGB(), llliIlIlilliIlIl.liIlIlIiIl.getRGB(), (double)var26), true));
               llliIlIlilliIlIl.lililiilil(this.iiiliIllil[var39], var28 + this.iIIiiIllil + 3.0F, llliIlIlilliIlIl.illilIilil(var22, this.iIIiiIllil, 0.82F), 0.82F, var30);
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(y, var18);
            IliiIilliiIi.lIiiIiIlilli(var17);
         }

         return var8;
      }
   }

   private boolean IlIiillIii(float w, float x, float h, float y) {
      for(int var5 = 0; var5 < this.llilIiIlil; ++var5) {
         if (this.lIIiiiIIii(var5) && liiIiiiiIi(w, x, h, y, this.IlllIiIlil[var5], this.llllIiIlil[var5], this.lIllIiIlil[var5], this.iIllIiIlil[var5])) {
            return false;
         }
      }

      return true;
   }

   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();

      for(Map.Entry var3 : this.IIiiIiIlil.entrySet()) {
         if (((iiIliiiIIlliii)var3.getValue()).liIiIIIlIl != IIiillIiil((String)var3.getKey())) {
            var1.addProperty((String)var3.getKey(), ((iiIliiiIIlliii)var3.getValue()).liIiIIIlIl);
         }
      }

      boolean var11 = !this.IIIIillIIIil();
      if (this.iIiiilIlil.isEmpty() && this.IliiilIlil.isEmpty() && var1.size() == 0 && !this.IIliliIlil && !var11) {
         return null;
      } else {
         JsonObject var12 = new JsonObject();
         JsonObject var4 = new JsonObject();

         for(Map.Entry var6 : this.iIiiilIlil.entrySet()) {
            float[] var7 = (float[])var6.getValue();
            if (!(Math.abs(var7[0]) < 0.5F) || !(Math.abs(var7[1]) < 0.5F)) {
               JsonArray var8 = new JsonArray();
               var8.add(var7[0]);
               var8.add(var7[1]);
               var4.add((String)var6.getKey(), var8);
            }
         }

         JsonObject var13 = new JsonObject();

         for(Map.Entry var17 : this.IliiilIlil.entrySet()) {
            float[] var20 = (float[])var17.getValue();
            JsonArray var9 = new JsonArray();
            var9.add(var20[0]);
            var9.add(var20[1]);
            var9.add(var20[2]);
            var9.add(var20[3]);
            var13.add((String)var17.getKey(), var9);
         }

         if (var4.size() == 0 && var13.size() == 0 && var1.size() == 0 && !this.IIliliIlil && !var11) {
            return null;
         } else {
            if (var11) {
               JsonArray var15 = new JsonArray();

               for(String var10 : this.iIiiiIllil) {
                  var15.add(var10);
               }

               var12.add(IliIlllilIi<invokedynamic>(), var15);
            }

            if (var4.size() > 0) {
               var12.add(IliIlllilIi<invokedynamic>(), var4);
            }

            if (var13.size() > 0) {
               var12.add(IliIlllilIi<invokedynamic>(), var13);
            }

            JsonArray var16 = new JsonArray();

            for(String var22 : this.ilIlIiIlil) {
               if (this.IliiilIlil.containsKey(var22)) {
                  var16.add(var22);
               }
            }

            if (var16.size() > 0) {
               var12.add(IliIlllilIi<invokedynamic>(), var16);
            }

            if (var1.size() > 0) {
               var12.add(IliIlllilIi<invokedynamic>(), var1);
            }

            if (this.IIliliIlil) {
               var12.addProperty(IliIlllilIi<invokedynamic>(), true);
            }

            var12.addProperty(IliIlllilIi<invokedynamic>(), 2);
            return var12;
         }
      }
   }

   private float liiiiiiiii(float home, float y, float h, float x, boolean w) {
      this.liIliiIlil = y;
      this.iiIliiIlil = Float.MAX_VALUE;
      float var6 = (float)this.liiiilIlil;
      float var7 = (float)this.iiiiilIlil;
      float var8 = var7 / 2.0F;
      float var9 = 6.0F;
      this.iiliiIIiii(var8 - x / 2.0F, 0.0F, var8, var6, var8);
      this.iiliiIIiii(6.0F, home, 6.0F, home + h, 6.0F);
      this.iiliiIIiii(var7 - 6.0F - x, home, var7 - 6.0F, home + h, var7 - 6.0F);
      if (w) {
         this.iiliiIIiii(this.iiIIIiIlil);
      }

      for(int var10 = 0; var10 < this.llilIiIlil; ++var10) {
         if (!this.IiIlIiIlil[var10].equals(this.lIIIIiIlil) && !this.iliillIiiill(this.IiIlIiIlil[var10])) {
            float var11 = this.IlllIiIlil[var10];
            float var12 = this.llllIiIlil[var10];
            float var13 = this.lIllIiIlil[var10];
            float var14 = this.iIllIiIlil[var10];
            float var15 = Math.min(var11, home);
            float var16 = Math.max(var11 + var13, home + h);
            if (home < var11 + var13 + var9 && var11 < home + h + var9) {
               float var17 = Math.max(var11, home);
               float var18 = Math.min(var11 + var13, home + h);
               this.lIiiiiIiii(var12 + var14 + var9, true, var17, var12 + var14 + var9 / 2.0F, var18, var12 + var14 + var9 / 2.0F);
               this.lIiiiiIiii(var12 - var9 - x, false, var17, var12 - var9 / 2.0F, var18, var12 - var9 / 2.0F);
            }

            if (!(home < var11 + var13) || !(var11 < home + h) || !(y < var12 + var14) || !(var12 < y + x)) {
               this.iiliiIIiii(var12, var15, var12, var16, var12);
               this.iiliiIIiii(var12 + var14 - x, var15, var12 + var14, var16, var12 + var14);
               this.iiliiIIiii(var12 + (var14 - x) / 2.0F, var15, var12 + var14 / 2.0F, var16, var12 + var14 / 2.0F);
               this.iiliiIIiii(var7 - var12 - var14, 0.0F, var8, var6, var8, home, var7 - var12 - var14, home + h, var7 - var12 - var14, var11, var12 + var14, var11 + var13, var12 + var14);
               this.iiliiIIiii(var7 - var12 - x, 0.0F, var8, var6, var8, home, var7 - var12, home + h, var7 - var12, var11, var12, var11 + var13, var12);
            }
         }
      }

      return this.Iliiilliii();
   }

   private double[] iiIliIIlli(float factor) {
      class_1041 var2 = Iiiilllliiilll.method_22683();
      double var3 = Iiiilllliiilll.field_1729.method_1603() * (double)var2.method_4486() / (double)Math.max(1, var2.method_4480());
      double var5 = Iiiilllliiilll.field_1729.method_1604() * (double)var2.method_4502() / (double)Math.max(1, var2.method_4507());
      return new double[]{var3 / (double)factor, var5 / (double)factor};
   }

   private void lIiilliIiill(float adv, float w) {
      this.iIIliIllil += adv;
      if (adv > 0.5F) {
         this.llIliIllil = Math.max(this.llIliIllil, w);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ var5))) << 3 | (char)(-((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ var5))) >>> 13))) ^ var5) ^ var5) + 23470) + 'ꭏ'))) >>> 1 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ var5))) << 3 | (char)(-((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ var5))) >>> 13))) ^ var5) ^ var5) + 23470) + 'ꭏ'))) << 15) ^ '蘭') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static liIliIliiIliIl lIilliIill() {
      return new liIliIliiIliIl(llIIIliilIIIli.iIlilliiiIllilliii, -447244992 * -438261969 * -125 ^ -2017454780, (double)0.0F);
   }

   private void iIIIilIlIIil(class_332 now, int radarD, long i, boolean radarOn, float ctx) {
      String var7 = this.iIiiiIllil[radarD];
      this.IliiiIllil[radarD] = -1;
      byte var9 = -1;
      switch (var7.hashCode()) {
         case -2020599460:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var9 = 2;
            }
            break;
         case -1983070683:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var9 = 1;
            }
            break;
         case -390600384:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var9 = 5;
            }
            break;
         case 473741317:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var9 = 4;
            }
            break;
         case 503572695:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var9 = 0;
            }
            break;
         case 1123654140:
            if (var7.equals(IliIlllilIi<invokedynamic>())) {
               var9 = 3;
            }
      }

      switch (var9) {
         case 0:
            float var22 = this.liIiilIlil.Iilllilliill() && this.iIlliIllil.ilIiiIliil ? (30.0F + this.iIlliIllil.IlIiiIliil + 5.0F) * this.illilIilil(var7) : 0.0F;
            this.llIIililIIil(this.IiiiiIllil, this.IIlilIllil, !this.IiIIilliIIil(var7), var22);
            this.IliiiIllil[radarD] = this.liIliIllil;
            this.Iliilllliill(var7, var22, 0.0F, !this.IiIIilliIIil(var7));
            this.IIIillIIil(var7);
            this.lIiilliIiill(this.iIiiilIliiil(now, this.lIIliIllil, this.iIIliIllil), this.IilIiIllil.lIiiIiIlilli() * this.lililiilil());
            this.iIIilIlIil();
            break;
         case 1:
            float var21 = this.iiIiilIlil.Iilllilliill() ? this.IlIIIillIIIi() * this.illilIilil(var7) : 0.0F;
            this.llIIililIIil(this.IiiIiIllil, this.lIlilIllil, !this.IiIIilliIIil(var7), var21);
            this.IliiiIllil[radarD] = this.liIliIllil;
            this.Iliilllliill(var7, var21, 0.0F, !this.IiIIilliIIil(var7));
            this.IIIillIIil(var7);
            this.lIiilliIiill(this.ilIIIiIiIIIi(now, this.lIIliIllil, this.iIIliIllil, i), this.iilIiIllil.lIiiIiIlilli() * this.lililiilil());
            this.iIIilIlIil();
            break;
         case 2:
            float var20 = this.IIliilIlil.Iilllilliill() ? this.iIlIIiIllIIi() * this.illilIilil(var7) : 0.0F;
            this.llIIililIIil(this.IliIIlllil, this.illIIlllil, !this.IiIIilliIIil(var7), var20);
            this.IliiiIllil[radarD] = this.liIliIllil;
            this.Iliilllliill(var7, var20, 0.0F, !this.IiIIilliIIil(var7));
            this.IIIillIIil(var7);
            this.lIiilliIiill(this.lllIIiillIIi(now, this.lIIliIllil, this.iIIliIllil), this.IIlIIilIlIIi() * this.lililiilil());
            this.iIIilIlIil();
            break;
         case 3:
            boolean var19 = !this.IiIIilliIIil(var7);
            boolean var23 = radarOn && IliIlllilIi<invokedynamic>().equals(this.illiilIlil.Iilllilliill());
            boolean var24 = this.iIIiilIlil.Iilllilliill() && (var19 || var23);
            boolean var13 = var24 && var23;
            this.llIIililIIil(this.liiIiIllil, var19 ? this.llIiIIllil : this.IIliIIllil, var24, this.IiIliIllil);
            this.IliiiIllil[radarD] = this.liIliIllil;
            this.Iliilllliill(var7, var24 ? this.IiIliIllil : 0.0F, var13 ? 6.0F + ctx : 0.0F, var24);
            float var14 = this.lIIliIllil;
            float var15 = this.iIIliIllil;
            this.IIIillIIil(var7);
            float var16 = this.lililiilil();
            float var17 = this.IlIlilllIlil(now, this.lIIliIllil, this.iIIliIllil) * var16;
            this.iIIilIlIil();
            if (var24 && (!var19 || this.llIiIIllil.IliIlllilIi() > 0.01F)) {
               this.liilIliiilIl(var14, var15, 74.0F * var16, var17);
            }

            this.IiIliIllil = var24 ? (var13 ? Math.max(var17, ctx) : var17) : 0.0F;
            this.lIiilliIiill(this.IIiIiIllil.IliIlllilIi(var24 ? this.IiIliIllil + 6.0F : 0.0F, this.iIiliIllil, 0.08F), 74.0F * var16 + (var13 ? 6.0F + ctx : 0.0F));
            break;
         case 4:
            float var18 = this.lIliilIlil.Iilllilliill() ? 68.0F * this.illilIilil(var7) : 0.0F;
            this.llIIililIIil(this.iIiIIlllil, this.lllIIlllil, !this.IiIIilliIIil(var7), var18);
            this.IliiiIllil[radarD] = this.liIliIllil;
            this.Iliilllliill(var7, var18, 0.0F, !this.IiIIilliIIil(var7));
            this.IIIillIIil(var7);
            this.lIiilliIiill(this.IilIIililIIi(now, this.lIIliIllil, this.iIIliIllil, i), 156.0F * this.lililiilil());
            this.iIIilIlIil();
            break;
         case 5:
            boolean var10 = !this.IiIIilliIIil(var7);
            float var11 = this.illilIilil(var7);
            float var12 = this.IllllIllil > 0 ? (30.0F + (float)this.IllllIllil * 15.0F + 5.0F) * var11 : 0.0F;
            this.llIIililIIil(this.iiiIiIllil, this.ilIiIIllil, var10, var12);
            this.IliiiIllil[radarD] = this.liIliIllil;
            this.Iliilllliill(var7, var12, 0.0F, var10);
            this.IIIillIIil(var7);
            this.lIiilliIiill(this.IIllillIllil(now, this.lIIliIllil, this.iIIliIllil, i), this.llliIIllil.lIiiIiIlilli());
            this.llIIililIIil(this.IIIliIllil, this.IiIiIIllil, var10, this.lllllIllil > 0 ? (30.0F + (float)this.lllllIllil * 15.0F + 5.0F) * var11 : 0.0F);
            this.Iillillillil(now, this.lIIliIllil, this.iIIliIllil, i);
            this.iIIilIlIil();
      }

   }

   private String IllIillllIil(int code) {
      long var3 = 5801212714089877015L;
      if (code >= 0 && IlIiliIlllIiliIl.IliIlllilIi(code)) {
         var3 ^= ((long)IlIiliIlllIiliIl.liiiIIllIl(code) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) == 0 ? IliIlllilIi<invokedynamic>() : ((int)(var3 >>> 32) == ((186915907 << 7 | 186915907 >>> 25) ^ -5 ^ 1844567679) ? IliIlllilIi<invokedynamic>() : ((int)(var3 >>> 32) == (~(--1397935114 * -1857283155) ^ -1198584001) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + ((int)(var3 >>> 32) + 1)));
      } else {
         return this.lIilIliIilIl(code);
      }
   }

   private void IllIIllllIIl(class_332 mx, double ctx, double my) {
      int var6 = llliIlIlilliIlIl.Illlllllilll();
      float var7 = IIIiiIillIIiiIil.Illlllllilll();
      float var8 = this.illliIilli();

      for(int var9 = 0; var9 < this.IiiiilIlil.size(); ++var9) {
         iiiilIIIIi var10 = (iiiilIIIIi)this.IiiiilIlil.get(var9);
         boolean var11 = var10.Iillililillili.equals(this.lIIIIiIlil) || this.lIIIIiIlil == null && var10.Iillililillili.equals(this.iIIIIiIlil);
         float var12 = llliIlIlilliIlIl.IIIllIIliIIl(var10.iilliliIIilili) - 2.0F;
         float var13 = llliIlIlilliIlIl.IIIllIIliIIl(var10.lIililiiIilili) - 2.0F;
         float var14 = llliIlIlilliIlIl.IIIllIIliIIl(var10.Ilililillilili) + 4.0F;
         float var15 = llliIlIlilliIlIl.IIIllIIliIIl(var10.ilililiIiilili) + 4.0F;
         float var16 = Math.min(var8, Math.min(var14, var15) / 2.0F);
         if (var11) {
            IIIiiIillIIiiIil.IlIlllIlilIl(mx, var12, var13, var14, var15, var16, lliIIliliIIl(var6, 20));
         }

         IIIiiIillIIiiIil.Iiilliiliiil(mx, var12, var13, var14, var15, var16, var7, var11 ? lliIIliliIIl(var6, 235) : lliIIliliIIl(-1, 64));
      }

      this.IIIIIllIIIIl();
      this.iiIIIlIIlIIl(mx);
      this.lIlIIliIlIIl(mx);
      IIlIiIlllIlIiIll var18 = IIlIiIlllIlIiIll.liiiIIllIl();
      if (var18.IIillIiliIil()) {
         String var19 = this.IIiiliIlil != null ? IliIlllilIi<invokedynamic>() : (this.lIIIIiIlil != null ? IliIlllilIi<invokedynamic>() : (this.iIIIIiIlil != null ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()));
         float var20 = 11.0F;
         float var21 = 9.0F;
         float var22 = 17.0F;
         float var23 = var18.Iiilliiliiil(var19, 11.0F);
         float var24 = 9.0F + var23 + 9.0F;
         float var25 = ((float)this.liiiilIlil - var24) / 2.0F;
         float var17 = 3.0F;
         IlIlIlllIlIl(mx, var25, var17, var24, 17.0F, 7.0F, lliIIliliIIl(-15724524, 232));
         IIIiiIillIIiiIil.Iiilliiliiil(mx, var25, var17, var24, 17.0F, 7.0F, var7, lliIIliliIIl(-1, 56));
         var18.IIlilIliiIli(var19, var25 + 9.0F, var17 + (17.0F - var18.IlIillIiilIi(11.0F)) / 2.0F, -1, 11.0F);
      }
   }

   public static float liIIlliiIIll(float w, float ids, float x, float h, String... y) {
      IIililillIililil var5 = lliiIliliiIl();
      if (var5 != null && var5.IliIlllilIi()) {
         float var6 = ids;
         float[] var7 = var5.IiiIIiIlil;

         for(String var11 : y) {
            if (var5.iiIilIIlil(var11, var7)) {
               float var12 = var7[0];
               float var13 = var7[1];
               float var14 = var7[2];
               float var15 = var7[3];
               if (!(var12 + var14 <= w) && !(var12 >= w + x) && !(var13 >= var6 + h) && !(var13 + var15 <= var6)) {
                  var6 = var13 + var15 + 6.0F;
               }
            }
         }

         return var6;
      } else {
         return ids;
      }
   }

   private float iiIIilIIlIil(String y, ilIllIiIll owner, float id, float x) {
      if (owner != null && owner.IliIlllilIi()) {
         float[] var5 = this.IiiIIiIlil;
         if (!this.iiIilIIlil(y, var5)) {
            return x;
         } else {
            float var6 = var5[0];
            float var7 = var5[1];
            float var8 = var5[2];
            float var9 = var5[3];
            return !(var6 > id + 120.0F) && !(var6 + var8 < id) && !(var7 + var9 < x) && !(var7 > x + 64.0F) ? var7 + var9 + 6.0F : x;
         }
      } else {
         return x;
      }
   }

   private static void IIlilllIlill(class_332 y, IIlIiIlllIlIiIll s, IIIlliillIIlliil f, float h, float x, float ctx, float a) {
      liIilliiIill(y, s, f, h, x, ctx, a, 1.0F);
   }

   private boolean Illlilllli(String id) {
      float var2 = Float.MAX_VALUE;
      float var3 = Float.MAX_VALUE;
      float var4 = -Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;

      for(int var6 = 0; var6 < this.IiiiilIlil.size(); ++var6) {
         iiiilIIIIi var7 = (iiiilIIIIi)this.IiiiilIlil.get(var6);
         if (var7.Iillililillili.equals(id)) {
            var2 = Math.min(var2, var7.iilliliIIilili);
            var3 = Math.min(var3, var7.lIililiiIilili);
            var4 = Math.max(var4, var7.iilliliIIilili + var7.Ilililillilili);
            var5 = Math.max(var5, var7.lIililiiIilili + var7.ilililiIiilili);
         }
      }

      if (var4 < var2) {
         return false;
      } else {
         this.llIIiiIlil = var2;
         this.ilIIiiIlil = var3;
         this.IiIIiiIlil = var4 - var2;
         this.liIIiiIlil = var5 - var3;
         this.lIlIiiIlil = llliIlIlilliIlIl.IIIllIIliIIl(17.0F + this.IilIiiIlil + 17.0F + 16.0F * this.iIIliiIlil.lIiiIiIlilli());
         this.iIlIiiIlil = llliIlIlilliIlIl.IIIllIIliIIl(Math.max(3.0F, Math.min((float)this.liiiilIlil - 3.0F - this.lIlIiiIlil, var2 + (this.IiIIiiIlil - this.lIlIiiIlil) / 2.0F)));
         float var11 = var5 + 6.0F;
         float var12 = var3 - 6.0F - 17.0F;
         this.IllIiiIlil = llliIlIlilliIlIl.IIIllIIliIIl(var11 + 17.0F <= (float)this.iiiiilIlil - 22.0F ? var11 : (var12 >= 3.0F ? var12 : var5 - 17.0F - 4.0F));
         float[] var8 = (float[])this.lliiilIlil.get(id);
         float[] var9 = (float[])this.iIiiilIlil.get(id);
         if (var8 != null) {
            this.IiIilliIil(id, (iiIliiiIIlliii)this.IIiiIiIlil.get(id), var8[0] + (var9 != null ? var9[0] : 0.0F), var8[1] + (var9 != null ? var9[1] : 0.0F), var8[2], var8[3]);
         } else {
            this.lIIIiiIlil = 0.0F;
            this.iIIIiiIlil = 0.0F;
         }

         float var10 = 2.0F - Math.min(this.illliIilli(), Math.min(this.IiIIiiIlil, this.liIIiiIlil) / 2.0F + 2.0F) * 0.2929F;
         this.lllIiiIlil = llliIlIlilliIlIl.IIIllIIliIIl(this.lIIIiiIlil >= 0.75F ? var2 - var10 : var4 + var10);
         this.illIiiIlil = llliIlIlilliIlIl.IIIllIIliIIl(this.iIIIiiIlil >= 0.75F ? var3 - var10 : var5 + var10);
         return true;
      }
   }

   private boolean IiIIilliIIil(String id) {
      if (this.liiiiIllil && id.equals(this.lIIIIiIlil)) {
         return false;
      } else if (this.IliiilIlil.containsKey(id)) {
         return true;
      } else {
         float[] var2 = (float[])this.iIiiilIlil.get(id);
         return var2 != null && (Math.abs(var2[0]) >= 0.5F || Math.abs(var2[1]) >= 0.5F);
      }
   }

   private boolean IIliilIlii(String w, float id, float x, float y, float h) {
      int var6 = -1;

      for(int var7 = 0; var7 < this.iIiiiIllil.length; ++var7) {
         if (this.iIiiiIllil[var7].equals(w)) {
            var6 = var7;
         }
      }

      if (var6 < 0) {
         return false;
      } else {
         float var20 = x + h / 2.0F;

         for(int var8 = 0; var8 < this.iliiiIllil; ++var8) {
            if (!(Math.abs(id - this.lliiiIllil[var8]) > 24.0F)) {
               float var9 = Float.MAX_VALUE;
               float var10 = -Float.MAX_VALUE;
               int var11 = -1;
               int var12 = -1;

               for(int var13 = 0; var13 < this.iIiiiIllil.length; ++var13) {
                  if (var13 != var6 && this.IliiiIllil[var13] == var8) {
                     String var14 = this.iIiiiIllil[var13];
                     int var15 = this.IiIIilliIIil(var14) ? -1 : this.liIiiiiIii(var14);
                     if (var15 >= 0) {
                        var9 = Math.min(var9, this.IIllIiIlil[var15]);
                        var10 = Math.max(var10, this.IIllIiIlil[var15] + this.iIllIiIlil[var15]);
                        var12 = var13;
                        if (var11 < 0 && this.IIllIiIlil[var15] + this.iIllIiIlil[var15] / 2.0F > var20) {
                           var11 = var13;
                        }
                     }
                  }
               }

               if (var12 < 0) {
                  if (var8 != 0) {
                     continue;
                  }

                  var9 = var10 = this.IlIliIllil;
               }

               if (!(x + h < var9 - 16.0F) && !(x > var10 + 30.0F)) {
                  int var21 = var11 >= 0 ? var11 : var12 + 1;
                  int var22 = this.liIiiiiIii(w);
                  if (this.liiiiIllil && var22 >= 0 && var21 != var6 && var21 != var6 + 1) {
                     float var23 = this.iIllIiIlil[var22] + 6.0F;
                     int var16 = var21 < var6 ? var21 : var6 + 1;
                     int var17 = var21 < var6 ? var6 - 1 : var21 - 1;

                     for(int var18 = var16; var18 <= var17; ++var18) {
                        String var19 = this.iIiiiIllil[var18];
                        if (this.IliiiIllil[var18] == var8 && !this.IiIIilliIIil(var19) && this.liIiiiiIii(var19) >= 0) {
                           this.iIliiIllii(var19, 0.0F, var21 < var6 ? -var23 : var23);
                        }
                     }
                  }

                  this.llliiillii(var6, var21);
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static float iiiIIlIIIlIl(IIlIiIlllIlIiIll size, String s, float f) {
      float var3 = IiiIIlliiIIl(size, f);
      float var4 = 0.0F;

      for(int var5 = 0; var5 < s.length(); ++var5) {
         char var6 = s.charAt(var5);
         var4 += var6 >= '0' && var6 <= '9' ? var3 : size.IIIilIIiiIIi(var6, f);
      }

      return var4;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5756527982630107244L ^ Long.rotateLeft(-230520645811138781L, 9) ^ 5966858037557785415L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2890579889701313967L ^ Long.rotateLeft(1560222013410452136L, 13) ^ -7870949212548701526L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7640695822722711029L ^ Long.rotateLeft(-3790518832880563838L, 46) ^ -2023102304916491884L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -486416913471623390L ^ Long.rotateLeft(-6022721120467328262L, 35) ^ 6067645342390061039L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8178564303114476470L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2613250536245875872L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4154581255639218879L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1460565015731994317L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2766659669241322445L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 499088314018191228L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
      byte[] var13 = var11.decode(var3);
      var12.init(2, var10, new GCMParameterSpec(128, var13, 0, 12));
      byte[] var15 = var12.doFinal(var13, 12, var13.length - 12);
      String var16 = new String(var15, StandardCharsets.UTF_8);
      Arrays.fill(var4, (byte)0);
      Arrays.fill(var5, (byte)0);
      Arrays.fill(var6, (byte)0);
      Arrays.fill(var8, (byte)0);
      Arrays.fill(var9, (byte)0);
      Arrays.fill(var15, (byte)0);
      MethodHandle var17 = MethodHandles.constant(String.class, var16);
      return new ConstantCallSite(var17);
   }

   private static float iIlIiIllIi(float hi, float lo, float v) {
      return hi < lo ? lo : (hi > v ? v : hi);
   }

   private static boolean IiIiIlliIiIl(long atPass) {
      return atPass >= (3794728368305042218L ^ 3794728368305042218L) && atPass >= llIiiiIlil - 1L;
   }

   private static void lIliiliIliil(class_332 segW, IIlIiIlllIlIiIll segs, int x, float seed, float n, IIIlliillIIlliil[] y, float[] ctx, int pop, float f, iiIIlillIIlIlill w) {
      float var10 = IliiIilliiIi.IilliliilIIi(w.IliIlllilIi());
      boolean var11 = llliIlIlilliIlIl.lIIIiiIIIi(segW, seed + f / 2.0F, n + 10.0F, w.liiiIIllIl());

      try {
         llliIlIlilliIlIl.IIIilIIiiIIi(x, (float)Math.round(seed), (float)Math.round(n), (float)Math.max(0, Math.round(f)), (float)Math.round(20.0F), (float)Math.round(6.0F), 1.0F);
         float var12 = seed;

         for(int var13 = 0; var13 < pop; ++var13) {
            if (var13 > 0) {
               llilllililll(segW, var12, n, 20.0F, 1.0F);
            }

            IIlilllIlill(segW, segs, y[var13], var12, n, 20.0F, 1.0F);
            var12 += ctx[var13];
         }
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(segW, var11);
         IliiIilliiIi.lIiiIiIlilli(var10);
      }

   }

   private void Iliilllliill(String need, float docked, float id, boolean extraW) {
      int var5 = liiilliiiill(need);
      float var6 = this.iIIliIllil;
      float var7 = var6;
      if (extraW && docked > 0.0F && this.IIIiIiIlil > 0) {
         float[] var8 = (float[])this.lliiilIlil.get(need);
         float var9 = (var8 == null ? 120.0F : var8[2] * this.illilIilil(need)) + id;
         float var10 = 5.5F;
         boolean var11 = false;

         for(int var12 = 0; var12 < 8; ++var12) {
            boolean var13 = false;

            for(int var14 = 0; var14 < this.IIIiIiIlil; ++var14) {
               if (!(this.lIIiIiIlil[var14] >= this.lIIliIllil + var9 + var10) && !(this.lIIiIiIlil[var14] + this.IlIiIiIlil[var14] + var10 <= this.lIIliIllil) && !(this.iIIiIiIlil[var14] >= var7 + docked + var10) && !(this.iIIiIiIlil[var14] + this.llIiIiIlil[var14] + var10 <= var7)) {
                  var7 = this.iIIiIiIlil[var14] + this.llIiIiIlil[var14] + 6.0F;
                  var13 = true;
                  var11 |= this.ilIiIiIlil[var14];
               }
            }

            if (!var13) {
               break;
            }
         }

         if (var11 && this.liIliIllil < this.iIIIIlllil.length) {
            this.iIIIIlllil[this.liIliIllil] = true;
         }
      }

      this.iIIliIllil = var6 + this.lIIIIlllil[var5].liiiIIllIl(var7 - var6, this.iIiliIllil, 0.07F, 0.05F);
   }

   private void IIiIIllIiIIl() {
      if (Iiiilllliiilll.field_1724 != null) {
         long var1 = System.currentTimeMillis();
         class_1041 var3 = Iiiilllliiilll.method_22683();
         long var4 = var3.method_4490();
         this.iIiIIlIliIIl(this.iliIliIlil, class_3675.method_15987(var3, 87));
         this.iIiIIlIliIIl(this.IiiIliIlil, class_3675.method_15987(var3, 65));
         this.iIiIIlIliIIl(this.liiIliIlil, class_3675.method_15987(var3, 83));
         this.iIiIIlIliIIl(this.iiiIliIlil, class_3675.method_15987(var3, 68));
         this.iIiIIlIliIIl(this.iIIlliIlil, class_3675.method_15987(var3, 32));
         boolean var6 = GLFW.glfwGetMouseButton(var4, 0) == 1;
         boolean var7 = GLFW.glfwGetMouseButton(var4, 1) == 1;
         this.iIiIIlIliIIl(this.IIIlliIlil, var6);
         this.iIiIIlIliIIl(this.lIIlliIlil, var7);
         if (var6 && !this.ilIlliIlil) {
            this.IlIlliIlil.add(var1);
         }

         if (var7 && !this.IiIlliIlil) {
            this.llIlliIlil.add(var1);
         }

         this.ilIlliIlil = var6;
         this.IiIlliIlil = var7;

         while(!this.IlIlliIlil.isEmpty() && var1 - (Long)this.IlIlliIlil.peek() > 1000L) {
            this.IlIlliIlil.poll();
         }

         while(!this.llIlliIlil.isEmpty() && var1 - (Long)this.llIlliIlil.peek() > 1000L) {
            this.llIlliIlil.poll();
         }

         if (Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1331) {
            class_1297 var8 = ((class_3966)Iiiilllliiilll.field_1765).method_17782();
            boolean var9 = var8 instanceof class_1309 && (!this.lIIiilIlil.Iilllilliill() || var8 instanceof class_1657);
            if (var9) {
               this.liIlliIlil = (class_1309)var8;
               this.iiIlliIlil = var1;
            }
         }

         double var19 = Iiiilllliiilll.field_1724.method_23317();
         double var10 = Iiiilllliiilll.field_1724.method_23321();
         if (this.lIiIliIlil == 0L) {
            this.lilIliIlil = var19;
            this.iilIliIlil = var10;
            this.lIiIliIlil = var1;
         } else {
            double var12 = (double)(var1 - this.lIiIliIlil) / (double)1000.0F;
            if (var12 >= 0.05) {
               double var14 = Math.hypot(var19 - this.lilIliIlil, var10 - this.iilIliIlil);
               this.IIiIliIlil += (var14 / var12 - this.IIiIliIlil) * 0.3;
               this.lilIliIlil = var19;
               this.iilIliIlil = var10;
               this.lIiIliIlil = var1;
            }
         }

         if (Iiiilllliiilll.field_1687 != null && var1 - this.IliIliIlil >= 100L) {
            long var20 = Iiiilllliiilll.field_1687.method_75260();
            if (!this.iIiIliIlil.isEmpty() && var20 < ((long[])this.iIiIliIlil.peekLast())[1]) {
               this.iIiIliIlil.clear();
            }

            this.iIiIliIlil.addLast(new long[]{var1, var20});

            while(this.iIiIliIlil.size() > 1 && var1 - ((long[])this.iIiIliIlil.peekFirst())[0] > 4000L) {
               this.iIiIliIlil.pollFirst();
            }

            long[] var21 = (long[])this.iIiIliIlil.peekFirst();
            double var15 = (double)(var1 - var21[0]) / (double)1000.0F;
            if (var15 >= (double)1.0F) {
               double var17 = Math.max((double)0.0F, Math.min((double)20.0F, (double)(var20 - var21[1]) / var15));
               this.lliIliIlil += (var17 - this.lliIliIlil) * (double)0.5F;
            }

            this.IliIliIlil = var1;
         }

      }
   }

   private float llIIIlilIIIl(int zone, long now) {
      long var4 = this.llIliiIlil[zone];
      if (var4 == (1715868778681975112L ^ 1715868778681975112L)) {
         return 0.0F;
      } else {
         float var6 = (float)(now - var4) / 2.0E8F;
         if (var6 >= 1.0F) {
            this.llIliiIlil[zone] = 0L;
            return 0.0F;
         } else {
            return llliIlIlilliIlIl.lIiiIiIlilli(var6);
         }
      }
   }

   public static boolean illiIlIiliIl() {
      return iiIiIlIIliIl() && liIiiiIlil > 0 && IiIiIlliIiIl(IIliiiIlil);
   }

   private float iliIiIiiIi(String id) {
      if (!this.llIlIiIlil.isEmpty() && (!this.IilIIiIlil || !id.equals(this.lIIIIiIlil))) {
         float[] var2 = (float[])this.llIlIiIlil.get(id);
         return var2 == null ? 0.0F : var2[3];
      } else {
         return 0.0F;
      }
   }

   private float illliIilli() {
      return 10.0F;
   }

   private void lIlIIliIlIIl(class_332 ctx) {
      long var2 = System.nanoTime();
      if (!this.IIliliIlil) {
         this.IIliliIlil = true;
         this.liiiliIlil = var2;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }

      boolean var4 = this.liiiliIlil != 0L && var2 - this.liiiliIlil < 5200000000L;
      if (!this.iiiIiiIlil.IilliliilIIi(var4, llIiiiIlil)) {
         if (!var4) {
            this.liiiliIlil = 0L;
         }

      } else {
         float var5 = llliIlIlilliIlIl.IIIllIIliIIl((float)Math.ceil((double)(this.lilIiiIlil + 22.0F)));
         float var6 = 21.0F;
         float var7 = llliIlIlilliIlIl.IIIllIIliIIl(((float)this.liiiilIlil - var5) / 2.0F);
         float var8 = llliIlIlilliIlIl.IIIllIIliIIl((float)this.iiiiilIlil * 0.26F);
         float var9 = IliiIilliiIi.IilliliilIIi(this.iiiIiiIlil.IliIlllilIi());
         boolean var10 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var7 + var5 / 2.0F, var8 + var6 / 2.0F, this.iiiIiiIlil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.IIIilIIiiIIi(llliIlIlilliIlIl.lIIlIlIiIl, var7, var8, var5, var6, var6 / 2.0F, 1.0F);
            llliIlIlilliIlIl.lililiilil(IliIlllilIi<invokedynamic>(), var7 + (var5 - this.lilIiiIlil) / 2.0F, llliIlIlilliIlIl.illilIilil(var8, var6, 0.86F), 0.86F, llliIlIlilliIlIl.liIlIlIiIl);
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var10);
            IliiIilliiIi.lIiiIiIlilli(var9);
         }

      }
   }

   private static float IiIlllliIlll(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private String iIIlllIlIlll(int t) {
      long var3 = -3045552941455745932L;
      if (t >= 0 && t <= ((-137998846 - 127 + -55) * 39 ^ -1087053868)) {
         var3 ^= ((long)(t / (-(-1676569161) + -55 - -127 ^ 1676569221)) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) / ((-270343268 << 27 | -270343268 >>> 5) * 49 ^ 1330867296) + IliIlllilIi<invokedynamic>() + String.format(IliIlllilIi<invokedynamic>(), (int)(var3 >>> 32) % ((-351364617 - -85 + 109) * -652835029 ^ 1274121263));
      } else {
         return "";
      }
   }

   private void lliililiil() {
      for(String var4 : liliIiIlil) {
         if (!this.IIiiIiIlil.containsKey(var4)) {
            iiIliiiIIlliii var5 = new iiIliiiIIlliii();
            var5.liIiIIIlIl = var5.iiIiIIIlIl = var5.illiIIIlIl = IIiillIiil(var4);
            this.IIiiIiIlil.put(var4, var5);
         }
      }

   }

   private void iillIlIIilIl(class_332 sh, int sw, int ctx) {
      double var4 = this.IIIIliIlil.iIlIlllllill();
      if (!(var4 < 0.005)) {
         float var6 = IiIlIiIiliIlIiIi.Iilllilliill();
         boolean var7 = var6 >= 0.999F && IiIlIiIiliIlIiIi.iliIiiliiiii() > 0;
         long var8 = System.currentTimeMillis();
         float var10 = this.iIIIliIlil == 0L ? 0.016F : Math.min(0.1F, (float)(var8 - this.iIIIliIlil) / 1000.0F);
         this.iIIIliIlil = var8;
         if (var6 <= 0.0F && this.lIIIliIlil > 0.5F) {
            this.lIIIliIlil = 0.0F;
         } else {
            this.lIIIliIlil += (var6 - this.lIIIliIlil) * (1.0F - (float)Math.exp((double)(-var10) * (double)6.0F));
         }

         if (Math.abs(var6 - this.lIIIliIlil) < 8.0E-4F) {
            this.lIIIliIlil = var6;
         }

         this.IlIIliIlil += ((var7 ? 1.0F : 0.0F) - this.IlIIliIlil) * (1.0F - (float)Math.exp((double)(-var10) * (double)3.0F));
         this.IiiIilliiIil(sh, sw);
      }
   }

   private float lllIIiillIIi(class_332 ctx, float y, float x) {
      boolean var4 = this.IIliilIlil.Iilllilliill();
      float var5 = this.IIlIIilIlIIi();
      float var6 = this.iIlIIiIllIIi();
      float var7 = (var6 * this.lililiilil() + 6.0F) * this.lilIIlllil.liiiIIllIl(var4 && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      if (!this.illIIlllil.IilliliilIIi(var4, llIiiiIlil)) {
         return var7;
      } else {
         float var8 = y + this.lIiIIiIlil;
         float var9 = x + this.iIiIIiIlil;
         this.IilIililIi(var8, var9, var5, var6);
         float var10 = IliiIilliiIi.IilliliilIIi(this.illIIlllil.IliIlllilIi());
         boolean var11 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var8 + var5 / 2.0F, var9 + var6 / 2.0F, this.illIIlllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.ilIlIlIiIl, var8, var9, var5, var6, 1.0F);
            class_1661 var12 = Iiiilllliiilll.field_1724.method_31548();
            float var13 = 18.0F;
            float var14 = 18.0F;
            float var15 = this.iIIiiIllil;
            float var16 = 6.0F;
            float var17 = var8 + 6.0F;
            float var18 = var9 + 6.0F;
            float var19 = var14 * 0.42F;

            for(int var20 = 0; var20 < 3; ++var20) {
               float var21 = var18 + (float)var20 * var14;
               if (var20 > 0) {
                  llliIlIlilliIlIl.IIIillIIil(ctx, var17, var21, 9.0F * var13, 536870911);
               }

               for(int var22 = 0; var22 < 9; ++var22) {
                  float var23 = var17 + (float)var22 * var13;
                  if (var22 > 0) {
                     llliIlIlilliIlIl.iIIilIlIil(ctx, var23, var21 + (var14 - var19) / 2.0F, var19, 536870911);
                  }

                  class_1799 var24 = var12.method_5438(9 + var20 * 9 + var22);
                  float var25 = var23 + var13 / 2.0F;
                  float var26 = var21 + var14 / 2.0F;
                  if (var24.method_7960()) {
                     llliIlIlilliIlIl.IIiilIiiiIii(lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llliIlIlilliIlIl.IIIllIIliIIl(var25 - var16 / 2.0F), llliIlIlilliIlIl.IIIllIIliIIl(var26 - var16 / 2.0F), var16, llliIlIlilliIlIl.IIllIlIiIl);
                  } else {
                     float var27 = llliIlIlilliIlIl.IIIllIIliIIl(var25 - var15 / 2.0F);
                     float var28 = llliIlIlilliIlIl.IIIllIIliIIl(var26 - var15 / 2.0F);
                     llliIlIlilliIlIl.lIIlliIIll(ctx, var24, var27, var28, var15);
                     int var29 = var24.method_7947();
                     if (var29 > 1) {
                        llliIlIlilliIlIl.IlIllllIll(ctx, var29 < 100 ? iIlIIlllil[var29] : String.valueOf(var29), var27, var28, var15);
                     }

                     if (var24.method_31578()) {
                        float var30 = var15 - 2.0F;
                        float var31 = 1.2F;
                        float var32 = llliIlIlilliIlIl.IIIllIIliIIl(var28 + var15 + 0.6F);
                        llliIlIlilliIlIl.IIillIiliIil(var27 + 1.0F, var32, var30, var31, var31 / 2.0F, 0.0F, 318767103);
                        llliIlIlilliIlIl.IIillIiliIil(var27 + 1.0F, var32, llliIlIlilliIlIl.IIIllIIliIIl(var30 * (float)var24.method_31579() / 13.0F), var31, var31 / 2.0F, 0.0F, -16777216 | var24.method_31580());
                     }
                  }
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var11);
            IliiIilliiIi.lIiiIiIlilli(var10);
         }

         return var7;
      }
   }

   public static float lliIililiIil(boolean statusBars) {
      if (!lilIiliilIil(lIIilIllil)) {
         return 0.0F;
      } else {
         float var1 = statusBars ? 28.0F : 14.0F;
         return (float)Math.max(0, Math.round((IlIilIllil + iilllIIill()) * llIilIllil + 3.0F - var1));
      }
   }

   private float IiIiilliIiil(class_332 y, float now, float ctx, long x) {
      IIlIiIlllIlIiIll var6 = lilllliillll();
      boolean var7 = var6.IIillIiliIil();
      this.iIlIiIllil = var7 && this.iiIiilIIliil(var6, x);
      float var8 = (20.0F * this.lililiilil() + 4.0F) * this.lllIiIllil.liiiIIllIl(this.iIlIiIllil && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      if (this.liIilIllil.IilliliilIIi(this.iIlIiIllil, llIiiiIlil) && var7 && this.lIIIiIllil != 0) {
         float var9 = now + this.lIiIIiIlil;
         float var10 = ctx + this.iIiIIiIlil;
         lIliiliIliil(y, var6, llliIlIlilliIlIl.IllIIlIiIl, var9, var10, this.iIiilIllil, this.lliilIllil, this.lIIIiIllil, this.IIlIiIllil, this.liIilIllil);
         this.IilIililIi(var9, var10, this.IIlIiIllil, 20.0F);
         this.IlliIlllliIl((int)now, (int)ctx, (int)this.IIlIiIllil, 20);
         return var8;
      } else {
         this.IlliIlllliIl(0, 0, 0, 0);
         return var8;
      }
   }

   private static IIililillIililil lliiIliliiIl() {
      return (IIililillIililil)llilIllililIll.iliIiiliiiii(IIililillIililil.class);
   }

   private static int IlIllllIll(class_1041 w) {
      try {
         class_313 var1 = w.method_20831();
         if (var1 != null) {
            class_319 var2 = var1.method_1617();
            if (var2 != null) {
               return var2.method_1669();
            }
         }
      } catch (Throwable var3) {
      }

      return 0;
   }

   public static int Iillllilll() {
      return iiillIllil;
   }

   private void liIliliiIlil(boolean on) {
      for(int var2 = 0; var2 < this.IIillIllil.size(); ++var2) {
         ((illiIIlIiliIIl)this.IIillIllil.get(var2)).iIlIlllllill();
      }

      if (on) {
         for(class_1293 var3 : Iiiilllliiilll.field_1724.method_6026()) {
            class_1291 var4 = (class_1291)var3.method_5579().comp_349();
            illiIIlIiliIIl var5 = (illiIIlIiliIIl)this.iilllIllil.get(var4);
            if (var5 == null) {
               var5 = new illiIIlIiliIIl(var4);
               var5.IIliliiIllIliliiIl = this.IIIllllIIlll(var3);
               var5.llliliiIlilliliiIl = llliIlIlilliIlIl.lIliliIlil(var5.IIliliiIllIliliiIl, 0.9F);

               try {
                  var5.liIiliiIliiIiliiIl = class_329.method_71644(var3.method_5579());
               } catch (Throwable var9) {
               }

               var5.IliIlllilIi((float)this.IIillIllil.size() * 15.0F);
               this.iilllIllil.put(var4, var5);
               this.IIillIllil.add(var5);
            }

            var5.liiiIIllIl();
            int var6 = var3.method_5578();
            if (var6 != var5.iililiiIlIIiiliiIl) {
               var5.iililiiIlIIiiliiIl = var6;
               var5.iIliliiIlIlliliiIl = var6 > 0 ? this.lIlllliIllll(var6 + 1) : "";
               var5.IililiiIllililiiIl = llliIlIlilliIlIl.lIliliIlil(var5.iIliliiIlIlliliiIl, 0.8F);
            }

            int var7 = var3.method_5584();
            boolean var8 = this.llIlllilIlll(var3);
            var5.lIiiliiIliIiiliiIl = var8 ? Integer.MAX_VALUE : var7;
            var5.IliiliiIllliiliiIl = !var8 && var7 < 200;
            if (var8) {
               if (var5.iliiliiIlIiiiliiIl.IliIlllilIi(-1L)) {
                  var5.iliiliiIlIiiiliiIl.liiiIIllIl(IliIlllilIi<invokedynamic>(), 0.9F, true, false);
               }
            } else if (var5.iliiliiIlIiiiliiIl.IliIlllilIi((long)(var7 / 20))) {
               var5.iliiliiIlIiiiliiIl.liiiIIllIl(this.iIIlllIlIlll(var7), 0.9F, true, false);
            }
         }
      }

      for(int var11 = 1; var11 < this.IIillIllil.size(); ++var11) {
         illiIIlIiliIIl var13 = (illiIIlIiliIIl)this.IIillIllil.get(var11);

         int var15;
         for(var15 = var11 - 1; var15 >= 0 && ilIlilIiIlil(var13, (illiIIlIiliIIl)this.IIillIllil.get(var15)); --var15) {
            this.IIillIllil.set(var15 + 1, (illiIIlIiliIIl)this.IIillIllil.get(var15));
         }

         this.IIillIllil.set(var15 + 1, var13);
      }

      int var12 = 0;

      for(int var14 = 0; var14 < this.IIillIllil.size(); ++var14) {
         illiIIlIiliIIl var16 = (illiIIlIiliIIl)this.IIillIllil.get(var14);
         if (!var16.IIIIIIiIllIIIIIiIl) {
            var16.IliiiilIllliiiilIl = (float)(var12++) * 15.0F;
         }
      }

      this.IllllIllil = var12;
      if (var12 > 0 && this.ilIIlIllil.IliIlllilIi((long)var12)) {
         this.ilIIlIllil.liiiIIllIl(String.valueOf(var12), 0.8F, true, false);
         this.illIlIllil.IliIlllilIi();
      }

   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] + var5))) >>> 13 | (char)(~((char)((char)var4[var5] + var5))) << 3) + 20297) + var5)) + var5))) ^ var5) ^ var5) ^ var5) ^ 14210) - var5) - 6004) + '\uda90') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] + var5))) >>> 13 | (char)(~((char)((char)var4[var5] + var5))) << 3) + 20297) + var5)) + var5))) ^ var5) ^ var5) ^ var5) ^ 14210) - var5) - 6004) + '\uda90') << 1) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] + var5))) >>> 13 | (char)(~((char)((char)var4[var5] + var5))) << 3) + 20297) + var5)) + var5))) ^ var5) ^ var5) ^ var5) ^ 14210) - var5) - 6004) + '\uda90') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] + var5))) >>> 13 | (char)(~((char)((char)var4[var5] + var5))) << 3) + 20297) + var5)) + var5))) ^ var5) ^ var5) ^ var5) ^ 14210) - var5) - 6004) + '\uda90') << 1) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int iliIIiIiiIIi(int i) {
      long var2 = (long)Math.round(IiIlllliIlll(this.iiIiiIllil[i]) * 600.0F);
      if (var2 != this.lIliiIllil[i]) {
         this.lIliiIllil[i] = var2;
         this.IIliiIllil[i] = (315541756 >>> 3 | 315541756 << 29) ^ -41 ^ -2103040312 | class_3532.method_15369((float)var2 / 1800.0F, 1.0F, 1.0F);
      }

      return this.IIliiIllil[i];
   }

   private void IIIIIllIIIIl() {
      float var1 = this.lIliIiIlil.liiiIIllIl(this.lIIIIiIlil != null && this.IilIIiIlil && this.IIliIiIlil > 0 ? 1.0F : 0.0F, this.IlIIiiIlil, 0.05F, 0.01F);
      if (!(var1 <= 0.01F) && this.IIliIiIlil != 0) {
         int var2 = llliIlIlilliIlIl.iliIiiliiiii(llliIlIlilliIlIl.Illlllllilll(), 0.85F * var1);
         float var3 = IIIiiIillIIiiIil.Illlllllilll();

         for(int var4 = 0; var4 < this.IIliIiIlil; ++var4) {
            float var5 = this.iiIiIiIlil[var4 * 4];
            float var6 = this.iiIiIiIlil[var4 * 4 + 1];
            float var7 = this.iiIiIiIlil[var4 * 4 + 2];
            float var8 = this.iiIiIiIlil[var4 * 4 + 3];
            if (var5 == var7) {
               llliIlIlilliIlIl.IIillIiliIil(llliIlIlilliIlIl.IIIllIIliIIl(var5), Math.min(var6, var8), var3, Math.abs(var8 - var6), 0.0F, 0.0F, var2);
            } else {
               llliIlIlilliIlIl.IIillIiliIil(Math.min(var5, var7), llliIlIlilliIlIl.IIIllIIliIIl(var6), Math.abs(var7 - var5), var3, 0.0F, 0.0F, var2);
            }
         }

      }
   }

   private static float iIiilIliil(String id) {
      byte var2 = -1;
      switch (id.hashCode()) {
         case -390600384:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case 473741317:
            if (id.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
      }

      float var10000;
      switch (var2) {
         case 0 -> var10000 = 0.9F;
         case 1 -> var10000 = 1.0F;
         default -> var10000 = -1.0F;
      }

      return var10000;
   }

   private boolean Iiililiili(String id, float[] out) {
      float var3 = Float.MAX_VALUE;
      float var4 = Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;
      float var6 = -Float.MAX_VALUE;

      for(int var7 = 0; var7 < this.IiiiilIlil.size(); ++var7) {
         iiiilIIIIi var8 = (iiiilIIIIi)this.IiiiilIlil.get(var7);
         if (var8.Iillililillili.equals(id)) {
            var3 = Math.min(var3, var8.iilliliIIilili);
            var4 = Math.min(var4, var8.lIililiiIilili);
            var5 = Math.max(var5, var8.iilliliIIilili + var8.Ilililillilili);
            var6 = Math.max(var6, var8.lIililiiIilili + var8.ilililiIiilili);
         }
      }

      if (var5 < var3) {
         return false;
      } else {
         out[0] = var3;
         out[1] = var4;
         out[2] = var5 - var3;
         out[3] = var6 - var4;
         return true;
      }
   }

   private boolean IIiiillIiiil(ilIllIiIll m) {
      return m != null && m.IliIlllilIi() && m.IIIilIIiiIIi() >= 0 && m.iIlIlllllill();
   }

   private void llIIililIIil(IliIIlllliIIll f, iiIIlillIIlIlill pop, boolean need, float docked) {
      if (!need) {
         f.iIiIiIIilIliIiIIil = false;
         f.lliIiIIililiIiIIil = -1;
      } else {
         boolean var5 = pop.IliIlllilIi() > 0.01F;
         if (docked > 0.0F || !var5) {
            f.iIiIiIIilIliIiIIil = docked > 0.0F && this.iIIliIllil > this.IlIliIllil + 0.5F && this.iIIliIllil + docked + (f.iIiIiIIilIliIiIIil && var5 ? 32.0F : 0.0F) > this.ilIliIllil;
         }

         if (f.iIiIiIIilIliIiIIil) {
            this.lIIliIllil += this.llIliIllil + 6.0F;
            this.iIIliIllil = this.IlIliIllil;
            this.llIliIllil = 0.0F;
            ++this.liIliIllil;
            if (this.liIliIllil < this.lliiiIllil.length) {
               this.lliiiIllil[this.liIliIllil] = this.lIIliIllil;
               this.iliiiIllil = Math.max(this.iliiiIllil, this.liIliIllil + 1);
            }
         }

         if (var5 && f.lliIiIIililiIiIIil >= 0 && f.lliIiIIililiIiIIil != this.liIliIllil) {
            pop.iIlIlllllill();
         }

         f.lliIiIIililiIiIIil = this.liIliIllil;
      }
   }

   private void lIiiiiIiii(float c, boolean inwardLow, float... seg) {
      long var8 = -525879972901842404L;
      float var4 = this.liIliiIlil - c;
      float var5 = 18.0F;
      var8 ^= ((long)(inwardLow ? (var4 < 0.0F ? 1 : 0) : (var4 > 0.0F ? 1 : 0)) << 32 ^ var8) & -1L << 32;
      float var7 = Math.abs(var4);
      if ((int)(var8 >>> 32) != 0) {
         if (!(var7 <= var5)) {
            return;
         }
      } else if (!(var7 <= 5.0F)) {
         return;
      }

      this.Iiliililii(c, (int)(var8 >>> 32) != 0 ? var7 * 5.0F / var5 : var7, seg);
   }

   private float IilIIililIIi(class_332 y, float ctx, float x, long now) {
      boolean var6 = this.lIliilIlil.Iilllilliill();
      float var7 = 156.0F;
      float var8 = 68.0F;
      float var9 = (var8 * this.lililiilil() + 6.0F) * this.IilIIlllil.liiiIIllIl(var6 && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      if (!this.lllIIlllil.IilliliilIIi(var6, llIiiiIlil)) {
         return var9;
      } else {
         if (this.IIIlIlllil == 0L || now - this.IIIlIlllil >= 250000000L) {
            this.IIIlIlllil = now;
            int var10 = Iiiilllliiilll.method_47599();
            if (this.lIiIIlllil.IliIlllilIi((long)var10)) {
               this.lIiIIlllil.liiiIIllIl(var10 + IliIlllilIi<invokedynamic>(), 0.9F, true, false);
            }
         }

         float var27 = ctx + this.lIiIIiIlil;
         float var11 = x + this.iIiIIiIlil;
         this.IilIililIi(var27, var11, var7, var8);
         float var12 = IliiIilliiIi.IilliliilIIi(this.lllIIlllil.IliIlllilIi());
         boolean var13 = llliIlIlilliIlIl.lIIIiiIIIi(y, var27 + var7 / 2.0F, var11 + var8 / 2.0F, this.lllIIlllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IiIlIlIiIl, var27, var11, var7, var8, 1.0F);
            float var14 = 8.0F;
            float var15 = 20.0F;
            llliIlIlilliIlIl.lililiilil(IliIlllilIi<invokedynamic>(), var27 + var14, llliIlIlilliIlIl.illilIilil(var11 + 4.0F, var15, 0.95F), 0.95F, llliIlIlilliIlIl.liIlIlIiIl);
            llliIlIlilliIlIl.iIiilIliil(this.lIiIIlllil, var27 + var7 - var14, llliIlIlilliIlIl.illilIilil(var11 + 4.0F, var15, 0.9F), 0.9F, llliIlIlilliIlIl.IIlllIlliIll());
            float var16 = var27 + var14;
            float var17 = var27 + var7 - var14;
            float var18 = var11 + 26.0F;
            float var19 = var11 + var8 - 15.0F;
            this.iilIIiIIiIIi(var16, var17, var18, var19);
            float var20 = llliIlIlilliIlIl.illilIilil(var19 + 2.0F, 11.0F, 0.62F);

            for(int var21 = 0; var21 < 6; ++var21) {
               float var22 = this.iiiIIlllil[var21];
               float var23 = var16 + (var17 - var16) * (float)var21 / 5.0F - var22 / 2.0F;
               var23 = Math.max(var16, Math.min(var17 - var22, var23));
               llliIlIlilliIlIl.lililiilil(lIlIIlllil[var21], llliIlIlilliIlIl.IIIllIIliIIl(var23), var20, 0.62F, llliIlIlilliIlIl.IIllIlIiIl);
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(y, var13);
            IliiIilliiIi.lIiiIiIlilli(var12);
         }

         return var9;
      }
   }

   private static float[] liIIiiiIIi(float sw, float sh, float h, float w, float x, float y) {
      float var11 = x - (sw + h);
      float var12 = Math.abs(sw + h / 2.0F - x / 2.0F);
      float var6;
      float var7;
      if (var12 < sw && var12 < var11) {
         var6 = 0.5F;
         var7 = sw + h / 2.0F - x / 2.0F;
      } else if (sw <= var11) {
         var6 = 0.0F;
         var7 = sw;
      } else {
         var6 = 1.0F;
         var7 = var11;
      }

      float var14 = y - (sh + w);
      float var15 = Math.abs(sh + w / 2.0F - y / 2.0F);
      float var8;
      float var9;
      if (var15 < sh && var15 < var14) {
         var8 = 0.5F;
         var9 = sh + w / 2.0F - y / 2.0F;
      } else if (sh <= var14) {
         var8 = 0.0F;
         var9 = sh;
      } else {
         var8 = 1.0F;
         var9 = var14;
      }

      return new float[]{var6, var8, var7, var9};
   }

   private void liliIliiliIl(float y, float x, float w) {
      lIliiiIlil = Math.round(y + w * (1.0F - this.illilIilil(this.IIiIIiIlil)));
      iIliiiIlil = Math.round(x);
      IlliiiIlil = llIiiiIlil;
   }

   private static float ilIIiIiIIi(float canvas, float p, float size, float edge) {
      if (canvas <= 0.25F) {
         return p;
      } else {
         return canvas >= 0.75F ? size - p - edge : size / 2.0F + p - edge / 2.0F;
      }
   }

   private int lilliiilli(double my, double mx) {
      if (Math.abs(my - (double)this.lllIiiIlil) <= (double)6.0F && Math.abs(mx - (double)this.illIiiIlil) <= (double)6.0F) {
         return 1;
      } else if (!(my < (double)this.iiIIiiIlil) && !(my > (double)(this.iiIIiiIlil + this.lIlIiiIlil)) && !(mx < (double)this.IIlIiiIlil) && !(mx > (double)(this.IIlIiiIlil + 17.0F))) {
         float var5 = (float)my - this.iiIIiiIlil;
         if (var5 < 17.0F) {
            return 2;
         } else if (var5 < 17.0F + this.IilIiiIlil) {
            return 3;
         } else if (var5 < 17.0F + this.IilIiiIlil + 17.0F) {
            return 4;
         } else {
            return this.iIIliiIlil.lIiiIiIlilli() > 0.5F ? 5 : 6;
         }
      } else {
         return 0;
      }
   }

   private String lIlllliIllll(int n) {
      String var10000;
      switch (n) {
         case 1 -> var10000 = IliIlllilIi<invokedynamic>();
         case 2 -> var10000 = IliIlllilIi<invokedynamic>();
         case 3 -> var10000 = IliIlllilIi<invokedynamic>();
         case 4 -> var10000 = IliIlllilIi<invokedynamic>();
         case 5 -> var10000 = IliIlllilIi<invokedynamic>();
         case 6 -> var10000 = IliIlllilIi<invokedynamic>();
         case 7 -> var10000 = IliIlllilIi<invokedynamic>();
         case 8 -> var10000 = IliIlllilIi<invokedynamic>();
         case 9 -> var10000 = IliIlllilIi<invokedynamic>();
         case 10 -> var10000 = IliIlllilIi<invokedynamic>();
         default -> var10000 = String.valueOf(n);
      }

      return var10000;
   }

   private static boolean lilIiliilIil(int stamp) {
      return iiillIllil - stamp <= (~(1246020157 << 5 | 1246020157 >>> 27) ^ -1217939369) && (Iiiilllliiilll.field_1755 == null || Iiiilllliiilll.field_1755 instanceof class_408);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) << 8) + '\ue3eb') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) << 8) + '\ue3eb') << 4) - var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) << 8) + '\ue3eb') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) >>> 2 | (char)((char)(-((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4))) + var5) << 14) + var5) << 8) + '\ue3eb') << 4) - var5) >>> 8) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String Iiiiilliiiil(int n) {
      long var2 = 63775738154205990L;
      if (n < (~(834628564 - 101) ^ -834627720)) {
         return String.valueOf(n);
      } else if (n >= (-1567604294 * 630453915 * -87 ^ 1901055582)) {
         return n / (-(723420494 - 1) ^ -723420837) + IliIlllilIi<invokedynamic>();
      } else {
         var2 ^= ((long)(n / (((1690176798 >>> 19 | 1690176798 << 13) - -97) * 286331153 + 69 ^ -789244711) % (~((572162133 + 7) * 125) ^ -27 ^ -1494176516)) << 32 ^ var2) & -1L << 32;
         return (int)(var2 >>> 32) == 0 ? n / (~(--762971000) * 128207979 ^ 1014276997) + IliIlllilIi<invokedynamic>() : n / (-(-1851285349 >>> 19 | -1851285349 << 13) * -654471207 ^ -2125126140) + IliIlllilIi<invokedynamic>() + (int)(var2 >>> 32) + IliIlllilIi<invokedynamic>();
      }
   }

   private static float IiiIIlliiIIl(IIlIiIlllIlIiIll f, float size) {
      if (f == iilliiIlil && Float.floatToRawIntBits(size) == Float.floatToRawIntBits(IIiliiIlil)) {
         return lIiliiIlil;
      } else {
         float var2 = 0.0F;

         for(char var3 = '0'; var3 <= '9'; ++var3) {
            var2 = Math.max(var2, f.IIIilIIiiIIi(var3, size));
         }

         iilliiIlil = f;
         IIiliiIlil = size;
         lIiliiIlil = var2;
         return var2;
      }
   }

   private float IIllillIllil(class_332 now, float ctx, float x, long y) {
      if (this.liIllIllil == 0L || y - this.liIllIllil >= 50000000L) {
         this.liIllIllil = y;
         this.liIliliiIlil(this.ilililIlil.Iilllilliill());
      }

      boolean var6 = this.IiililIlil.Iilllilliill();
      float var7 = var6 ? this.lIIllIllil + 5.0F : 0.0F;
      float var8 = 1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.06F));
      float var9 = 0.0F;
      float var10 = 0.0F;

      for(int var11 = 0; var11 < this.IIillIllil.size(); ++var11) {
         illiIIlIiliIIl var12 = (illiIIlIiliIIl)this.IIillIllil.get(var11);
         if (var12.IilliliilIIi(var8)) {
            this.iilllIllil.remove(var12.ilIiliiIlIiIiliiIl);
            this.IIillIllil.remove(var11--);
         } else {
            var9 += 15.0F * var12.iliiiilIlIiiiiilIl;
            if (!var12.IIIIIIiIllIIIIIiIl) {
               var10 = Math.max(var10, var7 + var12.llliliiIlilliliiIl + (var12.iIliliiIlIlliliiIl.isEmpty() ? 0.0F : 4.0F + var12.IililiiIllililiiIl) + 10.0F + var12.iliiliiIlIiiiliiIl.iliillIlIl);
            }
         }
      }

      boolean var46 = this.IllllIllil > 0;
      float var47 = 30.0F + var9 + 5.0F;
      float var13 = (var47 + 6.0F) * this.illiIIllil.liiiIIllIl(var46 ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      if (!this.ilIiIIllil.IilliliilIIi(var46, llIiiiIlil)) {
         this.llliIIllil.iIlIlllllill();
         return var13;
      } else {
         float var14 = this.llliIIllil.IilliliilIIi((float)Math.ceil((double)Math.max(120.0F, Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.iIiIlIllil, this.ilIIlIllil.iliillIlIl), var10 + 14.0F))), this.iIiliIllil, 0.08F);
         float var15 = ctx + this.lIiIIiIlil;
         float var16 = x + this.iIiIIiIlil;
         this.IilIililIi(var15, var16, var14, var47);
         float var17 = 0.55F + 0.45F * (0.5F + 0.5F * (float)Math.cos((double)(y % 900000000L) * 6.981317007977318E-9));
         float var18 = IliiIilliiIi.IilliliilIIi(this.ilIiIIllil.IliIlllilIi());
         boolean var19 = llliIlIlilliIlIl.lIIIiiIIIi(now, var15 + var14 / 2.0F, var16 + var47 / 2.0F, this.ilIiIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.iilIIlIiIl, var15, var16, var14, var47, 1.0F);
            float var20 = llliIlIlilliIlIl.IllIllllIl(now, var15, var16, var14, lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), this.ilIIlIllil, this.illIlIllil, IiIlllliIlll(var9 / 8.0F));
            float var21 = var15 + 7.0F;
            float var22 = var15 + var14 - 7.0F;

            for(int var23 = 0; var23 < this.IIillIllil.size(); ++var23) {
               illiIIlIiliIIl var24 = (illiIIlIiliIIl)this.IIillIllil.get(var23);
               float var25 = var24.iliiiilIlIiiiiilIl;
               if (!(var25 <= 0.002F)) {
                  float var26 = 15.0F * var25;
                  float var27 = var20 + var24.lIiiiilIliIiiiilIl;
                  float var28 = var21 + var7;
                  float var29 = IliiIilliiIi.IilliliilIIi(var25 * var25);

                  try {
                     if (var6) {
                        llliIlIlilliIlIl.ilIllIiIll(now, var24.liIiliiIliiIiliiIl, var21, var27 + llliIlIlilliIlIl.IIIllIIliIIl((var26 - this.lIIllIllil) / 2.0F), this.lIIllIllil);
                     }

                     llliIlIlilliIlIl.iIiIlIliIl(var24.IIliliiIllIliliiIl, var28, var27, var26, llliIlIlilliIlIl.liIlIlIiIl);
                     if (!var24.iIliliiIlIlliliiIl.isEmpty()) {
                        llliIlIlilliIlIl.IiiIlliiIl(var24.iIliliiIlIlliliiIl, var28 + var24.llliliiIlilliliiIl + 4.0F, var27, var26);
                     }

                     float var30 = IliiIilliiIi.IilliliilIIi(var24.IliiliiIllliiliiIl ? var17 : 1.0F);

                     try {
                        llliIlIlilliIlIl.iiiIlIIIll(var24.iliiliiIlIiiiliiIl, var22, var27, var26, var24.IliiliiIllliiliiIl ? llliIlIlilliIlIl.lIllIlIiIl : llliIlIlilliIlIl.liIlIlIiIl);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var30);
                     }
                  } finally {
                     IliiIilliiIi.lIiiIiIlilli(var29);
                  }
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(now, var19);
            IliiIilliiIi.lIiiIiIlilli(var18);
         }

         return var13;
      }
   }

   private boolean llIililIil(String sc, iiIliiiIIlliii id, float h, float w, float x, float y) {
      float var7 = id.IliIlllilIi();
      if (var7 == 1.0F) {
         id.illiIIIlIl = 1.0F;
         return false;
      } else {
         this.IiIilliIil(sc, id, h, w, x, y);
         id.illiIIIlIl = var7;
         id.IiliIIIlIl = h + this.lIIIiiIlil * x;
         id.liliIIIlIl = w + this.iIIIiiIlil * y;
         return true;
      }
   }

   private float iIiiilIliiil(class_332 y, float ctx, float x) {
      boolean var4 = this.liIiilIlil.Iilllilliill();
      List var5 = llilIllililIll.IilliliilIIi();
      long var6 = var4 ? -7046029254386353131L : 0L;
      if (var4) {
         int var8 = 0;

         for(int var9 = var5.size(); var8 < var9; ++var8) {
            ilIllIiIll var10 = (ilIllIiIll)var5.get(var8);
            if (this.IIiiillIiiil(var10)) {
               var6 = (var6 ^ (long)System.identityHashCode(var10) * -7046029254386353131L + (long)var10.IIIilIIiiIIi()) * -4658895280553007687L;
            }
         }
      }

      if (!this.lilliIllil || var6 != this.IilliIllil) {
         this.lilliIllil = true;
         this.IilliIllil = var6;
         this.IllliIllil.clear();
         if (var4) {
            int var20 = 0;

            for(int var24 = var5.size(); var20 < var24; ++var20) {
               ilIllIiIll var26 = (ilIllIiIll)var5.get(var20);
               if (this.IIiiillIiiil(var26)) {
                  int var11 = this.IllliIllil.size();
                  this.IllliIllil.add(var26);

                  while(var11 > 0 && String.CASE_INSENSITIVE_ORDER.compare(((ilIllIiIll)this.IllliIllil.get(var11 - 1)).IilliliilIIi(), var26.IilliliilIIi()) > 0) {
                     this.IllliIllil.set(var11, (ilIllIiIll)this.IllliIllil.get(var11 - 1));
                     --var11;
                  }

                  this.IllliIllil.set(var11, var26);
               }
            }
         }

         this.iIlliIllil.IliIlllilIi();

         for(int var21 = 0; var21 < this.IllliIllil.size(); ++var21) {
            this.iIlliIllil.liiiIIllIl((ilIllIiIll)this.IllliIllil.get(var21));
         }

         this.iIlliIllil.iIlIlllllill();
         int var22 = this.IllliIllil.size();
         if (var22 > 0 && this.iililIllil.IliIlllilIi((long)var22)) {
            this.iililIllil.liiiIIllIl(String.valueOf(var22), 0.8F, true, false);
            this.IIlliIllil.IliIlllilIi();
         }
      }

      this.iIlliIllil.IilliliilIIi(1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.06F)));
      boolean var23 = var4 && this.iIlliIllil.ilIiiIliil;
      float var25 = 30.0F + this.iIlliIllil.IlIiiIliil + 5.0F;
      float var27 = (var25 * this.lililiilil() + 6.0F) * this.illIiIllil.liiiIIllIl(var23 && !this.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? 1.0F : 0.0F, this.iIiliIllil, 0.08F, 0.002F);
      if (!this.IIlilIllil.IilliliilIIi(var23, llIiiiIlil)) {
         this.IilIiIllil.iIlIlllllill();
         return var27;
      } else {
         float var28 = this.IilIiIllil.IilliliilIIi((float)Math.ceil((double)Math.max(120.0F, Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.liliiIllil, this.iililIllil.iliillIlIl), this.iIlliIllil.llIiiIliil + 14.0F))), this.iIiliIllil, 0.08F);
         float var12 = ctx + this.lIiIIiIlil;
         float var13 = x + this.iIiIIiIlil;
         this.IilIililIi(var12, var13, var28, var25);
         float var14 = IliiIilliiIi.IilliliilIIi(this.IIlilIllil.IliIlllilIi());
         boolean var15 = llliIlIlilliIlIl.lIIIiiIIIi(y, var12 + var28 / 2.0F, var13 + var25 / 2.0F, this.IIlilIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.illIIlIiIl, var12, var13, var28, var25, 1.0F);
            float var16 = llliIlIlilliIlIl.IllIllllIl(y, var12, var13, var28, lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), this.iililIllil, this.IIlliIllil, IiIlllliIlll(this.iIlliIllil.IlIiiIliil / 8.0F));
            this.iIlliIllil.lIiiIiIlilli(var16, var12 + 7.0F, var12 + var28 - 7.0F);
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(y, var15);
            IliiIilliiIi.lIiiIiIlilli(var14);
         }

         return var27;
      }
   }

   public static int lIIlliIIll(class_310 client) {
      long var4 = -8490918058492955383L;
      class_1041 var1 = client.method_22683();
      var4 ^= ((long)var1.method_4507() << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)IlIllllIll(var1) ^ var4) & -1L >>> 32;
      return (int)var4 > (int)(var4 >>> 32) && (float)((int)(var4 >>> 32)) >= (float)((int)var4) * 0.8F ? (int)var4 : (int)(var4 >>> 32);
   }

   private static int IIillllIilll(int argb, float a) {
      return lliIIliliIIl(argb, Math.round((float)(argb >>> (~(-786058812 - -85 - -47) ^ 786058671) & (1064581808 * 17 * -1875962727 ^ 1026164431)) * IiIlllliIlll(a)));
   }

   public static iiIliiiIIlliii ilIIllIiIIll(String y, float w, float x, float id, float h) {
      IIililillIililil var5 = lliiIliliiIl();
      if (var5 != null && y != null && !(id <= 0.0F) && !(h <= 0.0F)) {
         iiIliiiIIlliii var6 = var5.IIiiIiIlil.isEmpty() ? null : (iiIliiiIIlliii)var5.IIiiIiIlil.get(y);
         if (var6 != null && !var5.llIililIil(y, var6, w, x, id, h)) {
            var6 = null;
         }

         var5.iilIiIIiIi(y, w, x, id, h, var6);
         return var6;
      } else {
         return null;
      }
   }

   private static void iiiIilIIIlil(String x, float w, float label, float y, float press, float h, float labelW) {
      llliIlIlilliIlIl.IiIIlliIIl(label, y, press, h, labelW);
      llliIlIlilliIlIl.lililiilil(x, llliIlIlilliIlIl.IIIllIIliIIl(label + (press - w) / 2.0F), llliIlIlilliIlIl.illilIilil(y, h, 0.82F), 0.82F, llliIlIlilliIlIl.liIlIlIiIl);
   }

   private static int liiilliiiill(String id) {
      for(int var1 = 0; var1 < lIiiiIllil.length; ++var1) {
         if (lIiiiIllil[var1].equals(id)) {
            return var1;
         }
      }

      return -1;
   }

   public static float ilIllIiIll() {
      IIililillIililil var0 = (IIililillIililil)llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      return var0 != null && var0.IliIlllilIi() ? IiIlllliIlll((float)(var0.IiIIliIlil.iIlIlllllill() * var0.ilIIliIlil.iIlIlllllill())) : 1.0F;
   }

   private float iIlIIiIllIIi() {
      return 66.0F;
   }

   private void iilIiIIiIi(String w, float xf, float x, float id, float y, iiIliiiIIlliii h) {
      if (w != null && !(id <= 0.0F) && !(y <= 0.0F)) {
         boolean var7 = w.equals(this.IIiIIiIlil);
         float var8 = var7 ? this.lIiIIiIlil : this.lIIIlliIIIll(w);
         float var9 = var7 ? this.iIiIIiIlil : this.IlIIllllIIll(w);
         float[] var10 = new float[]{xf - var8, x - var9, id, y};
         if (var7) {
            this.iliiilIlil = lllIiillIi(this.iliiilIlil, var10);
         } else {
            this.lliiilIlil.put(w, var10);
            if (h != null) {
               this.lIiIiiIiIi(w, h.liiiIIllIl(xf) - this.IliIilliIi(w), h.iIlIlllllill(x) - this.iliIiIiiIi(w), id * h.illiIIIlIl, y * h.illiIIIlIl);
            } else {
               this.lIiIiiIiIi(w, xf - this.IliIilliIi(w), x - this.iliIiIiiIi(w), id, y);
            }
         }

         if (this.IIIIIiIlil) {
            if (h != null) {
               this.IiiiilIlil.add(new iiiilIIIIi(w, h.liiiIIllIl(xf), h.iIlIlllllill(x), id * h.illiIIIlIl, y * h.illiIIIlIl));
            } else {
               this.IiiiilIlil.add(new iiiilIIIIi(w, xf, x, id, y));
            }

         }
      }
   }

   private void iIIliIlIli(boolean skipDrag, boolean apply) {
      if (this.IiilIiIlil != iiillIllil) {
         this.llilIiIlil = 0;
      }

      int var3 = this.llilIiIlil;
      String var4 = this.IilIIiIlil ? this.lIIIIiIlil : null;
      boolean var5 = var4 != null;

      for(int var6 = 0; var6 < var3; ++var6) {
         this.IlllIiIlil[var6] = this.iiIlIiIlil[var6];
         this.llllIiIlil[var6] = this.IIllIiIlil[var6];
         this.iillIiIlil[var6] = false;
         String var7 = this.IiIlIiIlil[var6];
         boolean var8 = var7.equals(var4) && !this.liiiiIllil;
         this.IillIiIlil[var6] = var8 ? Integer.MAX_VALUE : (this.IiIIilliIIil(var7) ? this.IIIlilIIli(var7) : Integer.MIN_VALUE);
         if (!var8 && this.IillIiIlil[var6] != Integer.MIN_VALUE) {
            var5 = true;
         }
      }

      if (var5) {
         int var14 = 0;

         for(int var17 = 0; var17 < var3; ++var17) {
            if (!skipDrag || !this.IiIlIiIlil[var17].equals(var4)) {
               this.illlIiIlil[var14++] = var17;
            }
         }

         for(int var18 = 1; var18 < var14; ++var18) {
            int var22 = this.illlIiIlil[var18];

            int var9;
            for(var9 = var18 - 1; var9 >= 0 && this.llIliilIli(var22, this.illlIiIlil[var9]); --var9) {
               this.illlIiIlil[var9 + 1] = this.illlIiIlil[var9];
            }

            this.illlIiIlil[var9 + 1] = var22;
         }

         this.iiilIiIlil = var14;

         for(int var19 = 0; var19 < var14; ++var19) {
            int var23 = this.illlIiIlil[var19];
            if (this.IillIiIlil[var23] == Integer.MAX_VALUE) {
               this.iillIiIlil[var23] = true;
            } else {
               boolean var26 = this.IillIiIlil[var23] == Integer.MIN_VALUE;
               boolean var10 = false;
               if (!var26 || liiilliiiill(this.IiIlIiIlil[var23]) < 0) {
                  for(int var11 = 0; var11 < var19 && !var10; ++var11) {
                     int var12 = this.illlIiIlil[var11];
                     if ((this.iillIiIlil[var12] || !var26) && liiIiiiiIi(this.iiIlIiIlil[var23], this.IIllIiIlil[var23], this.lIllIiIlil[var23], this.iIllIiIlil[var23], this.IlllIiIlil[var12], this.llllIiIlil[var12], this.lIllIiIlil[var12], this.iIllIiIlil[var12])) {
                        var10 = true;
                     }
                  }

                  if (!var26) {
                     this.iillIiIlil[var23] = true;
                  }

                  if (var10 && (this.IiIliliIli(var23, var19, true) || this.IiIliliIli(var23, var19, false))) {
                     this.IlllIiIlil[var23] = this.IiIiIiIlil;
                     this.llllIiIlil[var23] = this.liIiIiIlil;
                     this.lillIiIlil[var23] = this.liilIiIlil;
                     this.iillIiIlil[var23] = true;
                  }
               }
            }
         }
      }

      if (apply) {
         this.IIIiIiIlil = 0;

         for(int var15 = 0; var15 < var3 && this.IIIiIiIlil < 64; ++var15) {
            if (this.IillIiIlil[var15] != Integer.MIN_VALUE && (this.IillIiIlil[var15] != Integer.MAX_VALUE || liiilliiiill(this.IiIlIiIlil[var15]) < 0)) {
               this.lIIiIiIlil[this.IIIiIiIlil] = this.IlllIiIlil[var15];
               this.iIIiIiIlil[this.IIIiIiIlil] = this.llllIiIlil[var15];
               this.IlIiIiIlil[this.IIIiIiIlil] = this.lIllIiIlil[var15];
               this.llIiIiIlil[this.IIIiIiIlil] = this.iIllIiIlil[var15];
               this.ilIiIiIlil[this.IIIiIiIlil] = this.IillIiIlil[var15] == Integer.MAX_VALUE;
               ++this.IIIiIiIlil;
            }
         }
      }

      if (apply) {
         float var16 = 1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.07F));

         for(int var20 = 0; var20 < var3; ++var20) {
            String var24 = this.IiIlIiIlil[var20];
            float var27 = this.IlllIiIlil[var20] - this.iiIlIiIlil[var20];
            float var29 = this.llllIiIlil[var20] - this.IIllIiIlil[var20];
            float[] var31 = this.llIlIiIlil.isEmpty() ? null : (float[])this.llIlIiIlil.get(var24);
            if (var31 == null) {
               if (Math.abs(var27) < 0.05F && Math.abs(var29) < 0.05F) {
                  continue;
               }

               boolean var32 = false;

               for(int var13 = 0; var13 < this.ililIiIlil && !var32; ++var13) {
                  var32 = var24.equals(this.liIlIiIlil[var13]);
               }

               var31 = new float[]{var27, var29, var32 ? 0.0F : var27, var32 ? 0.0F : var29, 0.0F};
               this.llIlIiIlil.put(var24, var31);
            }

            var31[0] = var27;
            var31[1] = var29;
            if (Math.abs(var27) >= 0.05F || Math.abs(var29) >= 0.05F) {
               var31[4] = (float)this.lillIiIlil[var20];
            }

            var31[2] += (var27 - var31[2]) * var16;
            var31[3] += (var29 - var31[3]) * var16;
            if (Math.abs(var27 - var31[2]) < 0.05F) {
               var31[2] = var27;
            }

            if (Math.abs(var29 - var31[3]) < 0.05F) {
               var31[3] = var29;
            }

            if (var31[2] == 0.0F && var31[3] == 0.0F && var27 == 0.0F && var29 == 0.0F) {
               this.llIlIiIlil.remove(var24);
            }
         }

         if (!this.llIlIiIlil.isEmpty()) {
            Iterator var21 = this.llIlIiIlil.entrySet().iterator();

            while(var21.hasNext()) {
               String var25 = (String)((Map.Entry)var21.next()).getKey();
               boolean var28 = false;

               for(int var30 = 0; var30 < var3 && !var28; ++var30) {
                  var28 = var25.equals(this.IiIlIiIlil[var30]);
               }

               if (!var28) {
                  var21.remove();
               }
            }
         }

         System.arraycopy(this.IiIlIiIlil, 0, this.liIlIiIlil, 0, var3);
         this.ililIiIlil = var3;
      }
   }

   private float IIlIIilIlIIi() {
      return 174.0F;
   }

   private void liliiliiliil(IIlIiIlllIlIiIll f, int i, class_2960 text, String icon) {
      this.IliilIllil[i] = new IIIlliillIIlliil(text, icon, -1, true, false);
      this.iliilIllil[i] = ilIillIiIill(f, this.IliilIllil[i]);
   }

   private static boolean liiIiiiiIi(float aw, float bx, float bw, float by, float bh, float ay, float ah, float ax) {
      float var8 = 5.5F;
      return aw < bh + ah + var8 && bh < aw + bw + var8 && bx < ay + ax + var8 && ay < bx + by + var8;
   }

   public static void liiIlliiiIll() {
      IIililillIililil var0 = lliiIliliiIl();
      if (var0 != null) {
         var0.lilIIliilIIl();
      }

   }

   private void illIIlIilIIl(class_332 ctx) {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(llilIiIiililIiIi.class);
      if (var2 instanceof llilIiIiililIiIi var3) {
         if (var2.IliIlllilIi()) {
            var3.lllllillll(ctx);
         }
      }

      ilIllIiIll var11 = llilIllililIll.iliIiiliiiii(IiIiIIliliIiIIli.class);
      if (var11 instanceof IiIiIIliliIiIIli var4) {
         if (var11.IliIlllilIi()) {
            var4.lllllillll(ctx);
         }
      }

      ilIllIiIll var12 = llilIllililIll.iliIiiliiiii(liiiIIiiiiiIIi.class);
      if (var12 instanceof liiiIIiiiiiIIi var5) {
         if (var12.IliIlllilIi()) {
            var5.IlIllllIll(ctx);
         }
      }

      ilIllIiIll var13 = llilIllililIll.iliIiiliiiii(iIIiIlIlIiIl.class);
      if (var13 instanceof iIIiIlIlIiIl var6) {
         if (var13.IliIlllilIi()) {
            var6.IiilIiliilIi(ctx);
         }
      }

      ilIllIiIll var14 = llilIllililIll.iliIiiliiiii(iiIlIIIiIIllIIIi.class);
      if (var14 instanceof iiIlIIIiIIllIIIi var7) {
         if (var14.IliIlllilIi()) {
            var7.IlIllllIll(ctx);
         }
      }

      ilIllIiIll var15 = llilIllililIll.iliIiiliiiii(lIIIlIIliIIIlIIl.class);
      if (var15 instanceof lIIIlIIliIIIlIIl var8) {
         if (var15.IliIlllilIi()) {
            var8.IIlIlllIlIll(ctx);
         }
      }

      ilIllIiIll var16 = llilIllililIll.iliIiiliiiii(iIiIIiIlIliIIiIl.class);
      if (var16 instanceof iIiIIiIlIliIIiIl var9) {
         if (var16.IliIlllilIi()) {
            var9.lllllillll(ctx);
         }
      }

      ilIllIiIll var17 = llilIllililIll.iliIiiliiiii(llIIlIIiilIIlIIi.class);
      if (var17 instanceof llIIlIIiilIIlIIi var10) {
         if (var17.IliIlllilIi()) {
            var10.iIIilIlIil(ctx);
         }
      }

      iIlIiiiIllIiii.iIlIlllllill();
   }

   private int liIlIliiIlIl() {
      try {
         class_634 var1 = Iiiilllliiilll.method_1562();
         if (var1 != null && Iiiilllliiilll.field_1724 != null) {
            class_640 var2 = var1.method_2871(Iiiilllliiilll.field_1724.method_5667());
            int var3 = var2 != null ? var2.method_2959() : -1;
            if (var3 > 0) {
               return var3;
            } else {
               String var4 = Iiiilllliiilll.field_1724.method_7334() != null ? Iiiilllliiilll.field_1724.method_7334().name() : null;
               if (var4 == null || var4.isEmpty()) {
                  try {
                     var4 = Iiiilllliiilll.method_1548().method_1676();
                  } catch (Throwable var8) {
                  }
               }

               if (var4 != null) {
                  for(class_640 var6 : var1.method_2880()) {
                     GameProfile var7 = var6.method_2966();
                     if (var7 != null && var4.equalsIgnoreCase(var7.name())) {
                        return Math.max(0, var6.method_2959());
                     }
                  }
               }

               return Math.max(0, var3);
            }
         } else {
            return 0;
         }
      } catch (Throwable var9) {
         return 0;
      }
   }

   private static String[] liIIIiiiIIIi() {
      String[] var0 = new String[100];

      for(int var1 = 2; var1 < 100; ++var1) {
         var0[var1] = String.valueOf(var1);
      }

      return var0;
   }

   private void iIiIIlIliIIl(liIliIliiIliIl down, boolean a) {
      double var3 = a ? (double)1.0F : (double)0.0F;
      if (Math.abs(down.IiIlliIliiIl() - var3) > Double.longBitsToDouble(-7816286095521854573L ^ -6052130002102231064L)) {
         down.lIiiIiIlilli(var3);
      }

   }

   private static int lliiililiiil(class_1799 s) {
      if (s != null && !s.method_7960()) {
         if (!s.method_31574(class_1802.field_8463) && !s.method_31574(class_1802.field_8367)) {
            if (s.method_31574(class_1802.field_8288)) {
               return 1;
            } else if (s.method_31574(class_1802.field_8301)) {
               return 2;
            } else {
               return s.method_31574(class_1802.field_8287) ? 3 : -1;
            }
         } else {
            return 0;
         }
      } else {
         return -1;
      }
   }

   private static String IillIllillIl(boolean done) {
      if (done) {
         return "";
      } else {
         double var1 = IiiIlIIiliiIlIIi.IilliliilIIi();
         return var1 > Double.longBitsToDouble(-6046672640503390799L ^ -7785062096668402255L) ? IliIlllilIi<invokedynamic>() + IiiIlIIiliiIlIIi.IIlllIlliIll(var1) : "";
      }
   }

   public static float iilllIIill() {
      IIililillIililil var0 = lillilIlil;
      if (var0 != null && !var0.IIiiIiIlil.isEmpty()) {
         iiIliiiIIlliii var1 = (iiIliiiIIlliii)var0.IIiiIiIlil.get(IliIlllilIi<invokedynamic>());
         return var1 != null && var1.iiIiIIIlIl != 1.0F && !var0.IiIIilliIIil(IliIlllilIi<invokedynamic>()) ? iIlIiiiIllIiii.liiiIIllIl() * (var1.iiIiIIIlIl - 1.0F) : 0.0F;
      } else {
         return 0.0F;
      }
   }

   private static String[] lllillillill() {
      String[] var0 = new String[41];

      for(int var1 = 0; var1 <= 40; ++var1) {
         var0[var1] = var1 + IliIlllilIi<invokedynamic>();
      }

      return var0;
   }

   private List<ilIllIiIll> illlllIillll() {
      List var1 = lillIlliillIll.IliIlllilIi(llilIllililIll.IilliliilIIi());
      String var2 = this.llliilIlil.Iilllilliill();
      byte var3 = -1;
      switch (var2.hashCode()) {
         case -2022496506:
            if (var2.equals(IliIlllilIi<invokedynamic>())) {
               var3 = 1;
            }
            break;
         case 115155230:
            if (var2.equals(IliIlllilIi<invokedynamic>())) {
               var3 = 2;
            }
            break;
         case 803668952:
            if (var2.equals(IliIlllilIi<invokedynamic>())) {
               var3 = 0;
            }
      }

      List var10000;
      switch (var3) {
         case 0 -> var10000 = var1.stream().sorted(Comparator.comparing(ilIllIiIll::IilliliilIIi)).toList();
         case 1 -> var10000 = var1.stream().sorted((a, b) -> Integer.compare((int)illlIiiIillIii.liiiIIllIl().iIlIlllllill(b.IilliliilIIi()), (int)illlIiiIillIii.liiiIIllIl().iIlIlllllill(a.IilliliilIIi()))).toList();
         case 2 -> var10000 = var1.stream().sorted(Comparator.comparing(ilIllIiIll::iliIiiliiiii).thenComparing(ilIllIiIll::IilliliilIIi)).toList();
         default -> var10000 = var1;
      }

      return var10000;
   }

   private void Iillillillil(class_332 ctx, float x, float y, long now) {
      if (this.iiIllIllil == 0L || now - this.iiIllIllil >= 50000000L) {
         this.iiIllIllil = now;
         this.llllililllil();
      }

      float var6 = this.iiiIlIllil + 5.0F;
      float var7 = 1.0F - (float)Math.exp((double)(-this.iIiliIllil / 0.06F));
      float var8 = 0.0F;
      float var9 = 0.0F;

      for(int var10 = 0; var10 < this.iIillIllil.size(); ++var10) {
         iilIiIIiIIiIiIIi var11 = (iilIiIIiIIiIiIIi)this.iIillIllil.get(var10);
         if (var11.IilliliilIIi(var7)) {
            this.lIillIllil.remove(var11.lilIlliiil);
            this.iIillIllil.remove(var10--);
         } else {
            var8 += 15.0F * var11.iliiiilIlIiiiiilIl;
            if (!var11.IIIIIIiIllIIIIIiIl) {
               var9 = Math.max(var9, var6 + var11.lIiIlliiil + 10.0F + var11.IliIlliiil.iliillIlIl);
            }
         }
      }

      if (!this.IiIiIIllil.IilliliilIIi(this.lllllIllil > 0, llIiiiIlil)) {
         this.IiliIIllil.iIlIlllllill();
      } else {
         float var33 = this.IiliIIllil.IilliliilIIi((float)Math.ceil((double)Math.max(120.0F, Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.IliIlIllil, this.IiIIlIllil.iliillIlIl), var9 + 14.0F))), this.iIiliIllil, 0.08F);
         float var34 = 30.0F + var8 + 5.0F;
         float var12 = x + this.lIiIIiIlil;
         float var13 = y + this.iIiIIiIlil;
         this.IilIililIi(var12, var13, var33, var34);
         float var14 = IliiIilliiIi.IilliliilIIi(this.IiIiIIllil.IliIlllilIi());
         boolean var15 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var12 + var33 / 2.0F, var13 + var34 / 2.0F, this.IiIiIIllil.liiiIIllIl());

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IIiIIlIiIl, var12, var13, var33, var34, 1.0F);
            float var16 = llliIlIlilliIlIl.IllIllllIl(ctx, var12, var13, var33, lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), this.IiIIlIllil, this.IilIlIllil, IiIlllliIlll(var8 / 8.0F));
            float var17 = var12 + 7.0F;
            float var18 = var12 + var33 - 7.0F;

            for(int var19 = 0; var19 < this.iIillIllil.size(); ++var19) {
               iilIiIIiIIiIiIIi var20 = (iilIiIIiIIiIiIIi)this.iIillIllil.get(var19);
               float var21 = var20.iliiiilIlIiiiiilIl;
               if (!(var21 <= 0.002F)) {
                  float var22 = 15.0F * var21;
                  float var23 = var16 + var20.lIiiiilIliIiiiilIl;
                  float var24 = IliiIilliiIi.IilliliilIIi(var21 * var21);

                  try {
                     llliIlIlilliIlIl.lIIlliIIll(ctx, var20.iilIlliiil, var17, var23 + llliIlIlilliIlIl.IIIllIIliIIl((var22 - this.iiiIlIllil) / 2.0F), this.iiiIlIllil);
                     llliIlIlilliIlIl.iIiIlIliIl(var20.IIiIlliiil, var17 + var6, var23, var22, llliIlIlilliIlIl.liIlIlIiIl);
                     llliIlIlilliIlIl.iiiIlIIIll(var20.IliIlliiil, var18, var23, var22, llliIlIlilliIlIl.liIlIlIiIl);
                  } finally {
                     IliiIilliiIi.lIiiIiIlilli(var24);
                  }
               }
            }
         } finally {
            llliIlIlilliIlIl.IlIIillIIi(ctx, var15);
            IliiIilliiIi.lIiiIiIlilli(var14);
         }

      }
   }

   private static float ilIillIiIill(IIlIiIlllIlIiIll s, IIIlliillIIlliil f) {
      return IlIillllIill(s, f, 1.0F);
   }

   public static float Iiilllliilll(float k) {
      return 20.0F * k;
   }

   public static void lIiIlliIiIll(float dy, float dx) {
      IIililillIililil var2 = lliiIliliiIl();
      if (var2 != null) {
         var2.lliIiiIlil += dy;
         var2.iliIiiIlil += dx;
      }

   }

   private static float iIilllIlilll(float v) {
      return (float)Math.round(v * 2.0F) / 2.0F;
   }

   private static int lliIIliliIIl(int a, int argb) {
      return Math.max(0, Math.min((-460754639 - -111) * 119 ^ 1004786079, argb)) << (((-2086622335 - 7 << 5 | -2086622335 - 7 >>> 27) >>> 27 | (-2086622335 - 7 << 5 | -2086622335 - 7 >>> 27) << 5) ^ -2102531562) | a & (((-2061570029 << 15 | -2061570029 >>> 17) << 31 | (-2061570029 << 15 | -2061570029 >>> 17) >>> 1) ^ -1124393288);
   }

   private void iIliiIllii(String dy, float dx, float id) {
      float[] var4 = (float[])this.llIlIiIlil.get(dy);
      if (var4 == null) {
         var4 = new float[5];
         this.llIlIiIlil.put(dy, var4);
      }

      var4[2] += dx;
      var4[3] += id;
   }

   private float[] IlIIillIIi(String id) {
      float[] var2 = (float[])this.iIiiilIlil.get(id);
      if (!id.equals(this.lIIIIiIlil)) {
         float[] var3 = (float[])this.IliiilIlil.get(id);
         float[] var4 = (float[])this.lliiilIlil.get(id);
         if (var3 != null && var4 != null && this.liiiilIlil > 0 && this.iiiiilIlil > 0) {
            float var5 = var4[2];
            float var6 = var4[3];
            iiIliiiIIlliii var7 = this.IIiiIiIlil.isEmpty() ? null : (iiIliiiIIlliii)this.IIiiIiIlil.get(id);
            float var8 = var7 == null ? 1.0F : var7.IliIlllilIi();
            float var9;
            float var10;
            if (var8 == 1.0F) {
               var9 = iIlIiIllIi(ilIIiIiIIi(var3[0], var3[2], (float)this.liiiilIlil, var5), 0.0F, Math.max(0.0F, (float)this.liiiilIlil - var5));
               var10 = iIlIiIllIi(ilIIiIiIIi(var3[1], var3[3], (float)this.iiiiilIlil, var6), 0.0F, Math.max(0.0F, (float)this.iiiiilIlil - var6));
            } else {
               float var11 = var5 * var8;
               float var12 = var6 * var8;
               var9 = iIlIiIllIi(ilIIiIiIIi(var3[0], var3[2], (float)this.liiiilIlil, var11), 0.0F, Math.max(0.0F, (float)this.liiiilIlil - var11)) + Illillllil(var3[0]) * (var11 - var5);
               var10 = iIlIiIllIi(ilIIiIiIIi(var3[1], var3[3], (float)this.iiiiilIlil, var12), 0.0F, Math.max(0.0F, (float)this.iiiiilIlil - var12)) + Illillllil(var3[1]) * (var12 - var6);
            }

            float var13 = var9 - var4[0];
            float var14 = var10 - var4[1];
            if (var2 == null || var2[0] != var13 || var2[1] != var14) {
               this.iIiiilIlil.put(id, new float[]{var13, var14});
            }

            this.iliIIiIlil[0] = var13;
            this.iliIIiIlil[1] = var14;
            return this.iliIIiIlil;
         }
      }

      if (var2 != null) {
         this.iliIIiIlil[0] = var2[0];
         this.iliIIiIlil[1] = var2[1];
      } else {
         this.iliIIiIlil[0] = 0.0F;
         this.iliIIiIlil[1] = 0.0F;
      }

      return this.iliIIiIlil;
   }

   private void iiiiilIIIIIi(long now, boolean fresh) {
      Arrays.fill(this.IiiliIllil, 0);

      try {
         class_1661 var4 = Iiiilllliiilll.field_1724.method_31548();

         for(int var5 = 0; var5 <= 40; ++var5) {
            if (var5 < 36 || var5 >= 40) {
               class_1799 var6 = var4.method_5438(var5);
               int var7 = lliiililiiil(var6);
               if (var7 >= 0) {
                  int[] var10000 = this.IiiliIllil;
                  var10000[var7] += var6.method_7947();
               }
            }
         }
      } catch (Throwable var8) {
      }

      for(int var9 = 0; var9 < 4; ++var9) {
         int var10 = this.IiiliIllil[var9];
         if (var10 > this.ililiIllil[var9] && !fresh) {
            this.liiliIllil[var9] = now;
         }

         if (var10 != this.ililiIllil[var9] || this.iiiliIllil[var9].isEmpty()) {
            this.iiiliIllil[var9] = Iiiiilliiiil(var10);
            this.iiIIIlllil[var9] = llliIlIlilliIlIl.lIliliIlil(this.iiiliIllil[var9], 0.82F);
         }

         this.ililiIllil[var9] = var10;
      }

   }

   private void lIliliIlil(String sc, iiIliiiIIlliii y, float id, float h, float x, float w) {
      byte var8 = -1;
      switch (sc.hashCode()) {
         case -2133437673:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 12;
            }
            break;
         case -2020599460:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 20;
            }
            break;
         case -1998723398:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 11;
            }
            break;
         case -1983070683:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 19;
            }
            break;
         case -1573766501:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 9;
            }
            break;
         case -1354750946:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 2;
            }
            break;
         case -1211471706:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 7;
            }
            break;
         case -880905839:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 8;
            }
            break;
         case -868041058:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 16;
            }
            break;
         case -867918638:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 6;
            }
            break;
         case -816205337:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 5;
            }
            break;
         case -390600384:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 23;
            }
            break;
         case -368204171:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 15;
            }
            break;
         case 3437289:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 17;
            }
            break;
         case 93086015:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 3;
            }
            break;
         case 93997959:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 4;
            }
            break;
         case 94755854:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 10;
            }
            break;
         case 108270342:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 24;
            }
            break;
         case 109757152:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 1;
            }
            break;
         case 114722374:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 14;
            }
            break;
         case 473741317:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 22;
            }
            break;
         case 503572695:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 18;
            }
            break;
         case 771697063:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 13;
            }
            break;
         case 1123654140:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 21;
            }
            break;
         case 1227433863:
            if (sc.equals(IliIlllilIi<invokedynamic>())) {
               var8 = 0;
            }
      }

      switch (var8) {
         case 0:
         case 1:
            this.lIIIiiIlil = 1.0F;
            this.iIIIiiIlil = 0.0F;
            break;
         case 2:
            this.lIIIiiIlil = 0.0F;
            this.iIIIiiIlil = 1.0F;
            break;
         case 3:
         case 4:
            this.lIIIiiIlil = 1.0F;
            this.iIIIiiIlil = 1.0F;
            break;
         case 5:
         case 6:
         case 7:
            this.lIIIiiIlil = 0.5F;
            this.iIIIiiIlil = 1.0F;
            break;
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.lIIIiiIlil = 0.5F;
            this.iIIIiiIlil = 0.0F;
            break;
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
            this.lIIIiiIlil = 0.0F;
            this.iIIIiiIlil = 0.0F;
            break;
         case 24:
            boolean var9 = IiIiIlliIiIl(liiliiIlil);
            String var10 = this.illiilIlil.Iilllilliill();
            byte var11 = -1;
            switch (var10.hashCode()) {
               case -960744398:
                  if (var10.equals(IliIlllilIi<invokedynamic>())) {
                     var11 = 0;
                  }
                  break;
               case 2364455:
                  if (var10.equals(IliIlllilIi<invokedynamic>())) {
                     var11 = 4;
                  }
                  break;
               case 78959100:
                  if (var10.equals(IliIlllilIi<invokedynamic>())) {
                     var11 = 5;
                  }
                  break;
               case 287355729:
                  if (var10.equals(IliIlllilIi<invokedynamic>())) {
                     var11 = 1;
                  }
                  break;
               case 926500839:
                  if (var10.equals(IliIlllilIi<invokedynamic>())) {
                     var11 = 3;
                  }
                  break;
               case 999535836:
                  if (var10.equals(IliIlllilIi<invokedynamic>())) {
                     var11 = 2;
                  }
            }

            switch (var11) {
               case 0:
                  this.lIIIiiIlil = 0.0F;
                  this.iIIIiiIlil = 0.0F;
                  return;
               case 1:
                  this.lIIIiiIlil = 1.0F;
                  this.iIIIiiIlil = 0.0F;
                  return;
               case 2:
                  this.lIIIiiIlil = 0.0F;
                  this.iIIIiiIlil = 1.0F;
                  return;
               case 3:
                  this.lIIIiiIlil = 1.0F;
                  this.iIIIiiIlil = 1.0F;
                  return;
               case 4:
                  this.lIIIiiIlil = 0.0F;
                  this.iIIIiiIlil = 0.5F;
                  return;
               case 5:
                  this.lIIIiiIlil = 1.0F;
                  this.iIIIiiIlil = 0.5F;
                  return;
               default:
                  this.lIIIiiIlil = var9 ? 0.0F : 1.0F;
                  this.iIIIiiIlil = var9 ? 0.0F : 0.5F;
                  return;
            }
         default:
            if (y != null && y.iIliIIIlIl) {
               this.lIIIiiIlil = y.IIliIIIlIl;
               this.iIIIiiIlil = y.lIliIIIlIl;
               return;
            }

            this.lIIIiiIlil = id + x / 2.0F > (float)this.liiiilIlil / 2.0F ? 1.0F : 0.0F;
            this.iIIIiiIlil = h + w / 2.0F > (float)this.iiiiilIlil / 2.0F ? 1.0F : 0.0F;
            if (y != null) {
               y.iIliIIIlIl = true;
               y.IIliIIIlIl = this.lIIIiiIlil;
               y.lIliIIIlIl = this.iIIIiiIlil;
            }
      }

   }

   public static float lllIllillIll(String id, float v) {
      IIililillIililil var2 = lliiIliliiIl();
      iiIliiiIIlliii var3 = var2 != null && !var2.IIiiIiIlil.isEmpty() ? (iiIliiiIIlliii)var2.IIiiIiIlil.get(id) : null;
      return var3 != null && var3.illiIIIlIl != 1.0F && var3.iiIiIIIlIl != 1.0F ? var3.iIlIlllllill(v) : v;
   }
}
