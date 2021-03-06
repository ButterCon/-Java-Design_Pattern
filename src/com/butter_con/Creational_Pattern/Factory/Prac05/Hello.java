package com.butter_con.Creational_Pattern.Factory.Prac05;

public class Hello {

    public String greeting(String type) {

        Language a = (Language) Factory.getInstance(type);

        return a.text();
    }
}
