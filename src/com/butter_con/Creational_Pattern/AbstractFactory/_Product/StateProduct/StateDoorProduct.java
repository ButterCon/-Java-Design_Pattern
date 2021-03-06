package com.butter_con.Creational_Pattern.AbstractFactory._Product.StateProduct;

import com.butter_con.Creational_Pattern.AbstractFactory._Product.DoorProduct;


public class StateDoorProduct extends DoorProduct {

    public void StateDoorProduct() {}

    public void MakeAssemble() {
        System.out.println("미국형 도어 장착");
    }
}
