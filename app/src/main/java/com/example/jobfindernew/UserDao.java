package com.example.jobfindernew;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User WHERE email = :email")
    User getUserByEmail(String email);

    @Insert
    void insertUser(User user);

    // Các truy vấn khác

}
