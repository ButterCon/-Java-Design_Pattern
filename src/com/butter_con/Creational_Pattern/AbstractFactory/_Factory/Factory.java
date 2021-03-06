package com.butter_con.Creational_Pattern.AbstractFactory._Factory;

import com.butter_con.Creational_Pattern.AbstractFactory._Product.*;


abstract public class Factory {

    abstract public TireProduct CreateTire();

    abstract public DoorProduct CreateDoor();

}
