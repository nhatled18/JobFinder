package com.example.jobfindernew;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ApplicationDao {
    @Query("SELECT * FROM Application WHERE userId = :userId")
    List<Application> getApplicationsForUser(int userId);

    @Insert
    void insertApplication(Application application);

    // Các truy vấn khác

}
