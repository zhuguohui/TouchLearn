package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class MyViewGroup extends RelativeLayout {
    private String TAG = "zzz";

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        TAG += getTag();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MyViewGroup dispatchTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "MyViewGroup dispatchTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MyViewGroup dispatchTouchEvent--ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
        // return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyViewGroup onInterceptTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyViewGroup onInterceptTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyViewGroup onInterceptTouchEvent--ACTION_UP");
                break;
        }
//      return super.onInterceptTouchEvent(ev);
        //      return true;
        if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MyViewGroup onTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "MyViewGroup onTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MyViewGroup onTouchEvent--ACTION_UP");
                break;
        }
        boolean touch = super.onTouchEvent(event);
        Log.i(TAG, "MyViewGroup onTouchEvent--touch " + touch);
        return touch;
        //      return true;
    }
}
