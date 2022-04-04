package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ParkingLot parkingLot = new ParkingLot(); // Creates a parking lot

        System.out.println("Vehicle incoming?");

        Scanner scanner = new Scanner(System.in);
        String status = scanner.nextLine();

        while(status.equals("yes")){
            //Vehicle enters
            Vehicle vehicle = new Vehicle();

            //Ticket is issued and details recorded
            Ticket ticket = new Ticket(vehicle);

            //Parking spot assigned
            String parkingSpotID = ticket.assignSpot(parkingLot);
            if (parkingSpotID.equals(null)){
                System.out.println("No Spots Available");
                return;
            }

//--------------------------------------EXIT TERMINAL-------------------------------------------------------------------

            //Parking spot made available again
            for (ParkingSpot parkingSpot : parkingLot.getParkingSpots(ticket.getEntranceID())) {
                if (parkingSpotID.equals(parkingSpot.getParkingSpotID()))
                    parkingSpot.parkingSpotAvailable();
            }

            //Leaving time recorded and payment process initialised
            ticket.vehicleExits();

            System.out.println("Vehicle incoming?");
            status = scanner.nextLine();
        }
    }
}
