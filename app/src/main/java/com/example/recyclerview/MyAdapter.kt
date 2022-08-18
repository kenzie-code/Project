package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val items: List<String>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.itemView.text = item
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView){
    val textView = itemView.findViewById<TextView>(R.id.textView)
    val imageview = itemView.findViewById<ImageView>(R.id.imageView)

}