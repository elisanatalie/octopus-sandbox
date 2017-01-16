package org.builder.trait

import org.builder.model.House

class HouseBuilder implements DoorBuilder, RoofBuilder {
    private HouseBuilder() {

    }

    static HouseBuilder builder() {
        new HouseBuilder()
    }


    House build() {
        House house = new House()
        house.setDoor(buildDoor())
        house.setRoof(buildRoof())
        house
    }


}
