#version 330

uniform sampler2D HistorySampler;

layout(std140) uniform MotionBlurData {
    vec4 TintRetention;
};

out vec4 fragColor;

void main() {
    ivec2 maxCoord = max(textureSize(HistorySampler, 0) - ivec2(1), ivec2(0));
    vec4 history = texelFetch(HistorySampler, clamp(ivec2(gl_FragCoord.xy), ivec2(0), maxCoord), 0);
    vec4 premultiplied = vec4(history.rgb * history.a, history.a);
    vec4 paint = vec4(TintRetention.rgb * TintRetention.a, TintRetention.a);
    fragColor = premultiplied * paint;
}
