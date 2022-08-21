package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Transport_Darat extends AppCompatActivity {
    private ImageButton btnvespa;
    private ImageButton btnoplet;
    private ImageButton btnkereta;
    private ImageButton btnmotor;
    private ImageButton btnbecak;
    private ImageButton btnbus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_darat);

        ImageButton btnvespa = findViewById(R.id.btn_vespa);
        ImageButton btnoplet = findViewById(R.id.btn_bemo);
        ImageButton btnkereta = findViewById(R.id.btn_kereta);
        ImageButton btnmotor = findViewById(R.id.btn_motor);
        ImageButton btnbecak = findViewById(R.id.btn_becak);
        ImageButton btnbus = findViewById(R.id.btn_bus);

        btnvespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vespaIntent = new Intent(Transport_Darat.this, Vespa.class);
                startActivity(vespaIntent);
            }
        });
        btnoplet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opletIntent = new Intent(Transport_Darat.this, Oplet.class);
                startActivity(opletIntent);
            }
        });
        btnkereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keretaIntent = new Intent(Transport_Darat.this, Kereta.class);
                startActivity(keretaIntent);
            }
        });
        btnmotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent motorIntent = new Intent(Transport_Darat.this, Motor.class);
                startActivity(motorIntent);
            }
        });
        btnbecak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent becakIntent = new Intent(Transport_Darat.this, Becak.class);
                startActivity(becakIntent);
            }
        });
        btnbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent busIntent = new Intent(Transport_Darat.this, Bus.class);
                startActivity(busIntent);
            }
        });
    }
}