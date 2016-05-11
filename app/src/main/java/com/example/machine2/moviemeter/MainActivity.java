package com.example.machine2.moviemeter;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends BaseActivity implements NetworkListener,NavigationView.OnNavigationItemSelectedListener
{

 //variable declaration
    GridView gridView;
    NavigationView navigationView;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;

    UrlProvider urlProvider;
    NetworkCommunicator networkCommunicator;

    String popularUrl;
    String topratedUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        gridView = (GridView)findViewById(R.id.gridview);
        setSupportActionBar(toolbar);

        //calling the progress dialog from the Base activty
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        popularUrl = urlProvider.popularUrl;
        topratedUrl = urlProvider.topRatedUrl;

       //Calling the NetworkCommunicator and pass the Urls as arguments
        networkCommunicator = new NetworkCommunicator(this,popularUrl,topratedUrl);
        networkCommunicator.popularMovies(this);

        getSupportActionBar().setTitle("Popular");
    }

//Set the posters on the Gridview

    @Override
<<<<<<< HEAD
    public void setImageAdapter(MovieImageAdapter imageAdapter) {
        gridView.setAdapter(imageAdapter);
=======
    public void setImageAdapter(MovieImageAdapter imageAdapter)
    {

        dialogDismiss();
        setPosters.setAdapter(imageAdapter);
>>>>>>> 2c14a70f8c848d6fe9055dce2d07c96ca5110ded

    }
//Manages the clicks on the Navigation Menu's

    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {

        NavigationMenuSelector menuSelector = new NavigationMenuSelector(this, networkCommunicator,drawer);
        String title = menuSelector.getItem(item);
        getSupportActionBar().setTitle(title);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
