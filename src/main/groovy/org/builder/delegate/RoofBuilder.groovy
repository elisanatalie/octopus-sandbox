package org.builder.delegate

class RoofBuilder {
    private String type = "Hip"
    private String material = "Clay"

    private RoofBuilder() {
    }

    static RoofBuilder builder() {
        new RoofBuilder()
    }

    void withRoofType(final String type) {
        this.type = type
        this
    }

    void withMaterial(final String material) {
        this.material = material
        this
    }

    Roof build() {
        Roof roof = new Roof()
        roof.setType(type)
        roof.setMaterial(material)
        roof
    }
}
