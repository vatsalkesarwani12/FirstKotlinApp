package com.vatsal.kesarwani.a30daysofkotlin.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vatsal.kesarwani.a30daysofkotlin.R

class SecondActiviity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activiity)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(android.R.anim.slide_out_right,android.R.anim.fade_out)
    }
}