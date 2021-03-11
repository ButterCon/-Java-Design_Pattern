package com.maizer2.Creational_Pattern.Factory.Prac03;

import com.maizer2.Creational_Pattern.Factory.Prac02.Korean;

public class index {
    Korean korean = new Korean();

    Hello hello = new Hello(korean);

    public String run(){
        return hello.greeting();
    }
}
