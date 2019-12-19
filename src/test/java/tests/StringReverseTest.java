package tests;

import org.junit.jupiter.api.Test;

public class StringReverseTest extends StringReverse{

    StringReverse str = new StringReverse();

    @Test
    public void changingStrings() {
        str.printStringReverse("love");
    }

    @Test
    public void playWithArray() {
        str.returnArray(new int[]{1,3,4,5,5,5,8});
        System.out.println("==============");
        str.returnChangedArray(new int[]{3,44,55,65});
        System.out.println("==============");
        str.createNewReverseArray(new String[]{"I ","love ", "my ", "husband "});
    }

}
