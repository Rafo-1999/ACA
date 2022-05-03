//package com.vehicle;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Scanner;
//
//import static java.nio.file.StandardOpenOption.APPEND;
//
//public class LandVehicleService {
//
//        private void addLandVehicle()throws IOException {
//            System.out.println("Input Land Vehicle");
//            Scanner sc = new Scanner(System.in);
//            String vehicle = sc.nextLine();
//
//            LandVehicle landVehicle= new LandVehicle() {
//                @Override
//                public int wheelCount() {
//                    return 0;
//                }
//
//                @Override
//                public double airPressure() {
//                    return 0;
//                }
//
//                @Override
//                public String numberPlate() {
//                    return null;
//                }
//            };
//            Path landPath = Path.of("/home/rafo/IdeaProjects/LandVehicle/src/com/vehicle/LandVehicleFile");
//            try {
//                Files.writeString(landPath,landVehicle.toString()+"\n",APPEND);
//            }
//            catch (IOException e){
//                throw new RuntimeException("error");
//            }
//        }
//}
////add landvehicle
//
////remove ,,