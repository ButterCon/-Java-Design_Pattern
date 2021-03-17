package com.maizer2.Structural_Pattern.Composite.Prac03;

import java.util.*;

public class Memory {

    public List<Memory> memories = new ArrayList<Memory>();
    public String name = "메모리";

    public void addmemory(Memory memory) {
        memories.add(memory);
    }

    public void show() {
        for(Memory part : this.memories) {
            System.out.println(part.name);
        }
    }
}
