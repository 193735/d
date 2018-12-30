package com.example.administrator.myapplication.Model;

/**
 * Created by Administrator on 2018/12/28.
 */

public class HttpModel {
    Callback callback;
    public HttpModel(Callback callback){
        this.callback= callback;
    }
    public interface Callback{
        void onResult(String text);
    }
    public void request(){
        callback.onResult("sadda");
    }
}
