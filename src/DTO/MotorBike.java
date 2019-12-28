package DTO;

import java.util.Date;

public class MotorBike extends Vehicle {
    private float engineCapacity;

    public MotorBike() {
    }

    public MotorBike(String id, String type, String brand, String entryTime, String date, float engineCapacity) {
        super(id, type, brand, entryTime, date);
        this.engineCapacity = engineCapacity;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
