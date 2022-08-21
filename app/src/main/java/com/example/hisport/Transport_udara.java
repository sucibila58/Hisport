package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Transport_udara extends AppCompatActivity {
    private ImageButton btnhelikopter;
    private ImageButton btnpesawatcapung;
    private ImageButton btngaruda;
    private ImageButton btnpesawatdakota;
    private ImageButton btnpesawatpk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_udara);
        ImageButton btnhelikopter = findViewById(R.id.btn_helikopter);
        ImageButton btnpesawatcapung = findViewById(R.id.btn_latihair);
        ImageButton btngaruda = findViewById(R.id.btn_garuda);
        ImageButton btnpesawatdakota = findViewById(R.id.btn_pesawatdakota);
        ImageButton btnpesawatpk = findViewById(R.id.btn_latihpk);

        btnhelikopter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helikopterIntent = new Intent(Transport_udara.this, helikopter.class);
                startActivity(helikopterIntent);
            }
        });
        btnpesawatcapung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesawatcapungIntent = new Intent(Transport_udara.this, pesawatlatihair.class);
                startActivity(pesawatcapungIntent);
            }
        });
        btngaruda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesawatgarudaIntent = new Intent(Transport_udara.this, pesawatgaruda.class);
                startActivity(pesawatgarudaIntent);
            }
        });
        btnpesawatdakota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesawatdakotaIntent = new Intent(Transport_udara.this, pesawatdakota.class);
                startActivity(pesawatdakotaIntent);
            }
        });
        btnpesawatpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesawatpkIntent = new Intent(Transport_udara.this, pesawatlatihpk.class);
                startActivity(pesawatpkIntent);
            }
        });

    }
}