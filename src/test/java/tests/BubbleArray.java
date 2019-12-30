package tests;

import java.util.Arrays;

public class BubbleArray {

    boolean isSorted = false;
    int buf;

    public void bubbleSortedArray(int[] mas) {
        while (!isSorted) {
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}
