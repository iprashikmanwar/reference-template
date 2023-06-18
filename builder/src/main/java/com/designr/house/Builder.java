package com.designr.house;

import com.designr.constant.RoofType;
import com.designr.constant.WallType;

public interface Builder {
    void buildWalls(WallType wallType);
    void buildDoors(int door);
    void buildRoof(RoofType roofType);
    void buildGarage(boolean garageAvailable);
}
