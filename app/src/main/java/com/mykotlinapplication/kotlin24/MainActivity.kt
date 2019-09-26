package com.mykotlinapplication.kotlin24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val imageView = ImageView(this)

        // Use this for loading image
//        Glide.with(this).load("https://s3.amazonaws.com/appsdeveloperblog/Micky.jpg").into(imageView)
//        linearLayout.addView(imageView)

        // Use this for loading gif
        linearLayout.addView(imageView)
        Glide.with(this)
            .asGif()
            .load("https://s3.amazonaws.com/appsdeveloperblog/micky.gif")
            .into(imageView)


    }
}
