package com.example.jobfindernew;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ApplyActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JobApplicationAdapter adapter;
    private Object JobApplicationDao;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_apply);

        this.recyclerView = this.findViewById(R.id.rv_job_list);
        this.adapter = new JobApplicationAdapter(this.getJobApplicationsFromDatabase());

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(layoutManager);
        this.recyclerView.setAdapter(this.adapter);
    }

    private List<JobApplication> getJobApplicationsFromDatabase() {
        return new ArrayList<>();
    }

}