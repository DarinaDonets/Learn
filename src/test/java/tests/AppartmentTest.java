package tests;

import org.junit.jupiter.api.Test;

public class AppartmentTest {
    Appartment newAppartment = new Appartment(4);
    Appartment newAppartment1 = new Appartment(2);
    Appartment newAppartment2 = new Appartment(1,true);



    @Test
    public void checkAppartment() {
        newAppartment.printRoomQuantity();
        newAppartment.countQuantityOfBathrooms();
        System.out.println(newAppartment.printBalcon());
        System.out.println("---------------------------");

        newAppartment1.printRoomQuantity();
        newAppartment1.countQuantityOfBathrooms();
        System.out.println(newAppartment1.printBalcon());
        System.out.println("---------------------------");

        newAppartment2.printRoomQuantity();
        newAppartment2.countQuantityOfBathrooms();
        System.out.println(newAppartment2.printBalcon());

    }


}
