package com.maizer2.Creational_Pattern.AbstractFactory._Product.StateProduct;

import com.maizer2.Creational_Pattern.AbstractFactory._Product.DoorProduct;


public class StateDoorProduct extends DoorProduct {

    public void StateDoorProduct() {}

    public void MakeAssemble() {
        System.out.println("미국형 도어 장착");
    }
}
