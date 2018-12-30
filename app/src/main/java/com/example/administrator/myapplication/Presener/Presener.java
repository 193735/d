package com.example.administrator.myapplication.Presener;

import android.support.v7.app.AppCompatActivity;

import com.example.administrator.myapplication.Model.HttpModel;
import com.example.administrator.myapplication.R;

import com.example.administrator.myapplication.View.MVPView;

/**
 * Created by Administrator on 2018/12/28.
 */

public class Presener {
    private MVPView appCompatActivity;
    private HttpModel httpModel;

    public Presener(MVPView appCompatActivity){
        this.appCompatActivity = appCompatActivity;
        httpModel=new HttpModel(new HttpModel.Callback() {
            @Override
            public void onResult(String text) {
                System.out.println(text);
                Presener.this.appCompatActivity.updateTv(text);
            }
        });
    }
    public void request(){
        httpModel.request();

    }
}
