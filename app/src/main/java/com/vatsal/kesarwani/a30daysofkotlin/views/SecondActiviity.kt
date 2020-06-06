package com.vatsal.kesarwani.a30daysofkotlin.views

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.vatsal.kesarwani.a30daysofkotlin.R


class SecondActiviity : AppCompatActivity() , View.OnClickListener{

    private lateinit var gen:Button
    private lateinit var prog:ProgressBar
    private lateinit var fab:FloatingActionButton
    private lateinit var value:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activiity)
        init()
    }

    private fun init() {
        gen=findViewById(R.id.gen)
        prog=findViewById(R.id.progressBar)
        fab=findViewById(R.id.fab)
        value=findViewById(R.id.value)
        gen.setOnClickListener(this)
        fab.setOnClickListener(this)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(android.R.anim.slide_out_right,android.R.anim.fade_out)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.fab -> startActivity(Intent(this,ThirdActivity::class.java))
                R.id.gen -> {
                    prog.visibility=View.VISIBLE
                    value.visibility=View.INVISIBLE
                    Handler().postDelayed(Runnable {
                        val r = (1..6).shuffled().first()
                        value.visibility=View.VISIBLE

                        var uri ="@drawable/one" // where myresource (without the extension) is the file
                        when(r){
                            1 -> uri="@drawable/one"
                            2 -> uri="@drawable/two"
                            3 -> uri="@drawable/three"
                            4 -> uri="@drawable/four"
                            5 -> uri="@drawable/five"
                            6 -> uri="@drawable/six"
                        }
                        val imageResource =resources.getIdentifier(uri, null, packageName)
                        val res = resources.getDrawable(imageResource)
                        value.setImageDrawable(res)
                        prog.visibility=View.GONE
                    },1000)
                }
            }
        }
    }
}