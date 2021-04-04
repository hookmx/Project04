package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.btnaction
import com.example.project01.btnadventure
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure11.*
import kotlinx.android.synthetic.main.activity_btnaction.*
import kotlinx.android.synthetic.main.activity_btnadventure.*

class Adventure1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure1)

        backad1.setOnClickListener {
            startActivity(Intent(this, btnadventure::class.java))

            nextad1.setOnClickListener {
                startActivity(Intent(this, picadventure11::class.java))
            }
        }
    }
}
    
