package com.example.proyek1adri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity3 extends AppCompatActivity {
    String kepada,subyek,pesan;
    EditText eKepada,ePesan,eSubyek;
    Button bKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan  = getIntent().getExtras().getString("pesan");

        eKepada = findViewById(R.id.kepada);
        eSubyek = findViewById(R.id.subyek);
        ePesan  = findViewById(R.id.pesan);
        bKirim  = findViewById(R.id.kirim);

        eKepada.setText(kepada);
        eSubyek.setText(subyek);
        ePesan.setText(pesan);
    }
}