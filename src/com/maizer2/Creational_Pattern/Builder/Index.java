package com.maizer2.Creational_Pattern.Builder;


import com.maizer2.Creational_Pattern.Builder._algorism.ProductModel;
import com.maizer2.Creational_Pattern.Builder._builder.Factory;
import com.maizer2.Creational_Pattern.Builder.product.Computer;

public class Index {
    public void run() {
        ProductModel algorism = new ProductModel();

        Factory factory = new Factory();
        factory.setAlgorism(algorism);

        Computer computer = factory.build().getInstance();

        System.out.println(computer.toString());
    }
}
