package com.naman.mvcviewdemo.common;

public interface ObservableViewMvc<Listener> extends IViewMvc {
    void registerListener(Listener listener);

    void unRegisterListener(Listener listener);
}
