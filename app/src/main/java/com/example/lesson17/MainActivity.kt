package com.example.lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_reg).setOnClickListener {
            val intent = Intent(this, Sales::class.java)
            Handler().postDelayed({startActivity(intent)}, 3000)
        }

    }
}