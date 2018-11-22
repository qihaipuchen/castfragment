package com.yankestudent.vctor.mypronew.fragment.delefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yankestudent.vctor.mypronew.R;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by YoKeyword on 16/6/6.
 */
public class SettingsFragment extends SupportFragment {
    private Toolbar mToolbar;

    public static SettingsFragment newInstance() {

        Bundle args = new Bundle();

        SettingsFragment fragment = new SettingsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xq, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }

    @Override
    public boolean onBackPressedSupport() {
        pop();
        return true;
    }
}
