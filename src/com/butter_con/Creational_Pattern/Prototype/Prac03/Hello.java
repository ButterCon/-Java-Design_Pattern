package com.butter_con.Creational_Pattern.Prototype.Prac03;


public class Hello implements Cloneable{
    private String message;

    public Hello(String message) {
        System.out.println(this + "를 생성합니다.");
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
