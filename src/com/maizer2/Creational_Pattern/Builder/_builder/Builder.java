package com.maizer2.Creational_Pattern.Builder._builder;


import com.maizer2.Creational_Pattern.Builder._algorism.Algorism;

abstract public class Builder {

    protected Algorism algorism;

    public void setAlgorism(Algorism algorism) {
        //빌드할 객체의 알고리즘 객체를 저장합니다.
        System.out.println("빌드 객체를 저장합니다. <= " + algorism.getClass());

        this.algorism = algorism;
    }

    public Algorism getInstance() {
        return this.algorism;
    }

    //추상 메서드 선언
    abstract public Algorism build();
}
