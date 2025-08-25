package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profileImage = findViewById<ImageView>(R.id.imageView26)

        profileImage.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }


        val seeDetailsButton = findViewById<Button>(R.id.buttonSeeDetails)
        seeDetailsButton.setOnClickListener {
            val intent = Intent(this, mint::class.java)
            startActivity(intent)
        }



        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.plants -> {
                    // Navigate to MyPlants
                    startActivity(Intent(this, myplants::class.java))
                    true
                }
                R.id.profile -> {
                    // Navigate to Profile
                    startActivity(Intent(this, profile::class.java))
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}
