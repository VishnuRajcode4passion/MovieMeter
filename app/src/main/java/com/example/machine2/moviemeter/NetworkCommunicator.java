package com.example.machine2.moviemeter;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

/**
 * Created by machine2 on 09/05/16.
 */
public class NetworkCommunicator {
    AsyncHttpClient client;
    Context context;

    String popularUrl;
    String topratedUrl;


    public NetworkCommunicator( Context context, String popularUrl, String topratedUrl) {

        this.context = context;
        this.popularUrl = popularUrl;
        this.topratedUrl = topratedUrl;
    }

    public void popularMovies(final NetworkListener networkListener){

        client=new AsyncHttpClient();

        RequestParams params = new RequestParams();
        params.put("api_key","efc0d91dd29ee74d0c55029e31266793");

        client.get(popularUrl,params, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                MoviePosterManager popularMoviesManager = new MoviePosterManager(context,responseBody);
                popularMoviesManager.popular(networkListener);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
//                Toast.makeText(context,"NETWORK ERROR " + error,Toast.LENGTH_LONG).show();
                NetworkErrors networkErrors = new NetworkErrors();
                networkErrors.showError(context,statusCode,error);
            }
        });
    }

}
