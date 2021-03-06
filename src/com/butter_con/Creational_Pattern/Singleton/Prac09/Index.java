package com.butter_con.Creational_Pattern.Singleton.Prac09;

public class Index {
    Env env = Env.getInstance();
    //Config config = new Config();

    public void run() {
        //System.out.println(config);
        //System.out.println("env객체 :" + env);
        env.setting();
    }

}
