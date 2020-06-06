package com.vatsal.kesarwani.a30daysofkotlin.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.vatsal.kesarwani.a30daysofkotlin.R

class ThirdActivity : AppCompatActivity() ,View.OnClickListener {

    private lateinit var txta:TextView
    private lateinit var txtb:TextView
    private lateinit var result:Button
    private lateinit var a1:Button
    private lateinit var a2:Button
    private lateinit var a3:Button
    private lateinit var undoa:Button
    private lateinit var b1:Button
    private lateinit var b2:Button
    private lateinit var b3:Button
    private lateinit var undob:Button
    private lateinit var fab:FloatingActionButton
    private var a=0
    private var b=0
    private var an=0
    private var bn=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        init()
        update()
        listener()
    }

    private fun listener(){
        a1.setOnClickListener(this)
        b1.setOnClickListener(this)
        a2.setOnClickListener(this)
        b2.setOnClickListener(this)
        a3.setOnClickListener(this)
        b3.setOnClickListener(this)
        undoa.setOnClickListener(this)
        undob.setOnClickListener(this)
        fab.setOnClickListener(this)
        result.setOnClickListener(this)
    }

    private fun init(){
        txta=findViewById(R.id.grpa)
        txtb=findViewById(R.id.grpb)
        result=findViewById(R.id.result)
        a1=findViewById(R.id.a1)
        a2=findViewById(R.id.a2)
        a3=findViewById(R.id.a3)
        undoa=findViewById(R.id.undoa)
        b1=findViewById(R.id.b1)
        b2=findViewById(R.id.b2)
        b3=findViewById(R.id.b3)
        undob=findViewById(R.id.undob)
        fab=findViewById(R.id.fab2)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.result -> {
                    dialog()
                    an=0
                    bn=0
                    update()
                }
                R.id.a1 -> {
                    a=1
                    an+=1
                    update()
                }
                R.id.a2 -> {
                    a=2
                    an+=2
                    update()
                }
                R.id.a3 -> {
                    a=3
                    an+=3
                    update()
                }
                R.id.b1 -> {
                    b=1
                    bn+=1
                    update()
                }
                R.id.b2 -> {
                    b=2
                    bn+=2
                    update()
                }
                R.id.b3 -> {
                    b=3
                    bn+=3
                    update()
                }
                R.id.undob -> {
                    bn-=b
                    b=0
                    update()
                }
                R.id.undoa -> {
                    an-=a
                    a=0
                    update()
                }
                R.id.fab2 -> startActivity(Intent(this,FourthActivity::class.java))
            }
        }
    }

    private fun dialog(){
        val builder=AlertDialog.Builder(this)
        builder.setTitle("Winner")
        when(an>bn){
            true -> builder.setMessage("Group A Wins🎉🎉")
            false -> builder.setMessage("Group B Wins🎉🎉")
        }
        when(an==0 && bn==0){
            true -> builder.setMessage("It's a tie")
        }
        val alertDialog=builder.create()
        alertDialog.show()
    }

    private fun update(){
        txta.text=an.toString()
        txtb.text=bn.toString()
    }
}