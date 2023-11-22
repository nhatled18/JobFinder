package com.example.jobfindernew;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    private ImageView ivAvatar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ivAvatar = findViewById(R.id.iv_avatar);

        // Nhận đường dẫn của ảnh từ Intent hoặc một nguồn khác
        Intent intent = getIntent();
        if (intent != null) {
            String imagePath = intent.getStringExtra("image_path");

            // Sử dụng Picasso để tải ảnh và đặt nó lên ImageView
            Picasso.get().load("file://" + imagePath).into(ivAvatar);
        }
    }
}