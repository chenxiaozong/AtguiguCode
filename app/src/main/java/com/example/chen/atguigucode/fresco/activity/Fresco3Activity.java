package com.example.chen.atguigucode.fresco.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.chen.atguigucode.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Fresco3Activity extends Activity {

    @BindView(R.id.tv_top_tile)
    TextView tvTopTile;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco3);
        ButterKnife.bind(this);

        this.mContext = this;

        tvTopTile.setText("Fresco3");

    }
}
