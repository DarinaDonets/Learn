package tests;

import javax.imageio.ImageTranscoder;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.metadata.IIOMetadata;

public class TV  extends Electromachine implements ImageTranscoder {
    private int diagonal ;
    private int chanelNumber;
    private int loudness;
    private boolean isOn;


    public TV(int diagonal) {
        this.diagonal = diagonal;
        System.out.println("TV");
    }

    public TV() {
        this(55);
        System.out.println("TV");
    }



    public void tvConditionON_OFF() {
        if (isOn==false) {
            isOn = true;
            System.out.println("TV is turn on");
        } else {
            isOn = false;
            System.out.println("TV is turn off");
        }
    }

    public void printDiagonal() {
        System.out.println(diagonal);
    }

    public void chooseChanel(int chanelNumber) {
        this.chanelNumber=chanelNumber;
        System.out.println(chanelNumber);
    }

    public void changeChanelToNext() {
        this.chanelNumber++;
        System.out.println(chanelNumber);
    }

    public void changeLoudness(int loudness, int changeValueFor) {
        if(isOn==true){
            if(loudness<0) {
                throw new IllegalArgumentException("Choose value bigger then 0");
            }
            this.loudness=loudness;
            System.out.println(loudness+changeValueFor);
        } else {
            System.out.println("Tv is OFF. There is no posibility to change volume");

        }
    }

    @Override
    public void M1(){

        System.out.println("M1 overided");
    }

    @Override
    public IIOMetadata convertStreamMetadata(IIOMetadata inData, ImageWriteParam param) {
        return null;
    }

    @Override
    public IIOMetadata convertImageMetadata(IIOMetadata inData, ImageTypeSpecifier imageType, ImageWriteParam param) {
        return null;
    }
}
