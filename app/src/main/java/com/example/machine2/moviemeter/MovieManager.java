package com.example.machine2.moviemeter;

import android.content.Context;

/**
 * Created by machine2 on 12/05/16.
 */
public class MovieManager implements MovieListener {

    MovieAdapter movieAdapter;
    NetworkCommunicator networkCommunicator;
    Context context;

    @Override
    public void movieManager(Context context) {
        this.context = context;
        this.movieAdapter = (MovieAdapter) context;
        networkCommunicator = new NetworkCommunicator(context, UrlProvider.popularUrl);
        networkCommunicator.posters(this);
    }

    @Override
    public void getPopularImages(MovieImageAdapter imageAdapter) {
        movieAdapter.setImageAdapter(imageAdapter);
    }
}
