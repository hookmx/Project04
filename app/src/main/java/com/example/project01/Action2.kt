package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*
import kotlinx.android.synthetic.main.activity_btnaction.*

class Action2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action2)

        backac2.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac2.setOnClickListener {
                startActivity(Intent(this, picaction22::class.java))
            }
        }
    }
}