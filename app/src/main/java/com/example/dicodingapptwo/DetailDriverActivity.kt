package com.example.dicodingapptwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailDriverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)
        var tvName: TextView = findViewById(R.id.tv_item_name_detail)
        var tvDetail: TextView = findViewById(R.id.tv_item_detail_detail)
        var imgPhoto: ImageView = findViewById(R.id.img_item_photo_detail)
        val driverName = intent.getStringExtra( "NAME" )
        val driverDetail = intent.getStringExtra("DETAIL")
        val driverPhoto = intent.getIntExtra("PHOTO",0)
        tvName.text = driverName.toString()
        tvDetail.text = driverDetail.toString()
        Glide.with(this)
            .load(driverPhoto)
            .apply(RequestOptions().override(350, 550))
            .into(imgPhoto)
        title=driverName.toString() + "'s Driver Details"
    }
}