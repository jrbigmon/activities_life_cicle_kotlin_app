package com.example.activityslifecicle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityslifecicle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // -1
        // -10
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFirstActivity.setOnClickListener({
            startActivity(Intent(this, MainActivity2::class.java))
        })
    }

    override fun onStart() {
        // -2
        // -11
        super.onStart()
    }

    override fun onResume() {
        // -3
        // -12
        super.onResume()
    }

    override fun onPause() {
        // -4 (quando clicado para mudar de activity)
        super.onPause()
    }

    override fun onStop() {
        // -8 (retorna apos a main activity 2 passar pelo onResume)
        super.onStop()
    }

    override fun onDestroy() {
        // -x (quando a aplicacao ou o componente eh finalizado, sem a possibilidade de voltar)
        super.onDestroy()
    }
}