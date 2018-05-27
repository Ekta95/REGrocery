package com.example.as.regrocery;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Shubham on 12-Mar-18.
 */

public class Home extends AppCompatActivity {
    Button button1;
    Button button2;
    TextView textView,textView1;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        textView=(TextView)findViewById(R.id.wish);
        textView1=(TextView)findViewById(R.id.clear);
        button1=(Button)findViewById(R.id.view);
        button2=(Button)findViewById(R.id.add);
    }
    public void viewrec(View v){
        Intent homeIntent= new Intent(Home.this, com.example.as.regrocery.View.class);
        startActivity(homeIntent);

    }
    public void addrec(View v){
        Intent homeIntent= new Intent(Home.this,Addgroc.class);
        startActivity(homeIntent);

    }
    public void wishlist(View v){
        Intent homeIntent= new Intent(Home.this,Wishlist.class);
        startActivity(homeIntent);
    }
    public void clear(View v){
        Intent homeIntent= new Intent(Home.this,Clearlist.class);
        startActivity(homeIntent);
    }

}