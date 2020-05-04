package com.iit.academictracker.ui.course_details;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Assignment;

import java.util.ArrayList;

public class GradesListAdapter extends RecyclerView.Adapter<GradesListAdapter.GradesViewHolder> {

    private ArrayList<Assignment> assignments;

    @Override
    public GradesListAdapter.GradesViewHolder onCreateViewHolder(ViewGroup parent,
                                                                 int viewType) {

        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.template_course_info, parent, false);
        return new GradesListAdapter.GradesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GradesViewHolder holder, int position) {
        Assignment assignment = assignments.get(position);
        String displayGrade = "Assignment " +assignment.getId()+"\t\t\t\t" + assignment.getGrade();
        holder.grades.setText(displayGrade);
    }

    @Override
    public int getItemCount() {
        return assignments.size();
    }

    public class GradesViewHolder extends RecyclerView.ViewHolder {

        TextView grades;
        public GradesViewHolder(@NonNull View itemView) {
            super(itemView);
            grades = itemView.findViewById(R.id.course_list_item);
        }
    }

    void setGradesList(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
        notifyDataSetChanged();
    }
}
