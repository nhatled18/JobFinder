package com.example.jobfindernew;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NotificationDao {
    @Insert
    void insert(Notification notification);

    @Update
    void update(Notification notification);

    @Delete
    void delete(Notification notification);

    @Query("SELECT * FROM Notification WHERE notificationId = :notificationId")
    Notification getNotificationById(int notificationId);

    @Query("SELECT * FROM Notification WHERE userId = :userId")
    List<Notification> getNotificationsByUserId(int userId);
}

