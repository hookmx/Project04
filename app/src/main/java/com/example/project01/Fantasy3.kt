package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.fantasy33
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy3.*
import kotlinx.android.synthetic.main.activity_fantasy33.*

class Fantasy3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy3)


        backfan3.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan3.setOnClickListener {
                startActivity(Intent(this, fantasy33::class.java))
            }
        }
    }
}