package com.example.meysam95.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class GridviewActivity extends AppCompatActivity {
    Intent intent;
    static final String[] item = new String[]{
            " Basics", "Event", "Activity", "Gateway",
            "Flow", "Data", "Artifact", "Swimlane",
            "Rules", "Clarification",
            "Practices",
            "Modeling",
            "Examples", "Glossary"
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        GridView gridView= (GridView) findViewById(R.id.gridView1);
        GridviewAdapter adapter=new GridviewAdapter(this,R.layout.activity_grid_view_item,getData());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent=new Intent(GridviewActivity.this,Sample.class);
                startActivity(intent);
            }
        });


    }
    ArrayList<String> getData(){
        final ArrayList<String> items=new ArrayList<>();
        for (int i=0;i<item.length;i++){
            items.add(item[i]);
        }
        return items;
    }
}
