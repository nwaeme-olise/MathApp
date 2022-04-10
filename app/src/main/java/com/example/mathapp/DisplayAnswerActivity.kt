package com.example.mathapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayAnswerActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_answer)
        val answer = intent.getIntExtra(EXTRA_ANSWER, 0)
        val answerTextView = findViewById<TextView>(R.id.answer_textview)
        answerTextView.text = "The answer is $answer"
    }
}