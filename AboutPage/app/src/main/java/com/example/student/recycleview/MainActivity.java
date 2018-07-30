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
        listItems.add(new RecyclerItem(R.drawable.ic_menq, "Mikael Gabrielyan"));
        listItems.add(new RecyclerItem(R.drawable.ic_menq,"Mher Melqonyan"));
        listItems.add(new RecyclerItem(R.drawable.ic_menq, "Vahan Hovhannisyan"));
        listItems.add(new RecyclerItem(R.drawable.ic_menq, "Samvel Petrosyan"));
        listItems.add(new RecyclerItem(R.drawable.ic_menq, "Vova Sargsyan"));
        listItems.add(new RecyclerItem(R.drawable.ic_menq, "Stepan Chaparyan"));
        listItems.add(new RecyclerItem(R.drawable.ic_menq, "Elya Karapetyan"));
        adapter = new MyAdapter(this,listItems);
        recyclerView.setAdapter(adapter);

    }
}
