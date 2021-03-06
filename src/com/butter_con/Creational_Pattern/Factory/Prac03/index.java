package com.butter_con.Creational_Pattern.Factory.Prac03;

import com.butter_con.Creational_Pattern.Factory.Prac02.Korean;

public class index {
    Korean korean = new Korean();

    Hello hello = new Hello(korean);

    public String run(){
        return hello.greeting();
    }
}
