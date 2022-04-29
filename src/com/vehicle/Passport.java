package com.vehicle;

import java.util.Date;

public class Passport {

    private String passportNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String countryCode;
    private Date dateOfBirth;
    private Date dateOfIssue;
    private Date dateOfExpiry;
    private String nationality;
    private String placeOfBirth;
    private String registrationAddress;
    public Gender gender;

    public Passport(String passportNumber, String firstName, String lastName,String middleName, String countryCode, Date dateOfBirth, Date dateOfIssue, Date dateOfExpiry, String nationality, String placeOfBirth,Gender gender) {
        this.passportNumber = passportNumberGeneration();
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.countryCode = countryCode;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String passportNumberGeneration(){
        return "";
    }

    @Override
    public String toString() {
        return "";
    }


//    for unique
//    private static int globalID = 0;
//    private int ID;
//    public obj()
//    {
//        globalID++;
//        this.ID = globalID;
//    }

}
