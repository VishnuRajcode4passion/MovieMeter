package com.example.machine2.moviemeter;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by machine2 on 09/05/16.
 */
public class BaseActivity extends AppCompatActivity {

    ProgressDialog progressDialog;

    public void dialogShow(Context context) {
        progressDialog = new ProgressDialog(context);
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


