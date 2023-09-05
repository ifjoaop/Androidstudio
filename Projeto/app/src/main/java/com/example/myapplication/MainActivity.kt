package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,
            "Aula apocalíptica de Android",
            Toast.LENGTH_LONG).show()
        //Toast é o balão / makeT "qual texto tem


        val valor1 : EditText = findViewById(R.id.valor1)
        val valor2 : EditText = findViewById(R.id.valor2)
        valor1.text
        valor2.text
    }
}
