package tests;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InheritanceParking {

    int [][] parking;

    public InheritanceParking() {

        int[][] parking = new int[1][10];
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                parking[i][j] = j + 1;
            }
        }
        for (int[] anArr : parking) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        this.parking = parking;
    }

    public void goIn() {
        System.out.println("Car go in");

    }

    public void goOut() {

    }

}

