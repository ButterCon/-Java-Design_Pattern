package com.butter_con.Factory.Prac05;

import com.butter_con.Factory.Prac02.Korean;

public class Hello {

    public String greeting(String type) {
        // return "안녕하세요";
        // 새로운 객체를 생성합니다.

        // Korean ko = new Korean;
        // return ko.text();

        Korean ko = (Korean) Factory.getInstance(type);
        return ko.text();
    }
}
