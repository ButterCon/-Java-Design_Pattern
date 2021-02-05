package com.butter_con.FactoryMethod.Prac02;

public class Index {
    Factory fac = new Factory();

    LgProduct pro = fac.create();

    public void run() {
        pro.name();
    }
}
