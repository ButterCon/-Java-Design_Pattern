package com.butter_con.Builder;


import com.butter_con.Builder._algorism.ProductModel;
import com.butter_con.Builder._builder.Factory;
import com.butter_con.Builder.product.Computer;

public class Index {
    public void run() {
        ProductModel algorism = new ProductModel();

        Factory factory = new Factory();
        factory.setAlgorism(algorism);

        Computer computer = factory.build().getInstance();

        System.out.println(computer.toString());
    }
}
