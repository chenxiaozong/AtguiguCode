package com.example.chen.atguigucode;

import android.app.Application;

import org.xutils.x;

/**
 * Created by chen on 2017/8/14.
 */

public class AtguiguAppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        //初始化xutils3
        x.Ext.init(this);
        x.Ext.setDebug(true);// 开启debug会影响性能, 上线时关闭
    }
}
