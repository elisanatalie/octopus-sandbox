package org.builder

class House {
    private Door door
    private Roof roof

    void setDoor(final Door door) {
        this.door = door
    }

    void setRoof(final Roof roof) {
        this.roof = roof
    }

    Door getDoor() {
        return door
    }

    Roof getRoof() {
        return roof
    }
}
