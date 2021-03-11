package com.maizer2.Structural_Pattern.Adapter.New;

import com.maizer2.Structural_Pattern.Adapter.Old.Math;

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
