#version 330

uniform sampler2D DiffuseSampler;
uniform vec2 InSize;
uniform vec2 OutSize;
uniform vec2 Direction;
uniform float Radius;
uniform float Quality;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec2 safeInSize = max(InSize, vec2(1.0));
    vec2 texelSize = 1.0 / safeInSize;
    vec4 color = vec4(0.0);
    float total = 0.0;

    float offset = Radius;
    float maxQ = clamp(Quality, 0.0, 16.0);

    for (int idx = -16; idx <= 16; ++idx) {
        float i = float(idx);
        if (abs(i) > maxQ) {
            continue;
        }
        float weight = 1.0 - abs(i) / (maxQ + 1.0);
        weight = weight * weight;

        vec2 sampleOffset = Direction * texelSize * i * offset;
        color += texture(DiffuseSampler, clamp(texCoord + sampleOffset, vec2(0.001), vec2(0.999))) * weight;
        total += weight;
    }

    fragColor = color / max(total, 1.0e-5);
}
