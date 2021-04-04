package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.FictionCate
import com.example.project01.Romance1
import com.example.project01.Romance2
import com.example.project01.Romance3
import com.example.project01.Romance4
import com.example.project01.Romance5
import com.example.project01.Romance6
import kotlinx.android.synthetic.main.activity_btnadventure.*
import kotlinx.android.synthetic.main.activity_btnfantasy.*
import kotlinx.android.synthetic.main.activity_btnromance.*
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy3.*
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy5.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance3.*
import kotlinx.android.synthetic.main.activity_romance4.*
import kotlinx.android.synthetic.main.activity_romance5.*
import kotlinx.android.synthetic.main.activity_romance6.*

class btnromance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnromance)

        backro.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            ro1.setOnClickListener {
                startActivity(Intent(this,Romance1::class.java))

                ro2.setOnClickListener {
                    startActivity(Intent(this,Romance2::class.java))

                    ro3.setOnClickListener {
                        startActivity(Intent(this,Romance3::class.java))

                        ro4.setOnClickListener {
                            startActivity(Intent(this,Romance4::class.java))

                            ro5.setOnClickListener {
                                startActivity(Intent(this,Romance5::class.java))

                                ro6.setOnClickListener {
                                    startActivity(Intent(this,Romance6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

