package com.example.calculator_with_twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator_with_twoactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnCalculate.setOnClickListener {
            val firstNumber = binding.firstNumberEditText.text.toString().toDouble()
            val secondNumber = binding.secondNumberEditText.text.toString().toDouble()
            val operationType = binding.spinnerOperation.selectedItem.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("NUMBER_1",firstNumber)
            intent.putExtra("NUMBER_2",secondNumber)
            intent.putExtra("OPERATION",operationType)
            startActivity(intent)
        }
    }
}