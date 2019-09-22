package com.naman.mvcviewdemo;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestionListActivity extends BaseActivity implements QuestionListViewMvcImpl.Listener {

    private List<String> mQuestionList = new ArrayList<>();
    private QuestionListViewMvc mViewMvc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewMvc = getCompositeRoot().getViewMvcFactory().getQuestionListViewMvc(null);
        mViewMvc.registerListener(this);

        setContentView(mViewMvc.getViewRoot());

        mQuestionList = getCompositeRoot().getQuestionList();

        addQuestionList();



    }

    public void addQuestionList() {

        mViewMvc.bindQuestion(mQuestionList);
    }

    @Override
    public void onQuestionClicked(int pos) {
        Toast.makeText(this,mQuestionList.get(pos),Toast.LENGTH_SHORT).show();
    }
}
