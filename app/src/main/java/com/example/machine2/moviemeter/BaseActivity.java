package com.example.machine2.moviemeter;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by machine2 on 09/05/16.
 */
public class BaseActivity extends AppCompatActivity {
    ProgressDialog progressDialog;

    public void dialogShow() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Processing...");
        progressDialog.setMessage("Please wait.");
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
    }
    public void dialogDismiss() {
        progressDialog.dismiss();
    }


}


