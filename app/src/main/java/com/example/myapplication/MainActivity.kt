package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btn1 = findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }
            btn1.setOnClickListener {
                val Intent = Intent(this, MainActivity4::class.java)
                startActivity(Intent)
        }

    }
}