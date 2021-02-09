package com.butter_con.AbstractFactory._Factory;

import com.butter_con.AbstractFactory._Product.*;


abstract public class Factory {

    abstract public TireProduct CreateTire();

    abstract public DoorProduct CreateDoor();

}
