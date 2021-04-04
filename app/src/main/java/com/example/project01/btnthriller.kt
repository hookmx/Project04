package com.example.project01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project01.FictionCate
import com.example.project01.Mysterious1
import com.example.project01.Mysterious2
import com.example.project01.Mysterious3
import com.example.project01.Mysterious4
import com.example.project01.Mysterious5
import com.example.project01.Thriller1
import com.example.project01.Thriller2
import com.example.project01.Thriller3
import com.example.project01.Thriller4
import com.example.project01.Thriller5
import com.example.project01.Thriller6
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_mysterious1.*
import kotlinx.android.synthetic.main.activity_mysterious2.*
import kotlinx.android.synthetic.main.activity_mysterious3.*
import kotlinx.android.synthetic.main.activity_mysterious4.*
import kotlinx.android.synthetic.main.activity_mysterious5.*
import kotlinx.android.synthetic.main.activity_mysterious6.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller2.*
import kotlinx.android.synthetic.main.activity_thriller3.*
import kotlinx.android.synthetic.main.activity_thriller4.*
import kotlinx.android.synthetic.main.activity_thriller5.*
import kotlinx.android.synthetic.main.activity_thriller6.*

class btnthriller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnthriller)

        backthr.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            thr1.setOnClickListener {
                startActivity(Intent(this,Thriller1::class.java))

                thr2.setOnClickListener {
                    startActivity(Intent(this,Thriller2::class.java))

                    thr3.setOnClickListener {
                        startActivity(Intent(this,Thriller3::class.java))

                        thr4.setOnClickListener {
                            startActivity(Intent(this,Thriller4::class.java))

                            thr5.setOnClickListener {
                                startActivity(Intent(this,Thriller5::class.java))

                                thr6.setOnClickListener {
                                    startActivity(Intent(this,Thriller6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


