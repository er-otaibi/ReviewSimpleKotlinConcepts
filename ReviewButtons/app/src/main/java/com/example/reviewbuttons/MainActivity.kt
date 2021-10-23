package com.example.reviewbuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name1 =""
        var name2 =""
        var name3=""

        var et1 = findViewById<EditText>(R.id.et1)
        var et2 = findViewById<EditText>(R.id.et2)
        var et3 = findViewById<EditText>(R.id.et3)
        var tv = findViewById<TextView>(R.id.tv)

        var toast = findViewById<Button>(R.id.toast)
        var textView = findViewById<Button>(R.id.textView)
        var newActivity = findViewById<Button>(R.id.newActivity)







        toast.setOnClickListener {
            name1 = et1.text.toString()
            Toast.makeText(this , "Hello $name1" , Toast.LENGTH_SHORT).show() }
        textView.setOnClickListener {
            name2 = et2.text.toString()
            tv.text = name2 }
        newActivity.setOnClickListener {
            name3 = et3.text.toString()
            val intent = Intent(this, NewActivity::class.java)
            intent.putExtra("myText", name3 )
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.home -> { val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.help-> {val intent = Intent(this, HelpActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.about -> {val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

        return super.onOptionsItemSelected(item)
    }

}