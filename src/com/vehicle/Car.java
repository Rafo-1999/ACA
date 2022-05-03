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
    public String numberPlate() {
        return null;
    }


    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + super.getMaxSpeed() +
                ", maxWeight=" + super.getMaxWeight() +
                ", enginePower=" + super.getEnginePower() +
                ", engineVolume=" + super.getEngineVolume() +
                ", vinCode='" + super.getVinCode() + '\'' +
                ", sitCount=" + super.getSitCount() +
                ", yearOfProduction=" + super.getYearOfProduction() +
                ", brand='" + super.getBrand() + '\'' +
                ", mark='" + super.getMark() + '\'' +
                //  ", ownerPassportNumber=" + super.getOwnerPassportNumber().toString() +
                ", color='" + super.getColor() + '\'' +
                ", wheelCount=" + wheelCount +
                ", airPressure=" + airPressure +
                ", numberPlate='" + numberPlate + '\'' +
                ", startStop='" + startStop + '\'' +
                '}';
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public String setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
        return null;
    }

    public double getAirPressure() {
        return airPressure;
    }

    public String setAirPressure(double airPressure) {
        this.airPressure = airPressure;
        return null;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
        return numberPlate;
    }

    public String getStartStop(String startStop) {
        return this.startStop;
    }

    public void setStartStop(String startStop) {
        this.startStop = startStop;
    }


}
