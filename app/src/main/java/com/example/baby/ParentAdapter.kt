package com.example.baby
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParentAdapter(private val parents: List<ParentModel>) :
    RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {
    private val viewPool = RecyclerView.RecycledViewPool()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ParentViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return ParentViewHolder(v)
    }
    override fun getItemCount(): Int {
        return parents.size
    }
    override fun onBindViewHolder(
        holder: ParentViewHolder,
        position: Int
    ) {
        val parent = parents[position]
        val childLayoutManager = LinearLayoutManager(
            holder.recyclerView.context, RecyclerView.HORIZONTAL, false
        )
        childLayoutManager.initialPrefetchItemCount = 4
        holder.recyclerView.apply {
            layoutManager = childLayoutManager
            adapter = ChildAdapter(parent.children)
            setRecycledViewPool(viewPool)
        }
    }
    inner class ParentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.recycler_view)
    }
}