package com.yanes.assignment2;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Claudia and Lidia Yanes Garcia
 * Assignment 2
 * CSCI 4020
 **/


public class Secondv extends Activity implements View.OnClickListener {
    int[] dcolor = {R.drawable.byellow, R.drawable.bblue, R.drawable.bred, R.drawable.bgreen};
    int[] dcoloroff = {R.drawable.byellowoff, R.drawable.bblueoff, R.drawable.bredoff, R.drawable.bgreenoff};
    int[] ids = {R.id.iyellow, R.id.iblue, R.id.ired, R.id.igreen};
    boolean repe = true;
    int start = 0;
    ArrayList<Integer> sequence = new ArrayList<>();
    ArrayList<Integer> my_sequence = new ArrayList<>();
    int count;
    int count1 = 1;
    ImageButton im;
    boolean equal = true;

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
    private UpdateTask updateTask;

    protected void onPause() {
        super.onPause();
        if (updateTask != null) {
            updateTask.cancel(true);
            updateTask = null;
        }
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bfstart && (start == 1)) {
            Toast.makeText(this, "You have not lost yet", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.bfstart && sequence.size() == my_sequence.size() && (start == 0)) {
            sequence.clear();
            my_sequence.clear();
            start = 1;
            if (updateTask != null && updateTask.getStatus() == AsyncTask.Status.FINISHED) {
                updateTask = null;
            }
            if (updateTask == null) {
                updateTask = new UpdateTask();
                updateTask.execute();

            } else {
                Log.i("START", "task is already running");
            }
        }else if (view.getId() != R.id.bfstart && my_sequence.size()<sequence.size()&& (start==1) && updateTask.getStatus() == AsyncTask.Status.FINISHED) {
            int ii=0;
            if ((view.getId() == R.id.iyellow)) {
                ii=0;
            } else if ((view.getId() == R.id.iblue)) {
                ii=1;
            } else if ((view.getId() == R.id.ired)) {
                ii=2;
            } else if ((view.getId() == R.id.igreen)) {
                ii=3;
            }
            final int iii=ii;
            my_sequence.add(iii);

            im= (ImageButton) findViewById(ids[iii]);
            im.setImageResource(dcolor[iii]);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    im= (ImageButton) findViewById(ids[iii]);
                    im.setImageResource(dcoloroff[iii]);
                }
            },500);

        }

    }


    class UpdateTask extends AsyncTask<Void, Integer, Void> {
        int i = 0;

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (count = 0; count < count1; count++) {
                if (repe == true) {
                    Random rnd = new Random();
                    i = rnd.nextInt(4);
                    sequence.add(i);
                }

                publishProgress(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            if (repe == true) {
                im = (ImageButton) findViewById(ids[values[0]]);
                im.setImageResource(dcolor[values[0]]);
                repe = false;
                count--;
            } else {
                im = (ImageButton) findViewById(ids[values[0]]);
                im.setImageResource(dcoloroff[values[0]]);
                repe = true;
            }
        }

    }
}
