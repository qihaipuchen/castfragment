package com.yankestudent.vctor.mypronew.fragment.tabfargment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.yankestudent.vctor.mypronew.R;
import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;

public class Tab6Fragment extends BaseFragment {
    @Override
    public Object setLayout() {
        return R.layout.fragment_tab;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        Log.e("1", "6");
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        // 懒加载
        // 同级Fragment场景、ViewPager场景均适用
        Log.e("1", "6");
    }
}
