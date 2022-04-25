package com.vehicle;

public class Vehicle {
    protected int maxSpeed;
    protected double maxWeight;
    protected int enginePower;
    protected float engineVolume;
    protected String vinCode;
    protected int sitCount;
    protected short yearOfProduction;
    protected String brand;
    protected String mark;
    protected String color;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public int getSitCount() {
        return sitCount;
    }

    public void setSitCount(int sitCount) {
        this.sitCount = sitCount;
    }

    public short getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(short yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}