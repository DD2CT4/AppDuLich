package com.example.nguye.managerhotel;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {
    final String DATABASE_NAME = "Database.sqlite";
    SQLiteDatabase database;

    ListView listViewRestaurant;
    ArrayList<Restaurant> listresaurant;
    AdapterHotel adapterRestaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        addControl();
        readData();
        //  database = Database.initDatabase(this,DATABASE_NAME);
        // Cursor cursor = database.rawQuery("SELECT * FROM Hotel",null);
        // cursor.moveToFirst();
        // Toast.makeText(this,cursor.getString(1), Toast.LENGTH_SHORT).show();

    }



    public void addControl(){
        listViewRestaurant = (ListView) findViewById(R.id.listviewhotel);
        listresaurant = new ArrayList<Restaurant>();
        adapterRestaurant = new AdapterRestaurant(this, listresaurant);
        listViewRestaurant.setAdapter(adapterRestaurant);
    }


    public  void readData()
    {
        database = Database.initDatabase(this,DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM Restaurant",null);
        listresaurant.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String address = cursor.getString(2);
            String price = cursor.getString(3);
            byte[] anh = cursor.getBlob(4);
            listresaurant.add(new Restaurant(id, name, address,price ,anh));
        }
        adapterRestaurant.notifyDataSetChanged();
    }
}
