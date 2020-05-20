package com.example.registration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class InfoDB extends SQLiteOpenHelper {

    public InfoDB(Context context)
    {
        super(context,"hannamuni.db",null,1);

    }
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, " + "id STRING, password STRING, name STRING);");

    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS info");
        onCreate(db);
    }

}