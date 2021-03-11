package com.maizer2.Creational_Pattern.Singleton.Prac06;

public class Config {

    private static Config config = null;

    private Config() {}

    public static Config getInstance() {
        if(config == null) {
            System.out.println("새로운 객체를 생성합니다.");
            config = new Config();
        }
        System.out.println("객체를 반환합니다.");
        return config;
    }
}
