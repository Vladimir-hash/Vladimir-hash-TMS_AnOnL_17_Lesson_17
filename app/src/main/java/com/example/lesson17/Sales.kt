package com.example.lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)



        findViewById<Button>(R.id.button_to_goods).setOnClickListener {
            val intent = Intent(this, Goods::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_to_cart).setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}
