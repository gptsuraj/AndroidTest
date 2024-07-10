package com.example.practiceproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practiceproject.R;
import com.example.practiceproject.Retrofit.ListModel;
import com.example.practiceproject.Retrofit.MyListAdapter;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        ListModel[] myListData = new ListModel[]{
                new ListModel("Hello",R.drawable.flower),
                new ListModel("Suraj",R.drawable.flower),
                new ListModel("Vishal",R.drawable.flower),
                new ListModel("Rahul",R.drawable.flower),
                new ListModel("Shubham",R.drawable.flower),
                new ListModel("Abhishek",R.drawable.flower),
        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_food);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        //////////////////
        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.rv_food1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager((new LinearLayoutManager(this)));
        LinearLayoutManager layoutManager1 =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(adapter);
    }
}