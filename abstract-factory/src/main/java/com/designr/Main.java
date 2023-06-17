package com.designr;

import com.designr.furniture.FurnitureFactory;
import com.designr.furniture.ModernFurnitureFactory;
import com.designr.furniture.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args){
        ExposedFactory factory = configureFactory();
        factory.getAllDesc();
    }

    static ExposedFactory configureFactory(){
        ExposedFactory factory;
        FurnitureFactory furnitureFactory;
        String furnitureType = "Victorian";
        if(furnitureType.contains("Victorian")){
            furnitureFactory = new VictorianFurnitureFactory();
        }else{
            furnitureFactory = new ModernFurnitureFactory();
        }
        factory = new ExposedFactory(furnitureFactory);
        return factory;
    }

}
