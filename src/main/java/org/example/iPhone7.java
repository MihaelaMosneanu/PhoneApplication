package org.example;

public class iPhone7 extends Phone {

    public iPhone7(){
        this(90, "white","plastic","jkl123444566"," iPhone7");
    }


    public iPhone7(int batteryLife, String color, String material, String IMEI,String name) {
        super(batteryLife, color, material, IMEI, name);
    }
}

