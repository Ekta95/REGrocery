package com.example.as.regrocery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shubham on 13-Mar-18.
 */

public class Wishlist extends AppCompatActivity {
    private  Spinner spinner1;
    private EditText editText;
    private TextView text1,text2;
    private Button  Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishlist);
        spinner1=(Spinner)findViewById(R.id.itemfl);
        editText=(EditText)findViewById(R.id.item) ;
        text1=(TextView)findViewById(R.id.category);
        text2=(TextView)findViewById(R.id.Item);
        Add=(Button)findViewById(R.id.Addit);
    }
    public void additem(View v){
        Toast.makeText(getApplicationContext(),"Thanks for your Feedback",Toast.LENGTH_LONG).show();
        editText.setText("");
    }

}
