package org.builder.trait

import org.builder.model.Roof

trait RoofBuilder {
    private Roof roof = new Roof()
    private String type = "Hip"
    private String material = "Clay"


    RoofBuilder withRoofType(final String type) {
        this.type = type
        this
    }

    RoofBuilder withMaterial(final String material) {
        this.material = material
        this
    }

    Roof buildRoof() {
        roof.setType(type)
        roof.setMaterial(material)
        roof
    }
}
