package com.vatsal.kesarwani.a30daysofkotlin.views.Activtiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vatsal.kesarwani.a30daysofkotlin.R
import com.vatsal.kesarwani.a30daysofkotlin.views.Adapter.RecyclerAdapter
import com.vatsal.kesarwani.a30daysofkotlin.views.Model.Data

class FourthActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recycleAdapter: RecyclerAdapter
    var mList=ArrayList<Data>()
    private lateinit var reset:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        init()
        val intent=intent
        mList.add(Data(intent.getStringExtra("grp"),intent.getStringExtra("point")))
        /*mList.add(Data("Group B","1"))
        mList.add(Data("Group B","60"))
        mList.add(Data("Group A","150"))
        mList.add(Data("Group B","105"))
        mList.add(Data("Group A","7"))*/

        reset.setOnClickListener {
            mList.clear()
            recycleAdapter.notifyDataSetChanged()
        }
    }

    private fun init(){
        recyclerView=findViewById(R.id.recycle)
        recycleAdapter= RecyclerAdapter(mList)
        recyclerView.adapter=recycleAdapter
        reset=findViewById(R.id.reset)
    }
}