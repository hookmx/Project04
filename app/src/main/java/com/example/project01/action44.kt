package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action4
import kotlinx.android.synthetic.main.activity_action22.*
import kotlinx.android.synthetic.main.activity_action4.*
import kotlinx.android.synthetic.main.activity_action44.*

class action44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action44)

        backac44.setOnClickListener {
            startActivity(Intent(this, Action4::class.java))
        }
    }
}