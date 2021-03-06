package com.iit.academictracker.ui.course_details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Assignment;

import java.util.ArrayList;

public class CourseDetailsFragment extends Fragment {

    private CourseDetailsViewModel courseDetailsViewModel;
    private ArrayList<Assignment> assignments;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        courseDetailsViewModel =
                ViewModelProviders.of(this).get(CourseDetailsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_course_details, container, false);
        final GradesListAdapter gradesListAdapter = new GradesListAdapter();

        final TextView courseDescription = root.findViewById(R.id.course_description);
        final TextView upcomingDeadlines = root.findViewById(R.id.deadlines_list);
        RecyclerView recyclerView = root.findViewById(R.id.grades_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(gradesListAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        courseDetailsViewModel.getDescription().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                courseDescription.setText(s);
            }
        });

        courseDetailsViewModel.getDeadline().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                upcomingDeadlines.setText(s);
            }
        });

        courseDetailsViewModel.getAssignments().observe(getViewLifecycleOwner(), new Observer<ArrayList<Assignment>>() {
            @Override
            public void onChanged(ArrayList<Assignment> assignments) {
                    gradesListAdapter.setGradesList(assignments);
            }
        });

        return root;
    }
}
