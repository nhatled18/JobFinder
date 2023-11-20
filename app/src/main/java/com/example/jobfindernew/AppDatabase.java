package com.example.jobfindernew;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class, JobPost.class, JobApplication.class, Notification.class, UserJobRelation.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "app_database";
    private static AppDatabase instance;

    public static synchronized AppDatabase getInstance(Context context) {
        if (null == AppDatabase.instance) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract UserDao userDao();

    public abstract JobPostDao jobPostDao();

    public abstract JobApplicationDao jobApplicationDao();

    public abstract NotificationDao notificationDao();

    public abstract UserJobRelationDao userJobRelationDao();
}

