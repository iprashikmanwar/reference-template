package com.designr;

import com.designr.factory.Logistics;
import com.designr.factory.RoadLogistics;
import com.designr.factory.SeaLogistics;
import com.designr.transport.Transport;

public class Main {
    private static Logistics logistics;
    public static void main(String[] args) {
        getDeliveryPartner("Road");
        infoDelivery();
    }

    static void getDeliveryPartner(String partner){
        switch (partner){
            case "Sea":
                logistics = new SeaLogistics(); break;
            default:
                logistics = new RoadLogistics(); break;
        }
    }

    static void infoDelivery(){
        logistics.createTransport().deliver();
    }
}