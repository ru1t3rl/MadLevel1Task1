package tech.tucano.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.tucano.madlevel1task1.databinding.ActivityMainBinding

class activity_higher_lower : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}