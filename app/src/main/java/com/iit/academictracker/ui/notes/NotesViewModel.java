package com.iit.academictracker.ui.notes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.iit.academictracker.data_models.Notes;

import java.util.ArrayList;

public class NotesViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Notes>> notes;

    public NotesViewModel() {
        notes = new MutableLiveData<>();
        ArrayList<Notes> defaultNotes = getDefaultNotes();
        notes.setValue(defaultNotes);
    }

    LiveData<ArrayList<Notes>> getNotes() {
        return notes;
    }

    private ArrayList<Notes> getDefaultNotes() {
        ArrayList<Notes> defaultList = new ArrayList<>();
        defaultList.add(new Notes("1","Lecture 1","This is the first lecture. Welcome to CS487 Software Engineering."));
        defaultList.add(new Notes("2","Homework Description", "Homework 1 is worth 100 points. Define requirements for a system"));
        defaultList.add(new Notes("3","Lecture 2","This lectures covers Requirement Gathering and Analysis."));

        return defaultList;
    }
}