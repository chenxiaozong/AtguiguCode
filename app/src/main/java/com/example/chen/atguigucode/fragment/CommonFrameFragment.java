package com.example.chen.atguigucode.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.chen.atguigucode.R;
import com.example.chen.atguigucode.adapter.CommonFrameFragmentAdapter;
import com.example.chen.atguigucode.base.BaseFragment;
import com.example.chen.atguigucode.okhttp.OkHttpActivity;
import com.example.chen.atguigucode.okhttp.OkHttpUtilsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by chen on 2017/8/12.
 * 1. 常用框架
 */

public class CommonFrameFragment extends BaseFragment {

    @BindView(R.id.lv_main_common)
    ListView lvMainCommon;
    Unbinder unbinder;




    private String[] datas;


    @Override
    protected void initData() {
        datas = new String[]{"OKHttp","OKHttpUtils", "xUtils3", "Retrofit2", "Fresco", "Glide", "greenDao", "RxJava", "volley", "Gson", "FastJson", "picasso", "evenBus", "jcvideoplayer", "pulltorefresh", "Expandablelistview", "UniversalVideoView", "....."};

        ListAdapter adapter = new CommonFrameFragmentAdapter(mContext,datas);
        lvMainCommon.setAdapter(adapter);
        lvMainCommon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




               // String content = ((TextView)view).getText().toString();
                String text = datas[i];

                switchToActivity(text);



            }
        });
    }


    /**
     * 更加选择的item 启动相应activity
     * @param text
     */
    private void switchToActivity(String text) {
        switch (text.toLowerCase()){
            case "okhttp":

                Intent intent = new Intent(mContext, OkHttpActivity.class);
                startActivity(intent);
                break;
            case "okhttputils":

                 intent = new Intent(mContext, OkHttpUtilsActivity.class);
                startActivity(intent);
                break;

        }




    }




    @Override
    protected View initView() {

        return null;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View view = View.inflate(mContext, R.layout.fragment_main_commonframe, null);

        unbinder = ButterKnife.bind(this, view);
        return view;
    }
}
