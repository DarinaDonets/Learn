package tests;

import org.junit.jupiter.api.Test;

public class TestParking {

    InheritanceParking firstCar = new InheritanceParking();


    @Test
    public void parkingWork() {
        firstCar.goIn();
        firstCar.goOut();
        firstCar.checkPlacesOnFirstParkingFloor(5);
    }
}
