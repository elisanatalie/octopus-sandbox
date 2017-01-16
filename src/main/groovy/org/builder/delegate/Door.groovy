package org.builder.delegate

class Door {
    private String doorKnobType
    private String material

    void setDoorKnobType(final String doorKnobType) {
        this.doorKnobType = doorKnobType
    }

    void setMaterial(final String material) {
        this.material = material
    }

    String getDoorKnobType() {
        return doorKnobType
    }

    String getMaterial() {
        return material
    }
}
