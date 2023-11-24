package com.example.jobfindernew;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notification", foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "userId",
        childColumns = "userId",
        onDelete = ForeignKey.CASCADE))
public class Notification {
    @PrimaryKey
    public int notificationId;

    @ColumnInfo(name = "userId")
    public int userId;

    public String message;

    @ColumnInfo(name = "createdAt")
    public String createdAt;

    public String getMessage() {
        return message;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}

