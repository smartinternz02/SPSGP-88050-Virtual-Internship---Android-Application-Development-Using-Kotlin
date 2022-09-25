package com.faizan.grocery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var listbutton: ImageButton
    lateinit var messagebutton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listbutton = findViewById(R.id.imageButton4)
        listbutton.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        messagebutton = findViewById(R.id.imageButton5)
        messagebutton.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
    }
}