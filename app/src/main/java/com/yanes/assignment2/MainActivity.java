package com.yanes.assignment2;
/**
 * Claudia and Lidia Yanes Garcia
 * Assignment 2
 * CSCI 4020
 **/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity  implements View.OnClickListener {
    private static final int REQUEST_CODE_ADD = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.bfirstv);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.bsecondv);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.bthirdv);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        if (view.getId() == R.id.bfirstv) {
            intent = new Intent(this, Firstv.class);
        } else if (view.getId() == R.id.bsecondv) {
            intent = new Intent(this, Secondv.class);
        } else if (view.getId() == R.id.bthirdv) {
            intent = new Intent(this, Thirdv.class);
        }
        startActivityForResult(intent, REQUEST_CODE_ADD);
        
    }
}
