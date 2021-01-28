package com.butter_con.Factory.Prac05;

public class Factory {
    static final String KOREAN = "ko";
    static final String ENGLISH = "en";

    static public Language getInstance(String type) {
        System.out.println("팩토리:객체를 생성하여 반환합니다.");

        if(type == KOREAN) {
            return new Korean();
        }
        else if(type == ENGLISH) {
            return new English();
        }
        return null;
    }
}
