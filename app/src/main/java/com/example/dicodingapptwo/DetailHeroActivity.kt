package com.example.dicodingapptwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailHeroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)
        var tvName: TextView = findViewById(R.id.tv_item_name_detail)
        var tvDetail: TextView = findViewById(R.id.tv_item_detail_detail)
        var imgPhoto: ImageView = findViewById(R.id.img_item_photo_detail)
        val heroName = intent.getStringExtra( "NAME" )
        val heroDetail = intent.getStringExtra("DETAIL")
        val heroPhoto = intent.getIntExtra("PHOTO",0)
        tvName.text = heroName.toString()
        tvDetail.text = heroDetail.toString()
        Glide.with(this)
            .load(heroPhoto)
            .apply(RequestOptions().override(350, 550))
            .into(imgPhoto)
    }
}