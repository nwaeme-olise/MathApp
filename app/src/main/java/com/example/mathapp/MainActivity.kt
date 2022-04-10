package com.example.mathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

public const val EXTRA_ANSWER = "com.example.mathapp.ANSWER"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton = findViewById<Button>(R.id.add_button)
        addButton.setOnClickListener{
            addNumbers()
        }
    }
    private fun addNumbers() {
        val input1 = findViewById<EditText>(R.id.input_1).text
        val input2 = findViewById<EditText>(R.id.input_2).text
        val first_number = input1.toString().toInt()
        val second_number = input2.toString().toInt()
        if (input1.isEmpty() && input2.isEmpty()) {
            Toast.makeText(this, "You didn't enter a number", Toast.LENGTH_SHORT).show()
            return
        } else {
            val answer = first_number + second_number
            intent = Intent(this, DisplayAnswerActivity::class.java).apply {
                putExtra(EXTRA_ANSWER, answer)
            }
            startActivity(intent)
        }
    }
}