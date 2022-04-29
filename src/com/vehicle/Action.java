package com.vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.*;

public interface Action {
//logic

    static void addLandVehicle(LandVehicle landVehicle) {
        Path txtFilePath = Path.of("/home/rafo/IdeaProjects/LandVehicle/src/com/vehicle/vehicle.txt");
        try {
            Files.writeString(txtFilePath,landVehicle.toString()+"\n", APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Write ex");
        }
    }
}
