package com.vehicle;

public class Motorcycle extends LandVehicle{
    private int wheelCount;

    private double airPressure;

    private String numberPlate;

    private String  helmet;

    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public int wheelCount() {
        return 0;
    }

    @Override
    public double airPressure() {
        return 0;
    }

    @Override
    public double numberPlate() {
        return 0;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(double airPressure) {
        this.airPressure = airPressure;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wheelCount=" + wheelCount +
                ", airPressure=" + airPressure +
                ", numberPlate=" + numberPlate +
                ", helmet='" + helmet + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxWeight=" + maxWeight +
                ", enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                ", vinCode='" + vinCode + '\'' +
                ", sitCount=" + sitCount +
                ", yearOfProduction=" + yearOfProduction +
                ", brand='" + brand + '\'' +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
