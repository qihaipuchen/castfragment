package com.yankestudent.vctor.mypronew.basefragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.yankestudent.vctor.mypronew.R;
import com.yankestudent.vctor.mypronew.fragment.FindFragment;
import com.yankestudent.vctor.mypronew.fragment.HomeFragment;
import com.yankestudent.vctor.mypronew.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * BaseContainer 底层容器
 */
public class BottomAddContentLeagure extends BaseFragment {
    @BindView(R.id.radioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.frame_content)
    FrameLayout bottom_bar_delegate_container;
    private List<BaseFragment> mList = new ArrayList<>();
    private int index;
    private int hideindex;

    @Override
    public Object setLayout() {
        return R.layout.activity_content;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        mList.add(new HomeFragment());
        mList.add(new NewsFragment());
        mList.add(new FindFragment());
        getSupportDelegate().loadMultipleRootFragment(R.id.frame_content, 0, mList.get(0), mList.get(1),mList.get(2));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.v_homePage:
                        index = 0;
                        break;
                    case R.id.v_course:
                        index = 1;
                        break;
                    case R.id.v_square:
                        index = 2;
                        break;
                    default:
                        break;
                }
                getSupportDelegate().showHideFragment(mList.get(index), mList.get(hideindex));
                hideindex = index;
            }
        });
    }
}
