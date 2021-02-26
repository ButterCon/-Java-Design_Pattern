package com.butter_con.Builder;


import com.butter_con.Builder.product.*;

public class ProductModel extends Algorism{

    public ProductModel() {
        this.Composite = new Computer();
    }

    @Override
    public void setCpu(String cpu) {
        System.out.println("CPU를 설정합니다.");
        this.Composite._cpu = cpu;
    }

    @Override
    public void setRam(int[] size) {
        System.out.println("RAM을 설정합니다.");
        for(int mem : size) {
            System.out.println("슬롯 " + mem + "GB 장착");
            Composite._ram = new Memory[mem];
        }
    }

    @Override
    public void setStorage(int[] size) {
        return null;
    }
}
