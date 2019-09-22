package com.naman.mvcviewdemo.common.dependencyimjuction;

import android.app.Activity;
import android.view.LayoutInflater;

import com.naman.mvcviewdemo.common.ViewMvcFactory;

import java.util.List;

public class ControllerCompositionRoot {

    private final CompositionRoot mCompositionRoot;
    private Activity mActivity;

    public ControllerCompositionRoot(CompositionRoot compositionRoot, Activity activity) {
        mCompositionRoot = compositionRoot;
        mActivity = activity;
    }

    public List<String> getQuestionList() {
        return mCompositionRoot.getQuestionList();
    }

    public LayoutInflater getLayoutInflater(){
        return LayoutInflater.from(mActivity);
    }

    public ViewMvcFactory getViewMvcFactory(){
        return new ViewMvcFactory(getLayoutInflater());
    }
}
