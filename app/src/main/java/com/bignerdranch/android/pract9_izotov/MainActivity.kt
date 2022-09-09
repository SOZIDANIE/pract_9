package com.bignerdranch.android.pract9_izotov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.b1)
        button.setOnClickListener { callActivity() }
        val button2 = findViewById<Button>(R.id.b2)
        button2.setOnClickListener { callActivity2() }
        val button3 = findViewById<Button>(R.id.b3)
        button3.setOnClickListener { callActivity3() }
    }
    private fun callActivity(){
        val intent = Intent(this, perehod :: class.java)
        intent.putExtra("a", "tre")
        startActivity(intent)
    }
    private fun callActivity2(){
        val intent = Intent(this, perehod :: class.java)
        intent.putExtra("a", "krug")
        startActivity(intent)
    }
    private fun callActivity3(){
        val intent = Intent(this, perehod :: class.java)
        intent.putExtra("a", "kvadr")
        startActivity(intent)
    }
}