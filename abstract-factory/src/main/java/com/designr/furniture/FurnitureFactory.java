package com.designr.furniture;

import com.designr.product.Chair;
import com.designr.product.CoffeeTable;
import com.designr.product.Sofa;

public interface FurnitureFactory {
    public abstract Chair createChair();
    public abstract CoffeeTable createCoffeeTable();
    public abstract Sofa createSofa();


}
