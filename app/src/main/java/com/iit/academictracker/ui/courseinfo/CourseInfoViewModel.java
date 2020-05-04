package com.iit.academictracker.ui.courseinfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.iit.academictracker.data_models.CourseInfo;

import java.util.ArrayList;

public class CourseInfoViewModel extends ViewModel {
    private MutableLiveData<ArrayList<CourseInfo>> courses;

    public CourseInfoViewModel() {
        courses = new MutableLiveData<>();

        courses.setValue(getDefaultCourseList());
    }

    public LiveData<ArrayList<CourseInfo>> getCourses() {
        return courses;
    }

    private ArrayList<CourseInfo> getDefaultCourseList() {
        ArrayList<CourseInfo> courseList = new ArrayList<>();
        courseList.add(new CourseInfo("CS487","Software Engineering"));
        courseList.add(new CourseInfo("CSP544","System and Network Security"));
        courseList.add(new CourseInfo("CS350","Introduction to Algorithms"));

        return courseList;
    }
}
