package com.example.rebor.dasd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ReBor on 2017-12-04.
 */

public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Item> list;
    LayoutInflater inflater;

    public Adapter(Context context, int layout, ArrayList<Item> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public Object getItem(int position){
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public int getCount(){
        return list.size();
    }

    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null){
            convertView = inflater.inflate(layout, null);

        }
        TextView num = convertView.findViewById(R.id.num);
        TextView name = convertView.findViewById(R.id.name);
        TextView price = convertView.findViewById(R.id.price);
        TextView dscrt = convertView.findViewById(R.id.dscrt);

        Item item = list.get(position);
        num.setText(String.valueOf(item.getNum()));
        name.setText(item.getName());
        price.setText(String.valueOf(item.getPrice()));
        dscrt.setText(item.getDscrt());

        return convertView;
    }

}
