package com.example.jobfindernew;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int userId;

    public String username;
    public String email;
    // Các trường khác

}
