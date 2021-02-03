package com.butter_con.Singleton.Prac09;

public class Index {
    Env env1 = new Env();
    Config config = new Config();
    Env env = Env.getInstance();
    //Config config = new Config();

    public void run() {
        //System.out.println(config);
        System.out.println("env객체 :" + env);
    }

}
