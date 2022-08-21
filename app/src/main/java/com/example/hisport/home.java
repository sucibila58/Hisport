package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    private ImageButton user;
    private TextView tv;
    private Button btndarat;
    private Button btnlaut;
    private Button btnudara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btndarat = findViewById(R.id.btn_darat);
        Button btnlaut = findViewById(R.id.btn_laut);
        Button btnudara = findViewById(R.id.btn_udara);
        ImageButton btn_logout = findViewById(R.id.btnlogout);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userIntent = new Intent(home.this, register.class);
                startActivity(userIntent);
            }
        });

        btndarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daratintent = new Intent(home.this, Transport_Darat.class);
                startActivity(daratintent);
            }
        });
        btnlaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lautIntent = new Intent(home.this, Transport_laut.class);
                startActivity(lautIntent);
            }
        });
        btnudara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent udaraIntent = new Intent(home.this, Transport_udara.class);
                startActivity(udaraIntent);
            }
        });
    }
}