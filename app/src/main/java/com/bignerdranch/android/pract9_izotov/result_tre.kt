package com.bignerdranch.android.pract9_izotov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class result_tre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_tre)
        val b = intent.getStringExtra("b")
        val c = intent.getStringExtra("c")
        val textView = findViewById<TextView>(R.id.textView2)
        var ploshad = 0
        var n = b?.toInt()
        var d = c?.toInt()
        if (n != null && d!= null)
        {
            ploshad = (n*d)/2
            textView.text = ploshad.toString()
        }
    }
}


