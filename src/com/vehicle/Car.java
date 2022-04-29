package com.vehicle;

public class Car extends LandVehicle  {
    private int wheelCount;
    private double airPressure;
    private String numberPlate;

    private String startStop;

    public Car(int maxSpeed, double maxWeight, int enginePower, float engineVolume, String vinCode,
               int sitCount, short yearOfProduction, String brand, String mark, Passport ownerPassportNumber,
               String color, FuelType fuelType, SubType subType, int wheelCount, double airPressure,
               String numberPlate, String startStop) {
        super(maxSpeed, maxWeight, enginePower, engineVolume, vinCode, sitCount, yearOfProduction, brand,
                mark, ownerPassportNumber, color, fuelType, subType);
        this.wheelCount = wheelCount;
        this.airPressure = airPressure;
        this.numberPlate = numberPlate;
        this.startStop = startStop;
    }

    public Car() {
        super();
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


    @Override
    public String toString() {
        return "Car{" +
                "wheelCount=" + wheelCount +
                ", airPressure=" + airPressure +
                ", numberPlate='" + numberPlate + '\'' +
                ", startStop='" + startStop + '\'' +
                ", fuelType=" + fuelType +
                ", subType=" + subType +
                '}';
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

    public String getStartStop(String startStop) {
        return this.startStop;
    }

    public void setStartStop(String startStop) {
        this.startStop = startStop;
    }


}
