package com.example.jobfindernew;

import android.app.Application;

import org.chromium.base.ApplicationStatus;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JobSeekerApi {
    @GET("applications")
    Call<List<Application>> getApplications();

    @GET("applicationStatus/{applicationId}")
    Call<ApplicationStatus> getApplicationStatus(@Path("applicationId") int applicationId);
}
