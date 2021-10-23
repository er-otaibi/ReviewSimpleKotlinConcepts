package com.example.reviewbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        var myText = findViewById<TextView>(R.id.textView5)


        val intent = intent
        val name = intent.getStringExtra("myName")
        myText.text = name
    }
}