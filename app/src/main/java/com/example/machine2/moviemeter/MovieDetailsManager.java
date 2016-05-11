package com.example.machine2.moviemeter;

import android.content.Context;

import com.google.gson.Gson;

/**
 * Created by machine2 on 11/05/16.
 */
public class MovieDetailsManager {

    private static final String TAG = "MoviePosterManager";
    Gson gson;
   MovieDetailResponse movieDetailResponse;
    Context context;
    String  responseString;
    byte[] responseBody;
    public MovieDetailsManager(Context context, byte[] responseBody)
    {
        this.context = context;
        this.responseBody = responseBody;
    }

    void details( ) {
        responseString = new String(responseBody);
        gson = new Gson();

        movieDetailResponse = gson.fromJson(responseString, MovieDetailResponse.class);

    }
}
