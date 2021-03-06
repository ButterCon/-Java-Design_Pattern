package com.butter_con.Creational_Pattern.Factory.Prac04;

import com.butter_con.Creational_Pattern.Factory.Prac02.Korean;

public class Factory {

    static public Korean getInstance() {

        System.out.println("팩토리:객체를 생성하여 반환합니다.");

        return new Korean();
    }
}
