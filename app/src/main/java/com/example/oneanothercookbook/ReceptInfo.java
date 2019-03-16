package com.example.oneanothercookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class ReceptInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept_info);
        //получаем intent с помощью которого запущен activity
        Intent intent = new Intent();
        //извлекаем строчку из intent'a
        String reseptJson = intent.getStringExtra("reseptJson");

//        Gson gson = new Gson();
        //десериализуем объект класса receptBluda
//        ReceptBluda rb = gson.fromJson(reseptJson,ReceptBluda.class);
        //---вывод информации по рецепту на activity
//        TextView nazv = (TextView)findViewById(R.id.textViewNazv);
//        nazv.setText(rb.getNazvanie());

//        TextView opis = (TextView)findViewById(R.id.textViewOpisanie);
//        opis.setText(rb.getPolnoeOpisanie());
    }
}
