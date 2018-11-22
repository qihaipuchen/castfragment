package com.yankestudent.vctor.mypronew.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;
import com.yankestudent.vctor.mypronew.fragment.HomeFragment;
import com.yankestudent.vctor.mypronew.fragment.NewsFragment;

import java.util.List;


/**
 * Created by YoKeyword on 16/6/5.
 */
public class WechatPagerFragmentAdapter extends FragmentPagerAdapter {
    private String[] mTitles;
    List<BaseFragment> mList;

    public WechatPagerFragmentAdapter(FragmentManager fm, List<BaseFragment> mList, String... titles) {
        super(fm);
        mTitles = titles;
        this.mList = mList;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
