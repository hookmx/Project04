package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnadventure
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_adventure2.*
import kotlinx.android.synthetic.main.activity_adventure22.*
import kotlinx.android.synthetic.main.activity_btnadventure.*

class Adventure2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure2)

        backad2.setOnClickListener {
            startActivity(Intent(this, btnadventure::class.java))

            nextad2.setOnClickListener {
                startActivity(Intent(this, picadventure22::class.java))
            }
        }
    }
}

