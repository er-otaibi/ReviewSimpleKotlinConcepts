package com.example.reviewbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

       var myText = findViewById<TextView>(R.id.textView2)


        val intent = intent
        val name = intent.getStringExtra("myText")
        myText.text = name
    }
}