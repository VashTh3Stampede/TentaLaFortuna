package com.example.tentalafortuna;

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

    public void Dado(View view) {
        Intent intent = new Intent(this, TiraUnDado.class);
        startActivity(intent);
    }

    public void Moneta(View view) {
        Intent intent = new Intent(this, LanciaUnaMoneta.class);
        startActivity(intent);
    }

    public void Numeri(View view) {
        Intent intent = new Intent(this, GeneraNumeri.class);
        startActivity(intent);
    }
}