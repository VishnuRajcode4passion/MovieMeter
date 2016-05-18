package com.example.machine2.moviemeter;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

public class MainActivity extends BaseActivity implements MovieListener {

    //variable declaration
    GridView gridView;
    NavigationView navigationView;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NetworkCommunicator networkCommunicator;
    PopularMovieManager popularMovieManager;
    Toolbar toolbar;
    PopularMovieListener popularMovieListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        gridView = (GridView) findViewById(R.id.gridview);
        setSupportActionBar(toolbar);

        //calling the progress dialog from the Base activty
        dialogShow(this);

        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationItemSelected());

//Calling the NetworkCommunicator and pass the Urls as arguments

//        popularMovieManager = new PopularMovieManager(this);
//        popularMovieManager.movieManager();
        popularMovieListener = new PopularMovieManager();
        popularMovieListener.movieManager(this);

        getSupportActionBar().setTitle("Popular");

//Onclick of Gridview
        gridView.setOnItemClickListener(new GridviewClick());
    }

    @Override
    public void setImageAdapter(MovieImageAdapter imageAdapter) {
        dialogDismiss();
        gridView.setAdapter(imageAdapter);
    }
}
