package com.company;

public interface Visitor {
    Double visitBusTrip(BusTrip busTrip);
    Double visitPlainTrip(PlainTrip plainTrip);
}
