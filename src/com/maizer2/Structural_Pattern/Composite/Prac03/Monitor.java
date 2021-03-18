package com.maizer2.Structural_Pattern.Composite.Prac03;

import java.util.*;

public class Monitor {

    public List<Monitor_part> screen = new ArrayList<Monitor_part>();
    public String name = "모니터";

    public void addMonitor(Monitor_part monitor) {
        screen.add(monitor);
    }

    public void show() {
        for(Monitor_part part : this.screen) {
            System.out.println(part.name());
        }
    }
}
