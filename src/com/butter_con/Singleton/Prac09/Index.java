package com.butter_con.Singleton.Prac09;

import com.butter_con.Singleton.Prac09.Config.Config;

public class Index {
    Env env = Env.getInstance();
    //Config config = new Config();

    public void run() {
        //System.out.println(config);
        //System.out.println("env객체 :" + env);
        env.setting();
    }

}
