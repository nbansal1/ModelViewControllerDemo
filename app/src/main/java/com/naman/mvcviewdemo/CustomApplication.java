package com.naman.mvcviewdemo;

import android.app.Application;

import com.naman.mvcviewdemo.common.dependencyimjuction.CompositionRoot;

public class CustomApplication extends Application {

    private CompositionRoot compositionRoot;

    @Override
    public void onCreate() {
        super.onCreate();
        compositionRoot = new CompositionRoot();
    }

    public CompositionRoot getCompositionRoot() {
        return compositionRoot;
    }
}
