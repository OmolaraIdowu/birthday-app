package com.swancodes.firstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.swancodes.firstapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        birthdayImageView.visibility = View.INVISIBLE

        binding.tapMeButton.setOnClickListener {
            binding.root.setBackgroundColor(Color.GREEN)
            birthdayImageView.visibility = View.VISIBLE
        }
    }
}