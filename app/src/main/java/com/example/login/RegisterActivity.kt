package com.example.login

import  android
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    lateinit var etEmail1 : EditText
    lateinit var etPassword1 : EditText
    lateinit var erNumber: Number
    lateinit var llSelector : LinearLayout
    lateinit var rgReg :RadioGroup
    lateinit var rbFirst : RadioButton
    lateinit var rbSecond : RadioButton
    lateinit var rbThird: RadioButton
    lateinit var llRegister1 :LinearLayout
    lateinit var btnRegister :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    }
}