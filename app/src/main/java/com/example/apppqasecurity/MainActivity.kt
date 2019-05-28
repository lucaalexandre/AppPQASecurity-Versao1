package com.example.apppqasecurity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_popup.setOnClickListener{
            val dialogoView = LayoutInflater.from(this).inflate(R.layout.activity_dialogo, null);

            val builder = AlertDialog.Builder(this)
                .setView(dialogoView)
                .setTitle("Santander")


            builder.show()


        }



    }
}
