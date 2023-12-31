package com.example.jicken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.jicken.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private val binding:ActivitySplashBinding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this , SignUpActivity::class.java)
            startActivity(intent)
            finish()
        } , 3000)
    }
}