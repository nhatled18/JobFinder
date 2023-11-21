package com.example.jobfindernew;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_account);
    }

    ImageView avatarImageView = this.findViewById(R.id.iv_avatar);

    // Giả sử bạn có một đối tượng User
    User user = this.getUserFromSomeWhere();

    // Hiển thị avatar sử dụng Glide
        Glide.with(this)
                .

    load(user.getAvatar())
            .

    placeholder(R.drawable.avatar) // Avatar mặc định nếu không có avatar
            .

    error(R.drawable.avatar)       // Avatar mặc định nếu có lỗi khi tải
            .

    into(avatarImageView);

    // Các công việc khác liên quan đến hiển thị thông tin tài khoản
}

    // Hàm giả sử để lấy thông tin người dùng
    private User getUserFromSomeWhere() {
        // Triển khai để lấy thông tin người dùng từ nguồn dữ liệu nào đó
        // Ví dụ: lấy từ cơ sở dữ liệu, SharedPreferences, API, ...
        // Trả về một đối tượng User
        return new User(/* thông tin của người dùng */);
    }
}
}