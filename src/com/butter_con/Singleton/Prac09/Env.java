package com.butter_con.Singleton.Prac09;

import com.butter_con.Singleton.Prac09.Conf.Config;

public class Env extends Config {

    public void setting() {
        System.out.println("hello");
    }

    public static Env getInstance() {
        if (Instance == null) {
            Instance = new Env();
        }
        return (Env) Instance;
    }
}
