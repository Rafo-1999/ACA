package com.vehicle;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class CarService {


    private static final String CAR_FILE_PATH = "CarFile";
    public void addCar(Car car) throws IOException {

       Path addPath = Path.of(CAR_FILE_PATH);
        try {
            Files.writeString(addPath, car.toString() + "\n", APPEND);

        } catch (IOException e) {
            throw new RuntimeException("error add car" + e.getMessage());
        }
    }




    public void removeCar(Car car)  {
        Path removePath = Path.of(CAR_FILE_PATH);

        try {
            List<String> tmp = Files.readAllLines(removePath);

            Files.delete(removePath);
            Files.createFile(removePath);

            if (tmp.remove(car.toString())) {

                for (String carString : tmp) {
                    Files.writeString(removePath, carString+"\n", APPEND);
                }
            }else {
                System.out.println("Can't remove car. Car not fount");
            }
        } catch (IOException e) {
            throw new RuntimeException("remove error" + e.getMessage());
        }
    }

    public void printAll(){
        Path path = Path.of(CAR_FILE_PATH);

        try {
            String content = Files.readString(path);

            System.out.println();
            System.out.println("-----");
            System.out.println(content);
            System.out.println("----");
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}







