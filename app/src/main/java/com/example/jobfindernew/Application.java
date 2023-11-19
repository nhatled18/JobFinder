package com.example.jobfindernew;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Application {
    @PrimaryKey(autoGenerate = true)
    public int applicationId;

    public int jobId; // Liên kết với công việc
    public int userId; // Liên kết với người tìm việc
    public boolean isApproved;
    // Các trường khác

}
