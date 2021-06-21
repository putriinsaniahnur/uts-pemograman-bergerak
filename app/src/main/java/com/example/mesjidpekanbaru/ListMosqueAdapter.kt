package com.example.mesjidpekanbaru

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMosqueAdapter(private val mosque: ArrayList<Mosque>): RecyclerView.Adapter<ListMosqueAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_mosque, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = mosque[position]
        Glide.with(holder.itemView.context)
            .load(user.image)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = user.name
        holder.tvAdress.text = user.location
    }

    override fun getItemCount(): Int = mosque.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_mosque_name)
        var tvAdress: TextView = itemView.findViewById(R.id.tv_mosque_address)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_mosque)

    }
}