package com.example.diceroller

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class a2 : AppCompatActivity() {
    private val context : Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a2)

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener { next() }
    }

    private fun next() {
        val intent = Intent(context, a3::class.java)
        startActivity(intent)
    }
}