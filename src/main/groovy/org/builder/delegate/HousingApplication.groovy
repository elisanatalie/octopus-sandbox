package org.builder.delegate

class HousingApplication {

    static void main(String[] args) {
        House house = HouseBuilder.builder()
        //.withDoorKnobType("Lever")
        //.withRoofType("Gable")
                .build()

        println "House with door knob type = " + house.door.doorKnobType + "and roof Type = " + house.roof.type

    }

}

