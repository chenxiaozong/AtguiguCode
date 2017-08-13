package com.example.chen.atguigucode.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.chen.atguigucode.R;
import com.example.chen.atguigucode.base.BaseFragment;
import com.example.chen.atguigucode.fragment.adapter.CommonFrameFragmentAdapter;

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
        datas = new String[]{"OKHttp", "xUtils3", "Retrofit2", "Fresco", "Glide", "greenDao", "RxJava", "volley", "Gson", "FastJson", "picasso", "evenBus", "jcvideoplayer", "pulltorefresh", "Expandablelistview", "UniversalVideoView", "....."};

        lvMainCommon.setAdapter(new CommonFrameFragmentAdapter(mContext,datas));
        lvMainCommon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               // String content = ((TextView)view).getText().toString();
                String text = datas[i];

                Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
            }
        });
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
