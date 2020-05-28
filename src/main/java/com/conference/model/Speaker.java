package com.conference.model;

public class Speaker {
    private String firstName;
    private String lastName;
    private double seedNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSeedNumber() {
        return seedNumber;
    }

    public void setSeedNumber(double seedNumber) {
        this.seedNumber = seedNumber;
    }
}
