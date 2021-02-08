package com.butter_con.AbstractFactory.Prac01._Factory;

import com.butter_con.AbstractFactory.Prac01._Product.StateProduct.*;


public class StateFactory extends Factory {

    private static StateFactory stateFactory = null;

    private StateFactory() {}

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static StateFactory getInstance() {
        if (stateFactory == null) {
            stateFactory = new StateFactory();
        }
        return stateFactory;
    }

    public StateTireProduct CreateTire() {
        return new StateTireProduct();
    }

    public StateDoorProduct CreateDoor() {
        return new StateDoorProduct();
    }
}
