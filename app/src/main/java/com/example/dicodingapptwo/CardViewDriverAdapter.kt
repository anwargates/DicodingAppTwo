package com.example.dicodingapptwo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewDriverAdapter(private val listDriver: ArrayList<Driver>) : RecyclerView.Adapter<CardViewDriverAdapter.CardViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_driver, parent, false)
        return CardViewViewHolder(view)
    }
    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val driver = listDriver[position]
        Glide.with(holder.itemView.context)
            .load(driver.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = driver.name
        holder.tvDetail.text = driver.detail
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listDriver[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listDriver[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listDriver[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnFavorite.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favorite " + listDriver[position].name, Toast.LENGTH_SHORT).show()
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listDriver[position].name, Toast.LENGTH_SHORT).show()
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, driver.name)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            holder.btnShare.context.startActivity(shareIntent)
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listDriver[position].name, Toast.LENGTH_SHORT).show()
            val intent : Intent = Intent(holder.itemView.context, DetailDriverActivity::class.java)
            intent.putExtra("NAME", driver.name)
            intent.putExtra("DETAIL", driver.detail)
            intent.putExtra("PHOTO", driver.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listDriver.size
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

}