package com.example.jobfindernew;

import java.util.List;

import kotlinx.coroutines.Job;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EmployerApi {
    @GET("jobs")
    Call<List<Job>> getPostedJobs();

    @PUT("editJob/{jobId}")
    Call<Void> editJob(@Path("jobId") int jobId, @Body JobRequest jobRequest);

    @DELETE("deleteJob/{jobId}")
    Call<Void> deleteJob(@Path("jobId") int jobId);
}
