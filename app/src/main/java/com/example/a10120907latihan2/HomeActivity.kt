//Nim : 10120907
//Nama : Muhammad Nur Alviansyah
//Kelas : IF10
//Tanggal : 29 April 2023

package com.example.a10120907latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide();
    }
}