package com.krashkrosh748199.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count=0
        val btnApply= findViewById<Button>(R.id.btnCount)
        val btnB=findViewById<Button>(R.id.btnCount1)

        val tvSeen=findViewById<TextView>(R.id.tvCount)
        btnApply.setOnClickListener{
            count++
            tvSeen.text="Let's count together:$count"


        }
        btnB.setOnClickListener{
            count--
            tvSeen.text="Let's count together:$count"
        }





    }
}