package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_results:TextView
    lateinit var bnweight:EditText
    lateinit var bnHght:EditText
    lateinit var cal:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_results = findViewById(R.id.editText)
        bnweight = findViewById(R.id.bnweight)
        bnHght = findViewById(R.id.bnHght)
        cal = findViewById(R.id.cal)


        cal.setOnClickListener {
            var weight = bnweight.text.toString().trim()
            var heght = bnHght.text.toString().trim()


            var W = weight.toDouble()
            var H = heght.toDouble()

            var total = W * H
            var string_total = total.toString()
            Toast.makeText(this, "Your BMI is $string_total", Toast.LENGTH_SHORT).show()
        }

    }
}