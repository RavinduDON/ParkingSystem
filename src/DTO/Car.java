package DTO;

import java.util.Date;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String color;

    public Car() {
    }

    public Car(String id, String type, String brand, String entryTime, String date, int numberOfDoors, String color) {
        super(id, type, brand, entryTime, date);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
