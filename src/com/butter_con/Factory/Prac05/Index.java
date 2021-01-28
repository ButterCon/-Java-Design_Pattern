package com.butter_con.Factory.Prac05;

import static com.butter_con.Factory.Prac05.Factory.ENGLISH;
import static com.butter_con.Factory.Prac05.Factory.KOREAN;

public class Index {

    Hello hello = new Hello();

    public void run() {
        System.out.println(hello.greeting(KOREAN));
        System.out.println(hello.greeting(ENGLISH));
    }
}