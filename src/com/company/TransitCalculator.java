package com.company;


public class TransitCalculator {
    int numberOfDays;
    int expectedNumberOfRides;
    String ticketName[] = {"Pay-per-ride","7-day Unlimited Rides", "30-day Unlimited Rides"};
    double ticketCost[] = {2.75,33,127};




    public TransitCalculator(int numberOfDays, int expectedNumberOfRides) {
        this.numberOfDays = numberOfDays;
        this.expectedNumberOfRides = expectedNumberOfRides;
    }

    public double unlimited7Price(){
        double totalCost;
       /* if(numberOfDays%7!=0){
            totalCost=(numberOfDays/7+1)*ticketCost[1];
        } else {
            totalCost=numberOfDays/7*ticketCost[1];
        }
        */
        totalCost = Math.ceil((double)numberOfDays/7)*ticketCost[1];
        return totalCost/expectedNumberOfRides;
    }

    public double[] getRidePrices(){
        double unlimited7PerRide, unlimited30PerRide;

        unlimited30PerRide = Math.ceil((double)numberOfDays/30)*ticketCost[2]/expectedNumberOfRides;
        unlimited7PerRide = unlimited7Price();

        double perRideEachOption[] = {ticketCost[0],unlimited7PerRide,unlimited30PerRide};
        return perRideEachOption;
    }

    String getBestFare(){
        double ridePrices[] = getRidePrices();
        double bestPrice = ridePrices[0];
        int currentIndex = 0;
        int lowestFareIndex = 0;
        for (double ridePrice : ridePrices) {
            if(bestPrice > ridePrice){
                bestPrice = ridePrice;
                lowestFareIndex = currentIndex;
            }
            currentIndex++;
        }
        return "You should get the "+ticketName[lowestFareIndex]+" option at $"+Math.round(ridePrices[lowestFareIndex]*100.0)/100.0+" per ride.";
    }
}
