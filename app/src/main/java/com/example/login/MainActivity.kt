package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var username : EditText = findViewById(R.id.username)
    var password : EditText = findViewById(R.id.password)
    val button :
            Button = findViewById(R.id.button)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            username.text.clear()
            password.text.clear()
        }
    }
}