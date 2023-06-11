package com.example.login

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var llSecond : LinearLayout
    lateinit var etName1 : EditText
    lateinit var etRoll1 : EditText
    lateinit var etTemp1 : EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        llSecond = findViewById(R.id.llSecond)
        etName1 = llSecond.findViewById(R.id.etName1)
        etRoll1 = llSecond.findViewById(R.id.etRoll1)
        etTemp1 = llSecond.findViewById(R.id.etTemp1)
    }
}