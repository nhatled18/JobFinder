package com.example.jobfindernew;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface JobDao {
    @Query("SELECT * FROM Job WHERE position LIKE :position AND industry LIKE :industry AND location LIKE :location")
    List<Job> searchJobs(String position, String industry, String location);

    @Insert
    void insertJob(Job job);

    // Các truy vấn khác

}
