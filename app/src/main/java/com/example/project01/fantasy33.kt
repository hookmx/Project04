package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy11.*
import kotlinx.android.synthetic.main.activity_fantasy3.*
import kotlinx.android.synthetic.main.activity_fantasy33.*

class fantasy33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy33)

        backfan33.setOnClickListener {
            startActivity(Intent(this,fantasy3::class.java))
        }
    }
}

