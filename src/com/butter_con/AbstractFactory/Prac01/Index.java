package com.butter_con.AbstractFactory.Prac01;

import com.butter_con.AbstractFactory.Prac01._Factory.KoreaFactory;
import com.butter_con.AbstractFactory.Prac01._Factory.StateFactory;
import com.butter_con.AbstractFactory.Prac01._Product.KoreaProduct.KoreaTireProduct;

public class Index {

    public void run() {

        //한국 제품 생산
        KoreaFactory koreaFactory = KoreaFactory.getInstance();

        koreaFactory.CreateTire().MakeAssemble();

        koreaFactory.CreateDoor().MakeAssemble();

        System.out.println("");
        //미국 제품 생산
        StateFactory stateFactory = StateFactory.getInstance();

        stateFactory.CreateTire().MakeAssemble();

        stateFactory.CreateDoor().MakeAssemble();
    }
}
