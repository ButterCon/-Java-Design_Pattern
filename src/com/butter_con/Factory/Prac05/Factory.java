package com.butter_con.Factory.Prac05;

import com.butter_con.Factory.Prac02.Korean;

public class Factory {

    static public Object getInstance(String type) {
        System.out.println("팩토리:객체를 생성하여 반환합니다.");

        if(type == "ko") {
            return new Korean();
        }
        else if(type == "en") {
            return new English();
        }
        return null;
    }
}
