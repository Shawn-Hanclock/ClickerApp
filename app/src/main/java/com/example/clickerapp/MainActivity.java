package com.example.clickerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public Button clickBtn;
    public TextView clicksTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add resources being loaded
        clicksTv = (TextView) findViewById(R.id.clickTotal);
        clickBtn = (Button) findViewById(R.id.clickButton);
    }

    public int clicks = 0; //click counter variable
    public void btnClick(View view) {
        clicks++;
        clicksTv.setText(clicks+"");
    }
}