package tests;

import java.util.HashMap;
import java.util.Map;

public class InheritanceParking {
    Map<Integer, Boolean> firstFloorOfParking = new HashMap<>();
    Map<Integer, Boolean> secondFloorOfParking = new HashMap<>();
    Boolean occupancy;

    public InheritanceParking() {

        firstFloorOfParking.put(1, true);
        firstFloorOfParking.put(2, true);
        firstFloorOfParking.put(3, false);
        firstFloorOfParking.put(4, true);
        firstFloorOfParking.put(5, false);
        firstFloorOfParking.put(6, false);

        for (Map.Entry<Integer, Boolean> entry : firstFloorOfParking.entrySet()) {
            int k = entry.getKey();
            System.out.println(k);
        }

        System.out.println("===========");

        secondFloorOfParking.put(1, true);
        secondFloorOfParking.put(2, true);
        secondFloorOfParking.put(3, false);
        secondFloorOfParking.put(4, true);
        secondFloorOfParking.put(5, false);
        secondFloorOfParking.put(6, false);

        for (Map.Entry<Integer, Boolean> entry : secondFloorOfParking.entrySet()) {
            int k = entry.getKey();
            System.out.println(k);
        }
    }

    public void checkPlacesOnFirstParkingFloor(int placeNumber) {
        occupancy = firstFloorOfParking.get(placeNumber);

        if (occupancy = true) {
        System.out.println("This parking place is busy");}

        if (occupancy = false) {
        System.out.println("This parking place is free");}


    }

    public void goIn() {
        System.out.println("Car go in");

    }

    public void goOut() {
        System.out.println("Car go out");

    }

}

