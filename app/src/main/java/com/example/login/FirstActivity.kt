package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

   lateinit var llFirst : LinearLayout
   lateinit var etName : EditText
   lateinit var etRoll : EditText
   lateinit var etTemp : EditText
   lateinit var btnMove : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        llFirst = findViewById(R.id.llFirst)
        etName = llFirst.findViewById(R.id.etName)
        etRoll = llFirst.findViewById(R.id.etRoll)
        etTemp = llFirst.findViewById(R.id.etTemp)
       btnMove = llFirst.findViewById(R.id.btnMove)


        btnMove.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                etName.error = "Enter Your Name"
            } else if (etRoll.text.toString().isEmpty()) {
                etRoll.error = "Enter your Roll No."
            }
            else if (etTemp.text.toString().isEmpty()) {
                etTemp.error = "Enter Temperature"
            }else {
                Toast.makeText(this, "Move", Toast.LENGTH_SHORT).show()
                 val intent = Intent(this,SecondActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}