package com.maizer2.Creational_Pattern.Factory.Prac04;

import com.maizer2.Creational_Pattern.Factory.Prac02.Korean;

public class Hello {
    public String greeting() {
        // return "안녕하세요";
        // 새로운 객체를 생성합니다.

        // Korean ko = new Korean;
        // return ko.text();

        Korean ko = Factory.getInstance();
        return ko.text();
    }
}
