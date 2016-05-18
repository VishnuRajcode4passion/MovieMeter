package com.example.machine2.moviemeter;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

/**
 * Created by machine3 on 5/14/16.
 */
public class GridviewClick implements AdapterView.OnItemClickListener {
    TextView v;
    String movieId;
    Intent intent;
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        v = (TextView) view.findViewById(R.id.textView);
        movieId = (String) v.getText();
        intent = new Intent(view.getContext(), MovieDetailActivity.class);
        intent.putExtra("selectedId", movieId);
        view.getContext().startActivity(intent);
    }
}
