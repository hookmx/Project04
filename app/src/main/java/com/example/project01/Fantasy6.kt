package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.fantasy66
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fantasy66.*

class Fantasy6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy6)


        backfan6.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan6.setOnClickListener {
                startActivity(Intent(this, fantasy66::class.java))
            }
        }
    }
}