package com.example.machine2.moviemeter;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.view.MenuItem;

/**
 * Created by machine3 on 5/14/16.
 */
public class NavigationItemSelected extends MainActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        dialogShow(this);
        NavigationMenuSelector menuSelector = new NavigationMenuSelector(this,networkCommunicator,drawer);
        String title = menuSelector.getItem(item);
     //  dialogDismiss();

        getSupportActionBar().setTitle(title);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
