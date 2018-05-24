package com.example.nguye.hotel;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailActivity extends AppCompatActivity {
    private Button btnKhachsan;
    private Button btnNhahang;
    private Button btnChiduong;
    private ImageView img;
    private TextView name, address, desc;
    private Intent intent;
    int i;
    ArrayList<Trangchu> listDetail;
    final String DATABASE_NAME = "Homes.sqlite";
    SQLiteDatabase database;
    AdapterDetail adapterDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);


        readData();
//        Intent intent = new Intent (this,  AdapterDetail.class);
//        startActivity(intent);

        img = findViewById(R.id.detail_img);
        name = findViewById(R.id.detail_title);
        address = findViewById(R.id.detail_address);
        desc = findViewById(R.id.detail_desc);
//
        intent = getIntent();
        Bundle bundle = intent.getBundleExtra("key");
        Trangchu trangchu = (Trangchu) bundle.getSerializable("data");
//
//        name.setText(place.getName());
//        address.setText(place.getAddress());
//        desc.setText(place.getDesc());
//        int image = getResources().getIdentifier(place.getImage(), "drawable", getPackageName());
//        Drawable drawable = img.getResources().getDrawable(image);
//        img.setImageDrawable(drawable);

        //Trangchu trangchu = listDetail.get(i);

        name.setText(trangchu.name.toString());
        address.setText(trangchu.address);
        desc.setText(trangchu.disc);

        Bitmap bmAvatar = BitmapFactory.decodeByteArray(trangchu.image, 0, trangchu.image.length);
        img.setImageBitmap(bmAvatar);

        btnKhachsan = (Button) findViewById(R.id.btnKhachsan);
        btnKhachsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, HotelActivity.class);
                startActivity(intent);
            }
        });

        btnNhahang = (Button) findViewById(R.id.btnNhahang);
        btnNhahang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, RestaurantActivity.class);
                startActivity(intent);
            }
        });

        btnChiduong = (Button) findViewById(R.id.btnChiDuongDetail);
        btnChiduong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void readData()
    {
        database = Database.initDatabase(this,DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM TrangChu WHERE id=1",null);
        //listDetail.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String address = cursor.getString(2);
            String desc = cursor.getString(3);
            byte[] image = cursor.getBlob(4);
            //listDetail.add(new Trangchu(id, name, address,desc ,image));
        }
        //adapterDetail.notifyDataSetChanged();
    }
}
