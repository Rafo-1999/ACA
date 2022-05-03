package com.vehicle;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Car bmw = new Car();
        bmw.setBrand("bmw");
        bmw.setWheelCount(4);
        bmw.setMark("i750");
        bmw.setMaxSpeed(370);
        bmw.setMaxWeight(1245.7);
        bmw.setEnginePower(400);

        Car audi = new Car();
        audi.setBrand("Audi");
        audi.setWheelCount(4);
        audi.setMark("R8");
        audi.setMaxSpeed(300);
        audi.setMaxWeight(1545.7);
        audi.setEnginePower(280);

        CarService carService = new CarService();
        carService.addCar(bmw);
        carService.addCar(audi);

        carService.printAll();

        carService.removeCar(bmw);
        carService.printAll();

    }
}