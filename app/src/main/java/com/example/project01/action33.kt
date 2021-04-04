package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action2
import com.example.project01.Action3
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action33.*

class action33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action33)

        backac33.setOnClickListener {
            startActivity(Intent(this, Action3::class.java))
        }
    }
}