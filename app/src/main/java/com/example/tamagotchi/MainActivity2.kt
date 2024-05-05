package com.example.tamagotchi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ImageView: ImageView = findViewById(R.id.welcome_dog)
        val Feed: Button = findViewById(R.id.feed)
        val Clean: Button = findViewById(R.id.clean)
        val Play: Button = findViewById(R.id.play)
        val Hunger: TextView = findViewById(R.id.textView1)
        val Mood: TextView = findViewById(R.id.textView2)
        val Dirt: TextView = findViewById(R.id.textView3)
        val bundle: Bundle? = intent.extras

        Feed.setOnClickListener {

            ImageView.setImageResource(R.drawable.feed)

            Play.setOnClickListener {

                ImageView.setImageResource(R.drawable.play)

                Clean.setOnClickListener {

                    ImageView.setImageResource(R.drawable.clean)

                }
            }
        }
    }
}