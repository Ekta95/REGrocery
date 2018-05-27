package com.example.as.regrocery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shubham on 13-Mar-18.
 */

public class Add_spice extends AppCompatActivity {
    private  Spinner spinner1,spinner2;
    private TextView text1,text2;
    private Button  Add;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_spice);
        spinner1=(Spinner)findViewById(R.id.itemsp);
        spinner2=(Spinner)findViewById(R.id.Quantsp);
        text1=(TextView)findViewById(R.id.Name);
        text2=(TextView)findViewById(R.id.Quantity);
        Add=(Button)findViewById(R.id.Add);
        databaseHelper=new DatabaseHelper(this);
    }
    public void additem(View v){
        Items items=new Items(spinner1.getSelectedItem().toString(),Integer.parseInt(spinner2.getSelectedItem().toString()));
        boolean insertdata=databaseHelper.addata_item(items);
        if (insertdata==true){
            Toast.makeText(getApplicationContext(),"Successfully Added",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Error in Database Connection,try again",Toast.LENGTH_LONG).show();
        }

    }

}
