package com.butter_con.Structural_Pattern.Adapter.Prac01;

import com.butter_con.Structural_Pattern.Adapter.Prac01.New.Object;

public class Index {
    public void run() {

        Object obj = new Object();

        System.out.println(obj.twiceOf(5));

        System.out.println(obj.halfOf(4));
    }
}
