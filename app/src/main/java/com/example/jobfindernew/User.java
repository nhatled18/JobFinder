package com.example.jobfindernew;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class User {
    @PrimaryKey
    public int userId;

    public String email;
    public String password;
    public String avatar;

    @ColumnInfo(name = "socialMediaId")
    public String socialMediaId;

    @ColumnInfo(name = "userName")
    public String userName;

    @ColumnInfo(name = "fullName")
    public String fullName;

    @ColumnInfo(name = "createdAt")
    public String createdAt;
}

