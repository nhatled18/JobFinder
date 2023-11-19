package com.example.jobfindernew;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Job {
    @PrimaryKey(autoGenerate = true)
    public int jobId;

    public String position;
    public String industry;
    public String description;
    public String requirements;
    public String location;
    public String contactInfo;
    // Các trường khác

}
