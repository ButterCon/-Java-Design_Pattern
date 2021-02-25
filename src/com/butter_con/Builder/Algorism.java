package com.butter_con.Builder;

abstract public class Algorism {

    private Algorism Composite;

    abstract public Algorism setCpu(String cpu);
    abstract public Algorism setRam(int[] size);
    abstract public Algorism setStorage(int[] size);

    public void setInstance(Algorism composite) {
        this.Composite = composite;
    }

    public Algorism getInstance() {
        return this.Composite;
    }
}
