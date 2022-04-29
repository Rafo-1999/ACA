package com.vehicle;

public abstract class LandVehicle extends Vehicle  implements LandVehicleService{


        public LandVehicle() {
                super();
        }

        public abstract int wheelCount();
        public abstract double airPressure();

        public LandVehicle(int maxSpeed, double maxWeight, int enginePower, float engineVolume, String vinCode,
                           int sitCount, short yearOfProduction, String brand, String mark, Passport ownerPassportNumber,
                           String color, FuelType fuelType, SubType subType) {
                super(maxSpeed, maxWeight, enginePower, engineVolume, vinCode, sitCount, yearOfProduction, brand, mark,
                        ownerPassportNumber, color, fuelType, subType);
        }



}
