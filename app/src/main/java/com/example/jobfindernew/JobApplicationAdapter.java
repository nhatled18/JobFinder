package com.example.jobfindernew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JobApplicationAdapter extends RecyclerView.Adapter<JobApplicationAdapter.JobApplicationViewHolder> {

    private List<JobApplication> jobApplications;

    public JobApplicationAdapter(List<JobApplication> jobApplications) {
        this.jobApplications = jobApplications;
    }

    @NonNull
    @Override
    public JobApplicationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_job_application, parent, false);
        return new JobApplicationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull JobApplicationViewHolder holder, int position) {
        JobApplication jobApplication = jobApplications.get(position);

        // Hiển thị thông tin của JobApplication trong ViewHolder
        holder.textViewStatus.setText(jobApplication.status);
        holder.textViewCreatedAt.setText(jobApplication.createdAt);
        // Các bước khác tùy thuộc vào cách bạn muốn hiển thị dữ liệu
    }

    @Override
    public int getItemCount() {
        return jobApplications.size();
    }

    static class JobApplicationViewHolder extends RecyclerView.ViewHolder {
        TextView textViewStatus;
        TextView textViewCreatedAt;

        public JobApplicationViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewStatus = itemView.findViewById(R.id.text_view_status);
            textViewCreatedAt = itemView.findViewById(R.id.text_view_created_at);
            // Thêm các View khác nếu cần thiết
        }
    }
}
