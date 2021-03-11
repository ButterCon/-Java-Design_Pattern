package com.maizer2.Structural_Pattern.Composite;


import com.maizer2.Structural_Pattern.Composite.Prac01.*;

public class Index {

    public void run() {

        Computer obj = new Computer();
        obj.setMonitor(new Monitor());

        System.out.println(obj.name);
        System.out.println(obj.monitor.name);
    }
}
