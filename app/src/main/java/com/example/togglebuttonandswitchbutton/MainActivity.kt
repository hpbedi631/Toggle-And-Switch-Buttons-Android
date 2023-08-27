package com.example.togglebuttonandswitchbutton

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/* My name is Harshdeep Bedi and my student number is N01358063. I wrote the code because it was part of my practice lab,
I wrote this code on September 21 and this code should be processing the togglebutton by checking if the button is enabled,
then it displays a message Toggle On in the Toast and turns the background color to Magenta and when disabled Toggle Off in the Toast
and turns the background color to White. It also processes the switch button by checking if the button is enabled,
then it change the background color of the switch button to Green if enabled and red if disabled.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // process togglebutton
        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                // if toggle button is enabled
                Toast.makeText(this, "Toggle On", Toast.LENGTH_SHORT).show()
                root_layout.setBackgroundColor(Color.MAGENTA)
            } else {
                Toast.makeText(this, "Toggle Off", Toast.LENGTH_SHORT).show()
                root_layout.setBackgroundColor(Color.WHITE)
            }

            // process switch button
            switch1.setOnCheckedChangeListener { compoundButton, OnSwitch ->
                // switch is enabled/checked
                if (OnSwitch) {
                    // Change the button background color
                    switch1.setBackgroundColor(Color.GREEN)
                } else {
                    switch1.setBackgroundColor(Color.RED)
                }

            }

        }
    }
}
