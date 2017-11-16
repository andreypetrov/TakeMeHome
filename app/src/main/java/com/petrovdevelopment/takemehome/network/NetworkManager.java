package com.petrovdevelopment.takemehome.network;

import retrofit2.Retrofit;

/**
 * Created by user1 on 2017-11-16.
 */

public class NetworkManager {

    //TODO create models
    public static void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();
        GitHubService service = retrofit.create(GitHubService.class);
    }
}
