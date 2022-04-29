package com.vehicle;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CarService carService = new CarService();
        carService.addCar();

        LandVehicle landVehicle= new LandVehicle() {
            @Override
            public double numberPlate() {
                return 0;
            }

            @Override
            public int wheelCount() {
                return 0;
            }

            @Override
            public double airPressure() {
                return 0;
            }
        };


//        Motorcycle motorcycle = new Motorcycle();
//        motorcycle.setHelmet("OFF-Road");
//        motorcycle.setNumberPlate("AA977");
//        Action.addLandVehicle(motorcycle);
//

    }
}
