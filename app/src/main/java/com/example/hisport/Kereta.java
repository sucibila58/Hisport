package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kereta extends AppCompatActivity {
    private ImageButton btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kereta);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kereta.this,Transport_Darat.class));
            }
        });
    }
}