package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter: TextView = findViewById(R.id.tvCounter)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)

        btnPlus.setOnClickListener {
            counter++
            tvCounter.text = counter.toString()
        }

        btnMinus.setOnClickListener {
            if (counter > 0) {
                counter--
                tvCounter.text = counter.toString()
            }
        }
    }
}
