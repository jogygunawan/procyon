package com.example.projectmassive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Activity_splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            goToRegister()
        }, 3000L)
    }
    private fun goToRegister() {
        Intent(this@Activity_splash_screen,RegisterActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}