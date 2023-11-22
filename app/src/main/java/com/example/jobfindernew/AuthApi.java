package com.example.jobfindernew;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthApi {
    @POST("login")
    Call<User> loginUser(@Body LoginRequest loginRequest);

    @POST("register")
    Call<User> registerUser(@Body RegistrationRequest registrationRequest);
}