package com.maizer2.Creational_Pattern.Prototype;

import com.maizer2.Creational_Pattern.Prototype.Prac03.*;


public class Index {
    public void run() throws CloneNotSupportedException{

        Hello obj = new Hello("안녕");

        Hello obj2 = (Hello) obj.clone();

        System.out.println(obj2.getMessage());

        obj2.setMessage("수정된 안녕");

        System.out.println(obj2.getMessage());
    }
}
