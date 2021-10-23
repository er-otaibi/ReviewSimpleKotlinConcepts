package com.example.reviewbuttons

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SharedP : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_p)

        sharedPreferences = this.getSharedPreferences(
        getString(R.string.preference_file_key), Context.MODE_PRIVATE)

        var tvText1 = findViewById<TextView>(R.id.tvText1)
        var tvText2 = findViewById<TextView>(R.id.tvText2)

        val intent = intent
        val name1 = intent.getStringExtra("myName1")
        val name2 = intent.getStringExtra("myName2")
        tvText1.text = name1
        tvText2.text = name2
        var button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {

             tvText1.text =  sharedPreferences.getString("text1", "")
             tvText2.text =  sharedPreferences.getString("text2","");
        }
    }
}