package com.vehicle;

import java.util.Random;
import java.util.UUID;

public class PassportNumber {
    private SerialNumber serialNumber;
    private String number = "000000";

    public PassportNumber(SerialNumber serialNumber, String number) {
        this.serialNumber = serialNumber;
        this.number = number;
    }

    public SerialNumber getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(SerialNumber serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    //AN,PL,AM,PM
    public String generatePassportNumber(){
        Random random = new Random();
        int max = SerialNumber.values().length;
        int min = 0;
        int serialNumberRandomValue = (int) ((Math.random() * (max - min)) + min);
        String uniqueValue = number += 1;
        String uniqueNumber = String.valueOf(SerialNumber.values()[serialNumberRandomValue]);
        return uniqueNumber;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int max = SerialNumber.values().length;
        int min = 1;
        int serialNumberRandomValue = (int) ((Math.random() * (max - min)) + min);

        int len =6;
        Random rnd = new Random();
        String uuid = UUID.randomUUID().toString();

        // this will convert any number sequence into 6 character.
        System.out.println(uuid);

        System.out.println(serialNumberRandomValue);
        System.out.println(max);
        System.out.println(SerialNumber.values()[serialNumberRandomValue]);

    }


}
