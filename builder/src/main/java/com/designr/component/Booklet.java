package com.designr.component;

import com.designr.constant.RoofType;
import com.designr.constant.WallType;

public class Booklet {
    private final WallType wallType;
    private final int door;
    private final RoofType roofType;
    private boolean garageAvailable;
    private int dogDoor = 0;

    public Booklet(WallType wallType, int door, RoofType roofType, boolean garageAvailable){
        this.wallType = wallType;
        this.door = door;
        this.roofType = roofType;
        this.garageAvailable = garageAvailable;
    }

    public String print(){
        String info = "";
        info += "Type of wall: " + wallType + "\n";
        info += "Count of door: " + door + "\n";
        info += "Type of roof: " + roofType + "\n";
        return info;
    }
}
