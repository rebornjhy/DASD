package com.example.rebor.dasd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ReBor on 2017-12-04.
 */

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

    }

    public void moveMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void moveManage(View view) {
        Intent intent = new Intent(this, ManageActivity.class);
        startActivity(intent);
    }
}
