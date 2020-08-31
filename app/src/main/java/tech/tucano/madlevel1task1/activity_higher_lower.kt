package tech.tucano.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.tucano.madlevel1task1.databinding.ActivityMainBinding

class activity_higher_lower : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var currentThrow: Int = 1
    private var lastThrow: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun updateUI(){
        binding.result.text = getString(R.string.last_throw, lastThrow)

        when(currentThrow){
            1 -> binding.imageDice.setImageResource(R.drawable.dice1)
            2 -> binding.imageDice.setImageResource(R.drawable.dice2)
            3 -> binding.imageDice.setImageResource(R.drawable.dice3)
            4 -> binding.imageDice.setImageResource(R.drawable.dice4)
            5 -> binding.imageDice.setImageResource(R.drawable.dice5)
            6 -> binding.imageDice.setImageResource(R.drawable.dice6)
        }
    }

    private fun initViews(){
        updateUI()
    }
}