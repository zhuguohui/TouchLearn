package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class MyView extends Button {
    private String TAG = "zzz";

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TAG += getTag();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MyView dispatchTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "MyView dispatchTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MyView dispatchTouchEvent--ACTION_UP");
                break;
             case MotionEvent.ACTION_CANCEL:
                 Log.i(TAG, "MyView dispatchTouchEvent--ACTION_CANCEL");
                 break;
        }
       return super.dispatchTouchEvent(ev);
    //   return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MyView onTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "MyView onTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MyView onTouchEvent--ACTION_UP");
                break;
        }
        boolean touch = super.onTouchEvent(event);
        Log.i(TAG, "MyView onTouchEvent--touch  " + touch);
        return touch;

    }
}
