package com.maizer2.Creational_Pattern.AbstractFactory._Product.StateProduct;

import com.maizer2.Creational_Pattern.AbstractFactory._Product.TireProduct;


public class StateTireProduct extends TireProduct {

    public void StateTireProduct() {}

    public void MakeAssemble() {
        System.out.println("미국형 도어 장착");
    }
}
