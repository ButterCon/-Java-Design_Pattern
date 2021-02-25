package com.butter_con.Builder;


public class Index {
    public void run() {
        ProductModel algorism = new ProductModel();

        Factory factory = new Factory();
        factory.setAlgorism(algorism);
    }
}
