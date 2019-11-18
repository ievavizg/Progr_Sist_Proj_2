package com.company;

public class PriceVisitor implements Visitor{

    @Override
    public Double visitBusTrip(BusTrip busTrip) {
        System.out.println("Trip price with Bus");
        return busTrip.getKm()*0.15;
    }

    @Override
    public Double visitPlainTrip(PlainTrip plainTrip) {
        System.out.println("Trip price with Plain");
        return plainTrip.getKm()*0.30;
    }
}
