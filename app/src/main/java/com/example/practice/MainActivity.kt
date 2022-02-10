package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start: Button = findViewById(R.id.startButton)
        //  val stop : Button = findViewById(R.id.stopButton)
        start!!.setOnClickListener(this)
        //   stop!!.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        startService(Intent(this, NewService::class.java))
    }
}


