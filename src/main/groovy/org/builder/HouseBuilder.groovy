package org.builder

class HouseBuilder {
    private DoorBuilder doorBuilder = DoorBuilder.builder()
    private RoofBuilder roofBuilder = RoofBuilder.builder()

    private HouseBuilder() {

    }

    static HouseBuilder builder() {
        new HouseBuilder()
    }

    HouseBuilder withDoorKnobType(String doorKnobType) {
        doorBuilder.withDoorKnobType(doorKnobType)
        this
    }

    HouseBuilder withRoofType(String roofType) {
        roofBuilder.withRoofType(roofType)
        this
    }

    House build() {
        House house = new House()
        house.setDoor(doorBuilder.build())
        house.setRoof(roofBuilder.build())
        house
    }


}
