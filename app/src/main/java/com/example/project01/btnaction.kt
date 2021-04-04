package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action4.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action6.*
import kotlinx.android.synthetic.main.activity_btnaction.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*

class btnaction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnaction)

        backac.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            ac1.setOnClickListener {
                startActivity(Intent(this,Action1::class.java))

                ac2.setOnClickListener {
                    startActivity(Intent(this,Action4::class.java))

                    ac3.setOnClickListener {
                        startActivity(Intent(this,Action3::class.java))

                        ac4.setOnClickListener {
                            startActivity(Intent(this,Action4::class.java))

                            ac5.setOnClickListener {
                                startActivity(Intent(this,Action5::class.java))

                                ac6.setOnClickListener {
                                    startActivity(Intent(this,Action6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

