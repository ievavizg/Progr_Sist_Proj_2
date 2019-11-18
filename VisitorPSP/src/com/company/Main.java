package com.company;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        PriceVisitor priceVisitor = new PriceVisitor();
        BusTrip busTrip = new BusTrip(800);
        PlainTrip plainTrip = new PlainTrip(800);
        System.out.println(busTrip.acceptVisitor(priceVisitor));
        System.out.println(plainTrip.acceptVisitor(priceVisitor));

        SuperPriceVisitor superPriceVisitor = new SuperPriceVisitor();
        System.out.println(busTrip.acceptVisitor(superPriceVisitor));
        System.out.println(plainTrip.acceptVisitor(superPriceVisitor));
    }
}
