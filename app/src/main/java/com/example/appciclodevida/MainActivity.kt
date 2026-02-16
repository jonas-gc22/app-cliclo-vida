package com.example.appciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("CICLO", "onCreate ejecutado")

        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CICLO", "onStart ejecutado")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CICLO", "onResume ejecutado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO", "onPause ejecutado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CICLO", "onStop ejecutado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLO", "onDestroy ejecutado")
    }
}