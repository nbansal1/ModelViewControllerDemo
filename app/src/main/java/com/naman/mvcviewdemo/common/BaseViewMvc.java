package com.naman.mvcviewdemo.common;

import android.content.Context;
import android.view.View;

public abstract class BaseViewMvc implements IViewMvc {

    private View viewRoot;

    @Override
    public View getViewRoot() {
        return viewRoot;
    }

    protected void setViewRoot(View viewRoot) {
        this.viewRoot = viewRoot;
    }
    protected  <T extends View> T findViewById(int id) {
        return getViewRoot().findViewById(id);
    }

    protected Context getContext() {
        return getViewRoot().getContext();
    }
}
