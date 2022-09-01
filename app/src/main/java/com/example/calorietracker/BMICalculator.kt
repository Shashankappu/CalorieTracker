package com.example.calorietracker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_bmicalculator.*
import kotlin.math.roundToInt

class BMICalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculator)

        btnbackfromBMI.setOnClickListener {
            onBackPressed()
        }
        btncalculateBMI.setOnClickListener {
            if(edtheight==null || edtweight==null){
                Toast.makeText(this,"Please enter the details!!",Toast.LENGTH_SHORT).show()
            }
            else{
                var height = edtheight.text.toString().toFloat()/100
                var weight = edtweight.text.toString().toFloat()
                CvBMIinfo.isVisible = true
                var bmivalue = (weight/(height*height)).roundToInt()
                tvbmivalue.text = bmivalue.toString()
                if(bmivalue <=18){
                    tvbmisubject.text = "underweight"
                    progressbar.trackColor = Color.RED
                    llbmiinfo.setBackgroundColor(Color.BLUE)
                }
                else if(bmivalue >=25){
                    tvbmisubject.text = "overweight"
                    progressbar.trackColor = Color.BLUE
                    llbmiinfo.setBackgroundColor(Color.RED)
                }
                else{
                    tvbmisubject.text ="normal"
                    progressbar.trackColor = Color.YELLOW
                    llbmiinfo.setBackgroundColor(Color.GREEN)

                }
            }

        }
    }

}



