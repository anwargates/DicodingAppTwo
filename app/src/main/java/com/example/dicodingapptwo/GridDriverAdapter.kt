package com.example.dicodingapptwo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridDriverAdapter(val listDriver: ArrayList<Driver>) : RecyclerView.Adapter<GridDriverAdapter.GridViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_driver, parent, false)
        return GridViewHolder(view)
    }
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listDriver[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDriver[holder.adapterPosition])
            val intent = Intent(holder.itemView.context, DetailDriverActivity::class.java)
            intent.putExtra("NAME", listDriver[holder.adapterPosition].name)
            intent.putExtra("DETAIL", listDriver[holder.adapterPosition].detail)
            intent.putExtra("PHOTO", listDriver[holder.adapterPosition].photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listDriver.size
    }
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Driver)

    }
}