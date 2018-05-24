package com.example.nguye.hotel;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDetail extends BaseAdapter {
    private ImageView img;
    private TextView name, address, desc;
    private Intent intent;

    Context context;
    ArrayList<Trangchu> listDetail;

    public AdapterDetail(Context context, ArrayList<Trangchu> listDetail) {
        this.context = context;
        this.listDetail = listDetail;
    }

    @Override
    public int getCount() {
        return 0;
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
        View row = inflater.inflate(R.layout.detail_layout, null);

        img = (ImageView) row.findViewById(R.id.detail_img);
        name = row.findViewById(R.id.detail_title);
        address = row.findViewById(R.id.detail_address);
        desc = row.findViewById(R.id.detail_desc);

        Trangchu trangchu = listDetail.get(i);

        name.setText(trangchu.name);
        address.setText(trangchu.address);
        desc.setText(trangchu.disc);

        Bitmap bmAvatar = BitmapFactory.decodeByteArray(trangchu.image, 0, trangchu.image.length);
        img.setImageBitmap(bmAvatar);

        return  row;
    }
}
