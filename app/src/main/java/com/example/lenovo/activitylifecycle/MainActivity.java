package com.example.lenovo.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Life Cycle","Its onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Life Cycle","Its onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Life Cycle","Its onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Life Cycle","Its onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Life Cycle","Its onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Life Cycle","Its onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Life Cycle", "Its onDestroy");
    }
}