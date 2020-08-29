package com.company;


public class TransitCalculator {
    int numberOfDays;
    int expectedNumberOfRides;
    int age;
    boolean disabilities = false;
    String ticketName[] = {"Pay-per-ride", "7-day Unlimited Rides", "30-day Unlimited Rides"};
    double ticketCost[] = {2.75, 33, 127};
    double ticketReducedCost[] = {1.35, 16.50, 63.50};


    public TransitCalculator(int numberOfDays, int expectedNumberOfRides, int age, boolean disabilities) {
        this.numberOfDays = numberOfDays;
        this.expectedNumberOfRides = expectedNumberOfRides;
        this.age = age;
        this.disabilities = disabilities;
    }

    public double[] getRidePrices(){
        double unlimited7PerRide, unlimited30PerRide;
        double [] perRideEachOption;
        if(age < 65 && disabilities == false) {
            unlimited30PerRide = Math.ceil((double) numberOfDays / 30) * ticketCost[2] / expectedNumberOfRides;
            unlimited7PerRide = Math.ceil((double) numberOfDays / 7) * ticketCost[1] / expectedNumberOfRides;
            perRideEachOption = new double[]{ticketCost[0], unlimited7PerRide, unlimited30PerRide};
        } else{
            unlimited30PerRide = Math.ceil((double) numberOfDays / 30) * ticketReducedCost[2] / expectedNumberOfRides;
            unlimited7PerRide = Math.ceil((double) numberOfDays / 7) * ticketReducedCost[1] / expectedNumberOfRides;
            perRideEachOption = new double[]{ticketReducedCost[0], unlimited7PerRide, unlimited30PerRide};
        }
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
