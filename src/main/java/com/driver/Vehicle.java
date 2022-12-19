package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;
    public Vehicle(String name){
        currentSpeed=0;
        currentDirection=0;
    }
    public void steer(int direction){
        currentDirection+=direction;
        System.out.println("steer method called - The direction is changed to: " + this.currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + this.currentSpeed + ", and the direction is changed to: " + this.currentDirection + " degrees");
    }

    public void stop(){
       this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
