package com.example.diceroller

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class a3 : AppCompatActivity() {
    private val context : Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a3)

        val button: Button = findViewById(R.id.button3)

        button  .setOnClickListener {
            val intent: Intent = Intent(context, a4::class.java)
            startActivity(intent)
        }
    }
}