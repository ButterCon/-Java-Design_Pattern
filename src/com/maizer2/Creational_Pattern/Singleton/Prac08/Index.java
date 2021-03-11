package com.maizer2.Creational_Pattern.Singleton.Prac08;

public class Index {
    Config config = Config.getInstance();

    public void run() {
        System.out.println("Config객체 :" + config);
    }
}
