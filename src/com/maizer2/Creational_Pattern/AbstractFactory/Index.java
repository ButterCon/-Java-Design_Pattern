package com.maizer2.Creational_Pattern.AbstractFactory;

import com.maizer2.Creational_Pattern.AbstractFactory._Factory.KoreaFactory;
import com.maizer2.Creational_Pattern.AbstractFactory._Factory.StateFactory;

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
