package com.maizer2.Creational_Pattern.FactoryMethod.Prac04;


import com.maizer2.Creational_Pattern.FactoryMethod.Prac04.Prod.Product;

abstract public class Factory {

    public final Product create(String model) {

        return this.createProduct(model);

    }

    abstract public Product createProduct(String model);
}
