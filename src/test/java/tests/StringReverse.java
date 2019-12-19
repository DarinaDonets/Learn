package tests;
import java.lang.*;

public class StringReverse {

    private String reversedString;

    public void printStringReverseWay1(String reversedString) {
        char[] array = reversedString.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
