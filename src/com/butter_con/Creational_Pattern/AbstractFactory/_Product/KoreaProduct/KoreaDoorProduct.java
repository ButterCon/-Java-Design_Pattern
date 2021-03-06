package com.butter_con.Creational_Pattern.AbstractFactory._Product.KoreaProduct;

import com.butter_con.Creational_Pattern.AbstractFactory._Product.DoorProduct;


public class KoreaDoorProduct extends DoorProduct {

    public void KoreaDoorProduct() {}

    public void MakeAssemble() {
        System.out.println("한국형 도어 장착");
    }
}
