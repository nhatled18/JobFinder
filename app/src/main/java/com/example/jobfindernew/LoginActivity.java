package com.example.jobfindernew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Khởi tạo database
        appDatabase = AppDatabase.getInstance(this);

        // Thêm một User làm dummy
        addDummyUser();

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy email và password từ EditTexts
                EditText etEmail = findViewById(R.id.et_email);
                EditText etPassword = findViewById(R.id.et_password);
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                // Kiểm tra xem có User trùng khớp hay không
                User user = appDatabase.userDao().getUserByEmail(email);
                if (user != null && user.password.equals(password)) {
                    // Chuyển sang ActivityAccount và truyền dữ liệu
                    Intent intent = new Intent(LoginActivity.this, AccountActivity.class);
                    intent.putExtra("userId", user.userId);
                    startActivity(intent);
                } else {
                    // Hiển thị thông báo lỗi đăng nhập
                    Toast.makeText(LoginActivity.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void addDummyUser() {
        // Kiểm tra xem user có tồn tại không
        if (appDatabase.userDao().getUserByEmail("dummy@example.com") == null) {
            User dummyUser = new User();
            dummyUser.email = "dummy@example.com";
            dummyUser.password = "password123";
            dummyUser.fullName = "Dummy User";

            // Thêm dummyUser vào database
            appDatabase.userDao().insert(dummyUser);
        }
    }
}
