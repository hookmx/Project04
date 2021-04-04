package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnaction
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_action6.*
import kotlinx.android.synthetic.main.activity_action66.*
import kotlinx.android.synthetic.main.activity_btnaction.*

class Action6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action6)

        backac6.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac6.setOnClickListener {
                startActivity(Intent(this, picaction66::class.java))
            }
        }
    }
}







