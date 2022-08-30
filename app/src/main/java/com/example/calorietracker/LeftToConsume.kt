package com.example.calorietracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculate.*
import kotlinx.android.synthetic.main.activity_left_to_consume.*

class LeftToConsume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_to_consume)
        btnbackfromLeft.setOnClickListener {
            onBackPressed()
            finish()
        }
    }

}