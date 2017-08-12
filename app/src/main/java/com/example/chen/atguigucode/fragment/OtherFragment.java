package com.example.chen.atguigucode.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.chen.atguigucode.base.BaseFragment;

/**
 * Created by chen on 2017/8/12.
 * 4. 其它
 */

public class OtherFragment extends BaseFragment {
    @Override
    protected void initData() {

    }

    @Override
    protected View initView() {
        TextView tv = new TextView(mContext);

        tv.setTextSize(20);
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.RED);

        tv.setText("其它...");


        return tv;
    }
}
