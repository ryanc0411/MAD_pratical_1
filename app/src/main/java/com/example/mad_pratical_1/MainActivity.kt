package com.example.mad_pratical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countupButton: Button = findViewById(R.id.countup_button)
        rollButton.setOnClickListener{ rollDice() }
        countupButton.setOnClickListener{ countUp()}


    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString() + "\n\nDice Rolled!"
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()


    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        val number = resultText.text.toString().toInt();

        if (number >6){
            resultText.text = resultText.text
        }
        else if (number < 6){
            number+1;
            resultText.text = number.toString()
        }
        else resultText.text = "1"
    }
}
