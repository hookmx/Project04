package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.fantasy44
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy44.*

class Fantasy4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy4)


        backfan4.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan4.setOnClickListener {
                startActivity(Intent(this, fantasy44::class.java))
            }
        }
    }
}
