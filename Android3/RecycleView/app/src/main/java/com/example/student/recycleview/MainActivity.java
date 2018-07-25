package com.example.student.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;
    protected MyAdapter adapter;
    protected List<RecyclerItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();
        listItems.add(new RecyclerItem(getString(R.string.Revolver), R.drawable.revolver, getString(R.string.revolver), 5));
        listItems.add(new RecyclerItem(getString(R.string.DonnieBrasco), R.drawable.doniebracko,getString(R.string.donniebracko) , 4));
        listItems.add(new RecyclerItem(getString(R.string.PiratesofCaribbean), R.drawable.piratesofcaribbean, getString(R.string.piratsofcaribean), 5));
        listItems.add(new RecyclerItem(getString(R.string.Forsage7), R.drawable.forsaje7, getString(R.string.Forsaje7), 3));
        listItems.add(new RecyclerItem(getString(R.string.JohnWick), R.drawable.johnwick, getString(R.string.johnwick), 4));
        adapter = new MyAdapter(this,listItems);
        adapter = new MyAdapter(this,listItems);
        recyclerView.setAdapter(adapter);

    }
}
