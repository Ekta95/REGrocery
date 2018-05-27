package com.example.as.regrocery;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String Tag = "Database.db";
    private static final String TABLE_NAME = "grocery";
    private static final String COL2 = "Items";
    private static final String COL1="id";
    private static final String COL3="Quantity";

    public DatabaseHelper(Context context) {
        super(context, Tag, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "(id INTEGER PRIMARY KEY  , " + COL2 + " TEXT, "+ COL3 + " INTEGER " + ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addata_item(Items item) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,item.getItem().toString());
       // contentValues.put(COL1,1);
        contentValues.put(COL3,item.getQuant()+"kg");
        long result=db.insert(TABLE_NAME, null,contentValues);
       if (result==-1){
           return false;

       }
       else
           return true;

    }

public Cursor getdata(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor data=db.rawQuery("SELECT * FROM "+ TABLE_NAME,null);
        return data;
}
public boolean cleardata(int Id){
        if (Id<1){
            return false;
        }
        else {
            SQLiteDatabase db = this.getWritableDatabase();
            db.execSQL("delete from " + TABLE_NAME + " where id=" + Id + ";");

                      return true;
        }
}
public void droptable(){
    SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL("DELETE FROM " +TABLE_NAME +";");
    db.execSQL("update grocery set id=1;");
}
}