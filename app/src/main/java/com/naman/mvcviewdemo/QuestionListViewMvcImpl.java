package com.naman.mvcviewdemo;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.naman.mvcviewdemo.common.BaseObservableViewMvc;
import com.naman.mvcviewdemo.common.ViewMvcFactory;

import java.util.ArrayList;
import java.util.List;

public class QuestionListViewMvcImpl extends BaseObservableViewMvc<QuestionListViewMvc.Listener> implements QuestionListAdapter.IOnQuestionClickedListener, QuestionListViewMvc {

    private List<String> mQuestionList = new ArrayList<>();
    private final QuestionListAdapter adapter;

    public QuestionListViewMvcImpl(LayoutInflater inflater, ViewGroup parent, ViewMvcFactory viewMvcFactory) {
        setViewRoot(inflater.inflate(R.layout.activity_question_list,parent,false));
        RecyclerView mRvQuestionList = findViewById(R.id.mRvQuestionList);

        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        adapter = new QuestionListAdapter(getContext(), mQuestionList, this , viewMvcFactory);
        mRvQuestionList.setLayoutManager(manager);
        mRvQuestionList.setAdapter(adapter);

    }

    @Override
    public void bindQuestion(List<String> mQuestionList) {
        this.mQuestionList.addAll(mQuestionList);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onQuestionClicked(int pos) {
        for (Listener listener : getmListener()) {
            listener.onQuestionClicked(pos);
        }
    }

}
