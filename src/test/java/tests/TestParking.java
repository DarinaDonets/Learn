package tests;

import org.junit.jupiter.api.Test;

public class TestParking extends InheritanceParking {

   InheritanceParking firstCar = new InheritanceParking();


    @Test
    public void parkingWork() {
        firstCar.goIn();
    }
}
