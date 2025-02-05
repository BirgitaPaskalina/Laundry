package com.example.laundry

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardMasukPegawai = findViewById<CardView>(R.id.card_masuk_pegawai)
        cardMasukPegawai.setOnClickListener {
            val intent = Intent(this, LamanPegawai::class.java)
            startActivity(intent)
        }

            val cardMasukPelanggan = findViewById<CardView>(R.id.card_masuk_pelanggan)
        cardMasukPelanggan.setOnClickListener {
                val intent = Intent(this, LamanPegawai::class.java)
                startActivity(intent)
            }

                val cardMasukLayanan = findViewById<CardView>(R.id.card_masuk_layanan)
        cardMasukLayanan.setOnClickListener {
                    val intent = Intent(this, lamanLayanan::class.java)
                    startActivity(intent)
                }


    }
}