#version 330

void main() {
    vec2 positions[3] = vec2[3](
        vec2(-1.0, -1.0),
        vec2( 3.0, -1.0),
        vec2(-1.0,  3.0)
    );
    int vid = clamp(gl_VertexID, 0, 2);
    gl_Position = vec4(positions[vid], 0.0, 1.0);
}
