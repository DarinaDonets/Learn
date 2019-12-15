package tests;

public class MyInteger {

    int number = 1000;

    public MyInteger(int newOne) {
        number = newOne;
        System.out.println("нічоого не роблю окрім прирівнювання числа до глобальної переминної");
        System.out.println("я тільки запамятав число "+newOne);
    }

    public MyInteger() {

    }

    public void print1000() {
        System.out.println("дібильна назва метода/я не знаю чому тут 1000, але я викличу глобальну змінну number");
        System.out.println(number);
    }
}
