package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Adventure1
import com.example.project01.Adventure4
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_adventure4.*
import kotlinx.android.synthetic.main.activity_adventure44.*

class adventure44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure44)

        backad44.setOnClickListener {
            startActivity(Intent(this, Adventure4::class.java))
        }
    }
}

