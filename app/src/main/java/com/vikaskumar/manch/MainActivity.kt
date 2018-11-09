package com.vikaskumar.manch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setClickListeners()
    }

    /**
     * set click listeners here
     */
    private fun setClickListeners() {
        ivAddMore.setOnClickListener { Toast.makeText(this@MainActivity, "Add more", Toast.LENGTH_SHORT).show() }
        tvPostButton.setOnClickListener { Toast.makeText(this@MainActivity, "Post Poll", Toast.LENGTH_SHORT).show() }
    }
}
