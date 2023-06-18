package com.designr;

import com.designr.constant.RoofType;
import com.designr.constant.WallType;
import com.designr.house.Builder;

public class Director {
    public void constructTypeA(Builder builder){
        builder.buildWalls(WallType.WALL_TYPE_A);
        builder.buildDoors(2);
        builder.buildRoof(RoofType.ROOF_TYPE_A);
        builder.buildGarage(false);
    }

    public void constructTypeB(Builder builder){
        builder.buildWalls(WallType.WALL_TYPE_B);
        builder.buildDoors(4);
        builder.buildRoof(RoofType.ROOF_TYPE_B);
        builder.buildGarage(true);
    }

    public void constructTypeC(Builder builder){
        builder.buildWalls(WallType.WALL_TYPE_C);
        builder.buildDoors(4);
        builder.buildRoof(RoofType.ROOF_TYPE_C);
        builder.buildGarage(false);
    }



}
