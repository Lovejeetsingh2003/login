package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast


class LoginActivity : AppCompatActivity() {

    lateinit var etEmail : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var llRegister : LinearLayout
    lateinit var tvRegister : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        llRegister = findViewById(R.id.llRegister)
        tvRegister = llRegister.findViewById(R.id.tvRegister)
        btnLogin.setOnClickListener {
            if (etEmail.text.toString().isEmpty())
            {
                etEmail.error ="Enter Your Email"
            }
            else if(etPassword.text.toString().isEmpty())
            {
                etPassword.error = "Enter your Password"
            }
            else

            {
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show()

                finish()
            }}
            tvRegister.setOnClickListener {
            val intent =Intent(this,RegisterActivity::class.java)
               startActivity(intent)
                finish()
            }
;

        }
    }
