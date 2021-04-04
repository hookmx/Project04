package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy11.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fantasy66.*

class fantasy66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy66)

        backfan66.setOnClickListener {
            startActivity(Intent(this,fantasy6::class.java))
        }
    }
}

