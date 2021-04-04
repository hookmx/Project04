package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.Action1
import com.example.project01.Action2
import com.example.project01.Action3
import com.example.project01.Action4
import com.example.project01.Action5
import com.example.project01.Action6
import com.example.project01.Drama1
import com.example.project01.Drama2
import com.example.project01.Drama3
import com.example.project01.Drama4
import com.example.project01.Drama5
import com.example.project01.Drama6
import com.example.project01.FictionCate
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action4.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action6.*
import kotlinx.android.synthetic.main.activity_btnaction.*
import kotlinx.android.synthetic.main.activity_btndrama.*
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama2.*
import kotlinx.android.synthetic.main.activity_drama3.*
import kotlinx.android.synthetic.main.activity_drama4.*
import kotlinx.android.synthetic.main.activity_drama5.*
import kotlinx.android.synthetic.main.activity_drama6.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*

class btndrama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btndrama)

        backdra.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            dra1.setOnClickListener {
                startActivity(Intent(this,Drama1::class.java))

                dra2.setOnClickListener {
                    startActivity(Intent(this,Drama2::class.java))

                    dra3.setOnClickListener {
                        startActivity(Intent(this,Drama3::class.java))

                        dra4.setOnClickListener {
                            startActivity(Intent(this,Drama4::class.java))

                            dra5.setOnClickListener {
                                startActivity(Intent(this,Drama5::class.java))

                                dra6.setOnClickListener {
                                    startActivity(Intent(this,Drama6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}