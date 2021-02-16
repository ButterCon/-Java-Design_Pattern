package com.butter_con.Builder.Prac01;


public class Computer {
    public Object _cpu;
    public Memory[] _ram;
    public Storage[] _storage;

    public Computer() {
    }

    public String toString() {
        return
                "이 컴퓨터의 사양은 CPU=" + this._cpu + ", RAM= " + this.memory() + "GB" + ", Storage= " + this.storage() + "GB 입니다.";
    }

    public int memory() {
        int size = 0;

        for (Memory mem : this._ram) {
            size += mem.getSize();
        }

        return size;
    }

    public int storage() {
        int size = 0;

        for (Storage disk : this._storage) {
            size += disk.getSize();
        }

        return size;
    }
}