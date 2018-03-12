package com.yanes.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity  implements View.OnClickListener {

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
        
    }
}
