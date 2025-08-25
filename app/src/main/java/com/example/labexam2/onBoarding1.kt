package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextButton = findViewById<Button>(R.id.button3)
        nextButton.setOnClickListener {
            val intent = Intent(this, onBoarding2::class.java)
            startActivity(intent)
        }

        val skipTextView = findViewById<TextView>(R.id.textView11)
        skipTextView.setOnClickListener {
            val intent = Intent(this, onBoarding3::class.java)
            startActivity(intent)
        }
    }
}