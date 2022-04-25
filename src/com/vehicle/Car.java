package com.vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Car extends LandVehicle  {
    private int wheelCount;
    private double airPressure;
    private double numberPlate;


    @Override
    public int wheelCount() {
        return wheelCount;
    }

    @Override
    public double airPressure() {
        return airPressure;
    }

    @Override
    public double numberPlate() {
        return numberPlate;
    }






    @Override
    public String toString() {
        return "wheelCount=%d, airPressure=%s, numberPlate=%s, maxSpeed=%d, maxWeight=%s, enginePower=%d, engineVolume=%s, vinCode='%s', sitCount=%d, yearOfProduction=%s, brand='%s', mark='%s', color='%s".formatted(wheelCount, airPressure, numberPlate, maxSpeed, maxWeight, enginePower, engineVolume, vinCode, sitCount, yearOfProduction, brand, mark, color);
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

    public double getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(double numberPlate) {
        this.numberPlate = numberPlate;
    }
}
