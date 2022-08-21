package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Transport_laut extends AppCompatActivity {
    private ImageButton btnkapalkomodo;
    private ImageButton btnkapalpatroli;
    private ImageButton btnperahubanjar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_laut);
        ImageButton btnkapalkomodo = findViewById(R.id.btn_kapalkomodo);
        ImageButton btnkapalpatroli = findViewById(R.id.btn_kapalpatroli);
        ImageButton btnperahubanjar = findViewById(R.id.btn_perahubanjar);

        btnkapalkomodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kapalkomodoIntent = new Intent(Transport_laut.this, kapal_komodo.class);
                startActivity(kapalkomodoIntent);
            }
        });
        btnkapalpatroli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kapalpatroliIntent = new Intent(Transport_laut.this, kapal_patroli.class);
                startActivity(kapalpatroliIntent);
            }
        });
        btnperahubanjar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent perahubanjarIntent = new Intent(Transport_laut.this, perahu_banjar.class);
                startActivity(perahubanjarIntent);
            }
        });
    }
}