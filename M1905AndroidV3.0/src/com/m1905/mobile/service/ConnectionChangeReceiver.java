package com.m1905.mobile.service;

import com.m1905.mobile.common.TianyiContent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionChangeReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		ConnectivityManager connectivityManager=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo  mobNetInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        NetworkInfo  wifiNetInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        
        if (!mobNetInfo.isConnected() && !wifiNetInfo.isConnected()) {
        	System.out.println("网络不可用");
            //改变背景或者 处理网络的全局变量
        }else {
            //改变背景或者 处理网络的全局变量
        	if(TianyiContent.token.equals("")){
        		TianyiContent.tokenInit(context);
        	}
        }
	}
}
