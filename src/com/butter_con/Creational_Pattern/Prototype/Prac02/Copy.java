package com.butter_con.Creational_Pattern.Prototype.Prac02;

import com.butter_con.Creational_Pattern.Prototype.Prac01.Hello;


public class Copy {

    Hello obj = new Hello("안녕");

    public void Original_Object() {
        System.out.println(obj.getMessage());
    }

    public void Copy_Object() {
        Hello obj2 = obj;
        obj2.setMessage("Hello World");

        System.out.println("복사된 객체 :" + obj2.getMessage());

        System.out.println("기존의 객체 :" + obj.getMessage());
    }
}
