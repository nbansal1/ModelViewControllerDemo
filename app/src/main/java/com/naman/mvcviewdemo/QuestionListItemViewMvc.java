package com.naman.mvcviewdemo;

import com.naman.mvcviewdemo.common.ObservableViewMvc;

public interface QuestionListItemViewMvc extends ObservableViewMvc<QuestionListItemViewMvc.Listener> {

    interface Listener{
        void onQuestionClicked(int pos);
    }

    void bindQuestion(String mQuestion);

}
