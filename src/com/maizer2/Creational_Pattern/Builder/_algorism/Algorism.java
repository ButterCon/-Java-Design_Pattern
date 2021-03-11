package com.maizer2.Creational_Pattern.Builder._algorism;

import com.maizer2.Creational_Pattern.Builder.product.Computer;


abstract public class Algorism {

    protected Computer Composite;

    abstract public void setCpu(String cpu);
    abstract public void setRam(int[] size);
    abstract public void setStorage(int[] size);

    public void setInstance(Computer Composite) {
        this.Composite = Composite;
    }

    public Computer getInstance() {
        return this.Composite;
    }
}
