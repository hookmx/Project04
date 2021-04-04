package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnadventure
import kotlinx.android.synthetic.main.activity_adventure2.*
import kotlinx.android.synthetic.main.activity_adventure22.*
import kotlinx.android.synthetic.main.activity_adventure5.*
import kotlinx.android.synthetic.main.activity_adventure55.*
import kotlinx.android.synthetic.main.activity_btnadventure.*

class Adventure5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure5)

        backad5.setOnClickListener {
            startActivity(Intent(this, btnadventure::class.java))

            nextad5.setOnClickListener {
                startActivity(Intent(this, picadventure55::class.java))
            }
        }
    }
}



