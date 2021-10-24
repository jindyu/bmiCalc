package com.heaven.bmicalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText : EditText = findViewById(R.id.heightEditText)
        val weightEditText : EditText = findViewById(R.id.weightEditText)
        val resultButton : Button = findViewById(R.id.resultButton)

        resultButton.setOnClickListener {
            if (heightEditText.text.isEmpty() || weightEditText.text.isEmpty()){
                Toast.makeText(this, "빈 값이 있습니다", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val height : Int = heightEditText.text.toString().toInt()
            val weight : Int = weightEditText.text.toString().toInt()

            val intent = Intent(this, ResultActivivty::class.java)
            intent.putExtra("height", height)
            intent.putExtra("weight", weight)
            startActivity(intent);
        }
    }
}