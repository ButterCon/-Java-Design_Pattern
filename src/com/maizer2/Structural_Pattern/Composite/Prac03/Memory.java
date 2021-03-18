package com.maizer2.Structural_Pattern.Composite.Prac03;

import java.util.*;

public class Memory {

    public List<Memory_part> memories = new ArrayList<Memory_part>();
    public String name = "메모리";

    public void addMemory(Memory_part memory) {
        memories.add(memory);
    }

    public void show() {
        for(Memory_part part : this.memories) {
            System.out.println(part.name());
        }
    }
}
