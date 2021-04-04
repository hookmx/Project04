package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy11.*
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy44.*

class fantasy44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy44)

        backfan44.setOnClickListener {
            startActivity(Intent(this,fantasy4::class.java))
        }
    }
}

