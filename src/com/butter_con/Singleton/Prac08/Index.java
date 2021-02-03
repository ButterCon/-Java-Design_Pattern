package com.butter_con.Singleton.Prac08;

public class Index {
    Config config = Config.getInstance();

    public void run() {
        System.out.println("Config객체 :" + config);
    }
}
