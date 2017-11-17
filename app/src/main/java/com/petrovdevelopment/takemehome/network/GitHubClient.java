package com.petrovdevelopment.takemehome.network;

import com.petrovdevelopment.takemehome.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Andrey Petrov on 2017-11-16.
 */

public interface GitHubClient {
    @GET("users/{user}/repos")
    Call<List<GitHubRepo>> listRepos(@Path("user") String user);
}

