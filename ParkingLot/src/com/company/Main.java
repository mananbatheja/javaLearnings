package com.company;

import java.util.*;

public class Main {

    public static <ParkingLot> void main(String[] args) { // <ParkingLot> not needed
	// write your code here

        List<String> ParkingSlotType = Arrays.asList("Handicapped", "Small", "Large", "twoWheeler");

        Map<String, Map<String, ParkingSlot>> allSlots = new HashMap<>(); // second map - id, slot object

        //Create Slots

        //Slot structure created

        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType("");
        vehicle.setVehicleNumber("");

        Ticket ticket = parkingLotSystem.assignTicket(vehicle);
        System.out.println("ticket number = " + ticket.getTicketID());

        double cost = parkingLotSystem.payment(ticket);
        System.out.println("cost = " + cost);
    }
}
