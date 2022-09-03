package com.example.dicodingapptwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailDriverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_driver)
        var tvName: TextView = findViewById(R.id.tv_item_name_detail)
        var tvDetail: TextView = findViewById(R.id.tv_item_detail_detail)
        var imgPhoto: ImageView = findViewById(R.id.img_item_photo_detail)
        var btnFav: Button = findViewById(R.id.btn_set_favorite_detail)
        var btnShare: Button = findViewById(R.id.btn_set_share_detail)

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

        btnFav.setOnClickListener {
            Toast.makeText(this, "Favorite " + driverName, Toast.LENGTH_SHORT).show()
        }
        btnShare.setOnClickListener {
            Toast.makeText(this, "Share " + driverName, Toast.LENGTH_SHORT).show()
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, driverName)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            this.startActivity(shareIntent)
        }
    }
}