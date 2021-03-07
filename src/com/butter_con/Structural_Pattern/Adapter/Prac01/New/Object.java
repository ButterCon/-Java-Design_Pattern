package com.butter_con.Structural_Pattern.Adapter.Prac01.New;

import com.butter_con.Structural_Pattern.Adapter.Prac01.Old.Math;

public class Object implements Adapter{

    private Math _adapter;

    public Object() {
        this._adapter = new Math();
    }

    @Override
    public int twiceOf(int num) {

        float _num = this._adapter.twoTime((float)num);

        return (int)_num;
    }

    @Override
    public int halfOf(int num) {

        float _num = this._adapter.halfTime((float)num);

        return (int)_num;
    }
}
