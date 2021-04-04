package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*

class action22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action22)

        backac22.setOnClickListener {
            startActivity(Intent(this, Action2::class.java))
        }
    }
}

