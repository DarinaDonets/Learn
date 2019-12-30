package tests;

import org.junit.jupiter.api.Test;

public class BubbleArrayTest {

    BubbleArray first = new BubbleArray();

    @Test
    public void tryBubble(){

        first.bubbleSortedArray(new int[]{3,66,7,884,1});
    }
}
