package com.st10462391.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val exitButton: Int
        get() {
            TODO()
        }
    private val startButton: Int
        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets}

        val startButton = findViewById<Button>(startButton)
        val exitButton = findViewById<Button>(exitButton)

        startButton.setOnClickListener {
            val intent = intent()
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }
    }

    private fun intent(): Intent? {
        TODO("Not yet implemented")
    }
}
