#version 330

layout(std140) uniform KawaseData {
    vec4 params;
};

out vec2 texCoord;
out vec2 texelSize;
out float offset;

void main() {
    vec2 positions[6] = vec2[6](
        vec2(-1.0, -1.0),
        vec2( 1.0, -1.0),
        vec2( 1.0,  1.0),
        vec2(-1.0, -1.0),
        vec2( 1.0,  1.0),
        vec2(-1.0,  1.0)
    );

    vec2 uvs[6] = vec2[6](
        vec2(0.0, 0.0),
        vec2(1.0, 0.0),
        vec2(1.0, 1.0),
        vec2(0.0, 0.0),
        vec2(1.0, 1.0),
        vec2(0.0, 1.0)
    );

    int vid = clamp(gl_VertexID, 0, 5);
    gl_Position = vec4(positions[vid], 0.0, 1.0);
    texCoord = uvs[vid];
    texelSize = 1.0 / max(params.xy, vec2(1.0));
    offset = params.z;
}
