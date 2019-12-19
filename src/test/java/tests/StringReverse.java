package tests;
import java.lang.*;

public class StringReverse {

    int i;

    public void printStringReverseWay1(String reversedString) {
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
}
