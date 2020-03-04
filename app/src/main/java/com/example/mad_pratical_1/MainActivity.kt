package com.example.mad_pratical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countupButton: Button = findViewById(R.id.countup_button)
        rollButton.setOnClickListener { rollDice() }
        //countupButton.setOnClickListener { countUp() }
        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {
        // val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        //  resultText.text = randomInt.toString()
        // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()


    }

    /*private fun countUp(){
      //  val resultText: TextView = findViewById(R.id.result_text)
       // var number = resultText.text.toString().toIntOrNull();

       // if (number ==null){
      //      resultText.text = "1"
       // }
      //  else if (number < 6){
       //     number++
        //    resultText.text = number.toString()
        }
    }*/

}

