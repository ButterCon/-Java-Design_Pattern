package com.maizer2.Creational_Pattern.Factory.Prac03;

import com.maizer2.Creational_Pattern.Factory.Prac02.Korean;

public class Hello {

    private Korean korean ;

    public Hello(Korean korean) {
        this.korean = korean;
    }

    public String greeting() {
        //return "안녕하세요";
        return korean.text();
    }
}
