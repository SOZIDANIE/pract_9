package com.bignerdranch.android.pract9_izotov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class result_krug : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_krug)
        var b = intent.getStringExtra("b")
        val textView = findViewById<TextView>(R.id.textView2)
        var ploshad = 0
        var n = b?.toInt()
        if (n!= null){
            ploshad = 3*(n*n)
            textView.text = ploshad.toString()
        }
    }
}