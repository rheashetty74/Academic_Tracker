package com.iit.academictracker.ui.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Notes;

public class NoteDisplayActivity extends AppCompatActivity {

    public static final String EXTRA_NOTE = "extra_note";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_display);
        Notes note = (Notes) getIntent().getSerializableExtra(EXTRA_NOTE);

        EditText title = findViewById(R.id.note_title);
        EditText content = findViewById(R.id.note_content);

        if(note != null) {
            title.setText(note.getTitle());
            content.setText(note.getContent());
        }

        FloatingActionButton fab = findViewById(R.id.save_note);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Save to DB
                finish();
            }
        });
    }
}
