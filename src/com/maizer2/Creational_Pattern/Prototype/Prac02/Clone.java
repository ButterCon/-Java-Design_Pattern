package com.maizer2.Creational_Pattern.Prototype.Prac02;


public class Clone {

    Hello obj = new Hello("안녕");

    public void Original_Object() {
        System.out.println(obj.getMessage());
    }

    public String Deep_Copy_Object() throws CloneNotSupportedException {
        Hello obj2 = (Hello) obj.clone();

        obj2.setMessage("수정된 안녕");

        return obj2.getMessage();
    }
}