package com.maizer2.Structural_Pattern.Adapter;

import com.maizer2.Structural_Pattern.Adapter.New.Object;

public class Index {
    public void run() {

        Object obj = new Object();

        System.out.println(obj.twiceOf(5));

        System.out.println(obj.halfOf(4));
    }
}
