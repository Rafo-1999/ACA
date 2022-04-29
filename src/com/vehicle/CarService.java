package com.vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class CarService {
//addCar
    //removeCar
    //printall  petqa tpel bolor carrer y

    public void addCar() throws IOException {
        System.out.println("Input car numberPlate");
        Scanner scanner=new Scanner(System.in);
        String numberPlate =scanner.nextLine();


        Car car = new Car();
     Path addPath=Path.of("/home/rafo/IdeaProjects/LandVehicle/src/com/vehicle/vehicle.txt");
//        FileWriter myWriter = new FileWriter("/home/rafo/IdeaProjects/LandVehicle/src/com/vehicle/vehicle.txt",true);

        try {
          //  myWriter.write(String.valueOf(car));
            Files.writeString(addPath, car.toString()+"\n", APPEND);

        } catch (IOException e) {
            throw new RuntimeException("error");
        }
    }

    public  void removeCar(){
        System.out.println("Delete car model");
        Scanner scanner =new Scanner(System.in);
        String brand = scanner.nextLine();

        Car car = new Car();
    }
}
