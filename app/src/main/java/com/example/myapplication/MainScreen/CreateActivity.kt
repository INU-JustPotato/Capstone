package com.example.myapplication.MainScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.menuBottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> startActivity(Intent(this, MainActivity::class.java))
                R.id.menu_history -> startActivity(Intent(this,HistoryActivity::class.java))
                R.id.menu_user -> startActivity(Intent(this, UserActivity::class.java))
            }
            true
        }*/
    }
}