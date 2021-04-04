package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnfantasy.*
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy3.*
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy5.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*

class btnfantasy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnfantasy)

        backfan.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            fan1.setOnClickListener {
                startActivity(Intent(this,fantasy1::class.java))

                fan2.setOnClickListener {
                    startActivity(Intent(this,fantasy2::class.java))

                    fan3.setOnClickListener {
                        startActivity(Intent(this,fantasy3::class.java))

                        fan4.setOnClickListener {
                            startActivity(Intent(this,backfan4::class.java))

                            fan5.setOnClickListener {
                                startActivity(Intent(this,fantasy5::class.java))

                                fan6.setOnClickListener {
                                    startActivity(Intent(this,fantasy6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

