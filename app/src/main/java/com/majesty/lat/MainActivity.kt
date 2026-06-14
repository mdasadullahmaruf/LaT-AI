package com.majesty.lat

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val button = Button(this).apply {
            text = "Enable LaT-AI Service"
            setOnClickListener {
                try {
                    startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
                } catch (e: Exception) {
                    Toast.makeText(context, "Error opening settings", Toast.LENGTH_SHORT).show()
                }
            }
        }
        setContentView(button)
    }
}
