package com.example.reviewbuttons

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        var text1 = ""
        var text2 = ""

        sharedPreferences = this.getSharedPreferences(
        getString(R.string.preference_file_key), Context.MODE_PRIVATE)
        text1 = sharedPreferences.getString("text1", "").toString()
        text2 = sharedPreferences.getString("text2", "").toString()
        var mytext1 = findViewById<EditText>(R.id.textView1)
        var mytext2 = findViewById<EditText>(R.id.textView2)
        var tv1 = findViewById<TextView>(R.id.tv1)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)


        btn1.setOnClickListener {
        text1 = mytext1.text.toString()
        text2 = mytext2.text.toString()

            val intent = Intent(this, SharedP::class.java)
            intent.putExtra("myName1", text1)
            intent.putExtra("myName2", text2)
            startActivity(intent)


        }

        btn2.setOnClickListener {
            with(sharedPreferences.edit()) {
                text1 = mytext1.text.toString()
                text2 = mytext2.text.toString()
                putString("text1", text1)
                putString("text2", text2)
                apply()
            }
            val intent = Intent(this, SharedP::class.java)
            startActivity(intent)



        }






    }
}