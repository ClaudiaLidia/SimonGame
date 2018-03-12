package com.yanes.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Claudia and Lidia Yanes Garcia
 * Assignment 2
 * CSCI 4020
 **/

public class Thirdv extends Activity implements View.OnClickListener{
    int[] dcolor = {R.drawable.byellow, R.drawable.bblue, R.drawable.bred, R.drawable.bgreen};
    int[] dcoloroff = {R.drawable.byellowoff, R.drawable.bblueoff, R.drawable.bredoff, R.drawable.bgreenoff};
    int[] ids = {R.id.iyellow, R.id.iblue, R.id.ired, R.id.igreen};
    boolean repe = true;
    int start=0;
    ArrayList<Integer> sequence = new ArrayList<>();
    ArrayList<Integer> my_sequence = new ArrayList<>();
    int count;
    int count1=3;
    int count2=700;
    ImageButton im;
    boolean equal= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button button = (Button) findViewById(R.id.bfstart);
        button.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.iyellow);
        imageButton.setOnClickListener(this);
        imageButton = (ImageButton) findViewById(R.id.iblue);
        imageButton.setOnClickListener(this);
        imageButton = (ImageButton) findViewById(R.id.ired);
        imageButton.setOnClickListener(this);
        imageButton = (ImageButton) findViewById(R.id.igreen);
        imageButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

    }
}
