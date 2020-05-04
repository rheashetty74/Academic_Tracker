package com.iit.academictracker.ui.notes;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Notes;

import java.util.ArrayList;

public class NotesFragment extends Fragment implements NotesListAdapter.NotesItemClickListener {

    private NotesViewModel notesViewModel;
    private ArrayList<Notes> notes;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notesViewModel =
                ViewModelProviders.of(this).get(NotesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notes, container, false);

        final NotesListAdapter notesListAdapter = new NotesListAdapter(this);
        final RecyclerView recyclerView = root.findViewById(R.id.notes_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(notesListAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        notesViewModel.getNotes().observe(getViewLifecycleOwner(), new Observer<ArrayList<Notes>>() {
            @Override
            public void onChanged(@Nullable ArrayList<Notes> notes) {
                NotesFragment.this.notes = notes;
                notesListAdapter.setNotesList(notes);
            }
        });
        return root;
    }

    @Override
    public void onNoteClicked(View v, int position) {
        Toast.makeText(getContext(), "Title: " + notes.get(position).getTitle(), Toast.LENGTH_SHORT).show();
    }
}
