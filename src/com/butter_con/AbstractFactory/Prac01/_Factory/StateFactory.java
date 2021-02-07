package com.butter_con.AbstractFactory.Prac01._Factory;

public class StateFactory extends Factory {

    public StateFactory() {}

    public StateTireProduct CreateTire() {
        return new StateTireProduct();
    }

    public StateDoorProduct CreateDoor() {
        return new StateDoorProduct();
    }
}
