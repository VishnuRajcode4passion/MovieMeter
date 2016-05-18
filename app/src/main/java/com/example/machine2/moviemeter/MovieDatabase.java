package com.example.machine2.moviemeter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//Movie table fields,databasename,table names declaration
public class MovieDatabase {

    public static final String Favoriteid = "_id";
    public static final String Movieid = "movie_id";
    public static final String Database = "moviedb";
    public static final String Table = "movietbl";
    public static final Integer Version = 1;
    public static final String Query = "CREATE TABLE " + Table + "("
            + Favoriteid + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + Movieid + "  INTEGER)";

    private final Context context;
    private SQLiteDatabase db;
    private Dbhelp dbhelp;

    //constructor is created
    public MovieDatabase(Context context) {
        this.context = context;
        dbhelp = new Dbhelp(context);
    }

    public MovieDatabase open() {
        db = dbhelp.getWritableDatabase();
        return this;
    }

    public void close() {
        dbhelp.close();
    }

    //inserting data into database
    public long insert(Integer movie_id) {
        ContentValues values = new ContentValues();
        values.put(Movieid, movie_id);
        return db.insert(Table, null, values);
    }

    //fetching all the data from the database
    public String getdata() {

        String[] column = new String[]{Favoriteid, Movieid};
        Cursor movidata = db.query(Table, column, null, null, null, null, null);
        String result = "";

        int Favorite_id = movidata.getColumnIndex(Favoriteid);
        int Movie_id = movidata.getColumnIndex(Movieid);

        for (movidata.moveToFirst(); !movidata.isAfterLast(); movidata.moveToNext()) {
            result = result + movidata.getString(Favorite_id) + " " + movidata.getString(Movie_id) + "\n";

        }
        return result;

    }

    //deleting the corrosponding data from the database
    public void delete(long id) {
        db.delete(Table, Favoriteid + " = " + id, null);
    }

    public static class Dbhelp extends SQLiteOpenHelper {


        public Dbhelp(Context context) {
            super(context, Database, null, Version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(Query);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + Table);
            onCreate(db);

        }
    }


}


