package com.aaron_tejero.mapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void irCenote(View v){
        Intent i = new Intent(this, Mapscenote.class);
        startActivity(i);
    }

    public void irConvento(View v){
        Intent i = new Intent(this, MapsConvento.class);
        startActivity(i);
    }

    public void irChichen(View v){
        Intent i = new Intent(this, MapsChichen.class);
        startActivity(i);
    }
}
