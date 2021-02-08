package com.butter_con.AbstractFactory.Prac01._Product.KoreaProduct;

import com.butter_con.AbstractFactory.Prac01._Product.DoorProduct;

public class KoreaDoorProduct extends DoorProduct {

    public void KoreaDoorProduct() {}

    public void MakeAssemble() {
        System.out.println("한국형 도어 장착");
    }
}
