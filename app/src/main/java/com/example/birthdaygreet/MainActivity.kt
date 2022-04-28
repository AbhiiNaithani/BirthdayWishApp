package com.example.birthdaygreet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            }

    fun wishCard(view: View) {

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()

        val intent = Intent(this, card::class.java)
        intent.putExtra(card.NAME_EXTRA, name)
        val input=intent.getStringExtra(card.NAME_EXTRA)
        if (input?.isNotEmpty() == true) {
            startActivity(intent)
        }else{
            Toast.makeText(this, "Enter name first", Toast.LENGTH_SHORT).show()
        }
    }
}