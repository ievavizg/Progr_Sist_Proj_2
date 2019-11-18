package com.company;

public class PlainTrip extends Trip{

    public PlainTrip(int kilometers){
        super(kilometers);
    }

    public int getKm() {
        return km;
    }

    @Override
    public double acceptVisitor(Visitor visitor) {
        return visitor.visitPlainTrip(this);
    }
}
