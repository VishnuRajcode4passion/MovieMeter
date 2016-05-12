package com.example.machine2.moviemeter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

/**
 * Created by machine2 on 10/05/16.
 */
public class NavigationMenuSelector {

   //Variable and class declarations
    Context context;
    NetworkCommunicator networkCommunication;
    DrawerLayout drawer;
    String title;

   //The menu selctions in the NavigationDrawer activity
    public NavigationMenuSelector(Context context, NetworkCommunicator networkCommunication, DrawerLayout drawer) {
        this.context = context;
        this.networkCommunication = networkCommunication;
        this.drawer = drawer;
    }

    public String getItem(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.topRated) {

            networkCommunication.topRatedMovies((NetworkListener) context);
            title = "Top Rated";

        }
        else if (id == R.id.popular) {

            networkCommunication.popularMovies((NetworkListener) context);
            title = "Popular";
        }

        else if (id == R.id.favorite)
        {
            title = "Favorite";
        }

        else if (id == R.id.logout) {

            drawer.closeDrawer(GravityCompat.START);
            Intent intent = new Intent(context,LoginActivity.class);
            context.startActivity(intent);
        }
        return title;
    }
}
