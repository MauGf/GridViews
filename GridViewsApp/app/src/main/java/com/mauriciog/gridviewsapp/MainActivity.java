package com.mauriciog.gridviewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.mauriciog.gridviewsapp.adapter.Adapter;

public class MainActivity extends AppCompatActivity {

    GridView item;
    String [] equipo;
    String [] descripcion;
    int[] imagen={R.drawable.athletic_bilbao,
    R.drawable.atletico_madrid,
    R.drawable.barcelona,
    R.drawable.betis,
    R.drawable.deportivo,
    R.drawable.celta_vigo,
    R.drawable.espanyol,
    R.drawable.getafe,
    R.drawable.granada,
    R.drawable.levante,
    R.drawable.malaga,
    R.drawable.mallorca,
    R.drawable.osasuna,
    R.drawable.rayo_vallecano,
    R.drawable.real_madrid,
    R.drawable.real_sociedad,
    R.drawable.sevilla,
    R.drawable.valencia,
    R.drawable.valladolid,
    R.drawable.zaragoza};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        equipo=getResources ().getStringArray (R.array.equipos);
        descripcion=getResources ().getStringArray (R.array.descripciones);

        Adapter adapter= new Adapter (this,equipo,imagen);
        item=(GridView)findViewById (R.id.Id_GridView);
        item.setAdapter (adapter);

        item.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent (MainActivity.this, DetailsActivity.class);
                intent.putExtra ("descripcion", descripcion[position]);
                intent.putExtra ("imagen",imagen[position]);
                startActivity (intent);

            }
        });
    }
}
