package com.yanes.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Claudia and Lidia Yanes Garcia
 * Assignment 22
 * CSCI 4020
 **/

public class Rules extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        TextView tv1 = (TextView)findViewById(R.id.tvinfo1);
        tv1.setText("The first variation of Simon's game is the traditional one."+
                "Simon is an old electronic game from the 70s. It randomly picks one of its four buttons, lights it up, and plays a sound. " +
                "The user must press the same button. Simon plays that button again, and then randomly chooses another button. " +
                "The user must hit those two buttons in the correct order. " +
                " If the user succeeds, the series becomes progressively longer and more complex. Once the user fails, the game is over."
        );
        TextView tv2 = (TextView)findViewById(R.id.tvinfo2);
        tv2.setText("The second variation of Simon's game also requires a user to repeat the sequence." +
                "However, in this version, Simon creates a series of tones and lights ramdomly every single time");
        TextView tv3 = (TextView)findViewById(R.id.tvinfo3);
        tv3.setText("The third variation of Simon's game also requires a user to repeat the sequence. "+
                "At the beginning, the player needs to repeat a sequence of three element. " +
                "After winning a level, simon will increase the speed in which lights appear and disappear." +
                "When the player gets the level 14, the number of elements that are part of the serie increase by one and the speed will slow down." +
                "It will happen every 14 levels.");
    }
}
