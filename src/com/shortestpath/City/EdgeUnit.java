package com.shortestpath.City;

public class EdgeUnit {
    public int from_id;
    public int to_id;
    public double weight;

    public EdgeUnit(int from_id,int to_id,double weight) {
        this.from_id=from_id;
        this.to_id=to_id;
        this.weight=weight;
    }
}
