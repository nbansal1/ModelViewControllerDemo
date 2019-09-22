package com.naman.mvcviewdemo.common;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.naman.mvcviewdemo.QuestionListItemViewMvc;
import com.naman.mvcviewdemo.QuestionListItemsViewMvcImpl;
import com.naman.mvcviewdemo.QuestionListViewMvc;
import com.naman.mvcviewdemo.QuestionListViewMvcImpl;

public class ViewMvcFactory {

    private final LayoutInflater mLayoutInflator;

    public ViewMvcFactory(LayoutInflater mLayoutInflator) {
        this.mLayoutInflator = mLayoutInflator;
    }

    public QuestionListViewMvc getQuestionListViewMvc(@Nullable ViewGroup parent){
        return new QuestionListViewMvcImpl(mLayoutInflator,parent,this);
    }

    public QuestionListItemViewMvc getQuestionListItemViewMvc(@Nullable ViewGroup parent) {
        return new QuestionListItemsViewMvcImpl(mLayoutInflator,parent);
    }
}
