package tests;

import org.junit.jupiter.api.Test;

public class Types{

    int myInteger = 1;

    MyInteger myIntegerType = new MyInteger(5);
    MyInteger myIntegerType2 = new MyInteger(10);
    MyInteger forDefaultConstr = new MyInteger();
    MyInteger secondInteger = getMyInt();

    Integer number = new Integer(4);

    String globalString;




    @Test
    public void printAllVariables() {
        System.out.println(myInteger);  //1
        System.out.println(myIntegerType);  //0
        System.out.println(secondInteger);
        System.out.println(number); //4
        int inta = 3;

        new MyInteger().print1000();


        myIntegerType.print1000();
        forDefaultConstr.print1000();
        myIntegerType2.print1000();


        getAndPrintString("First string");
        getAndPrintString("Second string");

        System.out.println(globalString);
        getAndPrintTwoStrings("Print String", "Second String");
        System.out.println(globalString);
        System.out.println(returnString());
        System.out.println(returnBoolean(30));

    }


    public MyInteger getMyInt(){
        return new MyInteger();
    }

    public void getAndPrintString(String toPrint){
        System.out.println(toPrint);

    }

    public void getAndPrintTwoStrings(String first, String second) {
        System.out.println(first);
        globalString = second;

    }

    public String returnString() {
        return "Return string";
    }

    public boolean returnBoolean(int someValue) {
        return new Integer(20).equals(someValue);

    }


}
