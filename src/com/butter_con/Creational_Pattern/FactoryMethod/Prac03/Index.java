package com.butter_con.Creational_Pattern.FactoryMethod.Prac03;


public class Index {

    ProductFactory productFactory = ProductFactory.getInstance();

    public void run() {
        LgProduct pro = productFactory.create();

        pro.name();
    }

}
