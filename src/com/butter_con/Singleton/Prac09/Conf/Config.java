package com.butter_con.Singleton.Prac09.Conf;

public class Config {

    protected static Config Instance = null;

    protected Config() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}