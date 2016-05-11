package com.example.machine2.moviemeter;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by machine2 on 09/05/16.
 */

//Network problems are shows in this class

public class NetworkErrors {

    public void showError(Context context, int statusCode, Throwable error)
    {
        Toast.makeText(context, "Check your network connection " + error, Toast.LENGTH_LONG).show();
    }
}
