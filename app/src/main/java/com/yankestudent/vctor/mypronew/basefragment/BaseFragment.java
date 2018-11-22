package com.yankestudent.vctor.mypronew.basefragment;

import android.widget.Toast;

public abstract class BaseFragment extends PermissionCheckerFragment {
    // 再点一次退出程序时间设置
    private static final long WAIT_TIME = 2000L;
    private long TOUCH_TIME = 0;

    /**
     * 处理回退事件
     *
     * @return
     */
    @Override
    public boolean onBackPressedSupport() {
        if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
            _mActivity.finish();
        } else {
            TOUCH_TIME = System.currentTimeMillis();
            Toast.makeText(_mActivity, "再按一次退出", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public <T extends BaseFragment> T getParentDelegate() {
        return (T) getParentFragment();
    }
}
