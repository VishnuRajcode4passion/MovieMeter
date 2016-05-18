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
    MovieListener movieListener;
    Context context;

    public MoviePosterParser(Context context, byte[] responseBody) {
        this.responseBody = responseBody;
        this.movieListener = movieListener;
        this.context = context;
    }

    MovieImageAdapter poster() {
        responseString = new String(responseBody);
        gson = new Gson();
        moviesResponse = gson.fromJson(responseString, MoviesResponse.class);
        //  Log.d(TAG,"response = "+moviesResponse);
        imageAdapter = new MovieImageAdapter(context, moviesResponse.getResults());
        Log.d(TAG, "response = " + imageAdapter);
        //popularMovieListener.setImageAdapter(imageAdapter);
        return imageAdapter;
    }
}