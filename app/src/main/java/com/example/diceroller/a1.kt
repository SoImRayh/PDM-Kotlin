package com.example.diceroller

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class a1 : AppCompatActivity() {
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a1)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val button: Button = findViewById(R.id.button1)

        button.setOnClickListener {
            val intent : Intent = Intent(context, a2::class.java)
            startActivity(intent)
        }
    }
}