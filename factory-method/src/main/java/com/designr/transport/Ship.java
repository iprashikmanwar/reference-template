package com.designr.transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("by water via sea route");
    }
}
