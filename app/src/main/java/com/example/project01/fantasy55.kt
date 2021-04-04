package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy11.*
import kotlinx.android.synthetic.main.activity_fantasy5.*
import kotlinx.android.synthetic.main.activity_fantasy55.*

class fantasy55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy55)

        backfan55.setOnClickListener {
            startActivity(Intent(this,fantasy5::class.java))
        }
    }
}

