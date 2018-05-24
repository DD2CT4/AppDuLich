package com.example.nguye.hotel;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class RestaurantActivity extends AppCompatActivity {
     private Button btnChiduong;
     private Intent intent;
    //a List of type hero for holding list items
    List<Restaurant> restaurantList;

    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        //initializing objects
        restaurantList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.lvItem);

        //adding some values to our list
        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));
        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));

        restaurantList.add(new Restaurant(R.drawable.nhahang, "Nhà hàng AB Tower", "Địa chỉ: 168 Đường Cống Quỳnh, Phường Phạm Ngũ Lão, Quận 1, Tp. Hồ Chí Minh.","300.000VND - 600.000VND"));


        //creating the adapter
        AdapterRes adapter = new AdapterRes(this, R.layout.listrestaurant, restaurantList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);

        /*
        *  btnChiduong = (Button) findViewById(R.id.btnChiDuongRestaurent);
        btnChiduong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        *
        * */


    }

}
