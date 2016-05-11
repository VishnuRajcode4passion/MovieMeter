package com.example.machine2.moviemeter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by machine2 on 11/05/16.
 */
public class MovieDetailActivity extends AppCompatActivity{

//variable declaration

    TextView releaseYear;
    TextView movieRating;
    TextView movieDuration;
    TextView movieDescription;

    Integer runtime;
    String title;
    String overview;
    String poster;
    String releaseDate;
    String movie_id;
    String dataUrl;
    Double rating;

    CheckBox favorite;

    ImageView moviePoster;

    ListView trailer;
    Bundle bundle;

    NetworkCommunicator networkCommunicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page);

        releaseYear = (TextView)findViewById(R.id.year_of_relese);
        movieRating = (TextView)findViewById(R.id.rating);
        movieDuration = (TextView)findViewById(R.id.durationOfTheMovie);
        movieDescription = (TextView)findViewById(R.id.movie_description);
        favorite = (CheckBox)findViewById(R.id.checkBox_favorite);
        moviePoster = (ImageView)findViewById(R.id.movie_poster);
        trailer = (ListView)findViewById(R.id.listView);

        bundle = getIntent().getExtras();
        movie_id = bundle.getString("id");
        dataUrl = bundle.getString("detailUrls");
        networkCommunicator=new NetworkCommunicator(this,movie_id,dataUrl);
        networkCommunicator.movieDetails();

    }
}
