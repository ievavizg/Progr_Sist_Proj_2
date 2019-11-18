package com.company;

public class BusTrip extends Trip{

    public BusTrip(int kilometers){
        super(kilometers);
    }

    public int getKm() {
        return km;
    }

    @Override
    public double acceptVisitor(Visitor visitor) {
        return visitor.visitBusTrip(this);
    }
}
