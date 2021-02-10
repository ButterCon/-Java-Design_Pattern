package com.butter_con.Builder.Prac01;


public class Computer {
    public Object _cpu;
    public Object[] _ram;
    public Object[] _storage;

    public Computer() {}

    public String toString() {
        return
                "이 컴퓨터의 사양은 CPU=" + this._cpu + ", RAM= " + this.memory() + "GB" + ", Storage= " + this.storage() + "GB 입니다.";
    }

    public int memory() {
        int size = 0;

        for (Object mem : this._ram) {
            size += mem.getSize();
        }

        return 0;
    }

    public int storage() {

        return 0;
    }
}
