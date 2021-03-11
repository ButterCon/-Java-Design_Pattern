package com.maizer2.Creational_Pattern.Singleton.Prac08;

public class Config {
    protected static Config Instance = null;

    protected Config() {}

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static Config getInstance(){
        if(Instance == null) {
            Instance = new Config();
        }
        return Instance;
    }
}
