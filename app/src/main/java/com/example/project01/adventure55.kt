package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Adventure1
import com.example.project01.Adventure5
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_adventure5.*
import kotlinx.android.synthetic.main.activity_adventure55.*

class adventure55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure55)

        backad55.setOnClickListener {
            startActivity(Intent(this, Adventure5::class.java))
        }
    }
}

