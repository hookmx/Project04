package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action3
import com.example.project01.Action6
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*
import kotlinx.android.synthetic.main.activity_action6.*
import kotlinx.android.synthetic.main.activity_action66.*

class action66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action66)

        backac66.setOnClickListener {
            startActivity(Intent(this, Action6::class.java))
        }
    }
}