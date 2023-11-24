package com.example.jobfindernew;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "JobPost", foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "userId",
        childColumns = "userId",
        onDelete = ForeignKey.CASCADE),
        indices = {@Index("userId")})
public class JobPost {
    @PrimaryKey
    public int jobId;

    @ColumnInfo(name = "userId")
    public int userId;

    public String position;
    public String industry;
    public String description;
    public String requirements;
    public String location;

    @ColumnInfo(name = "contactInfo")
    public String contactInfo;

    @ColumnInfo(name = "createdAt")
    public String createdAt;
}

