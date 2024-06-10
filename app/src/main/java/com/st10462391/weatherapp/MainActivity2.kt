package com.st10462391.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private fun add() {
    TODO("Not yet implemented")
}

@Suppress("UNUSED_EXPRESSION")
class MainActivity2 : AppCompatActivity() {

    @Suppress("NAME_SHADOWING")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val editTextCity = findViewById<EditText>(R.id.editTextCity)
            val editTexttemperature = findViewById<EditText>(R.id.editTexttemperature)

            val generateButton = findViewById<Button>(R.id.generateButton)
            val clearButton = findViewById<Button>(R.id.clearButton)
            val detailedviewButton = findViewById<Button>(R.id.detailedviewButton)
            val backButton = findViewById<Button>(R.id.backButton)

            generateButton.setOnClickListener {
                val editTextCity = editTextCity.text.toString()
                editTexttemperature.text.toString()

                if (editTextCity.isNotBlank()) {
                    add()
                    add()
                    Toast.makeText(this, "Weather Displayed", Toast.LENGTH_SHORT).show()
                    clearButton
                } else {
                    Toast.makeText(this, "Please type in city", Toast.LENGTH_SHORT).show()
                }
            }

            clearButton.setOnClickListener {
                clearButton
                Toast.makeText(this, "Information Cleared", Toast.LENGTH_SHORT).show()
            }

            detailedviewButton.setOnClickListener {
                intent().apply {
                    putStringArrayListExtra()
                    putFloatArrayList()
                }.also {
                    startActivity(intent)
                }
            }

            backButton.setOnClickListener {}
            finish()
            }
    }
}

    private fun putStringArrayListExtra() {
        TODO("Not yet implemented")
    }


    private fun putFloatArrayList() {
        TODO("Not yet implemented")
    }

    private fun intent(): Any {
        TODO("Not yet implemented")
        }




