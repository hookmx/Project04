package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Funny3
import com.example.project01.Funny4
import com.example.project01.Funny5
import com.example.project01.Funny6
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_funny3.*
import kotlinx.android.synthetic.main.activity_funny4.*
import kotlinx.android.synthetic.main.activity_funny5.*
import kotlinx.android.synthetic.main.activity_funny6.*

class btnfunny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnfunny)

        backfun.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            fun1.setOnClickListener {
                startActivity(Intent(this,Funny1::class.java))

                fun2.setOnClickListener {
                    startActivity(Intent(this,Funny2::class.java))

                    fun3.setOnClickListener {
                        startActivity(Intent(this,Funny3::class.java))

                        fun4.setOnClickListener {
                            startActivity(Intent(this,Funny4::class.java))

                            fun5.setOnClickListener {
                                startActivity(Intent(this,Funny5::class.java))

                                fun6.setOnClickListener {
                                    startActivity(Intent(this,Funny6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

