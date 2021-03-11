package com.maizer2.Structural_Pattern.Bridge.Prac02;


public class Hello {
    public String greeting(String lang) {

        if(lang == "Korean") {
            return "안녕하세요";
        } else {
            return "Hello";
        }

    }
}
