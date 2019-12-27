package DTO;

import java.util.Date;

public class Van extends Vehicle {
    private float cargoVol;

    public Van() {
    }

    public Van(String id, String type, String brand, String entryTime, Date date, float cargoVol) {
        super(id, type, brand, entryTime, date);
        this.cargoVol = cargoVol;
    }

    public float getCargoVol() {
        return cargoVol;
    }

    public void setCargoVol(float cargoVol) {
        this.cargoVol = cargoVol;
    }
}
