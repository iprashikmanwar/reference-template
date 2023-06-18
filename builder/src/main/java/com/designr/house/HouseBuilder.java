package com.designr.house;

import com.designr.component.House;
import com.designr.constant.RoofType;
import com.designr.constant.WallType;

public class HouseBuilder implements Builder {
    private WallType wallType;
    private int door;
    private RoofType roofType;
    private boolean garageAvailable;
    @Override
    public void buildWalls(WallType wallType) {
        this.wallType = wallType;
    }

    @Override
    public void buildDoors(int door) {
        this.door = door;
    }

    @Override
    public void buildRoof(RoofType roofType) {
        this.roofType = roofType;
    }

    @Override
    public void buildGarage(boolean garageAvailable) {
        this.garageAvailable = garageAvailable;
    }

    public House getResult(){
        return new House(wallType, door, roofType, garageAvailable);
    }
}
