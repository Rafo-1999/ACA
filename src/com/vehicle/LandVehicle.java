package com.vehicle;

public abstract class LandVehicle extends Vehicle  implements LandVehicleService{


        public abstract int wheelCount();
        public abstract double airPressure();

        public LandVehicle(String brand) {
                super(brand);
        }
}
