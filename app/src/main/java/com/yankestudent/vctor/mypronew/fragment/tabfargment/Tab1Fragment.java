package com.yankestudent.vctor.mypronew.fragment.tabfargment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.yankestudent.vctor.mypronew.R;
import com.yankestudent.vctor.mypronew.ass.AccessActivity;
import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;
import com.yankestudent.vctor.mypronew.fragment.delefragment.SettingsFragment;
import com.yankestudent.vctor.mypronew.fragment.delefragment.XqFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class Tab1Fragment extends BaseFragment {

    @BindView(R.id.txt)
    TextView textView;

    @Override
    public Object setLayout() {
        return R.layout.fragment_tab;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        // 懒加载
        // 同级Fragment场景、ViewPager场景均适用
        Log.e("1", "1");
    }

    @Override
    public void onSupportVisible() {
        super.onSupportVisible();
        // 当对用户可见时 回调
        // 不管是 父Fragment还是子Fragment 都有效！

        Toast.makeText(_mActivity, "///", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSupportInvisible() {
        super.onSupportInvisible();
        // 当对用户不可见时 回调
        // 不管是 父Fragment还是子Fragment 都有效！
        //     Toast.makeText(_mActivity, "****", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.txt)
    public void setOnClick(View mView) {

        switch (mView.getId()) {
            case R.id.txt:


                Intent intent=new Intent(_mActivity,AccessActivity.class);
                startActivity(intent);
         //       start(SettingsFragment.newInstance());

                break;
        }
    }
}
