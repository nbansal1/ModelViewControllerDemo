package com.naman.mvcviewdemo;

import android.support.v7.app.AppCompatActivity;
import com.naman.mvcviewdemo.CustomApplication;

import com.naman.mvcviewdemo.common.dependencyimjuction.ControllerCompositionRoot;

public class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot mControllerCompositionRoot;

    public ControllerCompositionRoot getCompositeRoot(){
        if(mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication)getApplication()).getCompositionRoot(),
                    this
            );
        }
        return mControllerCompositionRoot;
    }
}
