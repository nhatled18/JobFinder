package com.example.jobfindernew;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface JobPostDao {
    @Insert
    void insert(JobPost jobPost);

    @Update
    void update(JobPost jobPost);

    @Delete
    void delete(JobPost jobPost);

    @Query("SELECT * FROM JobPost WHERE jobId = :jobId")
    JobPost getJobPostById(int jobId);

    @Query("SELECT * FROM JobPost")
    List<JobPost> getAllJobPosts();
}

