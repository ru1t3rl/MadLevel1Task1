package tech.tucano.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

    private fun initViews(){
        updateUI()

        binding.btnLower.setOnClickListener { onLowerClick() }
        binding.btnEqual.setOnClickListener { onEqualClick() }
        binding.btnHigher.setOnClickListener { onHigherClick() }
    }

    /**
     * Updates the UI based of the variable lastThrow
     */
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

    private fun rollDice() {
        lastThrow = currentThrow
        currentThrow = (1..6).random()
        updateUI()
    }

    /**
     * Rolls the Dice and checks if the throw is higher
     */
    private fun onHigherClick(){
        rollDice()

        if(currentThrow > lastThrow)
            onCorrect()
        else
            onIncorrect()
    }

    /**
     * Rolls the Dice and checks if the throw is Lower
     */
    private fun onLowerClick(){
        rollDice()

        if(currentThrow < lastThrow)
            onCorrect()
        else
            onIncorrect()
    }

    /**
     * Rolls the Dice and checks if the throw is Equal
     */
    private fun onEqualClick(){
        rollDice()
        if(currentThrow == lastThrow)
            onCorrect()
        else
            onIncorrect()
    }

    /**
     * Displays a correct message
     */
    private fun onCorrect(){
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    /**
     * Displays an incorrect message
     */
    private fun onIncorrect(){
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}