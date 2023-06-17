package com.designr.furniture;

import com.designr.product.Chair;
import com.designr.product.CoffeeTable;
import com.designr.product.Sofa;
import com.designr.product.VictorianChair;
import com.designr.product.VictorianCoffeeTable;
import com.designr.product.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
