package com.butter_con.Singleton.Prac05;

public class Config {

    private Config() {
        System.out.println("Config 객체 생성.");
    }

    public static Config getInstance(){
        System.out.println("Config 객체를 생성합니다.");

        return new Config();
    }
}
