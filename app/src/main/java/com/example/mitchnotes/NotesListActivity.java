package com.example.mitchnotes;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mitchnotes.models.Note;

public class NotesListActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Note note = new Note( "some title", "some content", "timestamp");
        Log.d(TAG, "onCreate: my note" + note.getTitle());


        Note note2 = new Note();
        note2.setTitle("some other Title");
        note2.setContent("some other content");
        note2.setTimestamp("");

        Log.d(TAG, "onCreate: This is a test written by Kizaka");
    }

    private void someRandomMethod(){
        String string = "this does something";
        int someInteger = 2;

        Log.d(TAG, "someRandomMethod: " + string);
        Log.d(TAG, "someRandomMethod: " + someInteger);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: called");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "onPostCreate: called");
    }


}