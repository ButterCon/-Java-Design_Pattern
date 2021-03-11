package com.maizer2.Creational_Pattern.Prototype.Prac02;


public class Hello implements Cloneable{
    private String message;

    public Hello(String message) {
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
