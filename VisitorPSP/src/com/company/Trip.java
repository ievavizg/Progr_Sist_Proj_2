package com.company;

public abstract class Trip {

    public int km;

    public Trip(int kilometers){
        km = kilometers;
    }

    public double acceptVisitor(Visitor visitor){
        return 0.0;
    }
}
