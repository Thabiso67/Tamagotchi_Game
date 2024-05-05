package com.example.tamagotchi

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //Declaration
        val ImageView: ImageView = findViewById(R.id.welcome)
        val Welcome: ImageView = findViewById(R.id.welcome_dog)
        val Button: Button = findViewById(R.id.button_start)
        
        //Activate Button//
        Button.setOnClickListener{

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
