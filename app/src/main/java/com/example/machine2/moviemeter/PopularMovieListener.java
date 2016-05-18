package com.example.machine2.moviemeter;

import android.content.Context;

/**
 * Created by machine3 on 5/17/16.
 */
public interface PopularMovieListener {
    void getPopularImages(MovieImageAdapter imageAdapter);
    void movieManager(Context context);
}
