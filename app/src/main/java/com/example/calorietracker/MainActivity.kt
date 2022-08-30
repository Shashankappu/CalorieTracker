package com.example.calorietracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener {
            intent = Intent(this, Calculate::class.java)
            startActivity(intent)

        }
        btnBMI.setOnClickListener {
            intent = Intent(this, BMICalculator::class.java)
            startActivity(intent)
        }
        btnHistory.setOnClickListener {
            intent = Intent(this, History::class.java)
            startActivity(intent)
        }
        btnmenu.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            } }

    }
}