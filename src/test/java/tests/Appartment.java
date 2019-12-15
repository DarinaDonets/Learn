package tests;

public class Appartment {

    private int quantity;
    private boolean balcon;

    public Appartment(int quantity){
        if(quantity>4) {
            System.out.println("TO MUCH ROOMS");
//            throw new IllegalArgumentException("TO MUCH ROOMS");
        }
        this.quantity = quantity;
    }

    public Appartment(int quantity, boolean balcon){
        if(quantity>4) {
            System.out.println("TO MUCH ROOMS");
//            throw new IllegalArgumentException("TO MUCH ROOMS");
        }
        this.quantity = quantity;
        this.balcon = balcon;
    }

    public void printRoomQuantity() {
        System.out.println(quantity);
    }

    public void countQuantityOfBathrooms() {
        if (quantity>=3){
            System.out.println("Your appartment have 2 bathrooms");
        } else{
            System.out.println("Your appartment have 1 bathroom");
        }
    }

    public boolean printBalcon() {
        return balcon;
    }
}
