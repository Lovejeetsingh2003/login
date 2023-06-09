package com.example.login


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    lateinit var etEmail1 : EditText
    lateinit var etPassword1 : EditText
    lateinit var etNumber: EditText
    lateinit var llSelect : LinearLayout
    lateinit var rgReg :RadioGroup
    lateinit var rbFirst : RadioButton
    lateinit var rbSecond : RadioButton
    lateinit var rbThird: RadioButton
    lateinit var etOther : EditText
    lateinit var llRegister1 : LinearLayout
    lateinit var btnRegister : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etEmail1 = findViewById(R.id.etEmail1)
        etPassword1 = findViewById(R.id.etPassword1)
        etNumber = findViewById(R.id.etNumber)
        llSelect = findViewById(R.id.llSelect)
        rgReg = llSelect.findViewById(R.id.rgReg)
        rbFirst = llSelect.findViewById(R.id.rbFirst)
        rbSecond = llSelect.findViewById(R.id.rbSecond)
        rbThird = llSelect.findViewById(R.id.rbThird)
        etOther = llSelect.findViewById(R.id.etOther)
        llRegister1 = findViewById(R.id.llRegister1)
        btnRegister = llRegister1.findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            if (etEmail1.text.toString().isEmpty()) {
                etEmail1.error = "Enter Your Email"
            } else if (etPassword1.text.toString().isEmpty()) {
                etPassword1.error = "Enter your Password"
            }
            else if (etNumber.text.toString().isEmpty()) {
                etNumber.error = "Enter your Mob. No."
            }else {
                Toast.makeText(this, "Register Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent ( this, FirstActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
      rgReg.setOnCheckedChangeListener { group, checkedId ->

          if(checkedId == R.id.rbFirst)
          {
            etOther.visibility = View.GONE
          }
          else if(checkedId == R.id.rbSecond)
          {
              etOther.visibility = View.GONE
          }
          else {
              etOther.visibility = View.VISIBLE
          }
      }

    }
}