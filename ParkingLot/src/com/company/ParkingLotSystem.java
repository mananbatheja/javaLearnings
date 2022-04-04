package com.company;

import java.util.Scanner;

public class ParkingLotSystem {

    public Ticket assignTicket(Vehicle vehicle) { //TODO - treeMap

        Ticket ticket = new Ticket();
        ticket.setEntryTime();
        ticket.setTicketID(vehicle);

        return ticket;
    }

    public double payment(Ticket ticket) { //name
        double cost = Ticket.getCharges()*Ticket.getTime();

        System.out.println("Input payment method : ");

        Scanner scanner = new Scanner(System.in);
        String paymentMethod = scanner.nextLine();

        if (paymentMethod.equals("UPI"))
            UPI(cost);
        else if (paymentMethod.equals("Card"))
            card(cost);
        else if (paymentMethod.equals("Cash"))
            cash(cost);

        return cost;
    }


    //name - more description
    public void UPI(double cost){
    }
    // name
    public void card(double cost){
    }
    public void cash(double cost){
    }
}
