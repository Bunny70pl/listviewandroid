package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ListView listaViewProdukty;
    private ArrayList<String> produkty;
    private ArrayAdapter<String> adapterek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        produkty = new ArrayList<String>();
        produkty.add("Marchewka");
        produkty.add("Ziemnaki");
        produkty.add("Buraki");
        produkty.add("Kapusta");
        adapterek = new ArrayAdapter<String>(MainActivity2.this,
                android.R.layout.simple_list_item_1,
                produkty);
        listaViewProdukty = findViewById(R.id.listaView2);
        listaViewProdukty.setAdapter(adapterek);
    }
}