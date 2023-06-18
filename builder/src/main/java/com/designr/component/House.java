package com.designr.component;

import com.designr.constant.RoofType;
import com.designr.constant.WallType;

public class House {
    private final WallType wallType;
    private final int door;
    private final RoofType roofType;
    private boolean garageAvailable;
    private int dogDoor = 0;

    public House(WallType wallType, int door, RoofType roofType, boolean garageAvailable){
        this.wallType = wallType;
        this.door = door;
        this.roofType = roofType;
        this.garageAvailable = garageAvailable;
    }

    public WallType getWallType() {
        return wallType;
    }

    public int getDoor() {
        return door;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public boolean isGarageAvailable() {
        return garageAvailable;
    }

    public void setGarageAvailable(boolean garageAvailable) {
        this.garageAvailable = garageAvailable;
    }

    public int getDogDoor() {
        return dogDoor;
    }

    public void setDogDoor(int dogDoor) {
        this.dogDoor = dogDoor;
    }
}
