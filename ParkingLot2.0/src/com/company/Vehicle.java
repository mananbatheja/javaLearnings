package com.company;

import java.util.Scanner;

public class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    private String vehicleColour;
    private String vehicleModel;

    Scanner scanner = new Scanner(System.in);

    Vehicle(){
        this.setVehicleNumber();
        this.setVehicleType();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber() {
        System.out.println("Vehicle Number: ");
        String vehicleNumber = scanner.nextLine();
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType() {
        System.out.println("Vehicle Type: " + "\n" + "Two Wheeler - 0" + "\n" + "Small Car - 1" + "\n" + "Large Car - 2");

        String vehicleCode = scanner.nextLine();

        switch (vehicleCode){
            case "0" : this.vehicleType = "twoWheeler"; break;
            case "1" : this.vehicleType = "smallCar"; break;
            case "2" : this.vehicleType = "largeCar"; break;
            default : System.out.println("Invalid Input! try again."); setVehicleType();
        }
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

}
