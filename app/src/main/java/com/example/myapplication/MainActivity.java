package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    MyView btn3;
    MyViewGroup myViewGroup1;
    private String TAG = "zzz";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = (MyView) findViewById(R.id.v3);
        myViewGroup1 = (MyViewGroup) findViewById(R.id.mg1);
        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent ev) {
                switch (ev.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i(TAG, "OnTouchListener ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i(TAG, "OnTouchListener  ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "OnTouchListener ACTION_UP");
                        break;
                }
              //  return true;
                return false;
            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "Activity dispatchTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "Activity dispatchTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "Activity dispatchTouchEvent--ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "Activity onTouchEvent--ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "Activity onTouchEvent--ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "Activity onTouchEvent--ACTION_UP");
                break;
        }
        boolean touch = super.onTouchEvent(event);
        Log.d(TAG, "Activity touch boolean---" + touch);
        return touch;
    }
}
