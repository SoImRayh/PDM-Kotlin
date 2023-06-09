package com.example.diceroller

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button


class a4 : AppCompatActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a4)

        val button: Button = findViewById(R.id.button4)
        val webview: WebView = findViewById(R.id.webview2)
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("https://lavajatodopedro.com")

        button.setOnClickListener {
            val intent: Intent = Intent(context, a5::class.java)
            startActivity(intent)
        }
    }
}