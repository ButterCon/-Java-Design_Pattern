package com.butter_con.Creational_Pattern.Builder;


import com.butter_con.Creational_Pattern.Builder._algorism.ProductModel;
import com.butter_con.Creational_Pattern.Builder._builder.Factory;
import com.butter_con.Creational_Pattern.Builder.product.Computer;

public class Index {
    public void run() {
        ProductModel algorism = new ProductModel();

        Factory factory = new Factory();
        factory.setAlgorism(algorism);

        Computer computer = factory.build().getInstance();

        System.out.println(computer.toString());
    }
}
