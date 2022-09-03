package com.example.dicodingapptwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        title="About Me"

        var imgPhoto: ImageView = findViewById(R.id.profile_image_view)

        Glide.with(this)
            .load(R.drawable.me)
            .into(imgPhoto)
    }
}