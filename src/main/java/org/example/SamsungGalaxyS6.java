package org.example;

public class SamsungGalaxyS6 extends Phone {

    public SamsungGalaxyS6(){
        this(80,"red","plastic","abc223456","SamsungGalaxyS6");
    }
    public SamsungGalaxyS6(int batteryLife, String color, String material, String IMEI,String name) {
        super(batteryLife, color, material, IMEI, name );

    }
}

