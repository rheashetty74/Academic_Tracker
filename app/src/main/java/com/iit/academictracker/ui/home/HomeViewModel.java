package com.iit.academictracker.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.iit.academictracker.data_models.Assignment;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> description;
    private MutableLiveData<String> deadline;
    private MutableLiveData<ArrayList<Assignment>> assignments;

    public HomeViewModel() {
        description = new MutableLiveData<>();
        deadline = new MutableLiveData<>();
        assignments = new MutableLiveData<>();
        description.setValue("Instructor: Dennis Hood\nLocation: RE 212\nTime: 11 AM - 12 PM");
        deadline.setValue("Assignment 3\t\t\tDue on\t03/05/2020");
        ArrayList<Assignment> defaultAssignments = getDefaultAssignments();
        assignments.setValue(defaultAssignments);
    }

    public LiveData<String> getDescription() {
        return description;
    }

    public LiveData<String> getDeadline() { return deadline; }

    public LiveData<ArrayList<Assignment>> getAssignments() { return assignments; }

    private ArrayList<Assignment> getDefaultAssignments() {
        ArrayList<Assignment> defaultAssignments = new ArrayList<>();
        defaultAssignments.add(new Assignment("1",null,"100/100"));
        defaultAssignments.add(new Assignment("2",null,"4/4"));
        defaultAssignments.add(new Assignment("3","03/05/2020","-/10"));
        return defaultAssignments;
    }
}