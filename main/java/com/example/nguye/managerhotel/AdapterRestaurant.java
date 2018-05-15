package com.example.nguye.managerhotel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterRestaurant extends BaseAdapter {
    Context context;
    ArrayList<Restaurant> listRestaurant;

    public AdapterRestaurant(Context context, ArrayList<Restaurant> listHotel) {
        this.context = context;
        this.listRestaurant = listRestaurant;
    }

    public int getCount() {
        return listRestaurant.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listrestaurant, null);

        ImageView imgHinhDaiDien = (ImageView) row.findViewById(R.id.imgAvatar);

        TextView txtName = (TextView) row.findViewById(R.id.txtName);
        TextView txtAddress = (TextView) row.findViewById(R.id.txtAddress);
        TextView txtPrice = (TextView) row.findViewById(R.id.txtPrice);
        Button btnChiDuong = (Button) row.findViewById(R.id.btnChiDuong);

        Restaurant restaurant = listRestaurant.get(i);



        txtName.setText(restaurant.name);
        txtAddress.setText(restaurant.address);
        txtPrice.setText(restaurant.price);

        Bitmap bmAvatar = BitmapFactory.decodeByteArray(restaurant.anh, 0, restaurant.anh.length);
        imgHinhDaiDien.setImageBitmap(bmAvatar);


        return  row;
    }
}
