package com.butter_con.Builder;


public class Factory extends Builder{

    public Factory() {}

    @Override
    public Builder build() {
        System.out.println("=== 빌드합니다. ===");
        this.algorism.setCpu("i7");
        this.algorism.setRam([8, 8]);
        this.algorism.setStorage([256, 512]);

        return this;
    }
}
