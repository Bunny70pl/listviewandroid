package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ListView listaViewProdukty;
    private ArrayList<String> produkty;
    private ArrayAdapter<String> adapterek;
    private Button przycisk;
    private EditText editText;
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
        listaViewProdukty.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity2.this, "Element: " + produkty.get(i), Toast.LENGTH_SHORT).show();
                        produkty.remove(i);
                        adapterek.notifyDataSetChanged();
                    }
                }
        );
        przycisk = findViewById(R.id.button);
        editText = findViewById(R.id.editTextProdukt);
        przycisk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String produkt = editText.getText().toString();
                        produkty.add(produkt);
                        adapterek.notifyDataSetChanged();
                    }
                }
        );
    }
}