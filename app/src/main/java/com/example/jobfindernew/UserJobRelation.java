package com.example.jobfindernew;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "UserJobRelation", foreignKeys = {
        @ForeignKey(entity = User.class,
                parentColumns = "userId",
                childColumns = "userId",
                onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = JobPost.class,
                parentColumns = "jobId",
                childColumns = "jobId",
                onDelete = ForeignKey.CASCADE)
})
public class UserJobRelation {
    @PrimaryKey
    public int userJobRelationId;

    @ColumnInfo(name = "userId")
    public int userId;

    @ColumnInfo(name = "jobId")
    public int jobId;

    @ColumnInfo(name = "isOwner")
    public boolean isOwner;

    @ColumnInfo(name = "createdAt")
    public String createdAt;
}

