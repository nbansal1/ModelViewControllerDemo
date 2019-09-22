package com.naman.mvcviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestionListActivity extends AppCompatActivity implements QuestionListViewMvcImpl.Listener {

    private List<String> mQuestionList = new ArrayList<>();
    private QuestionListViewMvc mViewMvc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewMvc = new QuestionListViewMvcImpl(LayoutInflater.from(this),null);
        mViewMvc.registerListener(this);

        setContentView(mViewMvc.getViewRoot());


        addQuestionList();



    }

    public void addQuestionList() {

        for(int i= 0; i< 5;i++) {
            mQuestionList.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
            mQuestionList.add("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of");
        }

        mViewMvc.bindQuestion(mQuestionList);
    }

    @Override
    public void onQuestionClicked(int pos) {
        Toast.makeText(this,mQuestionList.get(pos),Toast.LENGTH_SHORT).show();
    }
}
