package com.example.machine2.moviemeter;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

public class MainActivity extends BaseActivity implements NetworkListener {
    GridView SetPosters;


    UrlProvider urlProvider;
    NetworkCommunicator networkCommunicator;

    String popularUrl;
    String topratedUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        SetPosters = (GridView)findViewById(R.id.gridview);
        dialogShow();
        urlProvider = new UrlProvider();
        popularUrl = urlProvider.popularUrl;
        topratedUrl = urlProvider.topRatedUrl;

        networkCommunicator=new NetworkCommunicator(this,popularUrl,topratedUrl);
        networkCommunicator.popularMovies(this);

    }


    @Override
    public void setImageAdapter(ImageAdapter imageAdapter)
    {
        dialogDismiss();
        SetPosters.setAdapter(imageAdapter);

    }
}
