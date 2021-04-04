package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnadventure
import com.example.project01.fantasy11
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_btnadventure.*
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy11.*

class Fantasy1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy1)


        backfan1.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan1.setOnClickListener {
                startActivity(Intent(this, fantasy11::class.java))
            }
        }
    }
}
