package com.example.proyek1adri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Frame2Activity extends AppCompatActivity {
    EditText eUserName; //Deklarasikan untuk Username
    ImageButton bLogin; //Deklarikan untuk Tombol Login
    String user; //Deklarasikan untuk Menampung Input User
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2);

        eUserName = findViewById(R.id.username); //Hubungkan dengan EditText Username
        bLogin = findViewById(R.id.login); //Hubungkan dengan ImageButton Login

        //fungsi setOnClickListener untuk saat tombol login ditekan
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    public void login(){
        //Fungsi Login dibuat untuk menampilkan pesan dan berpindah
        //dari 1 avtivity ke activity lainnya

        //simpan input dari pengguna ke variable user
        user = eUserName.getText().toString();

        Intent intent = new Intent(Frame2Activity.this,LinearActivity2.class);
        intent.putExtra("user",user);

        //Toast digunakan untuk menampilkan pesan
        Toast.makeText(this, "Selamat Datang "+user,Toast.LENGTH_LONG).show();

        startActivity(intent);
    }
}