package com.mauriciog.gridviewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_details);

        final Toolbar toolbar = findViewById (R.id.toolbar);
        toolbar.setTitle ("Detalle");
        setSupportActionBar (toolbar);
        if (getSupportActionBar () != null) {
            getSupportActionBar ().setDisplayHomeAsUpEnabled (true);
            getSupportActionBar ().setDisplayShowHomeEnabled (true);
        }

        TextView descripcion= (TextView)findViewById (R.id.tvDescripcion);
        ImageView imagen=(ImageView)findViewById (R.id.imgDetalle);

        String detalle;
        int img;

        Bundle b= getIntent().getExtras ();
        detalle=b.getString ("descripcion");
        img=b.getInt ("imagen");

        descripcion.setText (detalle);
        imagen.setImageResource (img);
    }
}
