package com.designr.factory;

import com.designr.transport.Ship;
import com.designr.transport.Transport;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
