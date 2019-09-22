package com.naman.mvcviewdemo.common;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class BaseObservableViewMvc<T> extends BaseViewMvc implements ObservableViewMvc<T>{
    private Set<T> mListener = new HashSet<>();

    @Override
    public void registerListener(T t) {
        mListener.add(t);
    }

    @Override
    public void unRegisterListener(T t) {
        mListener.remove(t);
    }

    public Set<T> getmListener() {
        return Collections.unmodifiableSet(mListener);
    }
}
