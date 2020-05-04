package com.iit.academictracker.ui.courseinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.CourseInfo;
import com.iit.academictracker.ui.NavigationActivity;

import java.util.ArrayList;

public class CourseInfoActivity extends AppCompatActivity implements CourseListAdapter.CourseListItemClickListener {

    public ArrayList<CourseInfo> courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);
        CourseInfoViewModel viewModel = new CourseInfoViewModel();
        final CourseListAdapter courseListAdapter = new CourseListAdapter(this);

        RecyclerView recyclerView = findViewById(R.id.course_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(courseListAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);


        viewModel.getCourses().observe(this, new Observer<ArrayList<CourseInfo>>() {
            @Override
            public void onChanged(ArrayList<CourseInfo> courses) {
                CourseInfoActivity.this.courses = courses;
                courseListAdapter.setCourses(courses);
            }
        });
    }

    @Override
    public void onCourseClicked(View v, int position) {
        Intent intent = new Intent(this, NavigationActivity.class);
        intent.putExtra("CourseID", courses.get(position).getCourseID());
        startActivity(intent);
    }
}
