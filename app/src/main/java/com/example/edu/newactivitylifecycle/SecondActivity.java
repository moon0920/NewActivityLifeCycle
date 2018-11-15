package com.example.edu.newactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "States";
    final String ACTIVITY = "SecondActivity";
    Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSecond = findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,ACTIVITY + "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,ACTIVITY + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,ACTIVITY + "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,ACTIVITY + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,ACTIVITY + "onResume");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

}
