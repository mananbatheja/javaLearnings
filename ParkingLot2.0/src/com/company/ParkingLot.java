package com.company;

import java.util.*;

public class ParkingLot {

    private int NUMBER_OF_ENTRANCE = 4;
    private int NUMBER_OF_SPOTS = 10;

    private double minDistanceEntranceSpots = 2.00;
    private double maxDistanceEntranceSpots = 10.00;

    private String vehicleType1 = "twoWheeler";
    private String vehicleType2 = "smallCar";
    private String vehicleType3 = "largeCar";

    Map<Entrance, List<ParkingSpot>> parkingLot = new HashMap<Entrance, List<ParkingSpot>>();

    Comparator<ParkingSpot> sortByDistance = new Comparator<ParkingSpot>() {
        @Override
        public int compare(ParkingSpot o1, ParkingSpot o2) {
            return o1.getDistanceFromEntrance() < o2.getDistanceFromEntrance() ? 1 : 0;
        }
    };

    ParkingLot(){ //constructor
        // map, key:entrance & value:List of objects of parking spot then sorted using comparator - nlogn

        for (int i = 1; i <= NUMBER_OF_ENTRANCE; i++){

            List<ParkingSpot> parkingSpots = new ArrayList<>();

            for (int j = 1; j <= NUMBER_OF_SPOTS; j++){

                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setParkingSpotID(Integer.toString(j));
                if(j <= 3)
                    parkingSpot.setParkingSpotType(this.vehicleType1);
                else if(j <= 6)
                    parkingSpot.setParkingSpotType(this.vehicleType2);
                else
                    parkingSpot.setParkingSpotType(this.vehicleType3);

                Random random = new Random();
                double distanceSpotEntrance = minDistanceEntranceSpots + (maxDistanceEntranceSpots - minDistanceEntranceSpots)*random.nextDouble();
                parkingSpot.setDistanceFromEntrance(distanceSpotEntrance);
                //parkingSpot object created and details filled

                parkingSpots.add(parkingSpot); // added to the list
            }

            Collections.sort(parkingSpots, sortByDistance);

            Entrance entrance = new Entrance();
            entrance.setEntranceID(Integer.toString(i));

            parkingLot.put(entrance, parkingSpots);
        }
    }

    public List<ParkingSpot> getParkingSpots(String entranceID){

        Set<Entrance> entranceSet = this.parkingLot.keySet();

        for (Entrance entrance: entranceSet){
            if(entrance.getEntranceID().equals(entranceID))
                return this.parkingLot.get(entrance);
        }
        return null;

    }

}


//     - try with TreeMap & comparator
//     - try with PriorityQueue & comparator

//map, key:entrance & value:(map, key:spotID & value:object of parking spot) - Treemap sorted by values using comparator