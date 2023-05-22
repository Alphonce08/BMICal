package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edt_text:TextView
    lateinit var edt_weight:EditText
    lateinit var edt_height:EditText
    lateinit var btn_cal:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_text = findViewById(R.id.txtdisplay)
        edt_weight = findViewById(R.id.edtweight)
        edt_height = findViewById(R.id.edtheight)
        btn_cal = findViewById(R.id.btncal)


        btn_cal.setOnClickListener {

            //create two vars for receive data

            var myweight = edt_weight.text.toString().trim()
            var myheight = edt_height.text.toString().trim()

            //validation
            if (myweight.isEmpty() || myheight.isEmpty()) {
                Toast.makeText(this, "Cann't Submit an Empty Form", Toast.LENGTH_SHORT).show()
            } else {

                //convert string to Double
                var userweight = myweight.toString()
                var userheight = myheight.toString()

                //calculations
                var result = userweight / (userheight * userheight)
                var finalresult = result.toString()
                edt_text.setText(finalresult)
            }


        }



    }
}