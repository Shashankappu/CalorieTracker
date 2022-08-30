package com.example.calorietracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_add_item.*
import kotlinx.android.synthetic.main.activity_calculate.*

class AddItem : AppCompatActivity() {
    val units = arrayListOf("Unit","Scoop","Calorie","Spoon","Bowl","Meal")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)
        val unitspinnerAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,units)
        unitspinner.adapter  = unitspinnerAdapter

        btnbackfromitem.setOnClickListener {
            onBackPressed()
            finish()
        }
        btnsaveandnewitem.setOnClickListener {
            intent = Intent(this,AddItem::class.java)
            startActivity(intent)
            finish()
        }
        btnsaveitem.setOnClickListener {
            intent = Intent(this,Calculate::class.java)
            startActivity(intent )
            finish()
        }
    }
}