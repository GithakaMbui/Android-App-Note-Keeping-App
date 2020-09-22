package com.example.mitchnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: This is a test written by Kizaka");
    }

    private void someRandomMethod(){
        String string = "this does something";
        int someInteger = 2;

        Log.d(TAG, "someRandomMethod: " + string);
        Log.d(TAG, "someRandomMethod: " + someInteger);
    }

}