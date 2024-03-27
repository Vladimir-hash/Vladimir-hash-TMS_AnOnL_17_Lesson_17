package com.example.lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        findViewById<Button>(R.id.button_cart).setOnClickListener {
            val intent = Intent(this, User::class.java)
            Handler().postDelayed({startActivity(intent)}, 3000)
        }
        findViewById<Button>(R.id.button_to_profile).setOnClickListener {
            val intent = Intent(this, User::class.java)
            intent.putExtra("cart", "from cart")
            startActivity(intent)
        }
    }
    }

