package oop_pracitce;

public class Car {
    // rangi, modeli, narxi,

    public String getColor(String rangi){
        return rangi;
    }

    public String getModel(String model){
        return model;
    }

    public int getPrice(int price){
        return price;
    }

    public boolean isAutomate(String typeOfTransmission){
        return typeOfTransmission.equals("auto");
    }

    public boolean isManual(String typeOfTransmission){
        return typeOfTransmission.equals("manual");
    }
}
