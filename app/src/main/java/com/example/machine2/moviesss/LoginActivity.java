package com.example.machine2.moviesss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity
{
    ImageView loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);
        loginButton = (ImageView)findViewById(R.id.imageView6);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                System.out.println("login ");
                Intent intent;
                intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }

}
