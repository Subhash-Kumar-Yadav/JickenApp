package com.example.jicken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jicken.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private val binding:ActivitySignUpBinding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.allReadyHaveAccount.setOnClickListener {
            val intent = Intent(this , SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}