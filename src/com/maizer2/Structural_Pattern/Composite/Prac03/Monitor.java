package com.maizer2.Structural_Pattern.Composite.Prac03;

import java.util.*;

public class Monitor {

    public List<Monitor> screen = new ArrayList<Monitor>();
    public String name = "모니터";

    public void addMonitor(Monitor monitor) {
        screen.add(monitor);
    }

    public void show() {
        for(Monitor part : this.screen) {
            System.out.println(part.name);
        }
    }
}
