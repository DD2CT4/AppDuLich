package com.example.nguye.hotel;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;




public class Adapter extends ArrayAdapter<Hotel> {


    List<Hotel> hotelList;


    Context context;


    int resource;


    public Adapter(Context context, int resource, List<Hotel> hotelList) {
        super(context, resource, hotelList);
        this.context = context;
        this.resource = resource;
        this.hotelList = hotelList;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);


        View view = layoutInflater.inflate(resource, null, false);


        ImageView imgAvatar = view.findViewById(R.id.imgAvatar);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtAddress = view.findViewById(R.id.txtAddress);



        Hotel hotel = hotelList.get(position);


        imgAvatar.setImageDrawable(context.getResources().getDrawable(hotel.getImage()));
        txtName.setText(hotel.getName());
        txtAddress.setText(hotel.getAdd());





        return view;
    }

}

