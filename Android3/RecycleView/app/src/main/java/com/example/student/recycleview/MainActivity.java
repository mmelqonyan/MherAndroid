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
        listItems.add(new RecyclerItem(getString(R.string.Revolver), R.drawable.revolver, getString(R.string.revolver), 5 , "https://ru.wikipedia.org/wiki/%D0%A0%D0%B5%D0%B2%D0%BE%D0%BB%D1%8C%D0%B2%D0%B5%D1%80_(%D1%84%D0%B8%D0%BB%D1%8C%D0%BC)"));
        listItems.add(new RecyclerItem(getString(R.string.DonnieBrasco), R.drawable.doniebracko,getString(R.string.donniebracko) , 4, "https://ru.wikipedia.org/wiki/%D0%94%D0%BE%D0%BD%D0%BD%D0%B8_%D0%91%D1%80%D0%B0%D1%81%D0%BA%D0%BE"));
        listItems.add(new RecyclerItem(getString(R.string.PiratesofCaribbean), R.drawable.piratesofcaribbean, getString(R.string.piratsofcaribean), 5, "https://ru.wikipedia.org/wiki/%D0%9F%D0%B8%D1%80%D0%B0%D1%82%D1%8B_%D0%9A%D0%B0%D1%80%D0%B8%D0%B1%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_%D0%BC%D0%BE%D1%80%D1%8F"));
        listItems.add(new RecyclerItem(getString(R.string.Forsage7), R.drawable.forsaje7, getString(R.string.Forsaje7), 3, "https://ru.wikipedia.org/wiki/%D0%A4%D0%BE%D1%80%D1%81%D0%B0%D0%B6_7"));
        listItems.add(new RecyclerItem(getString(R.string.JohnWick), R.drawable.johnwick, getString(R.string.johnwick), 4, "https://ru.wikipedia.org/wiki/%D0%94%D0%B6%D0%BE%D0%BD_%D0%A3%D0%B8%D0%BA"));
        adapter = new MyAdapter(this,listItems);
        recyclerView.setAdapter(adapter);

    }
}
