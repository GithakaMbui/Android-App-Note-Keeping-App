package com.example.mitchnotes.adapters;
import android.view.LayoutInflater;
//import android.view.ViewGroup;
import android.view.ViewGroup;
import android.widget.TextView;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.RecyclerView;

import com.example.mitchnotes.R;
import com.example.mitchnotes.models.Note;

import java.util.ArrayList;

public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder> {
    private ArrayList<Note> mNotes = new ArrayList<>();

    public NotesRecyclerAdapter(ArrayList<Note> notes) {
        this.mNotes = notes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_note_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.timestamp.setText(mNotes.get(i).getTimestamp());
        viewHolder.title.setText(mNotes.get(i).getTitle());

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, timestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.note_title);
            timestamp = itemView.findViewById(R.id.note_timestamp);

        }
    }
}
