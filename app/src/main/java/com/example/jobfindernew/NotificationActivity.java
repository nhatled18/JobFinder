package com.example.jobfindernew;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    private NotificationDao notificationDao; // Thêm dòng này

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        // Khởi tạo đối tượng notificationDao
        AppDatabase appDatabase = AppDatabase.getInstance(this);
        notificationDao = appDatabase.notificationDao();

        RecyclerView recyclerView = findViewById(R.id.rv_notification_list);
        NotificationAdapter notificationAdapter = new NotificationAdapter();
        recyclerView.setAdapter(notificationAdapter);

        int userId = 1; // Thay thế 1 bằng userId thực tế của bạn

        List<Notification> notificationList = notificationDao.getNotificationsByUserId(userId);
        notificationAdapter.setNotifications(notificationList);
    }
}
