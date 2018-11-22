package com.yankestudent.vctor.mypronew.ass;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SimpleService extends AccessibilityService {

	private String TAG = getClass().getSimpleName();

	private  boolean  isFinish = false;

	public static SimpleService instance;
	private int index = 1;

	/**
	 * 获取到短信通知
	 *  0.唤醒屏幕
	 *  1.打开钉钉
	 *  2.确保当前页是主页界面
	 *  3.找到“工作”tab并且点击
	 *  4.确保到达签到页面
	 *  5.找到签到按钮，并且点击
	 *  6.判断签到是否成功
	 *      1.成功，退出程序
	 *      2.失败，返回到主页，重新从1开始签到
	 */


	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
//       final int eventType = event.getEventType();
		ArrayList<String> texts = new ArrayList<String>();
		Log.i(TAG, "事件---->" + event.getEventType());


		if(isFinish){
			return;
		}

		AccessibilityNodeInfo nodeInfo = getRootInActiveWindow();
		if(nodeInfo == null) {
			Log.w(TAG, "rootWindow为空");
			return ;
		}
//       nodeInfo.

//       System.out.println("nodeInfo"+nodeInfo);



	//	OpenHome(event.getEventType(),nodeInfo);

	}


	private ArrayList<String> getTextList(AccessibilityNodeInfo node,ArrayList<String> textList){
		if(node == null) {
			Log.w(TAG, "rootWindow为空");
			return null;
		}
		if(textList==null){
			textList = new ArrayList<String>();
		}
		String text = node.getText().toString();
		if(text!=null&&text.equals("")){
			textList.add(text);
		}
//        node.get
		return null;

	}


	private void OpenHome(int type,AccessibilityNodeInfo nodeInfo) {
		if(type == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED){
			//判断当前是否是钉钉主页
			List<AccessibilityNodeInfo> homeList = nodeInfo.findAccessibilityNodeInfosByText("MyProNew");
			if(!homeList.isEmpty()){
				//点击
				boolean isHome = click( "MyProNew");
				System.out.println("---->"+isHome);
				index = 2;
				System.out.println("点击进入主页签到");
			}
		}

	}






	//通过文字点击
	private boolean click(String viewText){
		AccessibilityNodeInfo nodeInfo = getRootInActiveWindow();
		if(nodeInfo == null) {
			Log.w(TAG, "点击失败，rootWindow为空");
			return false;
		}
		List<AccessibilityNodeInfo> list = nodeInfo.findAccessibilityNodeInfosByText(viewText);
		if(list.isEmpty()){
			//没有该文字的控件
			Log.w(TAG, "点击失败，"+viewText+"控件列表为空");
			return false;
		}else{
			//有该控件
			//找到可点击的父控件
			AccessibilityNodeInfo view = list.get(0);
			return onclick(view);  //遍历点击
		}

	}

	private boolean onclick(AccessibilityNodeInfo view){
		if(view.isClickable()){
		//	view.performAction(AccessibilityNodeInfo.ACTION_CLICK);
			Log.w(TAG, "点击成功");
			back();
			return true;
		}else{

			AccessibilityNodeInfo parent = view.getParent();
			if(parent==null){
				return false;
			}
			onclick(parent);
		}
		return false;
	}

	//点击返回按钮事件
	private void back(){
		performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK);
	}

	@Override
	public void onInterrupt() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onServiceConnected() {
		// TODO Auto-generated method stub
		super.onServiceConnected();
		Log.i(TAG, "service connected!");
		Toast.makeText(getApplicationContext(), "连接成功！",  Toast.LENGTH_SHORT).show();
		instance = this;
	}

	public void setServiceEnable(){
		isFinish = false;
		Toast.makeText(getApplicationContext(), "服务可用开启！",  Toast.LENGTH_SHORT).show();
		index = 1;
	}

}