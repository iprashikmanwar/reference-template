package com.designr.transport;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("by land via road");
    }
}
