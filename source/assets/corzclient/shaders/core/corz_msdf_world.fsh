#version 330

uniform sampler2D Sampler0;

in vec2 texCoord0;
in vec4 vertexColor;

out vec4 fragColor;

const float MSDF_RANGE = 12.0;
const float EDGE = 0.44;

float median(vec3 c) {
    return max(min(c.r, c.g), min(max(c.r, c.g), c.b));
}

void main() {
    float d = median(texture(Sampler0, texCoord0).rgb);
#ifdef SOFT
    float a = smoothstep(0.06, 0.62, d);
#else
    vec2 unitRange = vec2(MSDF_RANGE) / vec2(textureSize(Sampler0, 0));
    float px = max(0.5 * dot(unitRange, vec2(1.0) / max(fwidth(texCoord0), vec2(1.0e-6))), 1.0);
    float a = clamp(px * (d - EDGE) + 0.5, 0.0, 1.0);
#endif
#ifdef DEPTH_ONLY
    if (a < 0.5) {
        discard;
    }
#else
    if (a <= 0.003) {
        discard;
    }
#endif
    fragColor = vec4(vertexColor.rgb, vertexColor.a * a);
}
