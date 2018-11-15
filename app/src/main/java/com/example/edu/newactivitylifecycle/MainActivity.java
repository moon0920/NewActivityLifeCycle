package com.example.edu.newactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "states";
    final String ACTIVITY = "MainActivity";
    Button btnFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirst = findViewById(R.id.btnFirst);
        btnFirst.setOnClickListener(this);
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
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
