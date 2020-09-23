package com.example.mitchnotes;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.mitchnotes.adapters.NotesRecyclerAdapter;
import com.example.mitchnotes.models.Note;
import com.example.mitchnotes.util.VerticalSpacingItemDecorator;

import java.util.ArrayList;

public class NotesListActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //UI Components
    private RecyclerView  mRecyclerView;


    //Variables section
    private ArrayList<Note> mNotes = new ArrayList<>();
    private NotesRecyclerAdapter mNoteRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);
        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        insertFakeNoteS();

        setSupportActionBar((Toolbar)findViewById(R.id.notes_toolbar));
        setTitle("Notes");

//        Note note = new Note( "some title", "some content", "timestamp");
//        Log.d(TAG, "onCreate: my note" + note.getTitle());
//
//
//        Note note2 = new Note();
//        note2.setTitle("some other Title");
//        note2.setContent("some other content");
//        note2.setTimestamp("");
//
//        Log.d(TAG, "onCreate: This is a test written by Kizaka");
    }

    private void insertFakeNoteS(){
        for(int i = 0; i < 1000; i++){
            Note note = new Note();
            note.setTitle("title # " + i);
            note.setContent("content #: " + i);
            note.setTimestamp("Sept 2020");
            mNotes.add(note);
        }
        mNoteRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        VerticalSpacingItemDecorator itemDecorator = new VerticalSpacingItemDecorator(10);
        mRecyclerView.addItemDecoration(itemDecorator);
        mNoteRecyclerAdapter = new NotesRecyclerAdapter(mNotes);
        mRecyclerView.setAdapter(mNoteRecyclerAdapter);
    }

//    private void someRandomMethod(){
//        String string = "this does something";
//        int someInteger = 2;
//
//        Log.d(TAG, "someRandomMethod: " + string);
//        Log.d(TAG, "someRandomMethod: " + someInteger);
//    }

//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Log.d(TAG, "onPostResume: called");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy: called");
//    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(TAG, "onResume: called ");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(TAG, "onPause: called");
//    }
//
//    @Override
//    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        Log.d(TAG, "onPostCreate: called");
//    }


}