package com.naman.mvcviewdemo;

import com.naman.mvcviewdemo.common.ObservableViewMvc;

import java.util.List;

public interface QuestionListViewMvc extends ObservableViewMvc<QuestionListViewMvc.Listener> {

     interface Listener{
        void onQuestionClicked(int pos);
    }

    void bindQuestion(List<String> mQuestionList);

}
