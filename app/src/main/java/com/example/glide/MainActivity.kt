package com.example.glide

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.imageView)
        val btn: Button = findViewById(R.id.btn_load)



        btn.setOnClickListener()
        {
            Glide
                .with(this)
                .load("https://images.pexels.com/photos/1089440/pexels-photo-1089440.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
                .centerCrop()
                .into(img);
        }
    }

}