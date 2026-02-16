package com.example.appciclodevida

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnSalir = findViewById<Button>(R.id.btnSalir)
        btnSalir.setOnClickListener {
            finishAffinity()
        }
    }
}