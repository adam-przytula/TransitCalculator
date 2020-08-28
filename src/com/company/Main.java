package com.company;
public class Main {

    public static void main(String[] args) {
        TransitCalculator transitCalculator1 = new TransitCalculator(19,20);
        TransitCalculator transitCalculator2 = new TransitCalculator(26,54);
        TransitCalculator transitCalculator3 = new TransitCalculator(5,12);

        System.out.println(transitCalculator1.unlimited7Price());


        System.out.println(transitCalculator2.getBestFare());
        System.out.println(transitCalculator3.getBestFare());
    }
}
