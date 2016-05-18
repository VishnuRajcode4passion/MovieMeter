package com.example.machine2.moviemeter;

import android.content.Context;

/**
 * Created by machine2 on 12/05/16.
 */
public class PopularMovieManager implements PopularMovieListener  {

    PopularMovieListener popularMovieListener;
    MovieListener movieListener;
    NetworkCommunicator networkCommunicator;
    Context context;

    public PopularMovieManager(Context context) {
        this.context = context;
        this.movieListener = (MovieListener) context;
    }

    public void movieManager() {
        networkCommunicator = new NetworkCommunicator(context,UrlProvider.popularUrl);
        networkCommunicator.posters(this);
    }

    @Override
    public void setPopularImageAdapter(MovieImageAdapter imageAdapter) {
         movieListener.setImageAdapter(imageAdapter);
    }
}
