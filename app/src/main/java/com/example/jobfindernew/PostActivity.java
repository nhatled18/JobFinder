package com.example.jobfindernew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        // Trong onCreate hoặc một phương thức tương tự
        Spinner spinnerIndustry = findViewById(R.id.sp_industry);
        // Lấy danh sách industries từ JobPosts
        List<String> industries = getIndustriesFromJobPosts(); // Bạn cần triển khai phương thức này
        // Tạo ArrayAdapter
        ArrayAdapter<String> industryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, industries);
        // Đặt layout cho dropdown menu
        industryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Set ArrayAdapter cho Spinner
        spinnerIndustry.setAdapter(industryAdapter);

        spinnerIndustry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Xử lý sự kiện khi người dùng chọn một mục từ Spinner
                String selectedIndustry = (String) parentView.getItemAtPosition(position);
                // Do something with the selected industry
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Được gọi khi không có mục nào được chọn
            }
        });

    }

    private List<String> getIndustriesFromJobPosts() {
        List<JobPost> jobPosts = JobPostDao.getAllJobPosts();
        List<String> industry = new ArrayList<>();

        for (JobPost jobPost : jobPosts) {
            if (!industry.contains(jobPost.industry)) {
                industry.add(jobPost.industry);
            }
        }

        return industry;
    }

}