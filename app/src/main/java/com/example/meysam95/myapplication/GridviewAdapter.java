package com.example.meysam95.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridviewAdapter extends ArrayAdapter {
    Context context;
    ArrayList<String> items=new ArrayList();
    int resource;

    public GridviewAdapter(Context context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);
        this.context=context;
        this.items=objects;
        this.resource=resource;
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View row=convertView;
        ViewHolder holder;
        if(row == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.activity_grid_view_item,null);
            holder=new ViewHolder();
            holder.textView= (TextView) row.findViewById(R.id.gridview_item_id);
            holder.layout= (LinearLayout) row.findViewById(R.id.gridview_parent_id);
            row.setTag(holder);
        }else{
            holder= (ViewHolder) row.getTag();
        }
        holder.textView.setText(items.get(position));
        return row;
    }

    private class ViewHolder{
        TextView textView;
        LinearLayout layout;
    }

}
