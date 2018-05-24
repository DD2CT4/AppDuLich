package com.example.nguye.hotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class HotelActivity extends AppCompatActivity {
     private Button btnChiduong;
     private Intent intent;
    //a List of type hero for holding list items
    List<Hotel> hotelList;

    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        //initializing objects
        hotelList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.lvItem);

        //adding some values to our list
        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));

        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));
        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));
        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));
        hotelList.add(new Hotel(R.drawable.ks, "Khách sạn Tuấn Anh", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh."));








        //creating the adapter
        Adapter adapter = new Adapter(this, R.layout.listhotel, hotelList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);



       /*
       * btnChiduong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotelActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
       *
       *
       * */

    }
}
