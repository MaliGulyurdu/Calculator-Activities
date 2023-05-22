package com.example.calculator_with_twoactivities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator_with_twoactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val number1 = intent.getDoubleExtra("NUMBER_1", 0.0)
        val number2 = intent.getDoubleExtra("NUMBER_2", 0.0)

        val result = when(intent.getStringExtra("OPERATION")){
            "+" -> number1 + number2
            "-" -> number1 - number2
            "*" -> number1 * number2
            "/" -> number1 / number2
            else -> {0.0}
        }

        binding.resultTextView.text = "Result: $result"

    }
}