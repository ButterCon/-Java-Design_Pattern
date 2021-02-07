package com.butter_con.AbstractFactory.Prac01._Factory;


public class KoreaFactory extends Factory {

    public KoreaFactory() {}

    public KoreaTireProduct CreateTire() {
        return new KoreaTireProduct();
    }
    public KoreaDoorProduct CreateDoor() {
        return new KoreaDoorProduct();
    }
}
