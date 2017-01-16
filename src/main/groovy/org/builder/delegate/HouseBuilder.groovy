package org.builder.delegate

import org.builder.model.House

class HouseBuilder {
    @Delegate
    private DoorBuilder doorBuilder = DoorBuilder.builder()

    @Delegate
    private RoofBuilder roofBuilder = RoofBuilder.builder()

    private HouseBuilder() {

    }

    static HouseBuilder builder() {
        new HouseBuilder()
    }


    House build() {
        House house = new House()
        house.setDoor(doorBuilder.build())
        house.setRoof(roofBuilder.build())
        house
    }


}
