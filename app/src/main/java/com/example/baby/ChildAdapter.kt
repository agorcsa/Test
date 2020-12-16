package com.example.baby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter(private val children: List<ChildModel>) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_item, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return children.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        holder.textView.text = child.title
        holder.itemView.setBackgroundResource(child.color)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.text)
    }
}