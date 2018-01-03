package com.example.student.kolos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Coffee> coffees=new ArrayList<>();
        coffees.add(new Coffee("Latte","12.00"));
        coffees.add(new Coffee("Espresso","5.00"));
        coffees.add(new Coffee("Mocca","15.00"));
    }
}
