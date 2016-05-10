package com.example.machine2.moviemeter;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends BaseActivity implements NetworkListener,NavigationView.OnNavigationItemSelectedListener  {

    GridView setPosters;
    NavigationView navigationView;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;

    UrlProvider urlProvider;
    NetworkCommunicator networkCommunicator;

    String popularUrl;
    String topratedUrl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        setPosters = (GridView)findViewById(R.id.gridview);

        setSupportActionBar(toolbar);

        dialogShow();

        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        popularUrl = urlProvider.popularUrl;
        topratedUrl = urlProvider.topRatedUrl;

        networkCommunicator = new NetworkCommunicator(this,popularUrl,topratedUrl);
        networkCommunicator.popularMovies(this);

        getSupportActionBar().setTitle("Popular");
    }

    @Override
    public void setImageAdapter(ImageAdapter imageAdapter) {
        dialogDismiss();
       setPosters.setAdapter(imageAdapter);

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        MenuSelector menuSelector = new MenuSelector(this, networkCommunicator,drawer);
        String title = menuSelector.getItem(item);
        getSupportActionBar().setTitle(title);
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }
}
