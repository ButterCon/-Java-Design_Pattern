package com.maizer2.Creational_Pattern.Builder._algorism;


import com.maizer2.Creational_Pattern.Builder.product.*;

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
            Composite._ram.add(new Memory(mem));
        }
    }

    @Override
    public void setStorage(int[] size) {
         System.out.println("Storage를 설정합니다.");
         for(int disk : size) {
            System.out.println("슬롯 " + disk + "GB 장착");
            Composite._storage.add(new Storage(disk));
         }
    }
}
