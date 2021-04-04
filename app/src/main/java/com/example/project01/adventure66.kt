package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Adventure1
import com.example.project01.Adventure6
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_adventure6.*
import kotlinx.android.synthetic.main.activity_adventure66.*

class adventure66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure66)

        backad66.setOnClickListener {
            startActivity(Intent(this, Adventure6::class.java))
        }
    }
}

