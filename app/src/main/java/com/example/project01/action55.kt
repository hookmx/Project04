package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action3
import com.example.project01.Action5
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action55.*

class action55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action55)

        backac55.setOnClickListener {
            startActivity(Intent(this, Action5::class.java))
        }
    }
}