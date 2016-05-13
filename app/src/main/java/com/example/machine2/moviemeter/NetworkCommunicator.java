package com.example.machine2.moviemeter;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

/**
 * Created by machine2 on 09/05/16.
 */
public class NetworkCommunicator  {

    //Variables and class declartions
    private static final String TAG = "NetworkCommunicator";
    AsyncHttpClient client;
    Context context;

    String popularUrl;
    String topratedUrl;
    String movie_id;
    String dataUrl;
    String detailUrl;
    String url;

    MovieDetailActivity movieDetailActivity;

    public NetworkCommunicator( Context context, String popularUrl) {

        this.context=context;
        this.url=popularUrl;
    }


    //method created for the popularMovies
    public void posters(final MovieListener movieListener){

        client=new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("api_key","efc0d91dd29ee74d0c55029e31266793");

        client.get(url,params, new AsyncHttpResponseHandler() {


            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                MoviePosterParser popularMoviesManager = new MoviePosterParser(context,responseBody);
                popularMoviesManager.poster(movieListener);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                //Toast.makeText(context,"NETWORK ERROR " + error,Toast.LENGTH_LONG).show();
                NetworkErrors networkErrors = new NetworkErrors();
                networkErrors.showError(context,statusCode,error);
            }
        });
    }

}
