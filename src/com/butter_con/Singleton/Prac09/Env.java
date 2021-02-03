package com.butter_con.Singleton.Prac09;

public class Env extends Config{
    private Env() {}

    public static Env getInstance() {
        if (Instance == null) {
            Instance = new Env();
        }
        return (Env) Instance;
    }
}
