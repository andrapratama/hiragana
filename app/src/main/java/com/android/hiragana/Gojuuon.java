package com.android.hiragana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gojuuon extends AppCompatActivity {
    TextView txt_a, txt_i, txt_u, txt_e, txt_o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gojuuon);

        txt_a = findViewById(R.id.huruf_a);
        txt_i = findViewById(R.id.huruf_i);
        txt_u = findViewById(R.id.huruf_u);
        txt_e = findViewById(R.id.huruf_e);
        txt_o = findViewById(R.id.huruf_o);

        txt_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gojuuon.this, HurufA.class));
            }
        });

        txt_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gojuuon.this, HurufI.class));
            }
        });

        txt_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gojuuon.this, HurufU.class));
            }
        });

        txt_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gojuuon.this, HurufE.class));
            }
        });

        txt_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gojuuon.this, HurufO.class));
            }
        });
    }
}