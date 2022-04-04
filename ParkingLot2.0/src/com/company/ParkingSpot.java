package com.company;

public class ParkingSpot {
    private String parkingSpotID;
    private String parkingSpotType; // smallCar, largeCar, twoWheeler
    private Double distanceFromEntrance;
    private boolean isAvailable = true;

    public void parkingSpotAvailable(){
        this.isAvailable = true;
    }
    public void parkingSpotOccupied(){
        this.isAvailable = false;
    }

    public String getParkingSpotID() {
        return parkingSpotID;
    }

    public void setParkingSpotID(String parkingSpotID) {
        this.parkingSpotID = parkingSpotID;
    }

    public String getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(String parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Double getDistanceFromEntrance() {
        return distanceFromEntrance;
    }

    public void setDistanceFromEntrance(Double distanceFromEntrance) {
        this.distanceFromEntrance = distanceFromEntrance;
    }

    public boolean checkAvailability() {
        return this.isAvailable;
    }
}
