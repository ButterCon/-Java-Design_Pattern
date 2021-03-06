package com.butter_con.Creational_Pattern.FactoryMethod.Prac03;

abstract public class Factory {

    public final LgProduct create() {

        return this.createProduct();
    }

    abstract public LgProduct createProduct();
}
