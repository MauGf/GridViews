package com.mauriciog.gridviewsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mauriciog.gridviewsapp.R;

public class Adapter extends BaseAdapter {

    private Context contexto;
    private String [] equipo;
    private int[] imagen;
    TextView nombreEquipo;
    ImageView escudo;

    public Adapter (Context contexto, String[]equipo, int[] imagen){
        this.contexto=contexto;
        this.equipo=equipo;
        this.imagen=imagen;
    }

    @Override
    public int getCount() {
        return equipo.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View arg1, ViewGroup arg2) {
        View item;
        if(arg1==null){
            LayoutInflater inflar=(LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
            item=new View(contexto);
            item=inflar.inflate (R.layout.items,null);
        }else{
            item=(View)arg1;
        }

        nombreEquipo=(TextView)item.findViewById (R.id.tvEquipo);
        escudo=(TextView)item.findViewById (R.id.imgEscudo);
        nombreEquipo.setText (equipo[position]);
        escudo.setImageResource (imagen[position]);
        return item;
    }
}
