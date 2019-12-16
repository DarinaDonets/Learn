package tests;

import org.junit.jupiter.api.Test;

public class StringReverseTest extends StringReverse{

    StringReverse str = new StringReverse();

    @Test
    public void changingStrings() {
        str.printStringReverseWay1("I love my husband");
    }

}
