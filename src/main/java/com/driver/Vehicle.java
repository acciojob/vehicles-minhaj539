package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle() {
            setName(name);
            setCurrentSpeed(0);
           setCurrentDirection(0);
    }

    public void steer(int direction){
        this.currentDirection=direction;
        System.out.println("steer method called - The direction is changed to: " + this.currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        this.currentSpeed=speed;
        this.currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + this.currentSpeed + ", and the direction is changed to: " + this.currentDirection + " degrees");
    }

    public void stop(){
       this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
