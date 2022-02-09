package com.example.blauerbg2plusminuscounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import android.os.Bundle
import com.example.blauerbg2plusminuscounter.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 0

        binding.PlusBtn.setOnClickListener {
            counter++
            binding.Counter.text = "%d".format(counter)
        }

        binding.MinusBtn.setOnClickListener {
            counter--
            binding.Counter.text = "%d".format(counter)
        }
        binding.button3.setOnClickListener {
            val unter = Intent(this, UnterActivity::class.java)
            unter.putExtra("mainCounter", counter)
            startActivity(unter)
        }
    }
}