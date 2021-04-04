package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Adventure1
import com.example.project01.Adventure2
import com.example.project01.Adventure3
import com.example.project01.Adventure4
import com.example.project01.Adventure5
import com.example.project01.Adventure6
import kotlinx.android.synthetic.main.activity_adventure1.*
import kotlinx.android.synthetic.main.activity_adventure2.*
import kotlinx.android.synthetic.main.activity_adventure3.*
import kotlinx.android.synthetic.main.activity_adventure4.*
import kotlinx.android.synthetic.main.activity_adventure5.*
import kotlinx.android.synthetic.main.activity_adventure6.*
import kotlinx.android.synthetic.main.activity_btnadventure.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_fiction_cate.backad

class btnadventure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnadventure)

        backad.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            Ad1.setOnClickListener {
                startActivity(Intent(this,Adventure1::class.java))

                Ad2.setOnClickListener {
                    startActivity(Intent(this,Adventure2::class.java))

                    Ad3.setOnClickListener {
                        startActivity(Intent(this,Adventure3::class.java))

                        Ad4.setOnClickListener {
                            startActivity(Intent(this,Adventure4::class.java))

                            Ad5.setOnClickListener {
                                startActivity(Intent(this,Adventure5::class.java))

                                Ad6.setOnClickListener {
                                    startActivity(Intent(this,Adventure6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

