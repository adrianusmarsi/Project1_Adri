package com.example.proyek1adri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Frame1Activity extends AppCompatActivity {
    // Deklarasikan Variable Dengan Tipe Data
    // Gunakan Alt+Enter untuk Import/Menambahkan Kelas Secara Otomatis
    ImageView gambarLoading; // Untuk menampung gambar loading dari activity_frame1
    Animation rotasiAnimasi; // Untuk Melakukan Animasi Rotasi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1);

        //simpan gambar loading dari activity_frame1 ke variable gambarLoading
        gambarLoading = findViewById(R.id.loading);

        // Panggil Fungsi Rotasi
        rotasi();

          // Membuat Handler untuk berpindah dari 1 activity ke activity lain
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//        // Dalam hal ini berpindah dari Frame1 ke Frame2
            Intent intent = new Intent(Frame1Activity.this,Frame2Activity.class);
//
//        // Jalankan fungsi Intent
            startActivity(intent);
//
//        // Tutup activity ini --> masuk kedalam mode background
            finish();
            }
    // Durasi menampilkan activity ini sebelum berpindah
    // dalam satuan milidetik
    // dalam hal ini divberikan waktu 3000 ms atau 3 detik
        },3000);
    }

    private void rotasi(){
        // Fungsi rotasi digunakan untuk merotasi/memutar gambar yang diinginkan
        // dengan memanggil rotasi_searah
        rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
        gambarLoading.startAnimation(rotasiAnimasi);
    }
}