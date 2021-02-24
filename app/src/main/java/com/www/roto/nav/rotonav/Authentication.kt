package com.www.roto.nav.rotonav

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button

class Authentication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        val loginbuttonauth = findViewById<Button>(R.id.loginbutton);

        loginbuttonauth.setOnClickListener {
             val intent = Intent(this,maps_activity::class.java)
             startActivity(intent)
        }
    }
}