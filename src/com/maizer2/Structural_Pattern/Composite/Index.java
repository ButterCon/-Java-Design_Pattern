package com.maizer2.Structural_Pattern.Composite;


import com.maizer2.Structural_Pattern.Composite.Prac03.*;

public class Index {

    public void run() {

        Computer obj = new Computer();

        obj.setMonitor(new Monitor());
        obj.setDisk(new Disk());
        obj.setMemory(new Memory());

        obj.monitor.addMonitor(new Monitor32());
        obj.monitor.addMonitor(new Monitor32());

        obj.disk.addDisk(new Disk256());
        obj.disk.addDisk(new Disk512());

        obj.memory.addMemory(new Memory8());
        obj.memory.addMemory(new Memory8());

        obj.monitor.show();
        obj.disk.show();
        obj.memory.show();
    }
}
