package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class pesawatdakota extends AppCompatActivity {
    private ImageButton btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesawatdakota);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pesawatdakota.this,Transport_udara.class));
            }
        });
    }
}