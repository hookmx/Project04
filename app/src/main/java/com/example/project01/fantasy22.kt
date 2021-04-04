package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy11.*
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy22.*

class fantasy22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy22)

        backfan22.setOnClickListener {
            startActivity(Intent(this,fantasy2::class.java))
        }
    }
}

