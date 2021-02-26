package com.butter_con.Builder;


public class Factory extends Builder{

    public Factory() {}

    @Override
    public Algorism build() {
        System.out.println("=== 빌드합니다. ===");
        this.algorism.setCpu("i7");
        this.algorism.setRam(new int[]{8, 8});
        this.algorism.setStorage(new int[]{256, 512});

        return this.algorism;
    }
}
