package com.butter_con.Singleton.Prac09;

public class Config {
    protected static Config Instance = null;

    protected Config() {}

    @Override
    protected Object Clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
