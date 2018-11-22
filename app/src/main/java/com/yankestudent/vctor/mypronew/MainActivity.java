package com.yankestudent.vctor.mypronew;

import com.yankestudent.vctor.mypronew.basefragment.BaseFragment;
import com.yankestudent.vctor.mypronew.basefragment.BottomAddContentLeagure;

public class MainActivity extends ProxyActivity {

    @Override
    public BaseFragment setRootDelegate() {
        return new BottomAddContentLeagure();
    }

}
