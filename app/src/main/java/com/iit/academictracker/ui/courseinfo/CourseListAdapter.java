package com.iit.academictracker.ui.courseinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.CourseInfo;

import java.util.ArrayList;

public class CourseListAdapter extends RecyclerView.Adapter<CourseListAdapter.CourseViewHolder> {

    private ArrayList<CourseInfo> courses;
    private CourseListItemClickListener listener;

    interface CourseListItemClickListener {
        void onCourseClicked(View v, int position);
    }

    CourseListAdapter(CourseListItemClickListener listener) {
        this.listener = listener;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        TextView textView;
        CourseListItemClickListener listener;

        CourseViewHolder(View itemView, CourseListItemClickListener listener) {
            super(itemView);
            textView = itemView.findViewById(R.id.list_item);
            itemView.setOnClickListener(this);
            this.listener = listener;
        }

        @Override
        public void onClick(View v) {
            listener.onCourseClicked(v, getAdapterPosition());
        }
    }

    void setCourses(ArrayList<CourseInfo> courses) {
        this.courses = courses;
        notifyDataSetChanged();
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public CourseListAdapter.CourseViewHolder onCreateViewHolder(ViewGroup parent,
                                                                 int viewType) {

        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.template_list_info, parent, false);
        return new CourseViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        CourseInfo course = courses.get(position);
        String courseID = course.getCourseID();
        String courseName = course.getCourseName();
        String displayCourse = courseID + " " + courseName;
        holder.textView.setText(displayCourse);

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}
