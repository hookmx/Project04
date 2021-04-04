package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.fantasy22
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy22.*

class Fantasy2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy2)


        backfan2.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan2.setOnClickListener {
                startActivity(Intent(this, fantasy22::class.java))
            }
        }
    }
}