package com.example.apppqasecurity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dialogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogo)

        val btn_sair = findViewById<Button>(R.id.btn_sair)


        btn_sair.setOnClickListener{
            val intent = Intent(this@dialogo,MainActivity::class.java)
            startActivity(intent)

        }


    }
}
