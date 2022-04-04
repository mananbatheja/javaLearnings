package com.company;

import java.util.*;

public class ParkingSlot {
    String parkingSlotID;
    Map<String, Double> entrySlotDistance = HashMap<>();
    // (entrance: "entrance1", meters: xyz)


    public String getParkingSlotID() {
        return parkingSlotID;
    }

    public void setParkingSlotID(String parkingSlotID) {
        this.parkingSlotID = parkingSlotID;
    }

    public Map<String, Double> getEntrySlotDistance() {
        return entrySlotDistance;
    }

    public void setEntrySlotDistance(Map<String, Double> entrySlotDistance) {
        this.entrySlotDistance = entrySlotDistance;
    }
}
