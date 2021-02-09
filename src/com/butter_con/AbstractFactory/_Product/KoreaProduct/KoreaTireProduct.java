package com.butter_con.AbstractFactory._Product.KoreaProduct;

import com.butter_con.AbstractFactory._Product.TireProduct;


public class KoreaTireProduct extends TireProduct {

    public void KoreaTireProduct() {}

    public void MakeAssemble() {
        System.out.println("한국형 타이어 장착");
    }
}
