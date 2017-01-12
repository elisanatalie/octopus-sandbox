package org.builder

class DoorBuilder {
    private String doorKnobType
    private String material

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
