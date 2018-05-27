package com.example.as.regrocery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Clearlist extends AppCompatActivity {
    TextView textView,text1;
    EditText editText;
    Button   clearall;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clearlist);
        textView=(TextView)findViewById(R.id.cleattext);
        text1=(TextView)findViewById(R.id.droptable);
        editText=(EditText)findViewById(R.id.clearid);
        clearall=(Button)findViewById(R.id.clear);
    }
    public void clear(View v){
        int id=Integer.parseInt(editText.getText().toString());
        databaseHelper=new DatabaseHelper(this);
       boolean cleardata= databaseHelper.cleardata(id);
        if (cleardata==true){
            Toast.makeText(getApplicationContext(),"Successfully Deleted",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Error ",Toast.LENGTH_SHORT).show();
        }

    }
    public void droptable(View v){
        databaseHelper=new DatabaseHelper(this);
        databaseHelper.droptable();
        Toast.makeText(getApplicationContext(),"Successfully Deleted list",Toast.LENGTH_SHORT).show();


    }
}
