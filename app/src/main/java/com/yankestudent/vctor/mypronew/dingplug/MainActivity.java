package com.yankestudent.vctor.mypronew.dingplug;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.yankestudent.vctor.mypronew.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	Utils.openCLD("com.alibaba.android.rimet", this);
		System.out.println("start ...");
	}
	
	
	public void ServiceEnable(View v){
		
		DingService.instance.setServiceEnable();
	}


}
