package com.naman.mvcviewdemo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.naman.mvcviewdemo.common.BaseObservableViewMvc;

public class QuestionListItemsViewMvcImpl extends BaseObservableViewMvc<QuestionListItemViewMvc.Listener> implements QuestionListItemViewMvc,QuestionListAdapter.IOnQuestionClickedListener {

    private TextView mTvQuestionList;

    public QuestionListItemsViewMvcImpl(LayoutInflater inflater, ViewGroup root) {
        setViewRoot(inflater.inflate(R.layout.question_list_card_view,root,false));
        mTvQuestionList = findViewById(R.id.mTvQuestionList);
    }

    @Override
    public void bindQuestion(String mQuestion) {
        mTvQuestionList.setText(mQuestion);
    }

    @Override
    public void onQuestionClicked(int pos) {
        for(Listener listener :getmListener()) {
            listener.onQuestionClicked(pos);
        }
    }
}
