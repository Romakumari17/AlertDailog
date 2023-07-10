package com.romakumari.alertdailog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
     var btn:Button ?= null
    var Number =0
    var zero:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.btn)
        zero=findViewById(R.id.zero)
        btn?.setOnClickListener {
             AlertDialog.Builder(this)
                .setTitle("title")
                .setMessage(" Choose one")
                .setCancelable(false)
                .setPositiveButton("yes") { _, _, ->
                    Number+=2
                    zero?.setText(Number.toString())
                    Toast.makeText(this, "Number", Toast.LENGTH_SHORT).show()

                }
                .setNegativeButton("No") { _, _, ->
                    Number-=2
                    zero?.setText(Number.toString())
                    Toast.makeText(this, "Number", Toast.LENGTH_SHORT).show()
                }
                .setNeutralButton(" new") { _, _, ->
                    Number=0
                    zero?.setText(Number.toString())
                    Toast.makeText(this, "Number", Toast.LENGTH_SHORT).show()
                }
                 .show()
        }

    }
}