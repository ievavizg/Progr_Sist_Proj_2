package com.company;

public class SuperPriceVisitor implements Visitor{

    @Override
    public Double visitBusTrip(BusTrip busTrip) {
        System.out.println("Super Trip price with Bus");
        return (busTrip.getKm()*0.15)-(busTrip.getKm()*0.15)*0.4;
    }

    @Override
    public Double visitPlainTrip(PlainTrip plainTrip) {
        System.out.println("Super Trip price with Plain");
        return (plainTrip.getKm()*0.30)-(plainTrip.getKm()*0.30)*0.2;
    }
}