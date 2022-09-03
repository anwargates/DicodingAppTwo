package com.example.dicodingapptwo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListDriverAdapter(val listDriver: ArrayList<Driver>) : RecyclerView.Adapter<ListDriverAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_driver, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val driver = listDriver[position]
        Glide.with(holder.itemView.context)
            .load(driver.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = driver.name
        holder.tvDetail.text = driver.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDriver[holder.adapterPosition])
            val intent = Intent(holder.itemView.context, DetailDriverActivity::class.java)
            intent.putExtra("NAME", driver.name)
            intent.putExtra("DETAIL", driver.detail)
            intent.putExtra("PHOTO", driver.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listDriver.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Driver)
    }
}