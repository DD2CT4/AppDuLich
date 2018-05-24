package com.example.nguye.hotel;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRes extends ArrayAdapter<Restaurant> {


    List<Restaurant> restaurantList;


    Context context;


    int resource;


    public AdapterRes(Context context, int resource, List<Restaurant> restaurantList) {
        super(context, resource, restaurantList);
        this.context = context;
        this.resource = resource;
        this.restaurantList = restaurantList;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);


        View view = layoutInflater.inflate(resource, null, false);


        ImageView imgAvatar = view.findViewById(R.id.imgAvatar);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtAddress = view.findViewById(R.id.txtAddress);
        TextView txtPrice = view.findViewById(R.id.txtPrice);



        Restaurant restaurant = restaurantList.get(position);


        imgAvatar.setImageDrawable(context.getResources().getDrawable(restaurant.getImage()));
        txtName.setText(restaurant.getName());
        txtAddress.setText(restaurant.getAdd());
        txtPrice.setText(restaurant.getPrice());





        return view;
    }

}