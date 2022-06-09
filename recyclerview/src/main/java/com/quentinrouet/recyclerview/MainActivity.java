package com.quentinrouet.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Voiture> arrayList = new ArrayList<>();
        arrayList.add(new Voiture("Hyundai Ioniq","EL"));
        arrayList.add(new Voiture("Hyundai Ioniq","PHEV"));
        arrayList.add(new Voiture("Hyundai Ioniq","ES"));
        arrayList.add(new Voiture("Hyundai Kona","EL"));
        arrayList.add(new Voiture("Renault Megane 4","ES"));
        arrayList.add(new Voiture("Renault Megane 4","DIESEL"));
        arrayList.add(new Voiture("Renault Megane Etech","EL"));
        arrayList.add(new Voiture("Peugeot 307","ES"));
        arrayList.add(new Voiture("Peugeot 308","ES"));
        arrayList.add(new Voiture("Peugeot 307","DIESEL"));
        arrayList.add(new Voiture("Peugeot 308","DIESEL"));
        RecyclerView rv = findViewById(R.id.recylerViewVoiture);
        VoitureAdapter va = new VoitureAdapter(arrayList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(va);
    }
}