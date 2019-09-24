package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try
        {
            Thread.sleep(3000)
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        catch(e: Exception){
            return;
        }

    }
}