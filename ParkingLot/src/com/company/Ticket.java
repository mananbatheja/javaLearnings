package com.company;

import static java.lang.System.currentTimeMillis;

public class Ticket {
    static double handicappedCharges = 1.00;
    static double twoWheelerCharges = 1.50;
    static double smallCharges = 2.00;
    static double largeCharges = 3.00;

    static double entryTime;
    String ticketID;
    static String parkingSlotType;

    public static double getCharges() {
        switch (parkingSlotType) {
            case "Handicapped":
                return handicappedCharges;
            case "twoWheeler":
                return twoWheelerCharges;
            case "small":
                return smallCharges;
            case "large":
                return largeCharges;
        }
        return 0;
    }

    public static double getTime() {
        return currentTimeMillis() - entryTime;
    }

    public String getTicketID() {
        return ticketID;

    }

    public void setTicketID(Vehicle vehicle) {
        ticketID = vehicle.get + Double.toString(entryTime);
        parkingSlotType = vehicle.vehicleType;
    }

    public void setEntryTime() {
        entryTime = currentTimeMillis();
    }
}
