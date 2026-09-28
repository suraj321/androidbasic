package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("","App Created");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("","App Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("","App Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("","App Paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("","App Restarted");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("","App Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("","App Destroy");
    }
}