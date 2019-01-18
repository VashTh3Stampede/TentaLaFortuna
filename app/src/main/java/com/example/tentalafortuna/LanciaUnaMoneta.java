package com.example.tentalafortuna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LanciaUnaMoneta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancia_una_moneta);
    }

    public void handleClick(View view) {
        if (R.id.button5 == 1) {

            int faccia;

            faccia = (int) (Math.random() * 2);

            if (faccia == 1) {
                ImageView v = findViewById(R.id.imageView2);
                v.setImageResource(R.drawable.testa);
            } else {
                ImageView h = findViewById(R.id.imageView2);
                h.setImageResource(R.drawable.croce);
            }

        }
    }
}


