package com.example.machine2.moviemeter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

/**
 * Created by machine2 on 09/05/16.
 */
public class MoviePosterManager {
    private static final String TAG = "MoviePosterManager";
    Gson gson;
    MoviesResponse moviesResponse;
    ImageAdapter imageAdapter;
    Context context;
    String  responseString;
    byte[] responseBody;
    public MoviePosterManager(Context context, byte[] responseBody) {
        this.context = context;
        this.responseBody = responseBody;
    }

    void poster( NetworkListener networkListener) {
        responseString = new String(responseBody);
        gson = new Gson();
        moviesResponse = gson.fromJson(responseString, MoviesResponse.class);
        Log.d(TAG,"response="+moviesResponse);
        imageAdapter = new ImageAdapter(context,moviesResponse.getResults());
        networkListener.setImageAdapter(imageAdapter);
    }
}