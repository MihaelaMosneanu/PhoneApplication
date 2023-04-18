package org.example;

abstract class PhoneProperties implements PhoneBehavior {
    private final int batteryLife;
    private String color;
    private String material;
    private String IMEI;

    private String name;



    public PhoneProperties(int batteryLife, String color, String material, String IMEI, String name) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
     this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getBatteryLife(){
        return batteryLife;
    }

    public String getName(){
        return name;
    }
}





