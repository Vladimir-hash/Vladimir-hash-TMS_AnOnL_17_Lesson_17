package com.example.lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        findViewById<Button>(R.id.button_user).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Handler().postDelayed({startActivity(intent)}, 3000)
        }
    }


}