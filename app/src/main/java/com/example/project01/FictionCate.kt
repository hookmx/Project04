package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_main.*

class FictionCate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiction_cate)

        backad.setOnClickListener {
            startActivity(Intent(this,Main::class.java))
        }
    }
}