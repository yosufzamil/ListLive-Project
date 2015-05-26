package com.example.zamil.listviewimage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zamil on 5/25/2015.
 */
public class CustomList extends ArrayAdapter<String>{

    private final String web[];
    private final Activity context;
    private final Integer imageId[];
    TextView txtTitle;
    ImageView imageView;

    public CustomList(Activity context, String web[],Integer imageId[]){
        super(context, R.layout.list_single, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;


    }
    @Override
    public View getView(int position,View view,ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_single,null,true);

        txtTitle = (TextView) rowView.findViewById(R.id.img);
        imageView = (ImageView) rowView.findViewById(R.id.txt);


        txtTitle.setText(web[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;


    }





}
