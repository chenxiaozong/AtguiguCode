package com.example.chen.atguigucode.fresco;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chen.atguigucode.R;
import com.example.chen.atguigucode.fresco.activity.Fresco10Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco1Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco2Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco3Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco4Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco5Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco6Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco7Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco8Activity;
import com.example.chen.atguigucode.fresco.activity.Fresco9Activity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FrescoActivity extends Activity {

    @BindView(R.id.bt_fresco_id1)
    Button btFrescoId1;
    @BindView(R.id.bt_fresco_id2)
    Button btFrescoId2;
    @BindView(R.id.bt_fresco_id3)
    Button btFrescoId3;
    @BindView(R.id.bt_fresco_id4)
    Button btFrescoId4;
    @BindView(R.id.bt_fresco_id5)
    Button btFrescoId5;
    @BindView(R.id.bt_fresco_id6)
    Button btFrescoId6;
    @BindView(R.id.bt_fresco_id7)
    Button btFrescoId7;
    @BindView(R.id.bt_fresco_id8)
    Button btFrescoId8;
    @BindView(R.id.bt_fresco_id9)
    Button btFrescoId9;
    @BindView(R.id.bt_fresco_id10)
    Button btFrescoId10;
    @BindView(R.id.tv_top_tile)
    TextView tvTopTile;


    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco);
        ButterKnife.bind(this);
        this.mContext = this;
        initTitle();



    }

    /**
     * 标题
     */
    private void initTitle() {
        tvTopTile.setText("Fresco 图片处理");
    }



    @OnClick({R.id.bt_fresco_id1,
            R.id.bt_fresco_id2,
            R.id.bt_fresco_id3,
            R.id.bt_fresco_id4,
            R.id.bt_fresco_id5,
            R.id.bt_fresco_id6,
            R.id.bt_fresco_id7,
            R.id.bt_fresco_id8,
            R.id.bt_fresco_id9,
            R.id.bt_fresco_id10
    })
    public void itemOnclick(View view){

        switch (view.getId()){
            case R.id.bt_fresco_id1:
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                //带进度条图片
                Intent intent = new Intent(mContext, Fresco1Activity.class);
                startActivity(intent);


                break;
            case R.id.bt_fresco_id2:
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                intent = new Intent(mContext, Fresco2Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_fresco_id3:
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                intent = new Intent(mContext, Fresco3Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_fresco_id4:
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                intent = new Intent(mContext, Fresco4Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_fresco_id5:
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                intent = new Intent(mContext, Fresco5Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_fresco_id6:
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                intent = new Intent(mContext, Fresco6Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_fresco_id7:
                intent = new Intent(mContext, Fresco7Activity.class);
                startActivity(intent);
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                break;
            case R.id.bt_fresco_id8:
                intent = new Intent(mContext, Fresco8Activity.class);
                startActivity(intent);
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                break;
            case R.id.bt_fresco_id9:
                intent = new Intent(mContext, Fresco9Activity.class);
                startActivity(intent);
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                break;
            case R.id.bt_fresco_id10:
                intent = new Intent(mContext, Fresco10Activity.class);
                startActivity(intent);
                Log.d("FrescoActivity", ((TextView) view).getText().toString());
                break;

        }




    }
}
