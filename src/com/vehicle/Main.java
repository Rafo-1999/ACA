package com.vehicle;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setAirPressure(4.7);
        car.setNumberPlate(77977);
        car.setMaxSpeed(250);
        car.setMark("Lexus");
        Action.addLandVehicle(car);
    }
}
