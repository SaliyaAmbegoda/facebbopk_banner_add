package com.affix.fbadds;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class myApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
    }
}
