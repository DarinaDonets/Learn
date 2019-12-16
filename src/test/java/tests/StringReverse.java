package tests;

public class StringReverse {

    private String reversedString;

    public void printStringReverseWay1(String reversedString) {
        System.out.println(reversedString.reverse());
        this.reversedString = reversedString;
    }

    public void printStringReverseWay2() {
        char[] array = str.toCharArray();
        System.out.print("2) ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
