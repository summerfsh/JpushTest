package org.fsh.xzp;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class JpushApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
