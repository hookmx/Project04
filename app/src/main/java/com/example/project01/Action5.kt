package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action55.*
import kotlinx.android.synthetic.main.activity_btnaction.*

class Action5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action5)

        backac5.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac5.setOnClickListener {
                startActivity(Intent(this, picaction55::class.java))
            }
        }
    }
}