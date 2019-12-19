package tests;

import java.lang.*;

public class StringReverse {

    int i;
    String temp;

    public void printStringReverse(String reversedString) {
        char[] array = reversedString.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    public void returnArray(int[] createArray) {
        for (i = 0; i < createArray.length; i++) {
            System.out.println(createArray[i]);
        }
    }

    public void returnChangedArray(int[] createArrayForChanging) {
        for (i = createArrayForChanging.length - 1; i >= 0; i--) {
            System.out.println(createArrayForChanging[i]);
        }
    }

    public void  createNewReverseArray(String[] arrayOfStrings) {
        for (int i=0; i<arrayOfStrings.length; i++){
            System.out.print(arrayOfStrings[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayOfStrings.length/2; i++) {
            temp = arrayOfStrings[arrayOfStrings.length-i-1];
            arrayOfStrings[arrayOfStrings.length-i-1] = arrayOfStrings[i];
            arrayOfStrings[i] = temp;
        }
        for (int i=0; i<arrayOfStrings.length; i++){
            System.out.print(arrayOfStrings[i]);
        }
    }
}
