package com.yankestudent.vctor.mypronew.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

import com.yankestudent.vctor.mypronew.R;
import com.yankestudent.vctor.mypronew.adapter.WechatPagerFragmentAdapter;
import com.yankestudent.vctor.mypronew.ass.AccessUtil;
import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;
import com.yankestudent.vctor.mypronew.fragment.tabfargment.Tab1Fragment;
import com.yankestudent.vctor.mypronew.fragment.tabfargment.Tab2Fragment;
import com.yankestudent.vctor.mypronew.fragment.tabfargment.Tab3Fragment;
import com.yankestudent.vctor.mypronew.fragment.tabfargment.Tab4Fragment;
import com.yankestudent.vctor.mypronew.fragment.tabfargment.Tab5Fragment;
import com.yankestudent.vctor.mypronew.fragment.tabfargment.Tab6Fragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends BaseFragment {
    @BindView(R.id.tab)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private List<BaseFragment> mLitFragment;

    @Override
    public Object setLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        //判断是否前台还是后台
        AccessUtil.isBackground(_mActivity);
        mLitFragment = new ArrayList<>();
        mLitFragment.add(new Tab1Fragment());
        mLitFragment.add(new Tab2Fragment());
        mLitFragment.add(new Tab3Fragment());
        mLitFragment.add(new Tab4Fragment());
        mLitFragment.add(new Tab5Fragment());
        mLitFragment.add(new Tab6Fragment());
    }
    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        viewPager.setAdapter(new WechatPagerFragmentAdapter(getChildFragmentManager(), mLitFragment, "全部", "全部", "全部", "全部", "全部", "更多"));
        mTabLayout.setupWithViewPager(viewPager);
    }

}
