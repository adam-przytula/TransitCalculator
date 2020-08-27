package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        TransitCalculator transitCalculator1 = new TransitCalculator(19,20);
        TransitCalculator transitCalculator2 = new TransitCalculator(22,50);
        TransitCalculator transitCalculator3 = new TransitCalculator(6,14);

        System.out.println(transitCalculator1.unlimited7Price());
        System.out.println(transitCalculator2.unlimited7Price()+ "\n"+ transitCalculator3.unlimited7Price());
    }
}
