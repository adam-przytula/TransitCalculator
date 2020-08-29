package com.company;
public class Main {

    public static void main(String[] args) {
        TransitCalculator transitCalculator1 = new TransitCalculator(19,20, 53, true);
        TransitCalculator transitCalculator2 = new TransitCalculator(26,54, 68, false);
        TransitCalculator transitCalculator3 = new TransitCalculator(5,12, 85, true);
        TransitCalculator transitCalculator4 = new TransitCalculator(7,62, 33, false);



        System.out.println(transitCalculator1.getBestFare());
        System.out.println(transitCalculator2.getBestFare());
        System.out.println(transitCalculator3.getBestFare());
        System.out.println(transitCalculator4.getBestFare());
    }
}
