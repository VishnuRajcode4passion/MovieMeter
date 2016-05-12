package com.example.machine2.moviemeter;

/**
 * Created by machine2 on 12/05/16.
 */
public class PopularMovieManager  {

    MainActivity mainActivity;
    UrlProvider urlProvider;
    String popularUrl;

    NetworkCommunicator networkCommunicator;

        public PopularMovieManager(MainActivity mainActivity) {

        this.mainActivity=mainActivity;

    }
    public void MovieManager()
    {
        popularUrl = urlProvider.popularUrl;
        networkCommunicator = new NetworkCommunicator(mainActivity,popularUrl);
        networkCommunicator.posters(mainActivity);
    }


}
