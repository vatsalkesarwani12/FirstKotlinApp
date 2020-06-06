package com.vatsal.kesarwani.a30daysofkotlin.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.vatsal.kesarwani.a30daysofkotlin.R

class MainActivity : AppCompatActivity() {

    lateinit var welcome:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_in_left)
        init()
        welcome.setOnClickListener {
            val intent=Intent(this@MainActivity,SecondActiviity::class.java)
            Toast.makeText(this,"Welcome To My First Kotlin App",Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }

    private fun init() {
        welcome=findViewById(R.id.welcome)
    }

}