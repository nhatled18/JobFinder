package com.example.jobfindernew;

import kotlinx.coroutines.Job;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface JobApi {
    @POST("createJob")
    Call<Job> createJob(@Body JobRequest jobRequest);
}
