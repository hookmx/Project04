package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action1
import com.example.project01.FictionCate
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_btnromance.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*

class action11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action11)

        backac11.setOnClickListener {
            startActivity(Intent(this, Action1::class.java))
        }
    }
}