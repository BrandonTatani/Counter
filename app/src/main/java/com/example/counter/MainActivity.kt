package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter1 = findViewById<TextView>(R.id.first_counter)
        val counter2 = findViewById<TextView>(R.id.second_counter)
        val plus1 = findViewById<Button>(R.id.button1_plus)
        val minus1 = findViewById<Button>(R.id.button1_minus)
        val plus2 = findViewById<Button>(R.id.button2_plus)
        val minus2 = findViewById<Button>(R.id.button2_minus)
        val reset = findViewById<ImageButton>(R.id.reset_button)

        plus1.setOnClickListener{
            val tmp = counter1.text.toString().toInt()
            val counter = tmp + 1
            counter1.text = counter.toString()
        }
        minus1.setOnClickListener{
            val tmp = counter1.text.toString().toInt()
            var counter = tmp
            if(tmp > 0){
                counter -= 1
                counter1.text = counter.toString()
            }
        }
        plus2.setOnClickListener{
            var counter = counter2.text.toString().toInt()
            counter += 1
            counter2.text = counter.toString()
        }
        minus2.setOnClickListener{
            var counter = counter2.text.toString().toInt()
            if(counter > 0){
                counter -= 1
                counter2.text = counter.toString()
            }
        }
        reset.setOnClickListener {
            counter1.text = "0"
            counter2.text = "0"
        }
    }
}