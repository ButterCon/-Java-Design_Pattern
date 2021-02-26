package com.butter_con.Builder;


import com.butter_con.Builder.product.Computer;

public class Index {
    public void run() {
        ProductModel algorism = new ProductModel();

        Factory factory = new Factory();
        factory.setAlgorism(algorism);

        Computer computer = factory.build().getInstance();
    }
}
