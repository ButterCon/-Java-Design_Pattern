package com.maizer2.Structural_Pattern.Composite.Prac03;

import java.util.*;

public class Disk {

    public List<Disk_part> disks = new ArrayList<Disk_part>();
    public String name = "디스크";

    public void addDisk(Disk_part disk) {
        disks.add(disk);
    }

    public void show() {
        for(Disk_part part : this.disks) {
            System.out.println(part.name());
        }
    }
}
