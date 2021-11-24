package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var number = 0
    private lateinit var numberTxt: TextView
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        numberTxt = findViewById(R.id.textView3)
        plusButton = findViewById(R.id.pluse)
        minusButton = findViewById(R.id.minuse)

    plusButton.setOnClickListener {
        number++
        numberTxt.text = number.toString()
    }


        minusButton.setOnClickListener {

            number --
            numberTxt.text = number.toString()
        }







    }
}