package com.butter_con.Creational_Pattern.Factory.Prac01;

import com.butter_con.Creational_Pattern.Factory.Prac02.Korean;

public class Hello {
    public String greeting() {
        //return "안녕하세요";
        Korean $k0 = new Korean();  //의존성 주입
        return $k0.text();
       }

}