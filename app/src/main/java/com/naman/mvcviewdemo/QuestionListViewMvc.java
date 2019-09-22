package com.naman.mvcviewdemo;

import com.naman.mvcviewdemo.common.ObservableViewMvc;

import java.util.List;

interface QuestionListViewMvc extends ObservableViewMvc<QuestionListViewMvc.Listener> {

     interface Listener{
        void onQuestionClicked(int pos);
    }

    void bindQuestion(List<String> mQuestionList);

}
