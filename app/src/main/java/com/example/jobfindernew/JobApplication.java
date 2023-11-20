package com.example.jobfindernew;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "JobApplication", foreignKeys = {
        @ForeignKey(entity = User.class,
                parentColumns = "userId",
                childColumns = "userId",
                onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = JobPost.class,
                parentColumns = "jobId",
                childColumns = "jobId",
                onDelete = ForeignKey.CASCADE)
})
public class JobApplication {
    @PrimaryKey
    public int applicationId;

    @ColumnInfo(name = "userId")
    public int userId;

    @ColumnInfo(name = "jobId")
    public int jobId;

    public String status;

    @ColumnInfo(name = "createdAt")
    public String createdAt;
}

