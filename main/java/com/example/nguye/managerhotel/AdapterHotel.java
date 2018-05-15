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

public class AdapterHotel extends BaseAdapter {
    Context context;
    ArrayList<Hotel> listHotel;

    public AdapterHotel(Context context, ArrayList<Hotel> listHotel) {
        this.context = context;
        this.listHotel = listHotel;
    }

    public int getCount() {
        return listHotel.size();
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
        View row = inflater.inflate(R.layout.listhotel, null);

        ImageView imgHinhDaiDien = (ImageView) row.findViewById(R.id.imgAvatar);

        TextView txtName = (TextView) row.findViewById(R.id.txtName);
        TextView txtAddress = (TextView) row.findViewById(R.id.txtAddress);
        TextView txtPrice = (TextView) row.findViewById(R.id.txtPrice);
        Button btnChiDuong = (Button) row.findViewById(R.id.btnChiDuong);

        Hotel hoTel = listHotel.get(i);



        txtName.setText(hoTel.name);
        txtAddress.setText(hoTel.address);
        txtPrice.setText(hoTel.price);

        Bitmap bmAvatar = BitmapFactory.decodeByteArray(hoTel.anh, 0, hoTel.anh.length);
        imgHinhDaiDien.setImageBitmap(bmAvatar);


        return  row;
    }
}
