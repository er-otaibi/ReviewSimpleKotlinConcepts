package com.example.reviewbuttons


import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var askBtn = findViewById<Button>(R.id.askBtn)

        askBtn.setOnClickListener { funAlert() }
    }


    private fun funAlert() {
        val builder = AlertDialog.Builder(this)

        val view = layoutInflater.inflate(R.layout.alert_dialog, null)

        builder.setView(view)

        val tvBtn = view.findViewById<Button>(R.id.ok)
        val goBtn = view.findViewById<Button>(R.id.show)
        val tv = view.findViewById<TextView>(R.id.tvName)
        val et = view.findViewById<EditText>(R.id.etName)
        tv.text = ""


        builder.create().show()

        tvBtn.setOnClickListener(View.OnClickListener {
            tv.text = et.text
        })

        goBtn.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            intent.putExtra("myName", et.text.toString())
            startActivity(intent)
        }

        builder.setNegativeButton("Close"){_, _ ->}
    }




}