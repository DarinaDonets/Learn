package tests;

public class Electromachine {

    private int m1;
    public  String m2;

    public Electromachine() {
        System.out.println("Electromachine");
        m2 = "Electromachine";
    }

    public Electromachine(String str) {
        System.out.println(str);
    }

    public void M1(){
        System.out.println("M1");
    }

    private void M2(){
        System.out.println("M2");
    }

}
