package DTO;

import java.util.Date;

public abstract class Vehicle {
    private String id;
    private String type;
    private String brand;
    private String entryTime;
    private Date date;

    public Vehicle() {
    }

    public Vehicle(String id, String type, String brand, String entryTime, Date date) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.entryTime = entryTime;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
