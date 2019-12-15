package tests;

import org.junit.jupiter.api.Test;

public class TVTest {
//    TV samsung = new TV(66);
//    TV mi = new TV(55);


    @Test
    public void checkTypes() {
        Electromachine mach = new TV();


        if (mach instanceof Electromachine){

        }

        fdf(mach);


    }

    public void fdf (Electromachine m){
        System.out.println(m.m2);
    }
        @Test
    public void checkParent() {
        TV mi = new TV(55);
        mi.M1();
        TV mi2 = new TV();
        mi.M1();
    }

//    @Test
//    public void TVChecking() {
//        mi.printDiagonal();
//        samsung.printDiagonal();
//        samsung.tvConditionON_OFF();
//        samsung.changeLoudness(3,8);
//        samsung.tvConditionON_OFF();
//        samsung.changeLoudness(3,8);
//        samsung.tvConditionON_OFF();
//        samsung.changeLoudness(3,8);
//        samsung.tvConditionON_OFF();
//        samsung.changeLoudness(3,8);
//        samsung.tvConditionON_OFF();
//        samsung.chooseChanel(7);
//        samsung.changeChanelToNext();
//        samsung.changeChanelToNext();
//        samsung.changeLoudness(3,8);
//        samsung.changeLoudness(-1,5);
//
//    }

}
