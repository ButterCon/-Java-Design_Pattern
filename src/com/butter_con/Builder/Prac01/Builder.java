package com.butter_con.Builder.Prac01;


abstract public class Builder {

    protected Algorism algorism;

    public Object setAlgorism(Algorism algorism) {
        //빌드할 객체의 알고리즘 객체를 저장합니다.
        System.out.println("빌드 객체를 저장합니다. <= " + algorism.getClass());

        this.algorism = algorism;

        return this;
    }

    public Algorism getInstance() {
        return this.algorism.getInstance();
    }

    //추상 메서드 선언
    abstract public Builder build();
}
