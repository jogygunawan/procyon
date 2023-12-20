package com.example.projectmassive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DataActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_anak)

        val btnSave: Button = findViewById(R.id.btn_save)
        btnSave.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_save ->{
                val intent = Intent(this@DataActivity, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}