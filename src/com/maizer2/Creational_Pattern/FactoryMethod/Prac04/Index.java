package com.maizer2.Creational_Pattern.FactoryMethod.Prac04;


import com.maizer2.Creational_Pattern.FactoryMethod.Prac04.Prod.Product;

public class Index {

    ProductFactory fac = ProductFactory.getInstance();
    //Product pro = fac.createProduct("LG");
    Product pro = fac.createProduct("SAMSUNG");
    public void run() {
        pro.name();
    }
}
