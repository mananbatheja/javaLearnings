package com.company;

import java.util.Scanner;

import static java.lang.System.currentTimeMillis;


public class Ticket {

    private String ticketID;
    private String parkingSlotID = null;
    private String vehicleType;

    private String vehicleType1 = "twoWheeler";
    private String vehicleType2 = "smallCar";
    private String vehicleType3 = "largeCar";

    private Entrance entrance = new Entrance();;

    private long entryTime;
    private long exitTime;

    private long VEHICLE_TYPE1_CHARGES = 20;
    private long VEHICLE_TYPE2_CHARGES = 50;
    private long VEHICLE_TYPE3_CHARGES = 150;

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getEntranceID() {
        return entrance.getEntranceID();
    }

    public Ticket(Vehicle vehicle) {

        this.entryTime = currentTimeMillis();
        this.vehicleType = vehicle.getVehicleType();

        setTicketID(vehicle.getVehicleNumber()+Long.toString(this.entryTime));

        System.out.println("Entrance ID: ");

        Scanner scanner = new Scanner(System.in);
        String entranceID = scanner.nextLine();

        entrance.setEntranceID(entranceID);
    }

    private boolean compatibleSpot (ParkingLot parkingLot, String vehicleType){

        for (ParkingSpot parkingSpot : parkingLot.getParkingSpots(this.entrance.getEntranceID())) {

//            if (!parkingSpot.checkAvailability()) continue;

            if (parkingSpot.checkAvailability() && parkingSpot.getParkingSpotType().equals(vehicleType)) { // &&
                this.parkingSlotID = parkingSpot.getParkingSpotID();
                parkingSpot.parkingSpotOccupied();
                return true;
            }
        }
        return false;
    }

    protected String assignSpot(ParkingLot parkingLot) {

//        for (ParkingSpot parkingSpot : parkingLot.getParkingSpots(this.entrance.getEntranceID())) // should identify using ID rather than the whole object
//            if (parkingSpot.checkAvailability()) {

        if (this.vehicleType.equals(this.vehicleType1)){

            if(compatibleSpot(parkingLot, this.vehicleType1));
            else if(compatibleSpot(parkingLot, this.vehicleType2));
            else if(compatibleSpot(parkingLot, this.vehicleType3));

            return this.parkingSlotID;
        }

        else if (this.vehicleType.equals(this.vehicleType2)){

            if(compatibleSpot(parkingLot, this.vehicleType2));
            else if(compatibleSpot(parkingLot, this.vehicleType3));

            return this.parkingSlotID;
        }

        else if (this.vehicleType.equals(this.vehicleType3)){

            if(compatibleSpot(parkingLot, this.vehicleType3));

            return this.parkingSlotID;
        }

        return null;
    }

    protected void vehicleExits() {

        this.exitTime = currentTimeMillis(); // unit of time = nanoseconds
        long charges = this.vehicleType.equals(this.vehicleType1) ? VEHICLE_TYPE1_CHARGES :
                               this.vehicleType.equals(this.vehicleType2) ? VEHICLE_TYPE2_CHARGES :
                               this.vehicleType.equals(this.vehicleType3) ? VEHICLE_TYPE3_CHARGES :
                               0;

        System.out.println("Payment Method: ");

        Scanner scanner = new Scanner(System.in);
        String paymentMethod = scanner.nextLine();


        if (initialisePayment(paymentMethod, (exitTime-entryTime)*charges)){
            System.out.println("Payment Successful");
            return;
        }
        else {
            System.out.println("Payment Failed! Try again.");
            System.out.println("Payment Method: ");

            paymentMethod = scanner.nextLine();

            initialisePayment(paymentMethod, (exitTime - entryTime) * charges);
        }

    }

    private boolean initialisePayment(String paymentMethod, long payableAmount){
        switch (paymentMethod){
            case "cash" : paymentUsingCash(payableAmount); break;
            case "card" : paymentUsingCard(payableAmount); break;
            default : return false;
        }
        return true;
    }

    private void paymentUsingCard(long payableAmount) {
        System.out.println("Paid : ₹" + payableAmount/1000);
    }

    private void paymentUsingCash(long payableAmount) {
        System.out.println("Paid : ₹" + payableAmount/1000);
    }
}
