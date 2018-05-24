package com.example.nguye.hotel;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterTrangchu extends BaseAdapter {
    Context context;
    ArrayList<Trangchu> listtrangchu;
    private Intent intent;

    public AdapterTrangchu(Context context, ArrayList<Trangchu> listHotel) {
        this.context = context;
        this.listtrangchu = listHotel;
        this.intent = new Intent(context, DetailActivity.class);
    }

    public int getCount() {
        return listtrangchu.size();
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
        View row = inflater.inflate(R.layout.listtrangchu, null);

        ImageView imgHinhDaiDien = (ImageView) row.findViewById(R.id.imgAvatar);

        TextView txtName = (TextView) row.findViewById(R.id.txtName);
        TextView txtAddress = (TextView) row.findViewById(R.id.txtAddress);
        TextView txtDisc= (TextView) row.findViewById(R.id.txtDisc);

        final Trangchu trangchu = listtrangchu.get(i);

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", trangchu);
                intent.putExtra("key", bundle);
                context.startActivity(intent);
            }
        });

        txtName.setText(trangchu.name);
        txtAddress.setText(trangchu.address);
        txtDisc.setText(trangchu.disc.substring(0, 50)+ "...");

        Bitmap bmAvatar = BitmapFactory.decodeByteArray(trangchu.image, 0, trangchu.image.length);
        imgHinhDaiDien.setImageBitmap(bmAvatar);


        return  row;
    }
}
