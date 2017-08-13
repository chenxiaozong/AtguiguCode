package com.example.chen.atguigucode.adapter;


import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by chen on 2017/8/13.
 *
 * 常用框架页面的adapter
 *
 */

public  class CommonFrameFragmentAdapter extends BaseAdapter {


    private final Context mContex;
    private final String[] datas;

    public CommonFrameFragmentAdapter(Context mContex, String[] datas) {
        this.mContex = mContex;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView tv  = new TextView(mContex);
        tv.setText(datas[i]);
        tv.setTextSize(20);
        tv.setTextColor(Color.BLACK);

        tv.setPadding(10,5,10,5);

        return tv;
    }
}