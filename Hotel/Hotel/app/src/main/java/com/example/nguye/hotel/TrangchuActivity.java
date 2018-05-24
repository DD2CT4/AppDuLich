package com.example.nguye.hotel;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.util.ArrayList;

public class TrangchuActivity extends AppCompatActivity {

    final String DATABASE_NAME = "Homes.sqlite";
    SQLiteDatabase database;

    ListView listViewTrangchu;
    ArrayList<Trangchu> listtrangchu;
    AdapterTrangchu adapterTrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        addControl();
        readData();
      //  database = Database.initDatabase(this,DATABASE_NAME);
       // Cursor cursor = database.rawQuery("SELECT * FROM Hotel",null);
       // cursor.moveToFirst();
       // Toast.makeText(this,cursor.getString(1), Toast.LENGTH_SHORT).show();

    }


    public void addControl(){
        listViewTrangchu = (ListView) findViewById(R.id.lisviewtrangchu);
        listtrangchu = new ArrayList<>();
        adapterTrangchu = new AdapterTrangchu(this, listtrangchu);
        listViewTrangchu.setAdapter(adapterTrangchu);
    }

    public  void readData()
    {
        database = Database.initDatabase(this,DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM TrangChu",null);
        listtrangchu.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String address = cursor.getString(2);
            String desc = cursor.getString(3);
            byte[] image = cursor.getBlob(4);
            listtrangchu.add(new Trangchu(id, name, address,desc ,image));
        }
        adapterTrangchu.notifyDataSetChanged();
    }


}
