package com.example.machine2.moviemeter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements MovieListener,NavigationView.OnNavigationItemSelectedListener  {

 //variable declaration

    GridView setPosters;
    NavigationView navigationView;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NetworkCommunicator networkCommunicator;
    UrlProvider urlProvider;
    PopularMovieManager popularMovieManager;
    String popularUrl;
    String topratedUrl;
    String detailsUrl;
    String movie_Id;
    TextView movieId;
    Toolbar toolbar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        setPosters = (GridView)findViewById(R.id.gridview);
        setSupportActionBar(toolbar);

 //calling the progress dialog from the Base activty


        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        topratedUrl = urlProvider.topRatedUrl;
        detailsUrl = urlProvider.movieDetailsUrl;

//Calling the NetworkCommunicator and pass the Urls as arguments

     popularMovieManager = new PopularMovieManager(this);
     popularMovieManager.MovieManager();
     //networkCommunicator = new NetworkCommunicator();


        getSupportActionBar().setTitle("Popular");

//Onclick of Gridview

        setPosters.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                movieId = (TextView)view.findViewById(R.id.textView);
                movie_Id = (String)movieId.getText();
                intent = new Intent(MainActivity.this,MovieDetailActivity.class);
                intent.putExtra("id",movie_Id);
                intent.putExtra("detailUrls",detailsUrl);
                startActivity(intent);


            }
        });
    }

//Set the posters on the Gridview

    @Override
    public void setImageAdapter(MovieImageAdapter imageAdapter) {

        setPosters.setAdapter(imageAdapter);

    }
//Manages the clicks on the Navigation Menu's

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        NavigationMenuSelector menuSelector = new NavigationMenuSelector(this, networkCommunicator,drawer);
        String title = menuSelector.getItem(item);
        getSupportActionBar().setTitle(title);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
