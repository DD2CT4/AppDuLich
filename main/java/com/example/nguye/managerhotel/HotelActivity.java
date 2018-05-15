package com.example.nguye.managerhotel;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {
    final String DATABASE_NAME = "Database.sqlite";
    SQLiteDatabase database;

    ListView listViewHotel;
    ArrayList<Hotel> listhotel;
    AdapterHotel adapterHotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
       addControl();
      readData();
      //  database = Database.initDatabase(this,DATABASE_NAME);
       // Cursor cursor = database.rawQuery("SELECT * FROM Hotel",null);
       // cursor.moveToFirst();
       // Toast.makeText(this,cursor.getString(1), Toast.LENGTH_SHORT).show();

    }


    public void addControl(){
        listViewHotel = (ListView) findViewById(R.id.listviewhotel);
        listhotel = new ArrayList<>();
        adapterHotel = new AdapterHotel(this, listhotel);
        listViewHotel.setAdapter(adapterHotel);
    }

    public  void readData()
    {
        database = Database.initDatabase(this,DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM Hotel",null);
        listhotel.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String address = cursor.getString(2);
            String price = cursor.getString(3);
            byte[] image = cursor.getBlob(4);
            listhotel.add(new Hotel(id, name, address,price ,image));
        }
        adapterHotel.notifyDataSetChanged();
    }
}
