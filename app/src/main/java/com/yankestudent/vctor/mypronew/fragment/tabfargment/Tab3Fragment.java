package com.yankestudent.vctor.mypronew.fragment.tabfargment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.yankestudent.vctor.mypronew.R;
import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;

public class Tab3Fragment extends BaseFragment {
    @Override
    public Object setLayout() {
        return R.layout.fragment_tab;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        Log.e("1","3");
    }
    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        // 懒加载
        // 同级Fragment场景、ViewPager场景均适用
        Log.e("1","3");
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
}
