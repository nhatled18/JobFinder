package com.example.jobfindernew;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserJobRelationDao {
    @Insert
    void insert(UserJobRelation userJobRelation);

    @Update
    void update(UserJobRelation userJobRelation);

    @Delete
    void delete(UserJobRelation userJobRelation);

    @Query("SELECT * FROM UserJobRelation WHERE userJobRelationId = :userJobRelationId")
    UserJobRelation getUserJobRelationById(int userJobRelationId);

    @Query("SELECT * FROM UserJobRelation WHERE userId = :userId AND jobId = :jobId")
    UserJobRelation getUserJobRelationByUserIdAndJobId(int userId, int jobId);
}

