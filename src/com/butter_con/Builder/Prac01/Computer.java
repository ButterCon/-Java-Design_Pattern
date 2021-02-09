package com.butter_con.Builder.Prac01;


public class Computer {
    public Object cpu;
    public Object[] ram;
    public Object[] storage;

    public Computer() {}

    public String toString() {
        return
                "이 컴퓨터의 사양은 CPU=" + this.cpu + ", RAM= " + this.memory() + "GB";
    }

    public int memory() {
        int size = 0;

        for (Object mem : this.ram) {
            size += mem.getSize();
        }
    }
}
