package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreenn extends AppCompatActivity {

    public int time = 3000; // 3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenn);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent register = new Intent (splashscreenn.this, register.class);
                startActivity(register);
                finish();
            }
        },time);
    }
}