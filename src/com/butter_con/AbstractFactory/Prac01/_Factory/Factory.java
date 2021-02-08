package com.butter_con.AbstractFactory.Prac01._Factory;


import com.butter_con.AbstractFactory.Prac01._Product.*;

abstract public class Factory {

    abstract public TireProduct CreateTire();

    abstract public DoorProduct CreateDoor();

}
