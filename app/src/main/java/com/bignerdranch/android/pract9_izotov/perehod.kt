package com.bignerdranch.android.pract9_izotov

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class perehod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod2)
        var a = intent.getStringExtra("a")
        if (a == "krug")
        {
            val textView = findViewById<TextView>(R.id.t6)
            textView.visibility = View.VISIBLE
            val button4 = findViewById<Button>(R.id.b4)
            button4.setOnClickListener { callActivitykrug() }
            button4.setOnClickListener { peredachaKRUG() }
        }
        else if (a == "tre")
        {
            val editText = findViewById<EditText>(R.id.dannie2)
            val textView = findViewById<TextView>(R.id.textView4)
            val textView1 = findViewById<TextView>(R.id.textView5)
            editText.visibility = View.VISIBLE
            textView.visibility = View.VISIBLE
            textView1.visibility = View.VISIBLE
            val button4 = findViewById<Button>(R.id.b4)
            button4.setOnClickListener { callActivityTre() }
            button4.setOnClickListener { peredachaTRE() }
        }
        else if (a == "kvadr")
        {
            val textView = findViewById<TextView>(R.id.t7)
            textView.visibility = View.VISIBLE
            val button4 = findViewById<Button>(R.id.b4)
            button4.setOnClickListener { callActivityKvadr() }
            button4.setOnClickListener { peredachaKVADR() }
        }
    }
    private fun peredachaKRUG(){
        val intent = Intent(this, result_krug :: class.java)
        val editText = findViewById<EditText>(R.id.dannie)
        val text = editText.text
        if (text == null){
            Toast.makeText(applicationContext, "Введите данные!", Toast.LENGTH_SHORT).show()
        }
        else{
            intent.putExtra("b", "" + text)
            startActivity(intent)
        }
    }
    private fun peredachaTRE(){
        val intent = Intent(this, result_tre  :: class.java)
        val editText = findViewById<EditText>(R.id.dannie)
        val editText1 = findViewById<EditText>(R.id.dannie2)
        val high = editText.text
        val osnovanie = editText1.text
        if (high == null || osnovanie == null){
            Toast.makeText(applicationContext, "Введите данные!", Toast.LENGTH_SHORT).show()
        }
        else{
            intent.putExtra("b", "" + high)
            intent.putExtra("c", "" + osnovanie)
            startActivity(intent)
        }
    }
    private fun peredachaKVADR(){
        val intent = Intent(this, result_kvadr :: class.java)
        val editText = findViewById<EditText>(R.id.dannie)
        val text = editText.text
        if (text == null){
            Toast.makeText(applicationContext, "Введите данные!", Toast.LENGTH_SHORT).show()
        }
        else{
            intent.putExtra("b", "" + text)
            startActivity(intent)
        }
    }
    private fun callActivitykrug(){
        val intent = Intent(this, result_krug :: class.java)
        startActivity(intent)
    }
    private fun callActivityTre(){
        val intent = Intent(this, result_tre :: class.java)
        startActivity(intent)
    }
    private fun callActivityKvadr(){
        val intent = Intent(this, result_kvadr :: class.java)
        startActivity(intent)
    }
}