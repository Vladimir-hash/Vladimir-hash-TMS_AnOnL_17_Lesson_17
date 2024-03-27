package com.example.lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class Goods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goods)

        findViewById<Button>(R.id.button_goods).setOnClickListener {
                    val intent = Intent(this, Cart::class.java)
                    Handler().postDelayed({startActivity(intent)}, 3000)
                }
        findViewById<Button>(R.id.button_to_user).setOnClickListener {
            val intent = Intent(this, User::class.java)
            intent.putExtra("goods", "from goods")
            startActivity(intent)
        }
            }
    }
