package com.company;

public class TransitCalculator {
    int numberOfDays;
    int expectedNumberOfRides;
    String ticketName[]={"Pay-per-ride","7-day Unlimited Rides", "30-day Unlimited Rides"};
    double ticketCost[]={2.75,33,127};




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
        totalCost=Math.ceil((double)numberOfDays/7)*ticketCost[1];
        return totalCost/expectedNumberOfRides;
    }


}
