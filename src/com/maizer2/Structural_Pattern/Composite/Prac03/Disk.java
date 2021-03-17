package com.maizer2.Structural_Pattern.Composite.Prac03;

import java.util.*;

public class Disk {

    public List<Disk> disks = new ArrayList<Disk>();
    public String name = "디스크";

    public void addDisk(Disk disk) {
        disks.add(disk);
    }

    public void show() {
        for(Disk part : this.disks) {
            System.out.println(part.name);
        }
    }
}
