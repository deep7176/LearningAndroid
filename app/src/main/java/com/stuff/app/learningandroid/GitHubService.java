package com.stuff.app.learningandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET("topstories.json")
    Call<int[]> getTopStories();

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}