package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car() {
    }


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super();
        this.setName(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
        this.currentGear=1;
    }


    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + this.currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        if(newSpeed==0) setCurrentGear(1);
        if(newSpeed>=1&&newSpeed<=50) this.setCurrentGear(1);
        if(newSpeed>=51&&newSpeed<=100) this.setCurrentGear(2);
        if(newSpeed>=101&&newSpeed<=150) this.setCurrentGear(3);
        if(newSpeed>=151&&newSpeed<=200) this.setCurrentGear(4);
        if(newSpeed>=201&&newSpeed<=250) this.setCurrentGear(5);
        if(newSpeed>250) this.setCurrentGear(6);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
