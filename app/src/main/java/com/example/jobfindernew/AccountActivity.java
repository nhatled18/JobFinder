package com.example.jobfindernew;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    private AppDatabase appDatabase;
    private int userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        // Khởi tạo database
        appDatabase = AppDatabase.getInstance(this);

        // Nhận dữ liệu từ Intent
        Intent intent = getIntent();
        userId = intent.getIntExtra("userId", -1);

        // Hiển thị thông tin User trên giao diện
        displayUserInfo();
    }

    private void displayUserInfo() {
        // Lấy thông tin User từ database
        User user = appDatabase.userDao().getUserById(userId);

        // Hiển thị thông tin trên giao diện
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvEmail = findViewById(R.id.tv_email);

        if (user != null) {
            tvName.setText(user.fullName);
            tvEmail.setText(user.email);
        }
    }
}