package com.vatsal.kesarwani.a30daysofkotlin.views.Adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vatsal.kesarwani.a30daysofkotlin.R
import com.vatsal.kesarwani.a30daysofkotlin.views.Model.Data

class RecyclerAdapter(val data: ArrayList<Data> = ArrayList()) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        fun bindItems(data: Data) {
            val textViewName = itemView.findViewById(R.id.grpname) as TextView
            val textViewPoints  = itemView.findViewById(R.id.points) as TextView
            textViewName.text = data.groupName
            textViewPoints.text = data.point
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.bindItems(data[position])
    }

}