package com.example.machine2.moviemeter;

import android.content.Context;

/**
 * Created by machine2 on 12/05/16.
 */
public class TopratedMovieManager {

    UrlProvider urlProvider;
    String topRatedUrl;

    NetworkCommunicator networkCommunicator;
    Context context;

    public TopratedMovieManager(Context context) {
        this.context = context;
    }


    public void MovieManager()
    {
        topRatedUrl = urlProvider.topRatedUrl;
      //  networkCommunicator = new NetworkCommunicator(topRatedUrl);
   //     networkCommunicator.posters((MovieAdapter) context);
    }

}
