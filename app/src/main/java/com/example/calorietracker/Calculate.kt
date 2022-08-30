package com.example.calorietracker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_calculate.*

class Calculate : AppCompatActivity() {
    val Timevalues = arrayListOf("Morning","Afternoon","Evening","Night")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        val timeSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Timevalues)
        time.adapter  = timeSpinnerAdapter

        btnback.setOnClickListener {
            onBackPressed()
        }
        btnsaveandnew.setOnClickListener {
            intent = Intent(this,Calculate::class.java)
            startActivity(intent)
            finish()
        }
        btnsave.setOnClickListener {
            if(cbconsumed.isChecked) {
                intent = Intent(this, Congratulations::class.java)
                startActivity(intent)
            }else{
                intent = Intent(this, LeftToConsume::class.java)
                startActivity(intent)
            }
        }
        btnadditems.setOnClickListener {
            intent = Intent(this,AddItem::class.java)
            startActivity(intent)
            finish()
        }
    }
}