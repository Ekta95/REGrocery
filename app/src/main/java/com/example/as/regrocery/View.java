package com.example.as.regrocery;

import android.database.Cursor;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class View extends AppCompatActivity{
    ListView listView,quantlist,idlist;
    TextView textView;
    DatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_list);
        listView=(ListView)findViewById(R.id.viewlist);
        quantlist=(ListView)findViewById(R.id.quatlist);
        idlist=(ListView)findViewById(R.id.ID);
        mydb=new DatabaseHelper(this);
       ArrayList<String> list=new ArrayList<>();
       ArrayList<String> quantity=new ArrayList<>();
        ArrayList<String> ids=new ArrayList<>();
        Cursor data=mydb.getdata();
        if(data.getCount()==0){
            Toast.makeText(getApplicationContext(),"There is nothing to show",Toast.LENGTH_SHORT).show();
        }
        else{
            while (data.moveToNext()){
               list.add(data.getString(1));
               ids.add(data.getString(0));
               quantity.add(data.getString(2));
                //textView.setText(data.getString(1));
                ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
                ListAdapter idadapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ids);
                ListAdapter qauntadapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,quantity);
                listView.setAdapter(listAdapter);
                quantlist.setAdapter(qauntadapter);
                idlist.setAdapter(idadapter);
            }
        }
    }
}
