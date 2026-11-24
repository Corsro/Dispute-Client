#version 330

out vec2 texCoord;

void main() {
    vec2 grid[6] = vec2[6](
        vec2(-1.0, -1.0),
        vec2( 1.0, -1.0),
        vec2(-1.0,  1.0),
        vec2(-1.0,  1.0),
        vec2( 1.0, -1.0),
        vec2( 1.0,  1.0)
    );

    int vid = clamp(gl_VertexID, 0, 5);
    vec2 pos = grid[vid];
    texCoord = pos * 0.5 + 0.5;

    gl_Position = vec4(pos, 1.0, 1.0);
}
