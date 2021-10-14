package com.example.lab2elmerprograiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        claseHerencia()
    }
    private fun claseHerencia(){

        val Vehi = VhToyota("Carlos",2500)

    }
}