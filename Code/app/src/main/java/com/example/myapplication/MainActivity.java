package com.example.myapplication;

/*Programmer:     Caleb Barnhart
        Program Name:   Blood Bowl Calculator */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void block(View view){
        setContentView(R.layout.block);
    }

    public void skills(View view){

    }

    public void calculateBlock(View view){

    }
}
