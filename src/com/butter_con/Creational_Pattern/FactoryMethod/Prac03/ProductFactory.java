package com.butter_con.Creational_Pattern.FactoryMethod.Prac03;


public class ProductFactory extends Factory {

    private static ProductFactory productFactory = null;

    private ProductFactory() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static ProductFactory getInstance() {
        if (productFactory == null) {
            productFactory = new ProductFactory();
        }
        return productFactory;
    }

    @Override
    public LgProduct createProduct() {
        return new LgProduct();
    }
}
