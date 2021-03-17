package com.maizer2.Structural_Pattern.Composite;


import com.maizer2.Structural_Pattern.Composite.Prac03.*;

public class Index {

    public void run() {

        Computer obj = new Computer();

        obj.setMonitor(new Monitor());
        obj.setDisk(new Disk());
        obj.setMemory(new Memory());

        obj.monitor.addMonitor(new Monitor32());
        System.out.println(obj.name);
        System.out.println(obj.monitor.name);
    }
}
