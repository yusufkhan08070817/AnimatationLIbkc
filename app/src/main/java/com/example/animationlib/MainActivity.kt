package com.example.animationlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageView
import com.example.animation.LIB.AnimationKC

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView:ImageView=findViewById(R.id.imageView)
       val anim= AnimationKC(this)
        imageView.setOnClickListener {

            anim.AnimationStater(imageView,anim.toright)

        }
    }
}

