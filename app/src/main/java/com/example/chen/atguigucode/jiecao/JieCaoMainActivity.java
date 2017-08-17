package com.example.chen.atguigucode.jiecao;

import android.app.Activity;
import android.os.Bundle;

import com.example.chen.atguigucode.R;

import butterknife.ButterKnife;

public class JieCaoMainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jie_cao_main);
        ButterKnife.bind(this);


    }
}
