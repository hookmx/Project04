package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action1
import com.example.project01.Adventure1
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*

class adventure11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure11)

        backad11.setOnClickListener {
            startActivity(Intent(this, Adventure1::class.java))
        }
    }
}

