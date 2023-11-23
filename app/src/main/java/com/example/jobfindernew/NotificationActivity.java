package com.example.jobfindernew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        RecyclerView recyclerView = findViewById(R.id.rv_notification_list);
        NotificationAdapter notificationAdapter = new NotificationAdapter();
        recyclerView.setAdapter(notificationAdapter);

        List<Notification> notificationList = notificationDao.getNotificationsByUserId(userId);
        notificationAdapter.setNotifications(notificationList);

    }
}
