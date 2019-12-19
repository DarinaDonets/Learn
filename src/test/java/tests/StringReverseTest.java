package tests;

import org.junit.jupiter.api.Test;

public class StringReverseTest extends StringReverse{

    StringReverse str = new StringReverse();

    @Test
    public void changingStrings() {
        str.printStringReverseWay1("love");
    }

    @Test
    public void playWithArray() {
        str.returnArray(new int[]{1,3,4,5,5,5,8});
    }

}
