package com.example.traditionalandroiddev

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val et_name: TextView = findViewById(R.id.et_name)
        val btn_submit: Button = findViewById(R.id.btn_submit)

        et_name.text = "Hi, My name is Lianne"
        et_name.textSize = 20f
        et_name.setPadding(20,20,20,20)
        et_name.setBackgroundColor(resources.getColor(R.color.pink))

        btn_submit.text = "Submit"
        btn_submit.textSize = 20f
        btn_submit.setPadding(20,20,20,20)

        btn_submit.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}