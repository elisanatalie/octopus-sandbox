package org.builder.delegate

class DoorBuilder {
    private String doorKnobType = "Knob"
    private String material = "Wood"

    private DoorBuilder() {
    }

    static DoorBuilder builder() {
        new DoorBuilder()
    }

    DoorBuilder withDoorKnobType(String doorKnobType) {
        this.doorKnobType = doorKnobType
        this
    }

    DoorBuilder withDoorMaterial(String material) {
        this.material = material
        this
    }

    Door build() {
        Door door = new Door()
        door.setDoorKnobType(doorKnobType)
        door.setMaterial(material)
        door
    }

}
