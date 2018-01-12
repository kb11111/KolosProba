package com.example.student.kolos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        Bundle przekazanedane = getIntent().getExtras();



        ArrayList<Coffee> coffees=new ArrayList<>();
        coffees.add(new Coffee("Latte","12.00 zł"));
        coffees.add(new Coffee("Espresso","5.00 zł"));
        coffees.add(new Coffee("Mocca","15.00 zł"));
        coffees.add(new Coffee("Cappucino","9.00 zł"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);

        CoffeeAdapter coffeeAdaper = new CoffeeAdapter(coffees);
        recycler.setAdapter(coffeeAdaper);
    }
}
