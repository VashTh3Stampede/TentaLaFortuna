package com.example.tentalafortuna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class TiraUnDado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tira_un_dado);
    }

        Random generatore;
        int facce;

        public int lancia(View view)
        {
            facce = 6;

            generatore = new Random();

            return 1 + generatore.nextInt(facce);
        }
}
