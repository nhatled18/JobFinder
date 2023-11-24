package com.example.jobfindernew;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Lấy danh sách chức vụ từ resource
        String[] positions = getResources().getStringArray(R.array.position_array);

// Tạo ArrayAdapter
        ArrayAdapter<String> positionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, positions);

// Đặt layout cho dropdown menu
        positionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Set ArrayAdapter cho Spinner
        Spinner spinnerPosition = findViewById(R.id.sp_position);
        spinnerPosition.setAdapter(positionAdapter);

        // Lấy danh sách địa điểm từ resource
        String[] locations = getResources().getStringArray(R.array.location_array);

// Tạo ArrayAdapter
        ArrayAdapter<String> locationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, locations);

// Đặt layout cho dropdown menu
        locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Set ArrayAdapter cho Spinner
        Spinner spinnerLocation = findViewById(R.id.sp_location);
        spinnerLocation.setAdapter(locationAdapter);

    }
}