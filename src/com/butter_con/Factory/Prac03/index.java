package com.butter_con.Factory.Prac03;

import com.butter_con.Factory.Prac02.Korean;

public class index {
    Korean korean = new Korean();

    Hello hello = new Hello(korean);

    public String run(){
        return hello.greeting();
    }
}
