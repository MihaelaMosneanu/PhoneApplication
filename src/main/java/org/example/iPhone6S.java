package org.example;

public class iPhone6S extends Phone {


    public iPhone6S(){
        this(70,"black","plastic","def223456","iPhone6S");
    }
    public iPhone6S(int batteryLife, String color, String material, String IMEI,String name) {
        super(batteryLife, color, material, IMEI, name);

    }
}


