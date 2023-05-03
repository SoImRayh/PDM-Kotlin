package com.example.diceroller

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val context: Context get() = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aula41)

        actionBar?.setDisplayHomeAsUpEnabled(true)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener { nextPage() }
//        val rollButton: Button = findViewById(R.id.roll_button)
//        rollButton.setOnClickListener { rollDice() }
//
//        val addOneButton: Button = findViewById(R.id.add_one_button)
//        addOneButton.setOnClickListener{ addOne()}
    }

    private fun nextPage() {
        val intent = Intent(context, a1::class.java)
        val params = Bundle()
        params.putString("nada", "isso mesmo")
        intent.putExtras(params)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt: Int = (1..6).random()

        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun addOne(): Unit {
        val resultText: TextView = findViewById(R.id.result_text);


        if (resultText.text.toString() == R.string.app_name.toString()) {
            resultText.text = "1"
        }else {
            if (resultText.text.toString().toInt() < 6){
                resultText.text = (resultText.text.toString().toInt()+1).toString()
            }
        }

    }
}