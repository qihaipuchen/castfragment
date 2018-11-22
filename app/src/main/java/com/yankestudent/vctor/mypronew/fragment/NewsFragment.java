package com.yankestudent.vctor.mypronew.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.yankestudent.vctor.mypronew.R;
import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;
import com.yankestudent.vctor.mypronew.fragment.delefragment.SettingsFragment;

import butterknife.OnClick;

public class NewsFragment extends BaseFragment {
    @Override
    public Object setLayout() {
        return R.layout.fragment_news;
    }

    public static NewsFragment newInstance() {

        Bundle args = new Bundle();

        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }
    @OnClick(R.id.onclic)
    public void  setOnClik(View mV){
        switch (mV.getId()){
            case R.id.onclic:

                break;
        }

    }
}
