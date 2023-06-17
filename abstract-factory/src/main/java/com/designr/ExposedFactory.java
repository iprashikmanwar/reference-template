package com.designr;

import com.designr.furniture.FurnitureFactory;
import com.designr.product.Chair;
import com.designr.product.CoffeeTable;
import com.designr.product.Sofa;

public class ExposedFactory {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public ExposedFactory(FurnitureFactory furnitureFactory){
       chair = furnitureFactory.createChair();
       sofa = furnitureFactory.createSofa();
       coffeeTable = furnitureFactory.createCoffeeTable();
    }

    public void getAllDesc(){
        chair.getChairDesc();
        sofa.getSofaDesc();
        coffeeTable.getCoffeeTableDesc();
    }

    public Chair getChair(){
        return chair;
    }

    public Sofa getSofa(){
        return sofa;
    }

    public CoffeeTable getCoffeeTable(){
        return coffeeTable;
    }

}
