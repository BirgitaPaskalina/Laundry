package com.example.laundry

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.laundry.layanan.datalayanan
import com.example.laundry.pegawai.DataPegawai
import com.example.laundry.pelanggan.DataPelanggan
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Inisialisasi TextView
            val tvGreeting: TextView = findViewById(R.id.tvGreeting)
            val calendarTextView: TextView = findViewById(R.id.tvDate)

            // Menentukan bahasa perangkat
            val language = Locale.getDefault().language

            // Mendapatkan jam saat ini
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)

            // Menampilkan pesan selamat berdasarkan waktu dan bahasa perangkat
            val greeting = when (hour) {
                in 5..10 -> if (language == "id") "Selamat Pagi, Dude" else "Good Morning, Dude"
                in 11..14 -> if (language == "id") "Selamat Siang, Dude" else "Good Afternoon, Dude"
                in 15..17 -> if (language == "id") "Selamat Sore, Dude" else "Good Evening, Dude"
                else -> if (language == "id") "Selamat Malam, Dude" else "Good Night, Dude"
            }
            tvGreeting.text = greeting

            // Menampilkan tanggal saat ini
            val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())
            calendarTextView.text = dateFormat.format(Date())

            // Inisialisasi CardView
            val cardMasukPegawai = findViewById<CardView>(R.id.card_masuk_pegawai)
            val cardMasukPelanggan = findViewById<CardView>(R.id.card_masuk_pelanggan)
            val cardMasukLayanan = findViewById<CardView>(R.id.card_masuk_layanan)
            val cardTambah = findViewById<CardView>(R.id.card_masuk_tambah)

            // Set OnClickListener untuk CardView Pegawai
            cardMasukPegawai.setOnClickListener {
                val intent = Intent(this, DataPegawai::class.java) // Halaman Pegawai
                startActivity(intent)
            }

            // Set OnClickListener untuk CardView Pelanggan
            cardMasukPelanggan.setOnClickListener {
                val intent = Intent(this, DataPelanggan::class.java) // Halaman Pelanggan
                startActivity(intent)
            }

             //Set OnClickListener untuk CardView Layanan
            cardMasukLayanan.setOnClickListener {
                val intent = Intent(this, datalayanan::class.java) // Halaman Layanan
                startActivity(intent)
            }
//            //Set OnClickListener untuk CardView Layanan
//            cardTambah.setOnClickListener {
//                val intent = Intent(this, laman_tambahan::class.java) // Halaman Layanan
//                startActivity(intent)
//            }
        }
    }