package org.builder.trait

import org.builder.model.Door

trait DoorBuilder {
    private Door door = new Door()
    private String doorKnobType = "Knob"
    private String material = "Wood"


    DoorBuilder withDoorKnobType(String doorKnobType) {
        this.doorKnobType = doorKnobType
        this
    }

    DoorBuilder withDoorMaterial(String material) {
        this.material = material
        this
    }

    Door buildDoor() {
        door.setDoorKnobType(doorKnobType)
        door.setMaterial(material)
        door
    }

}
