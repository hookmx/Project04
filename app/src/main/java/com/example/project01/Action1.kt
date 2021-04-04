package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_btnaction.*

class Action1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action1)

        backac1.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac1.setOnClickListener {
                startActivity(Intent(this, picaction11::class.java))
            }
        }
    }
}