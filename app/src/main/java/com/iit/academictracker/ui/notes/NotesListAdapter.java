package com.iit.academictracker.ui.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Notes;

import java.util.ArrayList;

public class NotesListAdapter extends RecyclerView.Adapter<NotesListAdapter.NotesViewHolder> {

    private ArrayList<Notes> notes;
    private NotesItemClickListener listener;

    interface NotesItemClickListener {
        void onNoteClicked(View v, int position);
    }

    NotesListAdapter(NotesItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.template_list_info, parent, false);
        return new NotesListAdapter.NotesViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        Notes note = notes.get(position);
        holder.notes.setText(note.getTitle());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class NotesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView notes;
        NotesItemClickListener listener;

        NotesViewHolder(@NonNull View itemView, NotesItemClickListener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            notes = itemView.findViewById(R.id.list_item);
        }

        @Override
        public void onClick(View v) {
            listener.onNoteClicked(v, getAdapterPosition());
        }
    }

    void setNotesList(ArrayList<Notes> notes) {
        this.notes = notes;
        notifyDataSetChanged();
    }
}
