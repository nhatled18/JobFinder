package com.example.jobfindernew;

import android.content.Context;

import androidx.room.Room;

public enum DatabaseInitializer {
    ;

    private static AppDatabase appDatabase;

    public static AppDatabase initializeDatabase(final Context context) {
        if (null == appDatabase) {
            DatabaseInitializer.appDatabase = Room.databaseBuilder(context, AppDatabase.class, "app_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return DatabaseInitializer.appDatabase;
    }

    public static void destroyInstance() {
        DatabaseInitializer.appDatabase = null;
    }

    public static UserDao getUserDao() {
        if (null != appDatabase) {
            return DatabaseInitializer.appDatabase.userDao();
        }
        return null;
    }

    public static JobPostDao getJobPostDao() {
        if (null != appDatabase) {
            return DatabaseInitializer.appDatabase.jobPostDao();
        }
        return null;
    }

    public static JobApplicationDao getJobApplicationDao() {
        if (null != appDatabase) {
            return DatabaseInitializer.appDatabase.jobApplicationDao();
        }
        return null;
    }

    public static NotificationDao getNotificationDao() {
        if (null != appDatabase) {
            return DatabaseInitializer.appDatabase.notificationDao();
        }
        return null;
    }

    public static UserJobRelationDao getUserJobRelationDao() {
        if (null != appDatabase) {
            return DatabaseInitializer.appDatabase.userJobRelationDao();
        }
        return null;
    }
}

