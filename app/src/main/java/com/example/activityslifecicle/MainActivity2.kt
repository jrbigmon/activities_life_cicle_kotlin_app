package com.example.activityslifecicle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityslifecicle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        // -5 (quando inicia a tela apos ter a mudanca de activity)
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener({
            startActivity(Intent(this, MainActivity::class.java))
        })
    }

    override fun onStart() {
        // -6 (quando inicia a tela apos ter a mudanca de activity)
        super.onStart()
    }

    override fun onResume() {
        // -7 (quando inicia a tela apos ter a mudanca de activity)
        super.onResume()
    }

    override fun onPause() {
        // -9 (quando volta para a main activity)
        super.onPause()
    }

    override fun onStop() {
        // -13
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}