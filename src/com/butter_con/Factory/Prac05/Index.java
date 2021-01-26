package com.butter_con.Factory.Prac05;

public class Index {

    Hello hello = new Hello();

    public void run() {
        System.out.println(hello.greeting("en"));
        System.out.println(hello.greeting("ko"));
    }
}
