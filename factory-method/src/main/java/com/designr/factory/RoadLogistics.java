package com.designr.factory;

import com.designr.transport.Transport;
import com.designr.transport.Truck;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
