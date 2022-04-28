package com.example.birthdaygreet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class card : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val name=intent.getStringExtra(NAME_EXTRA)

        val wish = findViewById<TextView>(R.id.wish)
        wish.text = "Happy Birthday \n $name!"
    }
}