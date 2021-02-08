package com.butter_con.AbstractFactory.Prac01._Factory;

import com.butter_con.AbstractFactory.Prac01._Product.KoreaProduct.*;


public class KoreaFactory extends Factory {

    private static KoreaFactory koreaFactory = null;

    private KoreaFactory() {}

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static KoreaFactory getInstance() {
        if (koreaFactory == null) {
            koreaFactory = new KoreaFactory();
        }
        return koreaFactory;
    }

    public KoreaTireProduct CreateTire() {
        return new KoreaTireProduct();
    }

    public KoreaDoorProduct CreateDoor() {
        return new KoreaDoorProduct();
    }
}
