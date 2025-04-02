package vcmsa.ci.dietapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val timeOfDay = findViewById<EditText>(R.id.time)

        val inputButton = findViewById<Button>(R.id.inputButton)

        val reset = findViewById<Button>(R.id.resetButton)

        val display = findViewById<TextView>(R.id.answerDisplay)

        inputButton.setOnClickListener {
            val time = timeOfDay.text.toString()

            if (time.isEmpty()) {
                display.text = "Please fill all the fields correctly"

            }

            if (time == "Morning" || time == "morning") {
                display.text = "Eat cereal or porridge"


            } else if (time == "Mid Morning Snack" || time == "mid morning snacks") {
                display.text = "Eat yougurt with strawberries"


            }else if (time == "Afternoon" || time == "afternoon"){
                display.text = "Eat a chicken salad"


            }else if (time == "Mid Afternoon Snack" || time == "mid afternoon snack"){
                display.text = "Eat fruit(dependant on what fruit you like)"


            }else if (time == "Dinner" || time == "dinner"){
                display.text = "Eat a fried chicken brest with eggs and fried chips"


            }else if (time =="Dessert" || time == "dessert"){
                display.text = "Eat ice cream"


            }else {
                display.text = "STOP EATING!!!!!"
            }


        }
    reset.setOnClickListener{
        timeOfDay.text.clear()
        display.text = "See your meal here"
    }



        }
    }