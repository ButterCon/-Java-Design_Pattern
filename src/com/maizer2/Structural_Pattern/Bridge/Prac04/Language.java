package com.maizer2.Structural_Pattern.Bridge.Prac04;


import com.maizer2.Structural_Pattern.Bridge.Prac04._language.*;

public class Language {

    public English english;
    public Korean korean;

    public void setEnglish(English english) {
        this.english = english;
    }

    public void setKorean(Korean korean) {
        this.korean = korean;
    }
}
