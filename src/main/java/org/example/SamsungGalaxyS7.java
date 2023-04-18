package org.example;

public class SamsungGalaxyS7 extends Phone {

    public SamsungGalaxyS7(){
        this(70, "black","plastic","def123444566","SamsungGalaxyS7");
    }

    public SamsungGalaxyS7(int batteryLife, String color, String material, String IMEI,String name) {
        super(batteryLife, color, material, IMEI, name);
    }
}

