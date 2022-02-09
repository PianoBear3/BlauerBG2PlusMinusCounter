package com.example.blauerbg2plusminuscounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.blauerbg2plusminuscounter.databinding.ActivityMainBinding

private lateinit var binding2: ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding2.root)


    }
}