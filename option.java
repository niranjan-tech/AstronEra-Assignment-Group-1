package com.example.learnstar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//this option.java contains two options
public class option extends AppCompatActivity
{
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        //getting id of every element
        b2 = (Button)findViewById(R.id.telescope);
        b1 = (Button)findViewById(R.id.startstuff);
        //setting listener we can go from option.java to stars.class
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(option.this,stars.class);
                startActivity(intent);
            }
        });
        //setting listener we can go from option.java to stars.class

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(option.this,telescope.class);
                startActivity(intent);
            }
        });
    }
}