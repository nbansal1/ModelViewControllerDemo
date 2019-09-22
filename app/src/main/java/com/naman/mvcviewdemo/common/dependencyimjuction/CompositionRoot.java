package com.naman.mvcviewdemo.common.dependencyimjuction;

import java.util.ArrayList;
import java.util.List;

public class CompositionRoot {

    private List<String> mQuestionList;

    public List<String> getQuestionList() {
        if(mQuestionList == null) {
            mQuestionList = new ArrayList<>();
            for(int i= 0; i< 5;i++) {
                mQuestionList.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
                mQuestionList.add("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of");
            }
        }
        return mQuestionList;
    }
}
