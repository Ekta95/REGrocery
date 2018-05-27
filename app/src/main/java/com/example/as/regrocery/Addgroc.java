package com.example.as.regrocery;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shubham on 13-Mar-18.
 */

public class Addgroc extends AppCompatActivity {
    ImageView image1_pul,image_gr,image_fl,image_sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_groc);

        image1_pul=(ImageView)findViewById(R.id.pulses);
        image_fl=(ImageView)findViewById(R.id.flour);
        image_gr=(ImageView)findViewById(R.id.grains);
        image_sp=(ImageView)findViewById(R.id.spices);

    }
     public void addpulse(View v){

        Intent homeIntent= new Intent(Addgroc.this,Add_pulse.class);
        startActivity(homeIntent);
    }
    public void addgrain(View v){
        Intent homeIntent= new Intent(Addgroc.this,Add_grain.class);
        startActivity(homeIntent);

    }
    public void addspice(View v){
        Intent homeIntent= new Intent(Addgroc.this,Add_spice.class);
        startActivity(homeIntent);

    }
    public void addflour(View v){

        Intent homeIntent= new Intent(Addgroc.this,Add_flour.class);
        startActivity(homeIntent);
    }


}
