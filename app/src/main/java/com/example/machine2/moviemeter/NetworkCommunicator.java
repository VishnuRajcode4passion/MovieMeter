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

    //Variables and class declartions
    private static final String TAG = "NetworkCommunicator";
    AsyncHttpClient client;
    String url;
    Context context;
    MoviePosterParser moviePosterParser;
    MovieImageAdapter imageAdapter;


    public NetworkCommunicator(Context context, String url) {
        this.url = url;
        this.context = context;
    }

    //method created for the Movies
    public void posters(final PopularMovieListener popularMovieListener) {

        client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("api_key", "efc0d91dd29ee74d0c55029e31266793");

        client.get(url, params, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                //  MoviePosterParser moviePosterParser = new MoviePosterParser(responseBody);
                moviePosterParser = new MoviePosterParser(context, responseBody);
                imageAdapter = moviePosterParser.poster();
                popularMovieListener.getPopularImages(imageAdapter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                //Toast.makeText(context,"NETWORK ERROR " + error,Toast.LENGTH_LONG).show();
                NetworkErrors networkErrors = new NetworkErrors();
                networkErrors.showError(statusCode, error);
            }
        });
    }
}
