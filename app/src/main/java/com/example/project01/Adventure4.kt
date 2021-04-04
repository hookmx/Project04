package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnadventure
import kotlinx.android.synthetic.main.activity_adventure2.*
import kotlinx.android.synthetic.main.activity_adventure22.*
import kotlinx.android.synthetic.main.activity_adventure4.*
import kotlinx.android.synthetic.main.activity_adventure44.*
import kotlinx.android.synthetic.main.activity_btnadventure.*

class Adventure4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure4)

        backad4.setOnClickListener {
            startActivity(Intent(this, btnadventure::class.java))

            nextad4.setOnClickListener {
                startActivity(Intent(this, picadventure44::class.java))
            }
        }
    }
}



