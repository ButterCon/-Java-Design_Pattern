package com.butter_con.Factory.Prac03;

import com.butter_con.Factory.Prac02.Korean;

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
