package com.example.machine2.moviemeter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

/**
 * Created by machine2 on 09/05/16.
 */
//Manager class of the movie posters
public class MoviePosterParser {

    private static final String TAG = "MoviePosterParser";
    Gson gson;
    MoviesResponse moviesResponse;
    MovieImageAdapter imageAdapter;
    String responseString;
    byte[] responseBody;
    MovieAdapter movieAdapter;
    Context context;

    public MoviePosterParser(Context context, byte[] responseBody) {
        this.responseBody = responseBody;
        this.movieAdapter = movieAdapter;
        this.context = context;
    }

    MovieImageAdapter poster() {
        responseString = new String(responseBody);
        gson = new Gson();
        moviesResponse = gson.fromJson(responseString, MoviesResponse.class);
        //  Log.d(TAG,"response = "+moviesResponse);
        imageAdapter = new MovieImageAdapter(context, moviesResponse.getResults());
        Log.d(TAG, "response = " + imageAdapter);
        //movieListener.setImageAdapter(imageAdapter);
        return imageAdapter;
    }
}