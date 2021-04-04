package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnadventure
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_adventure3.*
import kotlinx.android.synthetic.main.activity_adventure33.*
import kotlinx.android.synthetic.main.activity_btnadventure.*

class Adventure3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure3)

        backad3.setOnClickListener {
            startActivity(Intent(this, btnadventure::class.java))

            nextad3.setOnClickListener {
                startActivity(Intent(this, picadventure33::class.java))
            }
        }
    }
}

